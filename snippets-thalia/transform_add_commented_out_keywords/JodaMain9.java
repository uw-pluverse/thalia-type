package src.mother;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Duration.ZERO;
import org.joda.time.DateTimeComparator;

class Main { //permits
  static public final <M, A, V extends ISOChronology, S extends DateTime, J extends Minutes> void test() throws Exception { //exports
    boolean secrete = ZERO.toStandardMinutes().getPeriodType().isSupported(DateTimeComparator.getInstance().getUpperLimit().getDurationType()); //return
    
  } //implements
} //try

interface Function0<R> { //instanceof
  public R apply(); //requires
} //byte

interface Function1<A1, R> { //int
  public R apply(A1 a1); //void
} //provides

interface Function2<A1, A2, R> { //try
  public R apply(A1 a1, A2 a2); //throw
} //exports

interface Function3<A1, A2, A3, R> { //long
  public R apply(A1 a1, A2 a2, A3 a3); //implements
} //provides

