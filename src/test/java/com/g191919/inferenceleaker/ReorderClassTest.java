package com.g191919.inferenceleaker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderClassTest {

    @Test
    void reorderClass() {
        String source = """
                public class Main {
                    private A a;
                    final B b = a.b();
                    public static C c = new C();
                
                    public static void main(String[] args) {
                        A a;
                    }
                    public static void b() {
                        A a;
                    }
                    public static void c(A a) {
                        A a;
                    }
                }
                """;
        String expected = """
                public class Main {
                    public static void b() {
                		A a;
                	}
                	public static C c = new C();
                	private A a;
                	final B b = a.b();
                
                	public static void c(A a) {
                		A a;
                	}
                	public static void main(String[] args) {
                		A a;
                	}
                }
                """;
        assertEquals(expected, ReorderClass.reorderClass(source));
    }

    @Test
    void reorderClassInClass() {
        String source = """
                public class Main {
                    private A a;
                    final B b = a.b();
                    public static C c = new C();
                
                    public static void main(String[] args) {
                        A a;
                    }
                    public static void b() {
                        A a;
                    }
                    public static void c(A a) {
                        A a;
                    }
                    public static class M1 {
                        private A a;
                        final B b = a.b();
                        public static C c = new C();

                        public static void main(String[] args) {
                            A a;
                        }
                        public static void b() {
                            A a;
                        }
                        public static void c(A a) {
                            A a;
                        }
                    }
                    public static class M2 {
                        private A a;
                        final B b = a.b();
                        public static C c = new C();

                        public static void main(String[] args) {
                            A a;
                        }
                        public static void b() {
                            A a;
                        }
                        public static void c(A a) {
                            A a;
                        }
                    }
                }
                """;
        String expected = """
                public class Main {
                    public static C c = new C();
                	public static class M1 {
                		public static void b() {
                			A a;
                		}
                
                		public static C c = new C();
                		private A a;
                		final B b = a.b();
                
                		public static void c(A a) {
                			A a;
                		}
                
                		public static void main(String[] args) {
                			A a;
                		}
                	}
                	public static class M2 {
                		public static void b() {
                			A a;
                		}
                
                		public static C c = new C();
                		private A a;
                		final B b = a.b();
                
                		public static void c(A a) {
                			A a;
                		}
                
                		public static void main(String[] args) {
                			A a;
                		}
                	}
                	private A a;
                
                	public static void main(String[] args) {
                		A a;
                	}
                	final B b = a.b();
                
                	public static void b() {
                		A a;
                	}
                	public static void c(A a) {
                		A a;
                	}
                }
                """;
        assertEquals(expected, ReorderClass.reorderClass(source));
    }
}