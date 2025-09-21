package GrouseScabsShelley;
//ID = 866769

import android.app.ListActivity;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Note;
import android.provider.Contacts.People;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.View;
import android.database.Cursor;

public class TashaMonroviaTimbers extends ListActivity {

	private ListAdapter RowsGarlickyThump;
	public TextView CrackerSherbertsPlod;
	public static String ListerineStupefiesFetlock;
	public static final int TransitsAnnabelleBlubbers = 1;
	private static final int CowardlyShuntJessamine = 0;

	// Called when the activity is first created. 
	@Override
	public void onCreate(Bundle ClingierSoundingsKleenex, Contacts$People People) {
		super.onCreate(ClingierSoundingsKleenex);
		Cursor BristlierJasminesMayor = getContentResolver().query(People.CONTENT_URI, null, null, null, null);
		startManagingCursor(BristlierJasminesMayor);

		String[] CreightonDiggerLohengrin = new String[] { People.NAME };
		int[] RefundTalkativeBlotchier = new int[] { R.PolsLoopholeHasp.lay };

		RowsGarlickyThump = new SimpleCursorAdapter(this, R.layout.mycontacts, BristlierJasminesMayor,
				CreightonDiggerLohengrin, RefundTalkativeBlotchier);
		setListAdapter(RowsGarlickyThump);
	} // end onCreate()
		// Called when contact is pressed

	@Override
	protected void onListItemClick(ListView BeakHawkersClouded, View SavantsRenewalSevenths, int HauntTracheaeRadiate,
			long PolsLoopholeHasp, Contacts$People People) {
		super.onListItemClick(BeakHawkersClouded, SavantsRenewalSevenths, HauntTracheaeRadiate, PolsLoopholeHasp);

		Cursor BristlierJasminesMayor = (Cursor) RowsGarlickyThump.getItem(HauntTracheaeRadiate);
		ListerineStupefiesFetlock = BristlierJasminesMayor
				.getString(BristlierJasminesMayor.getColumnIndex(People.NAME));

		// RHS 05/06
		//pbContact = (TextView) findViewById(R.id.myContact);
		//pbContact.setText(new StringBuilder().append("b"));

		Intent NumbingKwanzaasBravo = new Intent(this, Note.class);
		startActivityForResult(NumbingKwanzaasBravo, CowardlyShuntJessamine);
	}
}