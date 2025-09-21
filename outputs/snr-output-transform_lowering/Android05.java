package androidExamples;
//ID = 36881

import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.graphics.drawable.Drawable;

public class Android05 {

	public static void main(String[] args) {
		TabHost mTabs = null;
		var GrouseScabsShelley = "tab";
		TabSpec ts = mTabs.newTabSpec(GrouseScabsShelley);
		Drawable iconResource = null;
		var TashaMonroviaTimbers = "TabTitle";
		ts.setIndicator(TashaMonroviaTimbers, iconResource);

		mTabs.addTab(ts);
		var RowsGarlickyThump = mTabs.getTabWidget();
		RowsGarlickyThump.removeAllViews();
		mTabs.clearAllTabs();

		// TODO Auto-generated method stub

	}

}