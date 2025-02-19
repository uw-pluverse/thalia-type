package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AddMoreTypes {

    public static void main(String[] args) throws IOException {
        ProcessSetting setting = Utils.getProcessSetting(args);

        String lowerCode = addType(setting.sourceCode());

        System.out.println(lowerCode);
        Files.writeString(setting.outputPath(), lowerCode);
    }

    protected static String addType(String sourceCode) {
        CompilationUnit compilationUnit = Utils.parseSource(sourceCode);
        AST ast = compilationUnit.getAST();
        ASTRewrite rewriter = ASTRewrite.create(ast);
        Document document = new Document(sourceCode);

        Random rand = new Random(1);
        final int[] i = {0};
        final boolean[] added = {false};

        // Visit each type declaration (i.e., each class)
        compilationUnit.accept(new ASTVisitor() {
            @Override
            public boolean visit(TypeDeclaration node) {
                if (node.isInterface()) {
                    return super.visit(node);
                }
                String loggerName = Utils.getUniqueName(rand, "logger" + i[0]++);
                // 1. Add Logger field
                addLoggerField(node, ast, rewriter, loggerName);

                // 2. Add logging method
                addLoggingMethod(node, ast, rewriter, loggerName);

                added[0] = true;
                return super.visit(node);
            }
        });

        if (added[0]) {
            addImportStatements(compilationUnit, ast, rewriter);
        }

        // Apply changes to the document
        try {
            TextEdit edits = rewriter.rewriteAST(document, null);
            edits.apply(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return document.get();
    }// Helper method to add import statements if they do not already exist
    private static void addImportStatements(CompilationUnit compilationUnit, AST ast, ASTRewrite rewriter) {
        ListRewrite importRewrite = rewriter.getListRewrite(compilationUnit, CompilationUnit.IMPORTS_PROPERTY);

        // Imports to be added if not present
        String[] imports = {
                "java.util.logging.Logger",
                "java.util.logging.ConsoleHandler",
                "java.util.logging.FileHandler",
                "java.util.logging.Level",
                "java.util.logging.SimpleFormatter"
        };

        // Collect existing imports
        Set<String> existingImports = new HashSet<>();
        for (Object importObj : compilationUnit.imports()) {
            ImportDeclaration importDecl = (ImportDeclaration) importObj;
            existingImports.add(importDecl.getName().getFullyQualifiedName());
        }

        // Add each import only if it doesn't already exist
        for (String importName : imports) {
            if (!existingImports.contains(importName)) {
                ImportDeclaration importDeclaration = ast.newImportDeclaration();
                importDeclaration.setName(ast.newName(importName));
                importRewrite.insertLast(importDeclaration, null);
            }
        }
    }

    // Helper method to add the Logger field
    private static void addLoggerField(TypeDeclaration classNode, AST ast, ASTRewrite rewriter, String loggerName) {
        // Create the field declaration: "private static final Logger logger = Logger.getLogger(ClassName.class.getName());"
        VariableDeclarationFragment loggerFragment = ast.newVariableDeclarationFragment();
        loggerFragment.setName(ast.newSimpleName(loggerName));

        // Construct "Logger.getLogger(ClassName.class.getName())"
        MethodInvocation getLoggerInvocation = ast.newMethodInvocation();
        getLoggerInvocation.setExpression(ast.newName("Logger"));
        getLoggerInvocation.setName(ast.newSimpleName("getLogger"));

        TypeLiteral classLiteral = ast.newTypeLiteral();
        classLiteral.setType(ast.newSimpleType(ast.newSimpleName(classNode.getName().getIdentifier())));
        MethodInvocation getNameInvocation = ast.newMethodInvocation();
        getNameInvocation.setExpression(classLiteral);
        getNameInvocation.setName(ast.newSimpleName("getName"));

        getLoggerInvocation.arguments().add(getNameInvocation);

        // Initialize logger field with "Logger.getLogger(ClassName.class.getName())"
        loggerFragment.setInitializer(getLoggerInvocation);

        // Create the field declaration: "private static final Logger logger = ..."
        FieldDeclaration loggerField = ast.newFieldDeclaration(loggerFragment);
        loggerField.setType(ast.newSimpleType(ast.newSimpleName("Logger")));
        loggerField.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PRIVATE_KEYWORD));
        loggerField.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
        loggerField.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.FINAL_KEYWORD));

        // Insert the logger field at the beginning of the class
        ListRewrite listRewrite = rewriter.getListRewrite(classNode, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
        listRewrite.insertFirst(loggerField, null);
    }

    // Helper method to add a logging method
    private static void addLoggingMethod(TypeDeclaration classNode, AST ast, ASTRewrite rewriter, String loggerName) {
        // Create the method declaration: "public void logMessage()"
        MethodDeclaration logMethod = ast.newMethodDeclaration();
        logMethod.setName(ast.newSimpleName("logMessage"));
        logMethod.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID));
        logMethod.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

        Block methodBody = ast.newBlock();

        // Step 2: Set up console and file handlers for the logger
        methodBody.statements().add(createConsoleHandlerDeclaration(ast));
        methodBody.statements().add(createFileHandlerDeclaration(ast));

        // Optional: Set a simple format for log messages in the file
        methodBody.statements().add(createFileFormatterStatement(ast));

        // Step 3: Add handlers to the logger
        methodBody.statements().add(createAddHandlerStatement(ast, loggerName, "consoleHandler"));
        methodBody.statements().add(createAddHandlerStatement(ast, loggerName, "fileHandler"));

        // Step 4: Set the logger level
        methodBody.statements().add(createSetLevelStatement(ast, loggerName));

        // Add a sample log message
        methodBody.statements().add(createLogInfoStatement(ast, loggerName, "Logging from " + classNode.getName().getIdentifier()));

        logMethod.setBody(methodBody);

        // Add the logMessage method to the end of the class body
        ListRewrite listRewrite = rewriter.getListRewrite(classNode, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
        listRewrite.insertLast(logMethod, null);
    }

    // Helper method to create ConsoleHandler declaration
    private static Statement createConsoleHandlerDeclaration(AST ast) {
        VariableDeclarationFragment consoleHandlerFragment = ast.newVariableDeclarationFragment();
        consoleHandlerFragment.setName(ast.newSimpleName("consoleHandler"));
        ClassInstanceCreation classInstanceCreation = ast.newClassInstanceCreation();
        classInstanceCreation.setType(ast.newSimpleType(ast.newSimpleName("ConsoleHandler")));
        consoleHandlerFragment.setInitializer(classInstanceCreation);
        VariableDeclarationStatement variableDeclarationStatement = ast.newVariableDeclarationStatement(consoleHandlerFragment);
        variableDeclarationStatement.setType(ast.newSimpleType(ast.newSimpleName("ConsoleHandler")));
        return variableDeclarationStatement;
    }

    // Helper method to create FileHandler declaration
    private static Statement createFileHandlerDeclaration(AST ast) {
        VariableDeclarationFragment fileHandlerFragment = ast.newVariableDeclarationFragment();
        fileHandlerFragment.setName(ast.newSimpleName("fileHandler"));

        ClassInstanceCreation fileHandlerCreation = ast.newClassInstanceCreation();
        fileHandlerCreation.setType(ast.newSimpleType(ast.newSimpleName("FileHandler")));
        StringLiteral stringLiteral = ast.newStringLiteral();
        stringLiteral.setLiteralValue("application.log");
        fileHandlerCreation.arguments().add(stringLiteral);
        fileHandlerCreation.arguments().add(ast.newBooleanLiteral(true)); // append = true

        fileHandlerFragment.setInitializer(fileHandlerCreation);
        VariableDeclarationStatement variableDeclarationStatement = ast.newVariableDeclarationStatement(fileHandlerFragment);
        variableDeclarationStatement.setType(ast.newSimpleType(ast.newSimpleName("FileHandler")));
        return variableDeclarationStatement;
    }

    // Helper method to set FileHandler's formatter
    private static Statement createFileFormatterStatement(AST ast) {
        MethodInvocation setFormatter = ast.newMethodInvocation();
        setFormatter.setExpression(ast.newSimpleName("fileHandler"));
        setFormatter.setName(ast.newSimpleName("setFormatter"));
        ClassInstanceCreation classInstanceCreation = ast.newClassInstanceCreation();
        classInstanceCreation.setType(ast.newSimpleType(ast.newSimpleName("SimpleFormatter")));
        setFormatter.arguments().add(classInstanceCreation);
        return ast.newExpressionStatement(setFormatter);
    }

    // Helper method to add handler to logger
    private static Statement createAddHandlerStatement(AST ast, String loggerName, String handlerName) {
        MethodInvocation addHandler = ast.newMethodInvocation();
        addHandler.setExpression(ast.newSimpleName(loggerName));
        addHandler.setName(ast.newSimpleName("addHandler"));
        addHandler.arguments().add(ast.newSimpleName(handlerName));
        return ast.newExpressionStatement(addHandler);
    }

    // Helper method to set the logger level
    private static Statement createSetLevelStatement(AST ast, String loggerName) {
        MethodInvocation setLevel = ast.newMethodInvocation();
        setLevel.setExpression(ast.newSimpleName(loggerName));
        setLevel.setName(ast.newSimpleName("setLevel"));
        setLevel.arguments().add(ast.newName("Level.ALL"));
        return ast.newExpressionStatement(setLevel);
    }

    // Helper method to create a log message statement
    private static Statement createLogInfoStatement(AST ast, String loggerName, String message) {
        MethodInvocation infoInvocation = ast.newMethodInvocation();
        infoInvocation.setExpression(ast.newSimpleName(loggerName));
        infoInvocation.setName(ast.newSimpleName("info"));

        StringLiteral logMessage = ast.newStringLiteral();
        logMessage.setLiteralValue(message);
        infoInvocation.arguments().add(logMessage);

        return ast.newExpressionStatement(infoInvocation);
    }

}
