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

public class AddFileTypes {

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
                String methodName = Utils.getUniqueName(rand, "method" + i[0]++);
                // Create the new 'file' method
                MethodDeclaration fileMethod = createFileMethod(ast, methodName);

                // Add the new method to the type declaration
                ListRewrite listRewrite = rewriter.getListRewrite(node, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
                listRewrite.insertLast(fileMethod, null);


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
    }

    // Helper method to add import statements if they do not already exist
    private static void addImportStatements(CompilationUnit compilationUnit, AST ast, ASTRewrite rewriter) {
        ListRewrite importRewrite = rewriter.getListRewrite(compilationUnit, CompilationUnit.IMPORTS_PROPERTY);

        // Imports to be added if not present
        String[] imports = {
                "java.io.FileWriter",
                "java.io.FileReader",
                "java.io.BufferedReader",
                "java.io.IOException"
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


    private static MethodDeclaration createFileMethod(AST ast, String methodName) {
        MethodDeclaration method = ast.newMethodDeclaration();
        method.setName(ast.newSimpleName(methodName));
        method.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
        method.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
        method.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID));

        Block block = ast.newBlock();
        method.setBody(block);

        // Add variable declarations
        VariableDeclarationStatement filePathDecl = createStringVariable(ast, "filePath", "example.txt");
        VariableDeclarationStatement contentDecl = createStringVariable(ast, "content",
                "Hello, this is a sample text for file handling in Java.");

        block.statements().add(filePathDecl);
        block.statements().add(contentDecl);

        // Add write-to-file try-catch block
        TryStatement writeTry = createWriteTryCatch(ast);
        block.statements().add(writeTry);

        // Add read-from-file try-catch block
        TryStatement readTry = createReadTryCatch(ast);
        block.statements().add(readTry);

        return method;
    }

    private static VariableDeclarationStatement createStringVariable(AST ast, String name, String value) {
        VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
        fragment.setName(ast.newSimpleName(name));
        StringLiteral stringLiteral = ast.newStringLiteral();
        stringLiteral.setLiteralValue(value);
        fragment.setInitializer(stringLiteral);
        VariableDeclarationStatement variableDeclarationStatement = ast.newVariableDeclarationStatement(fragment);
        variableDeclarationStatement.setType(ast.newSimpleType(ast.newSimpleName("String")));
        return variableDeclarationStatement;
    }

    private static TryStatement createWriteTryCatch(AST ast) {
        TryStatement tryStatement = ast.newTryStatement();
        // Create resources
        VariableDeclarationExpression writer = createResource(ast, "FileWriter", "writer", "filePath");
        tryStatement.resources().add(writer);

        // Add try block statements
        Block tryBlock = ast.newBlock();
        tryStatement.setBody(tryBlock);

        // writer.write(content);
        MethodInvocation writeInvoke = ast.newMethodInvocation();
        writeInvoke.setExpression(ast.newSimpleName("writer"));
        writeInvoke.setName(ast.newSimpleName("write"));
        writeInvoke.arguments().add(ast.newSimpleName("content"));
        tryBlock.statements().add(ast.newExpressionStatement(writeInvoke));

        // System.out.println("Content written to file successfully.");
        tryBlock.statements().add(createPrintln(ast, "Content written to file successfully."));

        // Catch block for IOException
        tryStatement.catchClauses().add(createCatchClause(ast, "IOException",
                "An error occurred during writing to the file."));

        return tryStatement;
    }

