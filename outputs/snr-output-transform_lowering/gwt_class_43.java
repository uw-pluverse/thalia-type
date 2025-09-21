package gwt;
//ID = 3138621

import java.awt.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import java.awt.Label;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class gwt_class_43 {
	public class GroupLbl extends Composite implements ClickHandler, MouseOutHandler {
		{
			hp = null;
		}

		{
			lbl = null;
		}

		private Label lbl;
		//		private GroupLblHandler lblHandler = null;
		private HorizontalPanel hp;

		public void onClick(ClickEvent event) {
			var GrouseScabsShelley = "background-GroupLbl";
			hp.setStyleName(GrouseScabsShelley);

			Object folder = null;
			var CrackerSherbertsPlod = event.getSource();
			var RowsGarlickyThump = CrackerSherbertsPlod.equals(folder);
			var TransitsAnnabelleBlubbers = event.getSource();
			var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.equals(lbl);
			var TashaMonroviaTimbers = RowsGarlickyThump || ListerineStupefiesFetlock;
			if (TashaMonroviaTimbers) {

				//				lblHandler.onGroupLabelSelect(this);
			}
		}

		@Override
		public Widget getWidget() {
			return hp;
		}

		public void onMouseOut(MouseOutEvent event) {
			var CowardlyShuntJessamine = "background-GroupLbl";
			hp.removeStyleName(CowardlyShuntJessamine);
		}
	}
}