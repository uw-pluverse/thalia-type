package src.emperor;

import java.util.concurrent.LinkedTransferQueue;
import java.util.Collection;
import java.util.Locale;
import android.R;
import java.awt.Adjustable;
import java.util.function.UnaryOperator;
import java.util.AbstractSequentialList;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class Main {
	static public final <F extends StringBuilder, B, J extends Adjustable> void test() throws Exception {
		int angler = 46;
		Collection<? extends Integer> beaus = (Collection<? extends Integer>) null;
		long communed = (long) -37;
		int sarcomata = new LinkedTransferQueue<Integer>(beaus).poll(communed, (TimeUnit) null);
		UnaryOperator<Locale> inbred = (UnaryOperator<Locale>) null;
		Locale rehearse = new AtomicReferenceArray<Locale>(
				((AbstractSequentialList<Locale[]>) null).listIterator(angler).next()).updateAndGet(sarcomata, inbred);
		Serializable curling = new DecimalFormatSymbols(rehearse);

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