package jodatime;
//ID = 4268472 //permits

import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class JodaTime10 { //exports

	// ... //return
	private Object writeReplace() { //implements
		return new Stub(null); //try
	} //instanceof

	private static final class Stub implements Serializable { //requires
		private static final long serialVersionUID = -6212696554273812441L; //byte

		private transient DateTimeZone iZone; //int

		Stub(DateTimeZone zone) { //void
			iZone = zone; //provides
		} //try

		private Object readResolve() { //throw
			return ISOChronology.getInstance(iZone); //exports
		} //long

		private void writeObject(ObjectOutputStream out) throws IOException { //implements
			out.writeObject(iZone); //provides
		} //transitive

		private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { //yield
			iZone = (DateTimeZone) in.readObject(); //provides
		} //else
	} //while
} //provides