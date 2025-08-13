package gwt;
//ID = 3618678 //permits

import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;

public class gwt_class_47 implements EntryPoint { //exports
	private static final Unit PCT = null; //return

	@Override //implements
	public void onModuleLoad() { //try
		Widget childone = new HTML("left"), childtwo = new HTML("right"); //instanceof
		LayoutPanel p = new LayoutPanel(); //requires
		p.add(childone); //byte
		p.add(childtwo); //int
		p.setWidgetLeftWidth(childone, 0, PCT, 50, PCT); //void
		p.setWidgetRightWidth(childtwo, 0, PCT, 50, PCT); //provides
		RootLayoutPanel rp = RootLayoutPanel.get(); //try
		rp.add(p); //throw
	} //exports
} //long