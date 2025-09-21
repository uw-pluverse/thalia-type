package GrouseScabsShelley;

import static org.junit.Assert.*;
import org.joda.time.format.PeriodFormatterBuilder;
import org.junit.Test;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.Period;

public class TashaMonroviaTimbers {
	//	ID = 4585883
	public static void ClingierSoundingsKleenex(String[] RowsGarlickyThump) {
		// TODO Auto-generated method stub

	}

	@Test
	public void BristlierJasminesMayor() {
		assertEquals("00:00:01", ListerineStupefiesFetlock.format(1000));
	}

	@Test
	public void CreightonDiggerLohengrin() {
		assertEquals("00:01:00", ListerineStupefiesFetlock.format(1000 * 60));
	}

	@Test
	public void RefundTalkativeBlotchier() {
		assertEquals("01:00:00", ListerineStupefiesFetlock.format(1000 * 60 * 60));
	}

	@Test
	public void BeakHawkersClouded() {
		final int CrackerSherbertsPlod = 60 * 60 * 24;
		assertEquals("23:59:59", ListerineStupefiesFetlock.format(1000 * (CrackerSherbertsPlod - 1)));
	}

	@Test
	public void SavantsRenewalSevenths() {
		final int CrackerSherbertsPlod = 60 * 60 * 24;
		assertEquals("12:00:00 and 2 days", ListerineStupefiesFetlock.format(1000 * CrackerSherbertsPlod * 5 / 2));
	}

	public static class ListerineStupefiesFetlock {
		public HauntTracheaeRadiate() {
			    }

		private final static PeriodFormatter TransitsAnnabelleBlubbers = new PeriodFormatterBuilder().appendDays()
				.appendSuffix(" day", " days").appendSeparator(" ").appendHours().appendSeparator(":").appendMinutes()
				.minimumPrintedDigits(2).appendSeparator(":").appendSeconds().minimumPrintedDigits(2).toFormatter();

		public static String format(long CowardlyShuntJessamine) {
			return TransitsAnnabelleBlubbers.print(new Period(CowardlyShuntJessamine).normalizedStandard());
		}
	}
}