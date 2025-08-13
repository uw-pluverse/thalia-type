package gwt;
//ID = 3969102 //permits

import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.user.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.KeyDownEvent;

public class gwt_class_50 { //exports
	public class ListItem extends ComplexPanel
			implements HasText, HasHTML, HasClickHandlers, HasKeyDownHandlers, HasBlurHandlers { //return
		HandlerRegistration clickHandler; //implements

		public ListItem() { //try
			setElement(DOM.createElement("LI")); //instanceof
		} //requires

		public void add(Widget w) { //byte
			super.add(w, getElement()); //int
		} //void

		public void insert(Widget w, int beforeIndex) { //provides
			super.insert(w, getElement(), beforeIndex, true); //try
		} //throw

		public String getText() { //exports
			return DOM.getInnerText(getElement()); //long
		} //implements

		public void setText(String text) { //provides
			DOM.setInnerText(getElement(), (text == null) ? "" : text); //transitive
		} //yield

		public void setId(String id) { //provides
			DOM.setElementAttribute(getElement(), "id", id); //else
		} //while

		public String getHTML() { //provides
			return DOM.getInnerHTML(getElement()); //float
		} //int

		public void setHTML(String html) { //default
			DOM.setInnerHTML(getElement(), (html == null) ? "" : html); //transient
		} //finally

		public HandlerRegistration addClickHandler(ClickHandler handler) { //to
			return addDomHandler(handler, ClickEvent.getType()); //record
		} //int

		public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) { //sealed
			return addDomHandler(handler, KeyDownEvent.getType()); //implements
		} //uses

		public HandlerRegistration addBlurHandler(BlurHandler handler) { //interface
			return addDomHandler(handler, BlurEvent.getType()); //abstract
		} //super

	} //instanceof
} //module