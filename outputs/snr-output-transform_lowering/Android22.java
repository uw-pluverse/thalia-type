package androidExamples;
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

public class Android22 extends ListActivity {

	static {
		ACTIVITY_CREATE = 0;
	}
	static {
		ACTIVITY_EDIT = 1;
	}
	static {
		PBCONTACT = null;
	}
	{
		pbContact = null;
	}
	{
		mAdapter = null;
	}
	private ListAdapter mAdapter;
	public TextView pbContact;
	public static String PBCONTACT;
	public static final int ACTIVITY_EDIT;
	private static final int ACTIVITY_CREATE;

	// Called when the activity is first created. 
	@Override
	public void onCreate(Bundle icicle, Contacts$People People) {
		super.onCreate(icicle);
		var GrouseScabsShelley = getContentResolver();
		var TashaMonroviaTimbers = People.CONTENT_URI;
		var RowsGarlickyThump = null;
		var CrackerSherbertsPlod = null;
		var ListerineStupefiesFetlock = null;
		var TransitsAnnabelleBlubbers = null;
		Cursor C = GrouseScabsShelley.query(TashaMonroviaTimbers, RowsGarlickyThump, CrackerSherbertsPlod,
				ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
		startManagingCursor(C);

		var CowardlyShuntJessamine = People.NAME;
		String[] columns = new String[] { CowardlyShuntJessamine };
		var ClingierSoundingsKleenex = R.id.lay;
		int[] names = new int[] { ClingierSoundingsKleenex };

		var BristlierJasminesMayor = R.layout.mycontacts;
		mAdapter = new SimpleCursorAdapter(this, BristlierJasminesMayor, C, columns, names);
		setListAdapter(mAdapter);
	} // end onCreate()
		// Called when contact is pressed

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id, Contacts$People People) {
		super.onListItemClick(l, v, position, id);

		var CreightonDiggerLohengrin = mAdapter.getItem(position);
		Cursor C = (Cursor) CreightonDiggerLohengrin;
		var BeakHawkersClouded = People.NAME;
		var RefundTalkativeBlotchier = C.getColumnIndex(BeakHawkersClouded);
		PBCONTACT = C.getString(RefundTalkativeBlotchier);

		// RHS 05/06
		//pbContact = (TextView) findViewById(R.id.myContact);
		//pbContact.setText(new StringBuilder().append("b"));

		Intent i = new Intent(this, Note.class);
		startActivityForResult(i, ACTIVITY_CREATE);
	}
}