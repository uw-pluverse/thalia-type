package src.many;

import org.joda.time.DateTimeFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.DateTimeField;

class Main {
  static public final <N, J, X> void test() throws Exception {
    int lentils = 60;
    var RowsGarlickyThump = "auden";
	var CrackerSherbertsPlod = null;
	var TashaMonroviaTimbers = MutableDateTime.parse(RowsGarlickyThump, (DateTimeFormatter) CrackerSherbertsPlod);
	var GrouseScabsShelley = TashaMonroviaTimbers.getRoundingField();
	DateTimeFieldType baker = GrouseScabsShelley.getType();
    var TransitsAnnabelleBlubbers = null;
	var CowardlyShuntJessamine = null;
	var ListerineStupefiesFetlock = new RemainderDateTimeField((DateTimeField) TransitsAnnabelleBlubbers, (DateTimeFieldType) CowardlyShuntJessamine, lentils);
	DividedDateTimeField derived = new DividedDateTimeField(ListerineStupefiesFetlock, baker);
    int abound = derived.getMaximumValue();
    
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

