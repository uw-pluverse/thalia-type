package androidExamples;

import android.content.Context;
import android.app.Application;

public class Android28 extends android.app.Application {

	static {
		instance = null;
	}

	private static Android28 instance;

	public Android28() {
		instance = this;
	}

	public static Context getContext() {
		return instance;
	}

}