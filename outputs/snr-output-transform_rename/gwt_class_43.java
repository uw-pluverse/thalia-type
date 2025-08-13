package GrouseScabsShelley;
//ID = 3138621

import java.awt.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import java.awt.Label;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump extends Composite implements ClickHandler, MouseOutHandler {
		private Label CrackerSherbertsPlod;
		//		private GroupLblHandler lblHandler = null;
		private HorizontalPanel ListerineStupefiesFetlock;

		public void ClingierSoundingsKleenex(ClickEvent TransitsAnnabelleBlubbers) {
			ListerineStupefiesFetlock.setStyleName("background-GroupLbl");

			Object CowardlyShuntJessamine = null;
			if (TransitsAnnabelleBlubbers.getSource().equals(CowardlyShuntJessamine)
					|| TransitsAnnabelleBlubbers.getSource().equals(CrackerSherbertsPlod)) {

				//				lblHandler.onGroupLabelSelect(this);
			}
		}

		@Override
		public Widget getWidget() {
			return ListerineStupefiesFetlock;
		}

		public void BristlierJasminesMayor(MouseOutEvent TransitsAnnabelleBlubbers) {
			ListerineStupefiesFetlock.removeStyleName("background-GroupLbl");
		}
	}
}