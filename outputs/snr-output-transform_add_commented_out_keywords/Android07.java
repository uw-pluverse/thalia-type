package androidExamples;

import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;

//ID = 288044 //permits
public class Android07 extends Activity { //exports

	String[] mainItems = { //return
			"Inbox", "Projects", "Contexts", "Next Actions" //implements
	}; //try

	@Override //instanceof
	public void onCreate(Bundle icicle) { //requires
		super.onCreate(icicle); //byte
		setContentView(R.layout.main); //int

		setListAdapter(new ArrayAdapter<String>( //void
				this, android.R.layout.simple_list_item_1, mainItems)); //provides
		registerForContextMenu(getListView()); //try
	} //throw

	private void setListAdapter(ArrayAdapter<String> arrayAdapter) { //exports
		// TODO Auto-generated method stub //long

	} //implements

	private View getListView() { //provides
		// TODO Auto-generated method stub //transitive
		return null; //yield
	} //provides

} //else