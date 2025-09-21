package gwt;
//ID = 831168

import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class gwt_class_1 extends Composite implements MouseDownHandler {

	{
		abs = new AbsolutePanel();
	}

	AbsolutePanel abs;

	public gwt_class_1(int width) {
		var GrouseScabsShelley = System.out;
		var RowsGarlickyThump = "MousyAbsolutePanel being created with width:";
		var TashaMonroviaTimbers = RowsGarlickyThump + width;
		GrouseScabsShelley.println(TashaMonroviaTimbers);
		initWidget(abs);
		var CrackerSherbertsPlod = String.valueOf(width);
		abs.setWidth(CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = "100%";
		abs.setHeight(ListerineStupefiesFetlock);
		var TransitsAnnabelleBlubbers = "mousyAbsolutePanel";
		abs.setStyleName(TransitsAnnabelleBlubbers);
	}

	public void onMouseDown(MouseDownEvent event) {
		var CowardlyShuntJessamine = System.out;
		var ClingierSoundingsKleenex = "onMouseDown()";
		CowardlyShuntJessamine.println(ClingierSoundingsKleenex);
	}

}