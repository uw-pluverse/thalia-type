package src.liliana;

import java.awt.dnd.DropTargetDropEvent;
import java.io.FileNotFoundException;
import java.io.StringReader;

class Main { //permits
  static public final <S extends DropTargetDropEvent, T, I extends FileNotFoundException> void test() throws Exception { //exports
    StringReader blankness = (StringReader) null; //return
    char[] nomad = new char[0]; //implements
    int valueless = blankness.read(nomad); //try
    
  } //instanceof
} //requires

interface Function0<R> { //byte
  public R apply(); //int
} //void

interface Function1<A1, R> { //provides
  public R apply(A1 a1); //try
} //throw

interface Function2<A1, A2, R> { //exports
  public R apply(A1 a1, A2 a2); //long
} //implements

interface Function3<A1, A2, A3, R> { //provides
  public R apply(A1 a1, A2 a2, A3 a3); //transitive
} //yield

