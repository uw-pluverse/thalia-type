package com.g191919.inferenceleaker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoweringTest {

    @BeforeAll
    static void setUp() {
        Utils.NUMBERED_NAMES = true;
    }

    @Test
    void lowerNumbers() {
        String input = """
                public class Test {
                    public void foo() {
                        int subtreeResult = 1 + 2 + 3;
                        int result = subtreeResult;
                    }
                }""";
        String expected = """
                public class Test {
                    public void foo() {
                        var loweredV0 = 1;
                        var loweredV1 = 2;
                        var loweredV2 = 3;
                        int subtreeResult = loweredV0 + loweredV1 + loweredV2;
                        int result = subtreeResult;
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerMethod() {
        String input = """
                public class Test {
                    public void foo() {
                        int subtreeResult = a.b().c();
                    }
                }""";
        String expected = """
                public class Test {
                    public void foo() {
                        var loweredV0 = a.b();
                        int subtreeResult = loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerMethodParam() {
        String input = """
                public class Test {
                    public void foo() {
                        int subtreeResult = a.b(1).c();
                    }
                }""";
        String expected = """
                public class Test {
                    public void foo() {
                        var loweredV1 = 1;
                        var loweredV0 = a.b(loweredV1);
                        int subtreeResult = loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerField() {
        String input = """
                public class Test {
                    private int a = null;
                    public void foo() {
                        int subtreeResult = a.b(1).c();
                    }
                }""";
        String expected = """
                public class Test {
                    {
                        a = null;
                    }
                    private int a;
                    public void foo() {
                        var loweredV1 = 1;
                        var loweredV0 = a.b(loweredV1);
                        int subtreeResult = loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldArr() {
        String input = """
                public class Test {
                    String[] mainItems = {
                                "Inbox", "Projects", "Contexts", "Next Actions"
                            };
                    public void foo() {
                        int subtreeResult = a.b(1).c();
                    }
                }""";
        String expected = """
                public class Test {
                    String[] mainItems = {
                                "Inbox", "Projects", "Contexts", "Next Actions"
                            };
                    public void foo() {
                        var loweredV1 = 1;
                        var loweredV0 = a.b(loweredV1);
                        int subtreeResult = loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerExpressionStatement() {
        String input = """
                public class Test {
                    public void foo() {
                        a.b().c();
                    }
                }""";
        String expected = """
                public class Test {
                    public void foo() {
                        var loweredV0 = a.b();
                        loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerNumbersExpression() {
        String input = """
                public class Test {
                    public void foo() {
                        int subtreeResult = 1 + 2 + 3;
                    }
                }""";
        String expected = """
                public class Test {
                    public void foo() {
                        var loweredV0 = 1;
                        var loweredV1 = 2;
                        var loweredV2 = 3;
                        int subtreeResult = loweredV0 + loweredV1 + loweredV2;
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerNew() {
        String input = """
                public class Test {
                    public void foo() {
                        int subtreeResult = new A().b().c();
                    }
                }""";
        String expected = """
                public class Test {
                    public void foo() {
                        var loweredV1 = new A();
                        var loweredV0 = loweredV1.b();
                        int subtreeResult = loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerNewInMethod() {
        String input = """
                public class Test {
                    public void foo() {
                        int subtreeResult = System.out.println(new A().b().c());
                    }
                }""";
        String expected = """
                public class Test {
                    public void foo() {
                        var loweredV0 = System.out;
                        var loweredV3 = new A();
                        var loweredV2 = loweredV3.b();
                        var loweredV1 = loweredV2.c();
                        int subtreeResult = loweredV0.println(loweredV1);
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldAccess() {
        String input = """
                import A;
                
                public class Test {
                    public String a = "";
                    public void foo() {
                        int result1 = System.out.println(A.B);
                        int result2 = System.out.println(a.B);
                        int result3 = System.out.println(a);
                    }
                }""";
        String expected = """
                import A;
                
                public class Test {
                    {
                        a = "";
                    }
                    public String a;
                    public void foo() {
                        var loweredV0 = System.out;
                        var loweredV1 = A.B;
                        int result1 = loweredV0.println(loweredV1);
                        var loweredV2 = System.out;
                        var loweredV3 = a.B;
                        int result2 = loweredV2.println(loweredV3);
                        var loweredV4 = System.out;
                        int result3 = loweredV4.println(a);
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldAccessAndroid() {
        String input = """
                package androidExamples;
                //ID = 587917
                import android.content.Intent;
                import android.net.Uri;
                
                public class Android15 {
                
                    public static void main(String[] args) {
                        // TODO Auto-generated method stub
                
                        Intent sendIntent = new Intent(Intent.ACTION_SEND);
                    }
                }""";
        String expected = """
                package androidExamples;
                //ID = 587917
                import android.content.Intent;
                import android.net.Uri;
                
                public class Android15 {
                
                    public static void main(String[] args) {
                        // TODO Auto-generated method stub
                
                        var loweredV0 = Intent.ACTION_SEND;
                        Intent sendIntent = new Intent(loweredV0);
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFor() {
        String input = """
                import A;
                
                public class Test {
                    public String a = "a";
                    public String b = "b";
                    public void foo() {
                        for (int a = 0; a < 10; a++) {
                            System.out.println(a + 10);
                        }
                    }
                }""";
        String expected = """
                import A;
                
                public class Test {
                    {
                        b = "b";
                    }
                    {
                        a = "a";
                    }
                    public String a;
                    public String b;
                    public void foo() {
                        var loweredV0 = 10;
                        for (int a = 0; a < loweredV0; a++) {
                            var loweredV1 = System.out;
                            var loweredV3 = 10;
                            var loweredV2 = a + loweredV3;
                            loweredV1.println(loweredV2);
                        }
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldStatic() {
        String input = """
                public class Test {
                
                    public static String a = "content";
                
                    public void foo() {
                        int subtreeResult = new A().b().c();
                    }
                }""";
        String expected = """
                public class Test {
                
                    static {
                        a = "content";
                    }
                
                    public static String a;
                
                    public void foo() {
                        var loweredV1 = new A();
                        var loweredV0 = loweredV1.b();
                        int subtreeResult = loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldNonStatic() {
        String input = """
                public class Test {
                
                    public final String a = "content";
                
                    public void foo() {
                        int subtreeResult = new A().b().c();
                    }
                }""";
        String expected = """
                public class Test {
                
                    {
                        a = "content";
                    }
                
                    public final String a;
                
                    public void foo() {
                        var loweredV1 = new A();
                        var loweredV0 = loweredV1.b();
                        int subtreeResult = loweredV0.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerStaticFieldInit() {
        String input = """
                public class Test {
                
                    public static String a = "content";

                    static {
                        System.out.println("started");
                    }
                
                    public void foo() {
                        int subtreeResult = new A().b().c();
                    }
                }""";
        String expected = """
                public class Test {
                
                    static {
                        a = "content";
                    }
                
                    public static String a;
                
                    static {
                        var loweredV0 = System.out;
                        var loweredV1 = "started";
                        loweredV0.println(loweredV1);
                    }
                
                    public void foo() {
                        var loweredV3 = new A();
                        var loweredV2 = loweredV3.b();
                        int subtreeResult = loweredV2.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerNonStaticFieldInit() {
        String input = """
                public class Test {
                
                    public String a = "content";

                    {
                        System.out.println("started");
                    }
                
                    public void foo() {
                        int subtreeResult = new A().b().c();
                    }
                }""";
        String expected = """
                public class Test {
                
                    {
                        a = "content";
                    }
                
                    public String a;
                
                    {
                        var loweredV0 = System.out;
                        var loweredV1 = "started";
                        loweredV0.println(loweredV1);
                    }
                
                    public void foo() {
                        var loweredV3 = new A();
                        var loweredV2 = loweredV3.b();
                        int subtreeResult = loweredV2.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldNoInit() {
        String input = """
                public class Test {
                
                    public static String a;

                    static {
                        System.out.println("started");
                    }
                
                    public void foo() {
                        int subtreeResult = new A().b().c();
                    }
                }""";
        String expected = """
                public class Test {
                
                    static {
                        a = null;
                    }
                
                    public static String a;
                
                    static {
                        var loweredV0 = System.out;
                        var loweredV1 = "started";
                        loweredV0.println(loweredV1);
                    }
                
                    public void foo() {
                        var loweredV3 = new A();
                        var loweredV2 = loweredV3.b();
                        int subtreeResult = loweredV2.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldMultipleNoInit() {
        String input = """
                public class Test {
                
                    public static String a,b;

                    static {
                        System.out.println("started");
                    }
                
                    public void foo() {
                        int subtreeResult = new A().b().c();
                    }
                }""";
        String expected = """
                public class Test {
                
                    static {
                        b = null;
                        a = null;
                    }
                
                    public static String a,b;
                
                    static {
                        var loweredV0 = System.out;
                        var loweredV1 = "started";
                        loweredV0.println(loweredV1);
                    }
                
                    public void foo() {
                        var loweredV3 = new A();
                        var loweredV2 = loweredV3.b();
                        int subtreeResult = loweredV2.c();
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }

    @Test
    void lowerFieldArrayInit() {
        String input = """
                public class Test {
                
                    public int[] a = {1,2,23};
                    public int[] c = new int[] {1,2,23};

                    static {
                        System.out.println("started");
                    }
                
                    public void foo() {
                        int[] b = {100,1000,10000};
                    }
                }""";
        String expected = """
                public class Test {
                
                    {
                        c = new int[] {1,2,23};
                    }
                
                    public int[] a = {1,2,23};
                    public int[] c;
                
                    static {
                        var loweredV0 = System.out;
                        var loweredV1 = "started";
                        loweredV0.println(loweredV1);
                    }
                
                    public void foo() {
                        var loweredV2 = 100;
                        var loweredV3 = 1000;
                        var loweredV4 = 10000;
                        int[] b = {loweredV2,loweredV3,loweredV4};
                    }
                }""";
        assertEquals(expected, Lowering.lower(input).replace("\t", "    "));
    }
}