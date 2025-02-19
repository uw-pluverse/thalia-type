package com.g191919.inferenceleaker;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jface.text.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveComments {

    public static void main(String[] args) throws IOException {
        ProcessSetting setting = Utils.getProcessSetting(args);

        String renamedCode = removeComments(setting.sourceCode());

        System.out.println(renamedCode);
        Files.writeString(setting.outputPath(), renamedCode);
    }

    public static String removeComments(String sourceCode) {

        // Step 1: Set up ASTParser
        ASTParser parser = ASTParser.newParser(AST.JLS20);
        parser.setSource(sourceCode.toCharArray());
        parser.setKind(ASTParser.K_COMPILATION_UNIT);

        // Step 2: Parse the code into a CompilationUnit (AST root)
        CompilationUnit cu = (CompilationUnit) parser.createAST(null);
        cu.recordModifications();

        // Step 3: Collect and remove comments
        List<Comment> comments = new ArrayList<>((List<Comment>) cu.getCommentList());
        comments.sort(Comparator.comparingInt(Comment::getStartPosition));
        Collections.reverse(comments);
        String s = sourceCode;
        for (Comment comment : comments) {
            s = s.substring(0, comment.getStartPosition()) + s.substring(comment.getStartPosition() + comment.getLength());
        }

        // Print the resulting source code
        System.out.println(s);
        return Arrays.stream(s.strip().split("\n")).map(String::stripTrailing).collect(Collectors.joining("\n"));
    }

}
