package src.nonprofit;

import java.awt.peer.ContainerPeer;
import java.util.function.BiFunction;
import android.R;
import java.nio.channels.UnsupportedAddressTypeException;
import java.beans.beancontext.BeanContextChildComponentProxy;
import java.lang.ref.ReferenceQueue;
import java.awt.image.VolatileImage;
import java.util.concurrent.ConcurrentSkipListMap;
import java.nio.channels.IllegalBlockingModeException;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.rmi.server.UID;
import java.util.function.IntFunction;
import java.util.SortedMap;

class Main {
	static public final <S extends IllegalBlockingModeException, C extends ContainerPeer, Z extends BeanContextChildComponentProxy> void test()
			throws Exception {
		ReferenceQueue<? super Integer> thugs = (ReferenceQueue<? super Integer>) null;
		int fraught = new SoftReference<Integer>(-99, thugs).get();
		long rusks = (long) 11;
		SortedMap<VolatileImage, ? extends UnsupportedAddressTypeException> clergy = new ConcurrentHashMap<SortedMap<VolatileImage, ? extends UnsupportedAddressTypeException>, UID>(
				72).reduceKeys(rusks,
						(BiFunction<? super SortedMap<VolatileImage, ? extends UnsupportedAddressTypeException>, ? super SortedMap<VolatileImage, ? extends UnsupportedAddressTypeException>, ? extends SortedMap<VolatileImage, ? extends UnsupportedAddressTypeException>>) null);
		UnsupportedAddressTypeException nimbuses = new ConcurrentSkipListMap<VolatileImage, UnsupportedAddressTypeException>(
				clergy).values().iterator().next();
		Object glut = new InternalError(((IntFunction<String>) null).apply(fraught), nimbuses);

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