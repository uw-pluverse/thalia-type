package src.disclaim;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.R;
import android.util.Pair;
import android.widget.TimePicker;
import android.widget.RadioButton;
import android.app.backup.BackupAgentHelper;
import android.view.accessibility.AccessibilityEventSource;
import android.provider.ContactsContract.CommonDataKinds.SipAddress;

class Main {
	static public final <B extends SipAddress, K, J> void test() throws Exception {
		int packets = 43;
		AccessibilityEventSource rammed = ArrayAdapter
				.createFromResource((Context) null,
						new Pair<BackupAgentHelper, Integer>((BackupAgentHelper) null, -78).second, packets)
				.getDropDownView(-58, (RadioButton) null, (TimePicker) null);

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