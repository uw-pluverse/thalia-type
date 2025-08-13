package gwt;
//ID = 3618678

import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;

public class gwt_class_47 implements EntryPoint {
	static {
		PCT = null;
	}

	private static final Unit PCT;

	@Override
	public void onModuleLoad() {
		var GrouseScabsShelley = "left";
		var TashaMonroviaTimbers = "right";
		Widget childone = new HTML(GrouseScabsShelley), childtwo = new HTML(TashaMonroviaTimbers);
		LayoutPanel p = new LayoutPanel();
		p.add(childone);
		p.add(childtwo);
		var RowsGarlickyThump = 0;
		var CrackerSherbertsPlod = 50;
		p.setWidgetLeftWidth(childone, RowsGarlickyThump, PCT, CrackerSherbertsPlod, PCT);
		var ListerineStupefiesFetlock = 0;
		var TransitsAnnabelleBlubbers = 50;
		p.setWidgetRightWidth(childtwo, ListerineStupefiesFetlock, PCT, TransitsAnnabelleBlubbers, PCT);
		RootLayoutPanel rp = RootLayoutPanel.get();
		rp.add(p);
	}
}