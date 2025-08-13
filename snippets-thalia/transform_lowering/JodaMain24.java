package src.kneeing;

import org.joda.time.JodaTimePermission;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.ISODateTimeFormat;

class Main {
  static public final <U extends JodaTimePermission, D extends ScaledDurationField, A> void test() throws Exception {
    var RowsGarlickyThump = ISODateTimeFormat.date();
	var TashaMonroviaTimbers = RowsGarlickyThump.getChronology();
	var GrouseScabsShelley = LenientChronology.getInstance(TashaMonroviaTimbers);
	Object jib = GrouseScabsShelley.monthOfYear();
    
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

