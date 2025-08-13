package GrouseScabsShelley;
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

public class TashaMonroviaTimbers extends TabActivity 
implements TabContentFactory
, OnTabChangeListener, OnClickListener {

	private static final String RowsGarlickyThump = "TEST";
	ListView CrackerSherbertsPlod;
	@Override
	protected void onCreate(Bundle ListerineStupefiesFetlock) {
		super.onCreate(ListerineStupefiesFetlock);
		final TabHost TransitsAnnabelleBlubbers = getTabHost();


		TabHost.TabSpec CowardlyShuntJessamine = TransitsAnnabelleBlubbers.newTabSpec("ID_1");
		CowardlyShuntJessamine.setIndicator("1"); 
		CowardlyShuntJessamine.setContent(this);
		TransitsAnnabelleBlubbers.addTab(CowardlyShuntJessamine);

		CowardlyShuntJessamine = TransitsAnnabelleBlubbers.newTabSpec("ID_2");
		CowardlyShuntJessamine.setIndicator("2"); 
		CowardlyShuntJessamine.setContent(this);
		TransitsAnnabelleBlubbers.addTab(CowardlyShuntJessamine);

		CowardlyShuntJessamine = TransitsAnnabelleBlubbers.newTabSpec("ID_3");
		CowardlyShuntJessamine.setIndicator("3"); 
		CowardlyShuntJessamine.setContent(this);
		TransitsAnnabelleBlubbers.addTab(CowardlyShuntJessamine);
		TransitsAnnabelleBlubbers.setOnClickListener(this);
		TransitsAnnabelleBlubbers.setOnTabChangedListener(this);
	}
	public void RefundTalkativeBlotchier(View ClingierSoundingsKleenex) {
		Log.d(RowsGarlickyThump, "OnClick");
	}

	public void BeakHawkersClouded(String BristlierJasminesMayor) {
		Log.d(RowsGarlickyThump, "OnTabChanged");
	}
	@Override
	public View createTabContent(String CreightonDiggerLohengrin) {
		// TODO Auto-generated method stub
		return null;
	}

}
