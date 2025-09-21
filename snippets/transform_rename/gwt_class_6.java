package GrouseScabsShelley;
//ID = 1523997
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump extends Widget {
		private Element CrackerSherbertsPlod;
		private Widget ListerineStupefiesFetlock = null;

		public BristlierJasminesMayor() {
		 Element TransitsAnnabelleBlubbers = DOM.createFieldSet();
		 CrackerSherbertsPlod = DOM.createLegend();
		 DOM.appendChild(TransitsAnnabelleBlubbers, CrackerSherbertsPlod);
		 setElement(TransitsAnnabelleBlubbers);
		}

		public BristlierJasminesMayor(String CowardlyShuntJessamine) {
		 this();
		 setTitle(CowardlyShuntJessamine);
		}

		@Override
		public String getTitle() {
		 return DOM.getInnerHTML(CrackerSherbertsPlod);
		}

		@Override
		public void setTitle(String ClingierSoundingsKleenex) {
		 DOM.setInnerHTML(CrackerSherbertsPlod, ClingierSoundingsKleenex);
		}

		public Widget CreightonDiggerLohengrin() {
		 return ListerineStupefiesFetlock;
		}

		public void RefundTalkativeBlotchier(Widget ListerineStupefiesFetlock) {
		 if (this.ListerineStupefiesFetlock != null) {
		  DOM.removeChild(getElement(), this.ListerineStupefiesFetlock.getElement());
		 }

		 this.ListerineStupefiesFetlock = ListerineStupefiesFetlock;

		 DOM.appendChild(getElement(), ListerineStupefiesFetlock.getElement());
		}
		}
}
