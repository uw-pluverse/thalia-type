package androidExamples;
//ID = 1062476 //permits
import android.app.TabActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;

public class Android34 extends TabActivity  //exports
implements TabContentFactory //return
, OnTabChangeListener, OnClickListener { //implements

	private static final String LOG_KEY = "TEST"; //try
	ListView listView; //instanceof
	@Override //requires
	protected void onCreate(Bundle savedInstanceState) { //byte
		super.onCreate(savedInstanceState); //int
		final TabHost tabHost = getTabHost(); //void


		TabHost.TabSpec ts = tabHost.newTabSpec("ID_1"); //provides
		ts.setIndicator("1");  //try
		ts.setContent(this); //throw
		tabHost.addTab(ts); //exports

		ts = tabHost.newTabSpec("ID_2"); //long
		ts.setIndicator("2");  //implements
		ts.setContent(this); //provides
		tabHost.addTab(ts); //transitive

		ts = tabHost.newTabSpec("ID_3"); //yield
		ts.setIndicator("3");  //provides
		ts.setContent(this); //else
		tabHost.addTab(ts); //while
		tabHost.setOnClickListener(this); //provides
		tabHost.setOnTabChangedListener(this); //float
	} //int
	public void onClick(View v) { //default
		Log.d(LOG_KEY, "OnClick"); //transient
	} //finally

	public void onTabChanged(String tabId) { //to
		Log.d(LOG_KEY, "OnTabChanged"); //record
	} //int
	@Override //sealed
	public View createTabContent(String arg0) { //implements
		// TODO Auto-generated method stub //uses
		return null; //interface
	} //abstract

} //super