    private static TryStatement createReadTryCatch(AST ast) {
        TryStatement tryStatement = ast.newTryStatement();

        // Create resources
        VariableDeclarationExpression reader = createResource(ast, "FileReader", "reader", "filePath");
        VariableDeclarationExpression bufferedReader = createResource(ast, "BufferedReader", "bufferedReader", "reader");
        tryStatement.resources().add(reader);
        tryStatement.resources().add(bufferedReader);

        // Add try block statements
        Block tryBlock = ast.newBlock();
        tryStatement.setBody(tryBlock);

        // System.out.println("Reading from file:");
        tryBlock.statements().add(createPrintln(ast, "Reading from file:"));

        VariableDeclarationFragment variableDeclarationFragment = ast.newVariableDeclarationFragment();
        variableDeclarationFragment.setName(ast.newSimpleName("line"));
        VariableDeclarationStatement variableDeclarationStatement = ast.newVariableDeclarationStatement(variableDeclarationFragment);
        variableDeclarationStatement.setType(ast.newSimpleType(ast.newSimpleName("String")));
        tryBlock.statements().add(variableDeclarationStatement);

        // while loop to read lines
        WhileStatement whileStatement = ast.newWhileStatement();
        // Create the "bufferedReader.readLine()" method invocation expression
        MethodInvocation readLineInvocation = ast.newMethodInvocation();
        readLineInvocation.setExpression(ast.newSimpleName("bufferedReader"));
        readLineInvocation.setName(ast.newSimpleName("readLine"));

        // Create "line = bufferedReader.readLine()" assignment expression
        Assignment assignmentFragment = ast.newAssignment();
        assignmentFragment.setLeftHandSide(ast.newSimpleName("line"));
        assignmentFragment.setRightHandSide(readLineInvocation);

        // Set the while loop expression to "line = bufferedReader.readLine() != null"
        InfixExpression infixExpression = ast.newInfixExpression();
        infixExpression.setLeftOperand(assignmentFragment);
        infixExpression.setOperator(InfixExpression.Operator.NOT_EQUALS);
        infixExpression.setRightOperand(ast.newNullLiteral());
        whileStatement.setExpression(infixExpression);

        // Create the body of the while loop
        Block whileBody = ast.newBlock();

        // Create "System.out.println(line);" method invocation expression
        MethodInvocation printlnInvocation = ast.newMethodInvocation();
        Name sysout = ast.newName(new String[]{"System", "out"});
        printlnInvocation.setExpression(sysout);
        printlnInvocation.setName(ast.newSimpleName("println"));
        printlnInvocation.arguments().add(ast.newSimpleName("line"));

        // Add the println statement to the while body
        ExpressionStatement printlnStatement = ast.newExpressionStatement(printlnInvocation);
        whileBody.statements().add(printlnStatement);

        // Set the while body
        whileStatement.setBody(whileBody);

        tryBlock.statements().add(whileStatement);

        tryStatement.catchClauses().add(createCatchClause(ast, "IOException",
                "An error occurred during reading the file."));

        return tryStatement;
    }

    private static VariableDeclarationExpression createResource(AST ast, String type, String name, String argument) {
        // Create the variable fragment: "<name> = new <type>(<argument>)"
        VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
        fragment.setName(ast.newSimpleName(name));

        // Create the "new <type>(<argument>)" part of the expression
        ClassInstanceCreation instanceCreation = ast.newClassInstanceCreation();
        instanceCreation.setType(ast.newSimpleType(ast.newSimpleName(type)));
        instanceCreation.arguments().add(ast.newSimpleName(argument));

        // Assign the instance creation to the fragment
        fragment.setInitializer(instanceCreation);

        // Create and return the VariableDeclarationExpression: "<type> <name> = new <type>(<argument>)"
        VariableDeclarationExpression variableDeclarationExpression = ast.newVariableDeclarationExpression(fragment);
        variableDeclarationExpression.setType(ast.newSimpleType(ast.newSimpleName(type)));
        return variableDeclarationExpression;
    }

    private static ExpressionStatement createPrintln(AST ast, String message) {
        MethodInvocation println = ast.newMethodInvocation();
        Name name = ast.newName(new String[]{"System", "out"});
        println.setExpression(name);
        println.setName(ast.newSimpleName("println"));
        StringLiteral stringLiteral = ast.newStringLiteral();
        stringLiteral.setLiteralValue(message);
        println.arguments().add(stringLiteral);
        return ast.newExpressionStatement(println);
    }

    private static CatchClause createCatchClause(AST ast, String exceptionType, String errorMessage) {
        CatchClause catchClause = ast.newCatchClause();
        SingleVariableDeclaration ex = ast.newSingleVariableDeclaration();
        ex.setType(ast.newSimpleType(ast.newSimpleName(exceptionType)));
        ex.setName(ast.newSimpleName("e"));
        catchClause.setException(ex);

        Block catchBlock = ast.newBlock();
        catchBlock.statements().add(createPrintln(ast, errorMessage));

        MethodInvocation printStackTrace = ast.newMethodInvocation();
        printStackTrace.setExpression(ast.newSimpleName("e"));
        printStackTrace.setName(ast.newSimpleName("printStackTrace"));
        catchBlock.statements().add(ast.newExpressionStatement(printStackTrace));

        catchClause.setBody(catchBlock);
        return catchClause;
    }
}
