package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.dom.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SnippetFeatureExtraction {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SnippetFeatureExtraction <directory_path>");
            System.exit(1);
        }

        String directoryPath = args[0];

        // Get all .java files in the specified directory
        File directory = new File(directoryPath);
        File[] javaFiles = directory.listFiles((dir, name) ->
                name.matches(".+\\.java")
        );

        if (javaFiles != null) {

            Map<Features, List<Integer>> featureCountMap = new HashMap<>();
            for (File javaFile : javaFiles) {
                try {
                    System.out.println("Processing file: " + javaFile.getName());
                    // Read the content of each .java file
                    String code = new String(Files.readAllBytes(Paths.get(javaFile.getAbsolutePath())));
                    System.out.println("Code");
                    System.out.println(code);

                    // Extract features from the code
                    List<Features> features = featureExtract(code);
                    System.out.println("Features");
                    System.out.println(features);

                    // Temporary map to store counts for the current file
                    Map<Features, Integer> fileFeatureCounts = new HashMap<>();
                    for (Features feature : features) {
                        fileFeatureCounts.put(feature, fileFeatureCounts.getOrDefault(feature, 0) + 1);
                    }

                    // Add line of code (LOC) as a feature count
                    int loC = getLoC(code);
                    fileFeatureCounts.put(Features.LOC, fileFeatureCounts.getOrDefault(Features.LOC, 0) + loC);

                    // Merge the counts into the main featureCountMap
                    for (Map.Entry<Features, Integer> entry : fileFeatureCounts.entrySet()) {
                        featureCountMap.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).add(entry.getValue());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // Print the results or use them as needed
            System.out.println("Analyzed " + javaFiles.length + " files");
            System.out.println("Feature count map: " + featureCountMap);
            System.out.println(createTable(featureCountMap, javaFiles.length));
        } else {
            System.out.println("No .java files found in the specified directory.");
        }
    }

    public static int getLoC(String source) {
        if (source == null || source.isEmpty()) {
            return 0;
        }

        String[] lines = source.split("\n");
        int locCount = 0;
        boolean inBlockComment = false;

        for (String line : lines) {
            line = line.trim();

            // Ignore blank lines
            if (line.isEmpty()) {
                continue;
            }

            // Check for end of block comments
            if (inBlockComment) {
                if (line.contains("*/")) {
                    inBlockComment = false;
                }
                continue;
            }

            // Check for single-line comments
            if (line.startsWith("//")) {
                continue;
            }

            // Check for start of block comments
            if (line.startsWith("/*")) {
                inBlockComment = true;
                continue;
            }

            // Count as LoC if it reaches here (actual code line)
            locCount++;
        }

        return locCount;
    }

    public static String createTable(Map<Features, List<Integer>> featureCountMap, int fileCounts) {
        StringBuilder csvBuilder = new StringBuilder();

        // Add CSV header
        csvBuilder.append("Feature,Count,Stddev\n");

        // Remove individual counts for these categories
        featureCountMap.remove(Features.WHILE);
        featureCountMap.remove(Features.FOR);
        featureCountMap.remove(Features.DO);
        featureCountMap.remove(Features.INTERFACE_DECL);
        featureCountMap.remove(Features.CLASS_DECL);
        featureCountMap.remove(Features.ENUM_DECL);

        Set<Features> selectedFeatures = Set.of(
                Features.LOC,
                Features.ASSIGNMENT,
                Features.METHOD_CALL,
                Features.FIELD_ACCESS
        );

        selectedFeatures.forEach(features -> featureCountMap.putIfAbsent(features, Collections.emptyList()));

        // Sort the entries by count in descending order
        List<AbstractMap.SimpleImmutableEntry<Features, Integer>> sortedSums = featureCountMap.entrySet()
                .stream()
                .filter(entry -> selectedFeatures.contains(entry.getKey())) // Keep only selected features
                .map(entry -> new AbstractMap.SimpleImmutableEntry<>(entry.getKey(), entry.getValue().stream().mapToInt(Integer::intValue).sum()))
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .toList();


        Map<String, List<Integer>> outputJson = new HashMap<>();

        // Add each feature and its count to the CSV
        for (Map.Entry<Features, Integer> entry : sortedSums) {
            double average = (double) entry.getValue() / fileCounts;
            List<Integer> featureCounts = featureCountMap.get(entry.getKey());

            // Ensure we account for missing file counts by adding zeros for missing entries
            List<Integer> allFeatureCounts = new ArrayList<>(featureCounts);
            while (allFeatureCounts.size() < fileCounts) {
                allFeatureCounts.add(0); // Add 0 for missing files
            }

            outputJson.put(entry.getKey().toString(), allFeatureCounts);

            // Calculate standard deviation
            double variance = 0.0;
            for (int count : allFeatureCounts) {
                variance += Math.pow(count - average, 2);
            }
            variance /= fileCounts; // Divide by fileCounts to get variance
            double stdDeviation = Math.sqrt(variance);

            // Calculate median
            Collections.sort(allFeatureCounts);
            int size = allFeatureCounts.size();

            double median = calculateMedian(allFeatureCounts);

            // Calculate Q1 (First Quartile)
            double q1 = calculateMedian(allFeatureCounts.subList(0, size / 2));

            // Calculate Q3 (Third Quartile)
            double q3 = calculateMedian(allFeatureCounts.subList((size + 1) / 2, size));

            // Calculate IQR (Interquartile Range)
            double iqr = q3 - q1;

            // Append feature statistics to the CSV
            csvBuilder.append(entry.getKey().name())
                    .append(",")
                    .append(String.format("%.2f", median))
                    .append(",")
                    .append(String.format("%.2f", iqr))
                    .append(",")
                    .append(String.format("%.2f", average))
                    .append(",")
                    .append(String.format("%.2f", stdDeviation))
                    .append("\n");
        }

        // Converting to JSON and writing to a file
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = gson.toJson(outputJson);

        try (FileWriter writer = new FileWriter("SnippetFeatureExtraction.json")) {
            writer.write(jsonContent);
            System.out.println("JSON file created: SnippetFeatureExtraction.json");
        } catch (IOException e) {
            System.err.println("An error occurred while writing the JSON file: " + e.getMessage());
        }

        return csvBuilder.toString();
    }

    // Helper method to calculate median of a list
    private static double calculateMedian(List<Integer> list) {
        int size = list.size();
        if (size == 0) return 0.0;

        Collections.sort(list);
        if (size % 2 == 0) {
            return (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
        } else {
            return list.get(size / 2);
        }
    }

    public enum Features {
        LAMBDA,
        INTERFACE_DECL,
        CLASS_DECL,
        ENUM_DECL,
        GENERIC_TYPE,
        WILDCARD_TYPE,
        PARAM_TYPE,
        ANNOTATION,
        TYPE_CAST,
        ARRAY,
        TRY_CATCH,
        CONDITIONAL_EXPR,
        DO,
        WHILE,
        IF,
        FOR,
        SWITCH,
        THIS,
        SUPER,
        ASSERT,
        ASSIGNMENT,
        METHOD_CALL,
        FIELD_ACCESS,

        LOC,
        LOOPS,
        DECLARATIONS, IMPORT,
    }

    public static List<Features> featureExtract(String source) {
        final List<Features> features = new ArrayList<>();
        CompilationUnit cu = Utils.parseSource(source);
        cu.accept(new ASTVisitor() {
            @Override
            public boolean visit(LambdaExpression node) {
//                System.out.println("LambdaExpression" + node);
                features.add(Features.LAMBDA);
                return super.visit(node);
            }

            @Override
            public boolean visit(Modifier node) {
//                System.out.println("Modifier" + node);
                return super.visit(node);
            }

            @Override
            public boolean visit(ParameterizedType node) {
//                System.out.println("ParameterizedType" + node);
                features.add(Features.PARAM_TYPE);
                return super.visit(node);
            }

            @Override
            public boolean visit(ParenthesizedExpression node) {
//                System.out.println("ParenthesizedExpression" + node);
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeDeclaration node) {
//                System.out.println("TypeDeclaration" + node);
//                System.out.println("node.typeParameters()" + node.typeParameters());
//                System.out.println("isInterface" + node.isInterface());
                if (node.isInterface()) {
                    features.add(Features.INTERFACE_DECL);
                } else {
                    features.add(Features.CLASS_DECL);
                }
                if (!node.typeParameters().isEmpty()) {
                    features.add(Features.GENERIC_TYPE);
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeDeclarationStatement node) {
//                System.out.println("TypeDeclarationStatement" + node);
                return super.visit(node);
            }

            @Override
            public boolean visit(WildcardType node) {
//                System.out.println("WildcardType" + node);
                features.add(Features.WILDCARD_TYPE);
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodDeclaration node) {
//                System.out.println("MethodDeclaration" + node);
//                System.out.println("node.typeParameters()" + node.typeParameters());
                if (!node.typeParameters().isEmpty()) {
                    features.add(Features.GENERIC_TYPE);
                }
                return super.visit(node);
            }



            @Override
            public boolean visit(EnumDeclaration node) {
//                System.out.println("EnumDeclaration" + node);
                features.add(Features.ENUM_DECL);
                return super.visit(node);
            }

            @Override
            public boolean visit(ImportDeclaration node) {
//                System.out.println("ImportDeclaration" + node);
                if (node.isStatic()) {
                    return super.visit(node);
                }
                if (node.getName().toString().equals("android.R")) {
                    features.add(Features.IMPORT);
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(MarkerAnnotation node) {
                features.add(Features.ANNOTATION);
                return super.visit(node);
            }

            @Override
            public boolean visit(NormalAnnotation node) {
                features.add(Features.ANNOTATION);
                return super.visit(node);
            }

            @Override
            public boolean visit(SingleMemberAnnotation node) {
                features.add(Features.ANNOTATION);
                return super.visit(node);
            }

            @Override
            public boolean visit(CastExpression node) {
                features.add(Features.TYPE_CAST);
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayAccess node) {
                features.add(Features.ARRAY);
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayCreation node) {
//                features.add(Features.ARRAY);
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayInitializer node) {
//                features.add(Features.ARRAY);
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayType node) {
//                features.add(Features.ARRAY);
                return super.visit(node);
            }

            @Override
            public boolean visit(ConditionalExpression node) {
                features.add(Features.CONDITIONAL_EXPR);
                return super.visit(node);
            }

            @Override
            public boolean visit(DoStatement node) {
                features.add(Features.DO);
                return super.visit(node);
            }

            @Override
            public boolean visit(EnhancedForStatement node) {
                features.add(Features.FOR);
                return super.visit(node);
            }

            @Override
            public boolean visit(ForStatement node) {
                features.add(Features.FOR);
                return super.visit(node);
            }

            @Override
            public boolean visit(IfStatement node) {
                features.add(Features.IF);
                return super.visit(node);
            }

            @Override
            public boolean visit(TryStatement node) {
                features.add(Features.TRY_CATCH);
                return super.visit(node);
            }

            @Override
            public boolean visit(WhileStatement node) {
                features.add(Features.WHILE);
                return super.visit(node);
            }

            @Override
            public boolean visit(SwitchExpression node) {
                features.add(Features.SWITCH);
                return super.visit(node);
            }

            @Override
            public boolean visit(SwitchStatement node) {
                features.add(Features.SWITCH);
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperConstructorInvocation node) {
                features.add(Features.SUPER);
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperFieldAccess node) {
                features.add(Features.SUPER);
                features.add(Features.FIELD_ACCESS);
                return super.visit(node);
            }

            @Override
            public boolean visit(FieldAccess node) {
                features.add(Features.FIELD_ACCESS);
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperMethodInvocation node) {
                features.add(Features.SUPER);
                features.add(Features.METHOD_CALL);
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodInvocation node) {
                features.add(Features.METHOD_CALL);
                return super.visit(node);
            }

            @Override
            public boolean visit(ThisExpression node) {
                features.add(Features.THIS);
                return super.visit(node);
            }

            @Override
            public boolean visit(AssertStatement node) {
                features.add(Features.ASSERT);
                return super.visit(node);
            }

            @Override
            public boolean visit(Assignment node) {
                features.add(Features.ASSIGNMENT);
                return super.visit(node);
            }

            @Override
            public boolean visit(SingleVariableDeclaration node) {
//                features.add(Features.ASSIGNMENT);
                return super.visit(node);
            }

            @Override
            public boolean visit(VariableDeclarationStatement node) {
                for (VariableDeclarationFragment fragment : (List<VariableDeclarationFragment>) node.fragments()) {
                    if (fragment.getInitializer() != null) {
                        features.add(Features.ASSIGNMENT);
                    }
                }

                return super.visit(node);
            }

            @Override
            public boolean visit(FieldDeclaration node) {
                for (VariableDeclarationFragment fragment : (List<VariableDeclarationFragment>) node.fragments()) {
                    if (fragment.getInitializer() != null) {
                        features.add(Features.ASSIGNMENT);
                    }
                }

                return super.visit(node);
            }

            @Override
            public void preVisit(ASTNode node) {
                if (node.toString().equals("=")) {
                    System.out.println("Found =");
                }
                super.preVisit(node);
            }
        });
        return new ArrayList<>(features);
    }
}
