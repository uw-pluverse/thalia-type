package com.g191919.inferenceleaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AddFileTypesTest {

    @BeforeAll
    static void setUp() {
        Utils.NUMBERED_NAMES = true;
    }

    @Test
    void addMoreTypes() {
        Assertions.assertEquals("""
                        
                        
                        import java.io.FileWriter;
                        import java.io.FileReader;
                        import java.io.BufferedReader;
                        import java.io.IOException;public class Main {
                            String a = "";
                        
                            public static void method0(){String filePath="example.txt";String content="Hello, this is a sample text for file handling in Java.";try (FileWriter writer=new FileWriter(filePath)) {writer.write(content);System.out.println("Content written to file successfully.");} catch (IOException e){System.out.println("An error occurred during writing to the file.");e.printStackTrace();}try (FileReader reader=new FileReader(filePath);BufferedReader bufferedReader=new BufferedReader(reader)) {System.out.println("Reading from file:");String line;while (line=bufferedReader.readLine() != null){System.out.println(line);}} catch (IOException e){System.out.println("An error occurred during reading the file.");e.printStackTrace();}}
                        }""",
                AddFileTypes.addType("""
                        public class Main {
                            String a = "";
                        }""").replace("\t", "    "));
    }
}