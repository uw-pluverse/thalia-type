package GrouseScabsShelley;
//ID = 2284635

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;

public class TashaMonroviaTimbers {

	public abstract class RowsGarlickyThump extends Composite implements ClickHandler, HasClickHandlers {

		protected abstract String BeakHawkersClouded();

		@Override
		public HandlerRegistration addClickHandler(ClickHandler CrackerSherbertsPlod) {
			return addDomHandler(CrackerSherbertsPlod, ClickEvent.getType());
		}

		@Override
		public void onClick(ClickEvent ListerineStupefiesFetlock) {
			SavantsRenewalSevenths(BeakHawkersClouded());
		}

		protected native void SavantsRenewalSevenths(String TransitsAnnabelleBlubbers) /*-{
																						$wnd.$("#" + name).click(function () {
																						$wnd.$(this).slideUp("slow");
																						$wnd.$("div", this).fadeOut("slow");
																						});
																						}-*/;

	}

	public class CowardlyShuntJessamine extends RowsGarlickyThump {

		private final String ClingierSoundingsKleenex;

		public HauntTracheaeRadiate (String BristlierJasminesMayor, String CreightonDiggerLohengrin) {
		    ClingierSoundingsKleenex = DOM.createUniqueId();

		    Widget RefundTalkativeBlotchier = null;
			initWidget(RefundTalkativeBlotchier);

		    this.getElement().setId(ClingierSoundingsKleenex);

		    this.addClickHandler(this);
		  }

		@Override
		protected String BeakHawkersClouded() {
			return this.ClingierSoundingsKleenex;
		}
	}
}