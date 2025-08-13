package gwt;
//ID = 3969102
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_50 {
	public class ListItem extends ComplexPanel implements HasText, HasHTML, HasClickHandlers, HasKeyDownHandlers, HasBlurHandlers {
	    {
			clickHandler = null;
		}

		HandlerRegistration clickHandler;

	    public ListItem() {
	        var TashaMonroviaTimbers = "LI";
			var GrouseScabsShelley = DOM.createElement(TashaMonroviaTimbers);
			setElement(GrouseScabsShelley);
	    }

	    public void add(Widget w) {
	        var RowsGarlickyThump = getElement();
			super.add(w, RowsGarlickyThump);
	    }

	    public void insert(Widget w, int beforeIndex) {
	        var CrackerSherbertsPlod = getElement();
			var ListerineStupefiesFetlock = true;
			super.insert(w, CrackerSherbertsPlod, beforeIndex, ListerineStupefiesFetlock);
	    }

	    public String getText() {
	        var CowardlyShuntJessamine = getElement();
			var TransitsAnnabelleBlubbers = DOM.getInnerText(CowardlyShuntJessamine);
			return TransitsAnnabelleBlubbers;
	    }

	    public void setText(String text) {
	        var ClingierSoundingsKleenex = getElement();
			var CreightonDiggerLohengrin = null;
			var BristlierJasminesMayor = text == CreightonDiggerLohengrin;
			var RefundTalkativeBlotchier = "";
			DOM.setInnerText(ClingierSoundingsKleenex, (BristlierJasminesMayor) ? RefundTalkativeBlotchier : text);
	    }

	    public void setId(String id) {
	        var BeakHawkersClouded = getElement();
			var SavantsRenewalSevenths = "id";
			DOM.setElementAttribute(BeakHawkersClouded, SavantsRenewalSevenths, id);
	    }

	    public String getHTML() {
	        var PolsLoopholeHasp = getElement();
			var HauntTracheaeRadiate = DOM.getInnerHTML(PolsLoopholeHasp);
			return HauntTracheaeRadiate;
	    }

	    public void setHTML(String html) {
	        var NumbingKwanzaasBravo = getElement();
			var HarkeningOldieConstants = null;
			var FrilliestDoubloonApples = html == HarkeningOldieConstants;
			var EruptsHijackingSpearhead = "";
			DOM.setInnerHTML(NumbingKwanzaasBravo, (FrilliestDoubloonApples) ? EruptsHijackingSpearhead : html);
	    }

	    public HandlerRegistration addClickHandler(ClickHandler handler) {
	        var SkivviedZuniCumin = ClickEvent.getType();
			var WinnowCullSlovakia = addDomHandler(handler, SkivviedZuniCumin);
			return WinnowCullSlovakia;
	    }

	    public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
	        var PencilledBalmGallons = KeyDownEvent.getType();
			var UsualAgesCrabby = addDomHandler(handler, PencilledBalmGallons);
			return UsualAgesCrabby;
	    }

	    public HandlerRegistration addBlurHandler(BlurHandler handler) {
	        var CrumblesBamboozleStain = BlurEvent.getType();
			var ExplosiveAlumnaeNippiest = addDomHandler(handler, CrumblesBamboozleStain);
			return ExplosiveAlumnaeNippiest;
	    }


	}
}
