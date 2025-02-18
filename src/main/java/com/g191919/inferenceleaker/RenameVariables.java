package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RenameVariables {
    public static void main(String[] args) throws IOException {
        ProcessSetting setting = Utils.getProcessSetting(args);

        String renamedCode = renameVariables(setting.sourceCode());

        System.out.println(renamedCode);
        Files.writeString(setting.outputPath(), renamedCode);
    }

    public static String renameVariables(String sourceCode) {
        Random random = new Random(0);
        RenameVariables renameVariables = new RenameVariables();
        CompilationUnit cu = Utils.parseSource(sourceCode);
        List<String>[] variablesAndBlacklist = renameVariables.collectVariables(cu);
        List<String> variables = variablesAndBlacklist[0];
        List<String> methods = variablesAndBlacklist[1];
        List<String> methodBlackList = variablesAndBlacklist[2];
        methods = methods.stream()
                .filter(s -> !s.equals("apply"))
                .filter(s -> !methodBlackList.contains(s))
                .collect(Collectors.toList());
        System.out.println("variables = " + variables);
        String renamedCode = sourceCode;
        for (int i = 0; i < variables.size(); i++) {
            String variable = variables.get(i);
            renamedCode = renameVariables.renameVariable(renamedCode, variable, Utils.getUniqueName(random, "v" + i));
        }
        System.out.println("methods = " + methods);
        for (int i = 0; i < methods.size(); i++) {
            String method = methods.get(i);
            renamedCode = renameVariables.renameMethod(renamedCode, method, Utils.getUniqueName(random, "m" + i));
        }
        return renamedCode;
    }

    public List<String>[] collectVariables(CompilationUnit cu) {
        // Create a list to hold the variable names
        List<String> variableNames = new ArrayList<>();
        List<String> methodNames = new ArrayList<>();
        List<String> methodNamesBlackList = new ArrayList<>();

        // Visit the AST nodes to collect variable names
        cu.accept(new ASTVisitor() {
            @Override
            public boolean visit(VariableDeclarationFragment node) {
                SimpleName name = node.getName();
                if (!variableNames.contains(name.getIdentifier())) {
                    variableNames.add(name.getIdentifier());
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(SingleVariableDeclaration node) {
                SimpleName name = node.getName();
                if (!variableNames.contains(name.getIdentifier())) {
                    variableNames.add(name.getIdentifier());
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodDeclaration node) {
                SimpleName name = node.getName();
                IMethodBinding methodBinding = node.resolveBinding();
                if (methodBinding != null) {
                    if (Arrays.stream(methodBinding.getAnnotations()).anyMatch(annotation -> annotation.getName().equals("Override"))) {
                        return super.visit(node);
                    }
                }
                for (Object modifier : node.modifiers()) {
                    if (modifier instanceof MarkerAnnotation) {
                        MarkerAnnotation annotation = (MarkerAnnotation) modifier;
                        if (annotation.getTypeName().getFullyQualifiedName().equals("Override") || annotation.getTypeName().getFullyQualifiedName().equals("java.lang.Override")) {
                            return super.visit(node); // Skip method if it has @Override annotation
                        }
                    } else if (modifier instanceof NormalAnnotation) {
                        NormalAnnotation annotation = (NormalAnnotation) modifier;
                        if (annotation.getTypeName().getFullyQualifiedName().equals("Override") || annotation.getTypeName().getFullyQualifiedName().equals("java.lang.Override")) {
                            return super.visit(node); // Skip method if it has @Override annotation
                        }
                    }
                }
                if (!methodNames.contains(name.getIdentifier())) {
                    methodNames.add(name.getIdentifier());
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeDeclaration node) {
                SimpleName name = node.getName();
                if (!variableNames.contains(name.getIdentifier())) {
                    variableNames.add(name.getIdentifier());
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(PackageDeclaration node) {
                Name name = node.getName();
                if (!variableNames.contains(name.getFullyQualifiedName())) {
                    variableNames.add(name.getFullyQualifiedName());
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperFieldAccess node) {
                methodNamesBlackList.add(node.getName().getIdentifier());
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperMethodInvocation node) {
                methodNamesBlackList.add(node.getName().getIdentifier());
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperMethodReference node) {
                methodNamesBlackList.add(node.getName().getIdentifier());
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodInvocation node) {
                if (node.getExpression() != null) {
                    methodNamesBlackList.add(node.getName().getIdentifier());
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(ExpressionMethodReference node) {
                methodNamesBlackList.add(node.getName().getIdentifier());
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeMethodReference node) {
                methodNamesBlackList.add(node.getName().getIdentifier());
                return super.visit(node);
            }
        });

        return new List[]{variableNames, methodNames, methodNamesBlackList};
    }

    public String renameVariable(String source, String oldName, String newName) {
        CompilationUnit cu = Utils.parseSource(source);
        // Create a rewrite object to track changes
        AST ast = cu.getAST();
        ASTRewrite rewriter = ASTRewrite.create(ast);

        // Visit the AST and rename the variables
        cu.accept(new ASTVisitor() {
            @Override
            public boolean visit(SimpleName node) {
                if (node.getParent() instanceof MethodInvocation && node.equals(((MethodInvocation) node.getParent()).getName())) {
                    return super.visit(node);
                }
                if (node.getParent() instanceof TypeMethodReference && node.equals(((TypeMethodReference) node.getParent()).getName())) {
                    return super.visit(node);
                }
                if (node.getParent() instanceof ExpressionMethodReference && node.equals(((ExpressionMethodReference) node.getParent()).getName())) {
                    return super.visit(node);
                }
                if (node.getParent() instanceof MethodDeclaration && node.equals(((MethodDeclaration) node.getParent()).getName())) {
                    return super.visit(node);
                }
                if (node.getParent().toString().equals("org.hibernate")) {
                    return super.visit(node);
                }
                if (node.getIdentifier().equals(oldName)) {
                    SimpleName newNameNode = ast.newSimpleName(newName);
                    rewriter.replace(node, newNameNode, null);
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(PackageDeclaration node) {
                if (node.getName().getFullyQualifiedName().equals(oldName)) {
                    PackageDeclaration packageDeclaration = ast.newPackageDeclaration();
                    SimpleName newNameNode = ast.newSimpleName(newName);
                    packageDeclaration.setName(newNameNode);
                    rewriter.replace(node, packageDeclaration, null);
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(ImportDeclaration node) {
                return false;
            }

        });

        // Apply the changes to the document
        Document document = new Document(source);
        TextEdit edits = rewriter.rewriteAST(document, null);
        try {
            edits.apply(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Return the modified source code
        return document.get();
    }

    public String renameMethod(String source, String oldName, String newName) {
        CompilationUnit cu = Utils.parseSource(source);
        // Create a rewrite object to track changes
        AST ast = cu.getAST();
        ASTRewrite rewriter = ASTRewrite.create(ast);

        // Visit the AST and rename the variables
        cu.accept(new ASTVisitor() {

            private void rename(SimpleName name) {
                if (name.getIdentifier().equals(oldName)) {
                    SimpleName newNameNode = ast.newSimpleName(newName);
                    rewriter.replace(name, newNameNode, null);
                }
            }

            @Override
            public boolean visit(MethodInvocation node) {
                if (node.getExpression() == null) {
                    rename(node.getName());
                }
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodDeclaration node) {
                rename(node.getName());
                return super.visit(node);
            }
        });

        // Apply the changes to the document
        Document document = new Document(source);
        TextEdit edits = rewriter.rewriteAST(document, null);
        try {
            edits.apply(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Return the modified source code
        return document.get();
    }
}

