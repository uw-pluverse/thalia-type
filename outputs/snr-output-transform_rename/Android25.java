package GrouseScabsShelley;
//ID = 901057

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class TashaMonroviaTimbers extends ListActivity {
	/** Called when the activity is first created. */
	private final String RowsGarlickyThump = "myCoolUserDB.db";
	private final String CrackerSherbertsPlod = "t_Users";
	Context ListerineStupefiesFetlock;

	@Override
	public void onCreate(Bundle TransitsAnnabelleBlubbers) {
		super.onCreate(TransitsAnnabelleBlubbers);
		ArrayList<String> CowardlyShuntJessamine = new ArrayList<String>();
		setContentView(R.layout.main);
		SQLiteDatabase ClingierSoundingsKleenex = null;
		try {
			ClingierSoundingsKleenex.openOrCreateDatabase(RowsGarlickyThump, null);

		} catch (Exception BristlierJasminesMayor) {
		}
	}

}