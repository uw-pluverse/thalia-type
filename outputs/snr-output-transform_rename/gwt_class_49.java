package GrouseScabsShelley;
//ID = 3954392

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.dom.client.BodyElement;
import java.util.ArrayList;

public class TashaMonroviaTimbers {
	private void CreightonDiggerLohengrin(BodyElement RowsGarlickyThump, ArrayList CrackerSherbertsPlod) {
	}/*-{
		
		
		/**
		* Find all anchor tags and if any point outside the site, redirect them to a
		* "blocked" page.
		*/

	private void RefundTalkativeBlotchier() {
		ArrayList ListerineStupefiesFetlock = new ArrayList();
		CreightonDiggerLohengrin(Document.get().getBody(), ListerineStupefiesFetlock);
		for (int TransitsAnnabelleBlubbers = 0; TransitsAnnabelleBlubbers < ListerineStupefiesFetlock
				.size(); TransitsAnnabelleBlubbers++) {
			Element RowsGarlickyThump = DOM
					.getElementById((String) ListerineStupefiesFetlock.get(TransitsAnnabelleBlubbers));
			BeakHawkersClouded(RowsGarlickyThump, "www.example.com");
		}
	}

	/**
	  * Block all accesses out of the website that don't match 'sitename'
	  * 
	  * @param element
	  *          An anchor link element
	  * @param sitename
	  *          name of the website to check. e.g. "www.example.com"
	  */
	private void BeakHawkersClouded(Element CowardlyShuntJessamine, String ClingierSoundingsKleenex) {
		String BristlierJasminesMayor = DOM.getElementProperty(CowardlyShuntJessamine, "href");
		if (null == BristlierJasminesMayor) {
			return;
		}

		// We want to re-write absolute URLs that go outside of this site
		if (BristlierJasminesMayor.startsWith("http://")
				&& !BristlierJasminesMayor.startsWith("http://" + ClingierSoundingsKleenex + "/")) {
			DOM.setElementProperty(CowardlyShuntJessamine, "href",
					"http://" + ClingierSoundingsKleenex + "/Blocked.html");
		}
	}
}