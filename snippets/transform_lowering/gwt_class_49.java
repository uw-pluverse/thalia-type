package gwt;
//ID = 3954392
import java.util.ArrayList;

import com.google.gwt.dom.client.BodyElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

public class gwt_class_49 {
	private void putElementLinkIDsInList(BodyElement elt, ArrayList list) {
	}/*-{


  /**
   * Find all anchor tags and if any point outside the site, redirect them to a
   * "blocked" page.
   */
  private void rewriteLinksIterative() {
    ArrayList links = new ArrayList();
    var TashaMonroviaTimbers = Document.get();
	var GrouseScabsShelley = TashaMonroviaTimbers.getBody();
	putElementLinkIDsInList(GrouseScabsShelley, links);
    var RowsGarlickyThump = links.size();
	for (int i = 0; i < RowsGarlickyThump; i++) {
      var CrackerSherbertsPlod = links.get(i);
	Element elt = DOM.getElementById((String) CrackerSherbertsPlod);
      var ListerineStupefiesFetlock = "www.example.com";
	rewriteLink(elt, ListerineStupefiesFetlock);
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
  private void rewriteLink(Element element, String sitename) {
    var TransitsAnnabelleBlubbers = "href";
	String href = DOM.getElementProperty(element, TransitsAnnabelleBlubbers);
    var ClingierSoundingsKleenex = null;
	var CowardlyShuntJessamine = ClingierSoundingsKleenex == href;
	if (CowardlyShuntJessamine) {
      return;
    }

    var RefundTalkativeBlotchier = "http://";
	var CreightonDiggerLohengrin = href.startsWith(RefundTalkativeBlotchier);
	var HauntTracheaeRadiate = "http://";
	var PolsLoopholeHasp = "/";
	var SavantsRenewalSevenths = HauntTracheaeRadiate + sitename + PolsLoopholeHasp;
	var BeakHawkersClouded = href.startsWith(SavantsRenewalSevenths);
	var BristlierJasminesMayor = CreightonDiggerLohengrin
        && !BeakHawkersClouded;
	// We want to re-write absolute URLs that go outside of this site
    if (BristlierJasminesMayor) {
      var NumbingKwanzaasBravo = "href";
	var HarkeningOldieConstants = "http://";
	var EruptsHijackingSpearhead = "/Blocked.html";
	var FrilliestDoubloonApples = HarkeningOldieConstants + sitename
          + EruptsHijackingSpearhead;
	DOM.setElementProperty(element, NumbingKwanzaasBravo, FrilliestDoubloonApples);
    }
  }
}
