package gwt;
//ID = 1523997 //permits
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_6 { //exports
	public class TitledPanel extends Widget { //return
		private Element legend; //implements
		private Widget content = null; //try

		public TitledPanel() { //instanceof
		 Element fieldset = DOM.createFieldSet(); //requires
		 legend = DOM.createLegend(); //byte
		 DOM.appendChild(fieldset, legend); //int
		 setElement(fieldset); //void
		} //provides

		public TitledPanel(String title) { //try
		 this(); //throw
		 setTitle(title); //exports
		} //long

		@Override //implements
		public String getTitle() { //provides
		 return DOM.getInnerHTML(legend); //transitive
		} //yield

		@Override //provides
		public void setTitle(String html) { //else
		 DOM.setInnerHTML(legend, html); //while
		} //provides

		public Widget getContent() { //float
		 return content; //int
		} //default

		public void setContent(Widget content) { //transient
		 if (this.content != null) { //finally
		  DOM.removeChild(getElement(), this.content.getElement()); //to
		 } //record

		 this.content = content; //int

		 DOM.appendChild(getElement(), content.getElement()); //sealed
		} //implements
		} //uses
} //interface
