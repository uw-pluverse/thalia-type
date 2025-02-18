package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractImport {
    public static void main(String[] args) throws IOException {
        ProcessSetting setting = Utils.getProcessSetting(args);

        ExtractImport extractImport = new ExtractImport();
        String extracted = extractImport.processSource(setting.sourceCode());
        System.out.println(extracted);
        Files.writeString(setting.outputPath(), extracted);
    }

    public String processSource(String sourceCode) {
        CompilationUnit compilationUnit = Utils.parseSource(sourceCode);
        List<String> imports = extractImports(compilationUnit);
        return rewriteImports(sourceCode, imports);
    }

    public List<String> extractImports(CompilationUnit compilationUnit) {
        List<String> fqns = new ArrayList<>();
        compilationUnit.accept(new ASTVisitor() {
            @Override
            public boolean visit(PackageDeclaration node) {
                return false;
            }

            @Override
            public boolean visit(QualifiedName node) {
                fqns.add(node.getFullyQualifiedName());
                return false;
            }

            @Override
            public boolean visit(SimpleName node) {
                if (node.resolveBinding() != null && node.resolveBinding().getJavaElement() != null) {
                    String fqn = node.resolveBinding().getJavaElement().getElementName();
                    if (!fqns.contains(fqn)) {
                        fqns.add(fqn);
                    }
                }
                return super.visit(node);
            }
        });

        return fqns.stream().distinct().collect(Collectors.toList());
    }

    public String rewriteImports(String sourceCode, List<String> imports) {
        CompilationUnit cu = Utils.parseSource(sourceCode);
        // Create a rewrite object to track changes
        AST ast = cu.getAST();
        ASTRewrite rewriter = ASTRewrite.create(ast);

        List<String> importsToAdd = new ArrayList<>();

        cu.accept(new ASTVisitor() {
            @Override
            public boolean visit(QualifiedName node) {
                String fullyQualifiedName = node.getFullyQualifiedName();
                String identifier = node.getName().getIdentifier();
                if (imports.contains(fullyQualifiedName)) {
                    rewriter.replace(node, ast.newSimpleName(identifier), null);
                    importsToAdd.add(fullyQualifiedName);
                    return false;
                }
                return super.visit(node);
            }
        });

        for (String fqn : importsToAdd.stream().distinct().toList()) {
            ImportDeclaration importDeclaration = ast.newImportDeclaration();
            String[] names = fqn.split("\\.");
            if (isJavaLang(names)) {
                continue;
            }
            importDeclaration.setName(ast.newName(names));
            rewriter.getListRewrite(cu, CompilationUnit.IMPORTS_PROPERTY).insertLast(importDeclaration, null);
        }

        // Apply the changes to the document
        Document document = new Document(sourceCode);
        TextEdit edits = rewriter.rewriteAST(document, null);
        try {
            edits.apply(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Return the modified source code
        return document.get();
    }

    public boolean isJavaLang(String[] names) {
        return names.length == 3 && names[0].equals("java") && names[1].equals("lang");
    }
}
