package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ReorderClass {

    public static void main(String[] args) throws IOException {
        ProcessSetting processSetting = Utils.getProcessSetting(args);

        String renamedCode = reorderClass(processSetting.sourceCode());

        System.out.println(renamedCode);
        Files.writeString(processSetting.outputPath(), renamedCode);
    }

    public static String reorderClass(String source) {
        CompilationUnit compilationUnit = Utils.parseSource(source);
        TypeDeclarationVisitor typeDeclarationVisitor = new TypeDeclarationVisitor();
        compilationUnit.accept(typeDeclarationVisitor);
        Map<TypeDeclaration, List<BodyDeclaration>> typeToBodyDeclarations = typeDeclarationVisitor.getTypeToBodyDeclarations();
        compilationUnit.recordModifications();
        ASTRewrite astRewrite = ASTRewrite.create(compilationUnit.getAST());
        for (Map.Entry<TypeDeclaration, List<BodyDeclaration>> typeDeclarationListEntry : typeToBodyDeclarations.entrySet()) {
            TypeDeclaration typeDeclaration = typeDeclarationListEntry.getKey();
            System.out.println("typeDeclaration.getName() = " + typeDeclaration.getName());
            ListRewrite listRewrite = astRewrite.getListRewrite(typeDeclaration, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
            List<BodyDeclaration> bodyDeclarations = new ArrayList<>((List<BodyDeclaration>) listRewrite.getOriginalList());
            for (BodyDeclaration bodyDeclaration : bodyDeclarations) {
                listRewrite.remove(bodyDeclaration, null);
            }
            Collections.shuffle(bodyDeclarations, new Random(1L));
            for (BodyDeclaration bodyDeclaration : bodyDeclarations) {
                listRewrite.insertLast(bodyDeclaration, null);
            }
        }
        Document document = new Document(source);
        TextEdit edits = astRewrite.rewriteAST(document, null);
        try {
            edits.apply(document);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return document.get();
    }

    private static class TypeDeclarationVisitor extends ASTVisitor {
        private Map<TypeDeclaration, List<BodyDeclaration>> typeToBodyDeclarations = new HashMap<>();

        public Map<TypeDeclaration, List<BodyDeclaration>> getTypeToBodyDeclarations() {
            return typeToBodyDeclarations;
        }

        @Override
        public boolean visit(TypeDeclaration node) {
            FieldDeclaration[] fields = node.getFields();
            MethodDeclaration[] methods = node.getMethods();
            TypeDeclaration[] types = node.getTypes();
            List<BodyDeclaration> declarations = new ArrayList<>();
            declarations.addAll(List.of(fields));
            declarations.addAll(List.of(methods));
            declarations.addAll(List.of(types));
            typeToBodyDeclarations.put(node, declarations);
            return super.visit(node);
        }
    }
}
