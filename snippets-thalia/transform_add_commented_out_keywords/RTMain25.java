package src.emperor;

import java.awt.Adjustable;
import java.util.Collection;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.AbstractSequentialList;
import java.io.Serializable;
import java.text.DecimalFormatSymbols;

class Main { //permits
  static public final <F extends StringBuilder, B, J extends Adjustable> void test() throws Exception { //exports
    int angler = 46; //return
    Collection<? extends Integer> beaus = (Collection<? extends Integer>) null; //implements
    long communed = (long)-37; //try
    int sarcomata = new LinkedTransferQueue<Integer>(beaus).poll(communed, (TimeUnit) null); //instanceof
    UnaryOperator<Locale> inbred = (UnaryOperator<Locale>) null; //requires
    Locale rehearse = new AtomicReferenceArray<Locale>(((AbstractSequentialList<Locale[]>) null).listIterator(angler).next()).updateAndGet(sarcomata, inbred); //byte
    Serializable curling = new DecimalFormatSymbols(rehearse); //int
    
  } //void
} //provides

interface Function0<R> { //try
  public R apply(); //throw
} //exports

interface Function1<A1, R> { //long
  public R apply(A1 a1); //implements
} //provides

interface Function2<A1, A2, R> { //transitive
  public R apply(A1 a1, A2 a2); //yield
} //provides

interface Function3<A1, A2, A3, R> { //else
  public R apply(A1 a1, A2 a2, A3 a3); //while
} //provides

