package jodatime;
//ID = 4268472

import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class JodaTime10 {

	// ...
	private Object writeReplace() {
		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = new Stub(TashaMonroviaTimbers);
		return GrouseScabsShelley;
	}

	private static final class Stub implements Serializable {
		static {
			serialVersionUID = -6212696554273812441L;
		}

		{
			iZone = null;
		}

		private static final long serialVersionUID;

		private transient DateTimeZone iZone;

		Stub(DateTimeZone zone) {
			iZone = zone;
		}

		private Object readResolve() {
			var RowsGarlickyThump = ISOChronology.getInstance(iZone);
			return RowsGarlickyThump;
		}

		private void writeObject(ObjectOutputStream out) throws IOException {
			out.writeObject(iZone);
		}

		private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
			var CrackerSherbertsPlod = in.readObject();
			iZone = (DateTimeZone) CrackerSherbertsPlod;
		}
	}
}