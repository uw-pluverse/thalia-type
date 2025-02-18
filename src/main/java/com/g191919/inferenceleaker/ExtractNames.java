package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.dom.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ExtractNames {

    public static void main(String[] args) throws IOException {
        ProcessSetting processSetting = Utils.getProcessSetting(args);

        String output = extractName(processSetting.sourceCode());

        System.out.println(output);
        Files.writeString(processSetting.outputPath(), output);
    }

    public static String extractName(String input) {
        CompilationUnit cu = Utils.parseSource(input);

        NameVisitor nameVisitor = new NameVisitor();
        cu.accept(nameVisitor);
//        nameVisitor.getNames().stream().map(n -> n.toString()).distinct().forEach(System.out::println);
//        nameVisitor.getTypes().stream().map(t -> t.toString()).distinct().forEach(System.out::println);
//        nameVisitor.getExpressions().stream().map(e -> e.toString()).distinct().forEach(System.out::println);
        nameVisitor.getInterests().stream().forEach(System.out::println);

        return Stream.concat(Stream.concat(
                        nameVisitor.getPackageDeclaration().stream().map(Object::toString),
                        nameVisitor.getImportDeclaration().stream().map(Object::toString)),
                                nameVisitor.getInterests().stream())
                .collect(Collectors.joining("\n"));
    }

    private static class NameVisitor extends ASTVisitor {

        private final List<Name> names;
        private final List<Type> types;
        private final List<Expression> expressions;
        private final List<String> interests;
        private final List<PackageDeclaration> packageDeclaration;
        private final List<ImportDeclaration> importDeclaration;

        public NameVisitor() {
            names = new ArrayList<>();
            types = new ArrayList<>();
            expressions = new ArrayList<>();
            interests = new ArrayList<>();
            packageDeclaration = new ArrayList<>();
            importDeclaration = new ArrayList<>();
        }

        public List<Name> getNames() {
            return names;
        }

        public List<Type> getTypes() {
            return types;
        }

        public List<Expression> getExpressions() {
            return expressions;
        }

        public List<PackageDeclaration> getPackageDeclaration() {
            return packageDeclaration;
        }

        public List<ImportDeclaration> getImportDeclaration() {
            return importDeclaration;
        }

        public List<String> getInterests() {
            return interests;
        }

        @Override
        public boolean visit(PackageDeclaration node) {
            packageDeclaration.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(ImportDeclaration node) {
            importDeclaration.add(node);
            return false;
        }

        @Override
        public boolean visit(SimpleName node) {
            names.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(QualifiedName node) {
            names.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(SimpleType node) {
            types.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(QualifiedType node) {
            types.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(NameQualifiedType node) {
            types.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(ParameterizedType node) {
            types.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(MarkerAnnotation node) {
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(NormalAnnotation node) {
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(SingleMemberAnnotation node) {
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(MethodInvocation node) {
            expressions.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(SuperMethodInvocation node) {
            expressions.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(ConstructorInvocation node) {
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(SuperConstructorInvocation node) {
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(ClassInstanceCreation node) {
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(FieldAccess node) {
            expressions.add(node);
            interests.add(node.toString());
            return false;
        }

        @Override
        public boolean visit(SuperFieldAccess node) {
            expressions.add(node);
            interests.add(node.toString());
            return false;
        }
    }
}
