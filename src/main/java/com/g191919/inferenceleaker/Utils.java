package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Utils {
    public static ProcessSetting getProcessSetting(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: java VariableCollector <input path> <output path>");
            System.exit(1);
        }

        Path inputPath = Paths.get(args[0]);
        Path outputPath = Paths.get(args[1]);
        if (Files.exists(outputPath)) {
            System.err.println("Output file already exists: " + outputPath);
            System.exit(1);
        }
        String sourceCode = new String(Files.readAllBytes(inputPath));
        ProcessSetting result = new ProcessSetting(outputPath, sourceCode);
        return result;
    }

    public static CompilationUnit parseSource(String source) {
        // Set up the AST parser
        ASTParser parser = ASTParser.newParser(AST.JLS21);
        parser.setSource(source.toCharArray());
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setResolveBindings(true);
        parser.setBindingsRecovery(true);

        // Set up the AST parser options
        Map<String, String> options = JavaCore.getOptions();
        options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_17);
        parser.setCompilerOptions(options);

        // Parse the source code
        return (CompilationUnit) parser.createAST(null);
    }

    public static String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static boolean NUMBERED_NAMES = Boolean.parseBoolean(System.getenv().getOrDefault("NUMBERED_NAMES", "false"));
    public static String getUniqueName(Random random, String numberedName) {
        if (NUMBERED_NAMES) {
            return numberedName;
        }
        return generateRandomName(random);
    }

    protected static final Set<String> randomNamesHistory = new HashSet<>();
    protected static final List<String> words = new ArrayList<>();
    protected static int NAME_LENGTH = 3;
    public static String generateRandomName(Random random) {
        if (words.isEmpty()) {
            try (InputStream inputStream = Utils.class.getResourceAsStream("/words")) {
                if (inputStream == null) {
                    throw new IOException("Expected to have resource file /words");
                }
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                // Read all words into a list
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().isEmpty()) {
                        continue;
                    }
                    words.add(line.trim());  // Add each word to the set (and trim to remove unnecessary spaces)
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        String randomName = "";
        for (int i = 0; i < NAME_LENGTH; i++) {
            randomName += capitalize(words.get(random.nextInt(words.size())));
        }
        if (randomNamesHistory.contains(randomName)) {
            return generateRandomName(random);
        }
        randomNamesHistory.add(randomName);
        return randomName;
    }
}
