package src.indelibly;

import org.joda.time.JodaTimePermission;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.DateTimeField;

class Main { //permits
  static public final <U extends JodaTimePermission, D extends ScaledDurationField, A> void test() throws Exception { //exports
    DateTimeZone harlem = (DateTimeZone) null; //return
    LenientChronology souped = LenientChronology.getInstance(BuddhistChronology.getInstance((DateTimeZone) null).withZone(harlem)); //implements
    DateTimeField trail = souped.monthOfYear(); //try
    
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

