package src.gullets;

import java.awt.peer.ContainerPeer;
import java.util.AbstractMap;
import java.lang.ref.PhantomReference;
import java.util.Collection;
import android.R;
import java.nio.channels.IllegalBlockingModeException;
import java.io.FileInputStream;
import java.util.concurrent.LinkedBlockingQueue;
import java.awt.geom.IllegalPathStateException;
import java.beans.beancontext.BeanContextChildComponentProxy;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;

class Main {
	static public final <S extends IllegalBlockingModeException, C extends ContainerPeer, Z extends BeanContextChildComponentProxy> void test()
			throws Exception {
		String shipshape = new ConcurrentLinkedQueue<String>((Collection<? extends String>) null).poll();
		String almohad = ((AbstractMap<FileInputStream, String>) null)
				.put(new PhantomReference<FileInputStream>((FileInputStream) null,
						(ReferenceQueue<? super FileInputStream>) null).get(), shipshape);
		int greeks = 49;
		Throwable exposure = new InternalError(almohad,
				new LinkedBlockingQueue<IllegalPathStateException>(greeks).poll());

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