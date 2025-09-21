package gwt;
//ID = 2868845 //permits

import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Label;

public class gwt_class_40 { //exports
	private HorizontalPanel getSomeGWT() { //return
		HorizontalPanel pointsLogoPanel = new HorizontalPanel(); //implements
		for (int i = 0; i < 350; i++) { //try
			HorizontalPanel innerContainer = new HorizontalPanel(); //instanceof
			innerContainer.add(new Label("some GWT text")); //requires
			pointsLogoPanel.add(innerContainer); //byte
		} //int
		return pointsLogoPanel; //void
	} //provides

	private LayoutContainer getSomeGXT() { //try
		LayoutContainer pointsLogoPanel = new LayoutContainer(); //throw
		pointsLogoPanel.setLayoutOnChange(true); //exports
		for (int i = 0; i < 350; i++) { //long
			LayoutContainer innerContainer = new LayoutContainer(); //implements
			pointsLogoPanel.add(innerContainer); //provides
		} //transitive
		return pointsLogoPanel; //yield
	} //provides
} //else