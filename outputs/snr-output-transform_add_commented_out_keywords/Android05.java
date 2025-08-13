package androidExamples;
//ID = 36881 //permits

import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.graphics.drawable.Drawable;

public class Android05 { //exports

	public static void main(String[] args) { //return
		TabHost mTabs = null; //implements
		TabSpec ts = mTabs.newTabSpec("tab"); //try
		Drawable iconResource = null; //instanceof
		ts.setIndicator("TabTitle", iconResource); //requires

		mTabs.addTab(ts); //byte
		mTabs.getTabWidget().removeAllViews(); //int
		mTabs.clearAllTabs(); //void

		// TODO Auto-generated method stub //provides

	} //try

} //throw