package gwt;
//ID = 1523997

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.DOM;

public class gwt_class_6 {
	public class TitledPanel extends Widget {
		{
			content = null;
		}

		{
			legend = null;
		}

		private Element legend;
		private Widget content;

		public TitledPanel() {
			Element fieldset = DOM.createFieldSet();
			legend = DOM.createLegend();
			DOM.appendChild(fieldset, legend);
			setElement(fieldset);
		}

		public TitledPanel(String title) {
			this();
			setTitle(title);
		}

		@Override
		public String getTitle() {
			var GrouseScabsShelley = DOM.getInnerHTML(legend);
			return GrouseScabsShelley;
		}

		@Override
		public void setTitle(String html) {
			DOM.setInnerHTML(legend, html);
		}

		public Widget getContent() {
			return content;
		}

		public void setContent(Widget content) {
			var RowsGarlickyThump = this.content;
			var CrackerSherbertsPlod = null;
			var TashaMonroviaTimbers = RowsGarlickyThump != CrackerSherbertsPlod;
			if (TashaMonroviaTimbers) {
				var ListerineStupefiesFetlock = getElement();
				var CowardlyShuntJessamine = this.content;
				var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.getElement();
				DOM.removeChild(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
			}

			var ClingierSoundingsKleenex = this.content;
			ClingierSoundingsKleenex = content;

			var BristlierJasminesMayor = getElement();
			var CreightonDiggerLohengrin = content.getElement();
			DOM.appendChild(BristlierJasminesMayor, CreightonDiggerLohengrin);
		}
	}
}