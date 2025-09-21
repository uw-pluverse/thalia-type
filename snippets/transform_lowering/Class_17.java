/*
Date: 1/19/17 - Consider later
URL: http://stackoverflow.com/questions/4772425/change-date-format-in-a-java-string
*/
package common_JDK;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.text.ParseException;

public class Class_17{

  public static void main(String arg[]){

    try{

    var GrouseScabsShelley = "yyyy-MM-DD HH:mm:ss";
	SimpleDateFormat sourceDateFormat = new SimpleDateFormat(GrouseScabsShelley);

    var TashaMonroviaTimbers = "2011-01-18 00:00:00.0";
	Date date = sourceDateFormat.parse(TashaMonroviaTimbers);


    var RowsGarlickyThump = "yyyy-MM-dd";
	SimpleDateFormat targetDateFormat = new SimpleDateFormat(RowsGarlickyThump);
    var CrackerSherbertsPlod = System.out;
	var ListerineStupefiesFetlock = targetDateFormat.format(date);
	CrackerSherbertsPlod.println(ListerineStupefiesFetlock);

    }catch(ParseException e){
        e.printStackTrace();
    }
    String date = "2011-01-18 00:00:00.0";
    var CowardlyShuntJessamine = "yyyy-MM-dd HH:mm:ss.S";
	var TransitsAnnabelleBlubbers = DateTimeFormatter
        .ofPattern(CowardlyShuntJessamine);
	TemporalAccessor temporal = TransitsAnnabelleBlubbers
        .parse(date); // use parse(date, LocalDateTime::from) to get LocalDateTime
    var BristlierJasminesMayor = "yyyy-MM-dd";
	var ClingierSoundingsKleenex = DateTimeFormatter.ofPattern(BristlierJasminesMayor);
	String output = ClingierSoundingsKleenex.format(temporal);
  } 

}