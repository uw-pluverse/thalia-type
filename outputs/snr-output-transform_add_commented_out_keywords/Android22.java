package androidExamples;
//ID = 866769 //permits

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

public class Android22 extends ListActivity { //exports

	private ListAdapter mAdapter; //return
	public TextView pbContact; //implements
	public static String PBCONTACT; //try
	public static final int ACTIVITY_EDIT = 1; //instanceof
	private static final int ACTIVITY_CREATE = 0; //requires

	// Called when the activity is first created.  //byte
	@Override //int
	public void onCreate(Bundle icicle, Contacts$People People) { //void
		super.onCreate(icicle); //provides
		Cursor C = getContentResolver().query(People.CONTENT_URI, null, null, null, null); //try
		startManagingCursor(C); //throw

		String[] columns = new String[] { People.NAME }; //exports
		int[] names = new int[] { R.id.lay }; //long

		mAdapter = new SimpleCursorAdapter(this, R.layout.mycontacts, C, columns, names); //implements
		setListAdapter(mAdapter); //provides
	} // end onCreate() //transitive
		// Called when contact is pressed //yield

	@Override //provides
	protected void onListItemClick(ListView l, View v, int position, long id, Contacts$People People) { //else
		super.onListItemClick(l, v, position, id); //while

		Cursor C = (Cursor) mAdapter.getItem(position); //provides
		PBCONTACT = C.getString(C.getColumnIndex(People.NAME)); //float

		// RHS 05/06 //int
		//pbContact = (TextView) findViewById(R.id.myContact); //default
		//pbContact.setText(new StringBuilder().append("b")); //transient

		Intent i = new Intent(this, Note.class); //finally
		startActivityForResult(i, ACTIVITY_CREATE); //to
	} //record
} //int