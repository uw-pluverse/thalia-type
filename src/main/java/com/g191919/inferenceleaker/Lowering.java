package com.g191919.inferenceleaker;

import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Predicate;

public class Lowering {
    public static void main(String[] args) throws IOException {
        ProcessSetting setting = Utils.getProcessSetting(args);

        String lowerCode = lower(setting.sourceCode());

        System.out.println(lowerCode);
        Files.writeString(setting.outputPath(), lowerCode);
    }

    public static String lower(String input) {
        int i = 0;
        Random random = new Random(0);

        while (true) {
            CompilationUnit compilationUnit = Utils.parseSource(input);
            AST ast = compilationUnit.getAST();
            ASTRewrite rewriter = ASTRewrite.create(ast);
            Document document = new Document(input);

            CollectLowerable lowerables = new CollectLowerable();
            compilationUnit.accept(lowerables);
            List<Expression> nodes = lowerables.getNodes().stream()
                    .filter(Lowering::hasParentBlock)
                    .filter(Predicate.not(Lowering::isExpressionStatement))
                    .filter(Predicate.not(Lowering::isForWhileExpression))
                    .toList();
            if (nodes.isEmpty()) {
                break;
            }
            Expression node = nodes.get(0);
            System.out.println("node = " + node);
            VariableDeclarationFragment variableDeclarationFragment = ast.newVariableDeclarationFragment();
            SimpleName simpleName = ast.newSimpleName(Utils.getUniqueName(random, "loweredV" + i));
            i++;
            variableDeclarationFragment.setName(simpleName);
            variableDeclarationFragment.setInitializer((Expression) rewriter.createCopyTarget(node));
            VariableDeclarationStatement variableDeclarationStatement = ast.newVariableDeclarationStatement(variableDeclarationFragment);
            variableDeclarationStatement.setType(ast.newSimpleType(ast.newSimpleName("var")));
            try {
                Block parentBlock = getParentBlock(node);
                ListRewrite listRewrite = rewriter.getListRewrite(parentBlock, Block.STATEMENTS_PROPERTY);
                ASTNode statementInParentBlock = getStatementInParentBlock(node, parentBlock);
                listRewrite.insertBefore(variableDeclarationStatement, statementInParentBlock, null);
            } catch (RuntimeException e) {
                System.out.println("e.getMessage() = " + e.getMessage());
                System.err.println("e.getMessage() = " + e.getMessage());
                if (e.getMessage().equals("Could not get parent block")) {
                    System.out.println("no parent block on " + node);
                    System.err.println("no parent block on " + node);
                }
                throw e;
            }
            rewriter.replace(node, simpleName, null);
            TextEdit edits = rewriter.rewriteAST(document, null);
            try {
                edits.apply(document);
            } catch (Exception e) {
                e.printStackTrace();
            }
            input = document.get();
        }

        while (true) {
            CompilationUnit compilationUnit = Utils.parseSource(input);
            AST ast = compilationUnit.getAST();
            ASTRewrite rewriter = ASTRewrite.create(ast);
            Document document = new Document(input);

            CollectLowerField lowerables = new CollectLowerField();
            compilationUnit.accept(lowerables);
            List<FieldDeclaration> nodes = lowerables.getFoundNoInitNodes().stream().toList();
            if (nodes.isEmpty()) {
                break;
            }

            FieldDeclaration node = nodes.get(0);
            System.out.println("node = " + node);
            for (VariableDeclarationFragment fragment : (List<VariableDeclarationFragment>) node.fragments()) {
                NullLiteral nullLiteral = ast.newNullLiteral();
                rewriter.set(fragment, VariableDeclarationFragment.INITIALIZER_PROPERTY, nullLiteral, null);
            }

            TextEdit edits = rewriter.rewriteAST(document, null);
            try {
                edits.apply(document);
            } catch (Exception e) {
                e.printStackTrace();
            }
            input = document.get();
        }

        while (true) {
            CompilationUnit compilationUnit = Utils.parseSource(input);
            AST ast = compilationUnit.getAST();
            ASTRewrite rewriter = ASTRewrite.create(ast);
            Document document = new Document(input);

            CollectLowerField lowerables = new CollectLowerField();
            compilationUnit.accept(lowerables);
            List<Map.Entry<FieldDeclaration, Boolean>> nodes = new ArrayList<>();
            lowerables.getFoundNonStaticNodes().forEach(node -> nodes.add(new AbstractMap.SimpleImmutableEntry<>(node, false)));
            lowerables.getFoundStaticNodes().forEach(node -> nodes.add(new AbstractMap.SimpleImmutableEntry<>(node, true)));
            if (nodes.isEmpty()) {
                return document.get();
            }
            Map.Entry<FieldDeclaration, Boolean> entries = nodes.get(0);
            FieldDeclaration node = entries.getKey();
            boolean isStatic = entries.getValue();
            System.out.println("node = " + node);
            Initializer initBlock = getInitBlock(node, rewriter, isStatic);
            for (VariableDeclarationFragment fragment : (List<VariableDeclarationFragment>) node.fragments()) {
                Assignment assignment = ast.newAssignment();
                assignment.setLeftHandSide((SimpleName) rewriter.createCopyTarget(fragment.getName()));
                assignment.setRightHandSide((Expression) rewriter.createCopyTarget(fragment.getInitializer()));
                ExpressionStatement expressionStatement = ast.newExpressionStatement(assignment);
                rewriter.getListRewrite(initBlock.getBody(), Block.STATEMENTS_PROPERTY).insertFirst(expressionStatement, null);
                rewriter.remove(fragment.getInitializer(), null);
            }

            TextEdit edits = rewriter.rewriteAST(document, null);
            try {
                edits.apply(document);
            } catch (Exception e) {
                e.printStackTrace();
            }
            input = document.get();
        }
    }

