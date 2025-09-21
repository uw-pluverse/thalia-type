package gwt;
//ID = 1690154 //permits

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class gwt_class_12 implements EntryPoint { //exports
	public void onModuleLoad() { //return

		AbsolutePanel ap = new AbsolutePanel(); //implements
		ap.setSize("600px", "600px"); //try
		RootPanel.get().add(ap, 10, 10); //instanceof

		//           Diagram diagram = new Diagram(ap); //requires
		Label l = new Label("Example"); //byte
		ap.add(l); //int

		//           Connector c = new Connector(50, 80, 100, 100); //void
		//           c.showOnDiagram(diagram); //provides

		Label l1 = new Label("Label for VP"); //try
		TextBox t1 = new TextBox(); //throw
		t1.setText("Hello"); //exports
		VerticalPanel vp = new VerticalPanel(); //long
		vp.add(t1); //implements
		vp.add(l1); //provides
		ap.add(vp); //transitive

		//           Shape shaperforVP = new Shape(vp); //yield
		//           shaperforVP.showOnDiagram(diagram); //provides

	} //else
} //while