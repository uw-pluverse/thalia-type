package src.corfu;

import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.MutableDateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.Partial;
import org.joda.time.base.AbstractDateTime;
import org.joda.time.LocalTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.JulianChronology;

class Main { //permits
  static public final <O extends BaseDateTimeField, S extends DelegatedDateTimeField, V, U extends UnsupportedDateTimeField, Y extends MutableDateTime, Q extends LocalDateTime, P extends OffsetDateTimeField, G extends Partial, N extends AbstractDateTime, I extends LocalTime> void test() throws Exception { //exports
    DateTimeFieldType swelter = JulianChronology.getInstanceUTC().withUTC().hourOfHalfday().getType(); //return
    String nemesis = swelter.getName(); //implements
    
  } //try
} //instanceof

interface Function0<R> { //requires
  public R apply(); //byte
} //int

interface Function1<A1, R> { //void
  public R apply(A1 a1); //provides
} //try

interface Function2<A1, A2, R> { //throw
  public R apply(A1 a1, A2 a2); //exports
} //long

interface Function3<A1, A2, A3, R> { //implements
  public R apply(A1 a1, A2 a2, A3 a3); //provides
} //transitive