    public static boolean isExpressionStatement(Expression node) {
        return node.getParent() instanceof ExpressionStatement;
    }

    public static boolean isName(ASTNode node) {
        if (node instanceof Name) {
            return true;
        }
        return false;
    }

    public static boolean isForWhileExpression(ASTNode node) {
        if (node instanceof Expression) {
            if (node.getParent() instanceof ForStatement) {
                ForStatement forStatement = (ForStatement) node.getParent();
                return forStatement.getExpression() == node;
            }
            if (node.getParent() instanceof WhileStatement) {
                WhileStatement whileStatement = (WhileStatement) node.getParent();
                return whileStatement.getExpression() == node;
            }
        }
        return false;
    }

    public static boolean hasParentBlock(Expression node) {
        ASTNode parent = node;
        Set<ASTNode> visited = new HashSet<>();
        while (parent != null) {
            if (visited.contains(parent)) {
                break;
            }
            visited.add(parent);
            if (parent instanceof Block) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public static Block getParentBlock(Expression node) {
        ASTNode parent = node;
        Set<ASTNode> visited = new HashSet<>();
        while (parent != null) {
            if (visited.contains(parent)) {
                break;
            }
            visited.add(parent);
            if (parent instanceof Block) {
                return (Block) parent;
            }
            parent = parent.getParent();
        }
        throw new RuntimeException("Could not get parent block");
    }

    public static ASTNode getStatementInParentBlock(Expression node, Block parentBlock) {
        ASTNode parent = node;
        Set<ASTNode> visited = new HashSet<>();
        while (parent != null) {
            if (visited.contains(parent)) {
                break;
            }
            visited.add(parent);
            if (parent.getParent() == parentBlock) {
                return parent;
            }
            parent = parent.getParent();
        }
        throw new RuntimeException("Could not get statement in parent block");
    }

    private static class CollectLowerable extends ASTVisitor {

        private final LinkedHashSet<Expression> ignoredNodes;
        private final LinkedHashSet<Expression> foundNodes;

        public CollectLowerable() {
            this(new LinkedHashSet<>());
        }

        public CollectLowerable(Set<Expression> ignoredNodes) {
            this.ignoredNodes = new LinkedHashSet<>(ignoredNodes);
            this.foundNodes = new LinkedHashSet<>();
        }

        public List<Expression> getNodes() {
            List<Expression> nodes = new ArrayList<>(foundNodes);
            nodes.removeAll(ignoredNodes);
            return nodes;
        }

        @Override
        public boolean visit(ImportDeclaration node) {
            return false;
        }

        @Override
        public boolean visit(ModuleDeclaration node) {
            return false;
        }

        @Override
        public boolean visit(PackageDeclaration node) {
            return false;
        }

        @Override
        public boolean visit(VariableDeclarationFragment node) {
            ignoredNodes.add(node.getInitializer());
            return super.visit(node);
        }

        @Override
        public boolean visit(Assignment node) {
            ignoredNodes.add(node.getRightHandSide());
            return super.visit(node);
        }

        @Override
        public boolean visit(MethodInvocation node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(InfixExpression node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(NullLiteral node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(NumberLiteral node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(BooleanLiteral node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(CharacterLiteral node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(StringLiteral node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(FieldAccess node) {
            if (node.getExpression() != null) {
                foundNodes.add(node);
            }
            return false;
        }

        @Override
        public boolean visit(ArrayInitializer node) {
            System.out.println("ArrayInitializer node = " + node);
            ignoredNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(NameQualifiedType node) {
            return false;
        }

        @Override
        public boolean visit(QualifiedType node) {
            return false;
        }

        @Override
        public boolean visit(QualifiedName node) {
            foundNodes.add(node);
            return false;
        }

        @Override
        public boolean visit(SimpleType node) {
            return false;
        }

        @Override
        public boolean visit(ClassInstanceCreation node) {
            foundNodes.add(node);
            return super.visit(node);
        }

        @Override
        public boolean visit(InstanceofExpression node) {
            foundNodes.add(node);
            return super.visit(node);
        }
    }

    private static boolean isStatic(BodyDeclaration node) {
        return (node.getModifiers() & Modifier.STATIC) == 0;
    }

    private static class CollectLowerField extends ASTVisitor {
        private final LinkedHashSet<FieldDeclaration> foundStaticNodes;
        private final LinkedHashSet<FieldDeclaration> foundNonStaticNodes;
        private final LinkedHashSet<FieldDeclaration> foundNoInitNodes;

        private CollectLowerField() {
            this.foundStaticNodes = new LinkedHashSet<>();
            this.foundNonStaticNodes = new LinkedHashSet<>();
            this.foundNoInitNodes = new LinkedHashSet<>();
        }

        public LinkedHashSet<FieldDeclaration> getFoundStaticNodes() {
            return foundStaticNodes;
        }

        public LinkedHashSet<FieldDeclaration> getFoundNonStaticNodes() {
            return foundNonStaticNodes;
        }

        public LinkedHashSet<FieldDeclaration> getFoundNoInitNodes() {
            return foundNoInitNodes;
        }

        @Override
        public boolean visit(FieldDeclaration node) {
            for (VariableDeclarationFragment fragment : (List<VariableDeclarationFragment>) node.fragments()) {
                Expression initializer = fragment.getInitializer();
                if (initializer != null && initializer instanceof ArrayInitializer) {
                    continue;
                }
                if (initializer != null) {
                    if (isStatic(node)) {
                        foundNonStaticNodes.add(node);
                    } else {
                        foundStaticNodes.add(node);
                    }
                } else {
                    foundNoInitNodes.add(node);
                }
            }
            return super.visit(node);
        }

        @Override
        public boolean visit(AnonymousClassDeclaration node) {
            return false;
        }
        @Override
        public boolean visit(EnumDeclaration node) {
            return false;
        }
    }

    private static Initializer getInitBlock(FieldDeclaration expression, ASTRewrite rewriter, boolean isStatic) {
        TypeDeclaration classDefinition = (TypeDeclaration) expression.getParent();
        AST ast = classDefinition.getAST();
        Initializer initializer = ast.newInitializer();
        Block block = ast.newBlock();
        initializer.setBody(block);
        if (isStatic) {
            initializer.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
        }
        rewriter.getListRewrite(classDefinition, TypeDeclaration.BODY_DECLARATIONS_PROPERTY).insertFirst(initializer, null);
        return initializer;
    }
}
