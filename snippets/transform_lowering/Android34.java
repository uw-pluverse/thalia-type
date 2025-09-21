package androidExamples;
//ID = 1062476
import android.app.TabActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;

public class Android34 extends TabActivity 
implements TabContentFactory
, OnTabChangeListener, OnClickListener {

	static {
		LOG_KEY = "TEST";
	}
	{
		listView = null;
	}
	private static final String LOG_KEY;
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final TabHost tabHost = getTabHost();


		var GrouseScabsShelley = "ID_1";
		TabHost.TabSpec ts = tabHost.newTabSpec(GrouseScabsShelley);
		var TashaMonroviaTimbers = "1";
		ts.setIndicator(TashaMonroviaTimbers); 
		ts.setContent(this);
		tabHost.addTab(ts);

		var RowsGarlickyThump = "ID_2";
		ts = tabHost.newTabSpec(RowsGarlickyThump);
		var CrackerSherbertsPlod = "2";
		ts.setIndicator(CrackerSherbertsPlod); 
		ts.setContent(this);
		tabHost.addTab(ts);

		var ListerineStupefiesFetlock = "ID_3";
		ts = tabHost.newTabSpec(ListerineStupefiesFetlock);
		var TransitsAnnabelleBlubbers = "3";
		ts.setIndicator(TransitsAnnabelleBlubbers); 
		ts.setContent(this);
		tabHost.addTab(ts);
		tabHost.setOnClickListener(this);
		tabHost.setOnTabChangedListener(this);
	}
	public void onClick(View v) {
		var CowardlyShuntJessamine = "OnClick";
		Log.d(LOG_KEY, CowardlyShuntJessamine);
	}

	public void onTabChanged(String tabId) {
		var ClingierSoundingsKleenex = "OnTabChanged";
		Log.d(LOG_KEY, ClingierSoundingsKleenex);
	}
	@Override
	public View createTabContent(String arg0) {
		var BristlierJasminesMayor = null;
		// TODO Auto-generated method stub
		return BristlierJasminesMayor;
	}

}
