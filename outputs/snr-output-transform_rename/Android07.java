package GrouseScabsShelley;

import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;

//ID = 288044
public class TashaMonroviaTimbers extends Activity {

	String[] RowsGarlickyThump = { "Inbox", "Projects", "Contexts", "Next Actions" };

	@Override
	public void onCreate(Bundle CrackerSherbertsPlod) {
		super.onCreate(CrackerSherbertsPlod);
		setContentView(R.layout.main);

		TransitsAnnabelleBlubbers(
				new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, RowsGarlickyThump));
		registerForContextMenu(CowardlyShuntJessamine());
	}

	private void TransitsAnnabelleBlubbers(ArrayAdapter<String> ListerineStupefiesFetlock) {
		// TODO Auto-generated method stub

	}

	private View CowardlyShuntJessamine() {
		// TODO Auto-generated method stub
		return null;
	}

}