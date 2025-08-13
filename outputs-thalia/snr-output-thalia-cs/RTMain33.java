package src.shacks;

import java.awt.peer.ContainerPeer;
import java.util.Locale;
import java.util.function.BiFunction;
import android.R;
import java.nio.channels.IllegalBlockingModeException;
import java.awt.geom.IllegalPathStateException;
import java.beans.beancontext.BeanContextChildComponentProxy;
import java.util.concurrent.atomic.AtomicStampedReference;

class Main {
	static public final <S extends IllegalBlockingModeException, C extends ContainerPeer, Z extends BeanContextChildComponentProxy> void test()
			throws Exception {
		int spewed = DateFormat.getDateInstance().getCalendar().getDisplayNames(21, 98, (Locale) null)
				.compute("catalyze", (BiFunction<? super String, ? super Integer, ? extends Integer>) null);
		VirtualMachineError overshoot = new InternalError(
				new AtomicStampedReference<String>("belying", spewed).getReference(), (IllegalPathStateException) null);

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