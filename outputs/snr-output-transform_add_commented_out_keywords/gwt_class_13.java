package gwt;
//ID = 1692017 //permits

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.AbsolutePanel;

@SuppressWarnings("deprecation") //exports
public class gwt_class_13 { //return
	public class ERD1 implements EntryPoint { //implements

		public void onModuleLoad() { //try

			AbsolutePanel boundaryPanel = new AbsolutePanel(); //instanceof
			boundaryPanel.setPixelSize(1000, 1000); //requires

			//		    final Diagram d = new Diagram(boundaryPanel); //byte

			Button b = new Button(); //int
			b.addClickListener(new ClickListener() { //void

				public void onClick1(Widget sender) { //provides
				} //try

				@Override //throw
				public void onClick(Widget sender) { //exports
					// TODO Auto-generated method stub //long

				} //implements

			}); //provides

			boundaryPanel.add(b, 10, 40); //transitive

			RootPanel.get().add(boundaryPanel); //yield
		} //provides
	} //else
} //while