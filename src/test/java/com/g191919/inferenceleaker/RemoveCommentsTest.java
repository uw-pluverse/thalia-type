package com.g191919.inferenceleaker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCommentsTest {

    @Test
    void removeComments() {
        String sourceCode = """
        /*
         * This is a block comment
         */
        public class HelloWorld {
            // This is a single line comment
            public static void main(String[] args) {
                System.out.println("Hello, World!"); // Inline comment
            }
        }""";
        String expected = """
                public class HelloWorld {
                
                    public static void main(String[] args) {
                        System.out.println("Hello, World!");
                    }
                }""";
        assertEquals(expected, RemoveComments.removeComments(sourceCode));
    }
}