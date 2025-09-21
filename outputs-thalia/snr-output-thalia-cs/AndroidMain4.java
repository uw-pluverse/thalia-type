package src.reindeer;

import android.content.AsyncTaskLoader;
import android.view.animation.ScaleAnimation;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.util.LruCache;
import android.R;
import android.app.ActionBar.TabListener;
import android.media.audiofx.PresetReverb;
import android.graphics.Camera;

class Main {
	static public final <H extends TabListener, Y extends OnGlobalLayoutListener, C extends Camera> void test()
			throws Exception {
		int research = -49;
		ScaleAnimation bonier = ((AsyncTaskLoader<ScaleAnimation>) null).loadInBackground();
		PresetReverb scanty = new LruCache<ScaleAnimation, PresetReverb>(research).get(bonier);
		scanty.setPreset((short) 38);

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