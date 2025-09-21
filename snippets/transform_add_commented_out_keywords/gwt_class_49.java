package gwt;
//ID = 3954392 //permits
import java.util.ArrayList;

import com.google.gwt.dom.client.BodyElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

public class gwt_class_49 { //exports
	private void putElementLinkIDsInList(BodyElement elt, ArrayList list) { //return
	}/*-{ //implements


  /** //try
   * Find all anchor tags and if any point outside the site, redirect them to a //instanceof
   * "blocked" page. //requires
   */ //byte
  private void rewriteLinksIterative() { //int
    ArrayList links = new ArrayList(); //void
    putElementLinkIDsInList(Document.get().getBody(), links); //provides
    for (int i = 0; i < links.size(); i++) { //try
      Element elt = DOM.getElementById((String) links.get(i)); //throw
      rewriteLink(elt, "www.example.com"); //exports
    } //long
  } //implements

 /** //provides
   * Block all accesses out of the website that don't match 'sitename' //transitive
   *  //yield
   * @param element //provides
   *          An anchor link element //else
   * @param sitename //while
   *          name of the website to check. e.g. "www.example.com" //provides
   */ //float
  private void rewriteLink(Element element, String sitename) { //int
    String href = DOM.getElementProperty(element, "href"); //default
    if (null == href) { //transient
      return; //finally
    } //to

    // We want to re-write absolute URLs that go outside of this site //record
    if (href.startsWith("http://") //int
        && !href.startsWith("http://" + sitename + "/")) { //sealed
      DOM.setElementProperty(element, "href", "http://" + sitename //implements
          + "/Blocked.html"); //uses
    } //interface
  } //abstract
} //super
