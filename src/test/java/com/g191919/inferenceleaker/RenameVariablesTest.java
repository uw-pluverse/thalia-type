package com.g191919.inferenceleaker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RenameVariablesTest {

    @BeforeAll
    static void setUp() {
        Utils.NUMBERED_NAMES = true;
    }

    @Test
    void renameVariables() {
        String sourceCode = """
                public class Test {
                    private int myVariable;
                    public void method() {
                        int myVariable = 0;
                        myVariable++;
                    }
                    public void method1() {
                        method();
                        int method = 1;
                        method++;
                    }
                }""";
        String expected = """
                public class v0 {
                    private int v1;
                    public void m0() {
                        int v1 = 0;
                        v1++;
                    }
                    public void m1() {
                        m0();
                        int v2 = 1;
                        v2++;
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameVariablesImports() {
        String sourceCode = """
                import java.method.CCC;
                public class Test {
                    private int myVariable;
                    public void method() {
                        int myVariable = 0;
                        myVariable++;
                    }
                    public void method1() {
                        method();
                        int method = 1;
                        method++;
                    }
                }""";
        String expected = """
                import java.method.CCC;
                public class v0 {
                    private int v1;
                    public void m0() {
                        int v1 = 0;
                        v1++;
                    }
                    public void m1() {
                        m0();
                        int v2 = 1;
                        v2++;
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameVariablesOverride() {
        String sourceCode = """
                public class Test {
                    private int myVariable;
                    public void method() {
                        int myVariable = 0;
                        myVariable++;
                    }

                    @Override
                    public void method1() {
                        method();
                        int method = 1;
                        method++;
                    }
                }""";
        String expected = """
                public class v0 {
                    private int v1;
                    public void m0() {
                        int v1 = 0;
                        v1++;
                    }
                
                    @Override
                    public void method1() {
                        m0();
                        int v2 = 1;
                        v2++;
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameVariablesSuperOverride() {
        String sourceCode = """
                public class Test {
                    private int myVariable;
                    public void method() {
                        int myVariable = 0;
                        super.method1();
                        myVariable++;
                    }

                    public void method1() {
                        method();
                        int method = 1;
                        method++;
                    }
                }""";
        String expected = """
                public class v0 {
                    private int v1;
                    public void m0() {
                        int v1 = 0;
                        super.method1();
                        v1++;
                    }
                
                    public void method1() {
                        m0();
                        int v2 = 1;
                        v2++;
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameVariablesMethod() {
        String sourceCode = """
                public class Test {
                    private int myVariable;
                    public void method() {
                        int e = 0;
                        Object o = null;
                        o.e();
                    }
                }""";
        String expected = """
                public class v0 {
                    private int v1;
                    public void m0() {
                        int v2 = 0;
                        Object v3 = null;
                        v3.e();
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameMethodCall1() {
        String sourceCode = """
                public class Test {
                    private int myVariable;
                    public void method() {
                        int e = 0;
                        Object o = null;
                        o.method();
                        o.toString().method();
                        method();
                    }
                }""";
        String expected = """
                public class v0 {
                    private int v1;
                    public void method() {
                        int v2 = 0;
                        Object v3 = null;
                        v3.method();
                        v3.toString().method();
                        method();
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameMethodCall2() {
        String sourceCode = """
                public class Test {
                    private int myVariable;
                    public void method1() {
                        int e = 0;
                        Object o = null;
                        o.method();
                        o.toString().method();
                        method1();
                    }
                }""";
        String expected = """
                public class v0 {
                    private int v1;
                    public void m0() {
                        int v2 = 0;
                        Object v3 = null;
                        v3.method();
                        v3.toString().method();
                        m0();
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameHibernate() {
        String sourceCode = """
                package hibernate;
                public class Test {
                    private int myVariable;

                    @org.hibernate.annotations.Inject()
                    public void method1() {
                    }
                }""";
        String expected = """
                package v0;
                public class v1 {
                    private int v2;

                    @org.hibernate.annotations.Inject()
                    public void m0() {
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }

    @Test
    void renameHibernate2() {
        String sourceCode = """
                package hibernate;
                public class Test {
                    private int myVariable;

                    @org.hibernate.T()
                    public void method1() {
                    }
                }""";
        String expected = """
                package v0;
                public class v1 {
                    private int v2;

                    @org.hibernate.T()
                    public void m0() {
                    }
                }""";
        assertEquals(expected, RenameVariables.renameVariables(sourceCode));
    }
}