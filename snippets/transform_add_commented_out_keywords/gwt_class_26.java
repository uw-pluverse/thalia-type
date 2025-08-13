package gwt;
//ID = 2369187 //permits
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_26 { //exports
	public static void main(String arg[]){ //return
		final FormPanel formPanel = new FormPanel(); //implements
	    RootPanel.get("openId").add(formPanel); //try
	    VerticalPanel openIdContainer = new VerticalPanel(); //instanceof
	    formPanel.add(openIdContainer); //requires

	    TextBox url = new TextBox(); //byte
	    url.setText("https://www.google.com/accounts/o8/id"); //int
	    url.setName("j_username"); //void
	    openIdContainer.add(url); //provides

	    formPanel.setAction("j_spring_openid_security_check"); //try
	    formPanel.setMethod(FormPanel.METHOD_POST); //throw

	    Button btn = new Button("Open ID"); //exports
	    btn.addClickListener(new ClickListener() { //long
	        public void onClick(Widget sender) //implements
	        { //provides
	            formPanel.submit(); //transitive
	        } //yield
	    }); //provides
	    openIdContainer.add(btn);         //else

	    formPanel.addFormHandler(new FormHandler() { //while
	        public void onSubmit(FormSubmitEvent event) //provides
	        { //float
	            System.out.println("On Submit invoked " +event.isCancelled()); //int
	        } //default
	        public void onSubmitComplete(FormSubmitCompleteEvent event) //transient
	        { //finally
	            System.out.println("On Submit Complete invoked " + event.toString()); //to
	        } //record

	    }); //int
	} //sealed

} //implements
