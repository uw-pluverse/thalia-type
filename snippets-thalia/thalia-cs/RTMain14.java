package src.liliana;

import java.awt.dnd.DropTargetDropEvent;
import java.io.FileNotFoundException;
import java.io.StringReader;

class Main {
  static public final <S extends DropTargetDropEvent, T, I extends FileNotFoundException> void test() throws Exception {
    StringReader blankness = (StringReader) null;
    char[] nomad = new char[0];
    int valueless = blankness.read(nomad);
    
  }
}

interface Function0<R> {
  public R apply();
}

interface Function1<A1, R> {
  public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
  public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
  public R apply(A1 a1, A2 a2, A3 a3);
}

