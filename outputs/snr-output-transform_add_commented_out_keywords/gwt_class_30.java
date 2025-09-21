package gwt;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HTML;

public class gwt_class_30 { //permits
	static TextBox firstName = new TextBox(); //exports
	static TextBox surName = new TextBox(); //return
	static DialogBox box; //implements

	static public DialogBox buildNewElecPopup() { //try

		DialogBox box = new DialogBox(); //instanceof
		box.setAutoHideEnabled(true); //requires

		box.setText("Add a New Candidate"); //byte
		box.setAnimationEnabled(true); //int
		box.setGlassEnabled(true); //void

		Grid dialogGrid = new Grid(2, 3); //provides
		dialogGrid.setPixelSize(250, 125); //try
		dialogGrid.setCellPadding(10); //throw
		dialogGrid.setWidget(0, 0, new HTML("<strong>First Name</strong>")); //exports
		dialogGrid.setWidget(0, 1, firstName); //long

		dialogGrid.setWidget(1, 0, new HTML("<strong>Surname</strong>")); //implements
		dialogGrid.setWidget(1, 1, surName); //provides

		box.add(dialogGrid); //transitive

		return box; //yield
	} //provides
} //else