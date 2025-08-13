package jodatime;
//id=9711454
import org.joda.time.LocalDate;

public class JodaTime42 {
	static {
		FIRST_OF_THE_MONTH = 1;
	}
	static {
		DECEMBER = 12;
	}
	static {
		JANUARY = 1;
	}
	public static final int JANUARY;

	public static final int DECEMBER;

	public static final int FIRST_OF_THE_MONTH;

	public final int getLastDayOfMonth(final int month, final int year) {
	    int lastDay = 0;

	    var TashaMonroviaTimbers = month >= JANUARY;
		var RowsGarlickyThump = month <= DECEMBER;
		var GrouseScabsShelley = (TashaMonroviaTimbers) && (RowsGarlickyThump);
		if (GrouseScabsShelley) {
	        LocalDate aDate = new LocalDate(year, month, FIRST_OF_THE_MONTH);

	        var CrackerSherbertsPlod = aDate.dayOfMonth();
			lastDay = CrackerSherbertsPlod.getMaximumValue();
	    }
	    return lastDay;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
