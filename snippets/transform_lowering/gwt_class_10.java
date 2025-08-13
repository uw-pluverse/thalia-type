package gwt;
//ID = 1629323
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

//import com.google.gwt.user.client.ui.FormPanel;
//import com.google.gwt.user.client.ui.VerticalPanel;

public class gwt_class_10 {
	public void main(){
		final FormPanel form =new FormPanel();
	    VerticalPanel holder = new VerticalPanel();
	    var TashaMonroviaTimbers = "User ID";
		var GrouseScabsShelley = new Label(TashaMonroviaTimbers);
		holder.add(GrouseScabsShelley);
	    TextBox nameTextBox = new TextBox();
	    var RowsGarlickyThump = "userid";
		nameTextBox.setName(RowsGarlickyThump);
	    holder.add(nameTextBox);

	     var CrackerSherbertsPlod = "Submit";
		Button submitButton = new Button(CrackerSherbertsPlod);
	     holder.add(submitButton);
	    form.add(holder);

	    var ListerineStupefiesFetlock = new ClickListener() {

	    public void onClick1(Widget sender) {
	            form.submit();
	    }

		@Override
		public void onClick(Widget sender) {
			// TODO Auto-generated method stub
			
		}
	};
		submitButton.addClickListener(ListerineStupefiesFetlock);
	}
}
