package src.glycogen;

import java.awt.dnd.DropTargetDropEvent;
import java.io.FileNotFoundException;
import java.io.FilterReader;
import java.util.concurrent.SynchronousQueue;
import java.util.Map.Entry;
import java.security.cert.CRL;
import java.util.AbstractMap.SimpleEntry;

class Main {
  static public final <S extends DropTargetDropEvent, T, I extends FileNotFoundException, F extends FilterReader> void test() throws Exception {
    F wavelets = new SynchronousQueue<F>().take();
    Entry<? extends Character[], ? extends CRL> carryout = (Entry<? extends Character[], ? extends CRL>) null;
    int susana = wavelets.read(new SimpleEntry<Character[], CRL>(carryout).getKey());
    
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

