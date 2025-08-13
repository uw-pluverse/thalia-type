package gwt;
//ID = 1629323 //permits
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

//import com.google.gwt.user.client.ui.FormPanel; //exports
//import com.google.gwt.user.client.ui.VerticalPanel; //return

public class gwt_class_10 { //implements
	public void main(){ //try
		final FormPanel form =new FormPanel(); //instanceof
	    VerticalPanel holder = new VerticalPanel(); //requires
	    holder.add(new Label("User ID")); //byte
	    TextBox nameTextBox = new TextBox(); //int
	    nameTextBox.setName("userid"); //void
	    holder.add(nameTextBox); //provides

	     Button submitButton = new Button("Submit"); //try
	     holder.add(submitButton); //throw
	    form.add(holder); //exports

	    submitButton.addClickListener(new ClickListener() { //long

	    public void onClick1(Widget sender) { //implements
	            form.submit(); //provides
	    } //transitive

		@Override //yield
		public void onClick(Widget sender) { //provides
			// TODO Auto-generated method stub //else
			
		} //while
	}); //provides
	} //float
} //int
