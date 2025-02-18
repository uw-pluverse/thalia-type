package com.g191919.inferenceleaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AddMoreTypesTest {

    @BeforeAll
    static void setUp() {
        Utils.NUMBERED_NAMES = true;
    }

    @Test
    void addMoreTypes() {
        Assertions.assertEquals("""


                import java.util.logging.Logger;
                import java.util.logging.ConsoleHandler;
                import java.util.logging.FileHandler;
                import java.util.logging.Level;
                import java.util.logging.SimpleFormatter;public class Main {
                    private static final Logger logger0 = Logger.getLogger(Main.class.getName());
                    String a = "";
               
                    public void logMessage() {
                        ConsoleHandler consoleHandler = new ConsoleHandler();
                        FileHandler fileHandler = new FileHandler("application.log", true);
                        fileHandler.setFormatter(new SimpleFormatter());
                        logger0.addHandler(consoleHandler);
                        logger0.addHandler(fileHandler);
                        logger0.setLevel(Level.ALL);
                        logger0.info("Logging from Main");
                    }
                }""",
                AddMoreTypes.addType("""
                public class Main {
                    String a = "";
                }""").replace("\t", "    "));

    }

    @Test
    void addMoreTypesClassInClass() {
        Assertions.assertEquals("""


                import java.util.logging.Logger;
                import java.util.logging.ConsoleHandler;
                import java.util.logging.FileHandler;
                import java.util.logging.Level;
                import java.util.logging.SimpleFormatter;public class Main {
                    private static final Logger logger0 = Logger.getLogger(Main.class.getName());
                    String a = "";
               
                    public static class A {
                        private static final Logger logger1 = Logger.getLogger(A.class.getName());
                        String b = "";
               
                        public void logMessage() {
                            ConsoleHandler consoleHandler = new ConsoleHandler();
                            FileHandler fileHandler = new FileHandler("application.log", true);
                            fileHandler.setFormatter(new SimpleFormatter());
                            logger1.addHandler(consoleHandler);
                            logger1.addHandler(fileHandler);
                            logger1.setLevel(Level.ALL);
                            logger1.info("Logging from A");
                        }
                    }
               
                    public void logMessage() {
                        ConsoleHandler consoleHandler = new ConsoleHandler();
                        FileHandler fileHandler = new FileHandler("application.log", true);
                        fileHandler.setFormatter(new SimpleFormatter());
                        logger0.addHandler(consoleHandler);
                        logger0.addHandler(fileHandler);
                        logger0.setLevel(Level.ALL);
                        logger0.info("Logging from Main");
                    }
                }""",
                AddMoreTypes.addType("""
                public class Main {
                    String a = "";

                    public static class A {
                        String b = "";
                    }
                }""").replace("\t", "    "));

    }

    @Test
    void addMoreTypesAlreadyImported() {
        Assertions.assertEquals("""
                import java.util.logging.Logger;
                import java.util.logging.ConsoleHandler;
                import java.util.logging.FileHandler;
                import java.util.logging.Level;
                import java.util.logging.SimpleFormatter;
                public class Main {
                    private static final Logger logger0 = Logger.getLogger(Main.class.getName());
                    String a = "";
               
                    public void logMessage() {
                        ConsoleHandler consoleHandler = new ConsoleHandler();
                        FileHandler fileHandler = new FileHandler("application.log", true);
                        fileHandler.setFormatter(new SimpleFormatter());
                        logger0.addHandler(consoleHandler);
                        logger0.addHandler(fileHandler);
                        logger0.setLevel(Level.ALL);
                        logger0.info("Logging from Main");
                    }
                }""",
                AddMoreTypes.addType("""
                import java.util.logging.Logger;
                public class Main {
                    String a = "";
                }""").replace("\t", "    "));

    }

}