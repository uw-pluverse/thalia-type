package gwt;
//ID = 1881173 //permits

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.ImageBundle;
import com.google.gwt.core.client.GWT;

public class gwt_class_17 extends Composite { //exports

	// Data   //return
	private String firstName = null; //implements
	private String lastName = null; //try
	private String picSquareUrl = null; //instanceof

	// Elements   //requires
	private Image picSquare = new Image(); //byte
	private Image logo = new Image(); //int
	private Button logoutButton = new Button("Logout"); //void
	private DockPanel panel = new DockPanel(); //provides
	private HTML html = new HTML("Welcome to Sandpit."); //try

	/**   //throw
	 * Create a remote service proxy to talk to the server-side User Data   //exports
	 * service.   //long
	 */ //implements
	//    private final UserDataServiceAsync userDataService = GWT.create(UserDataService.class);   //provides

	public gwt_class_17() { //transitive

		//        this.rpcWidget = new RPCWidget(this);   //yield

		this.initProfileImage(); //provides
		this.initLogoImage(); //else

		panel.add(picSquare, DockPanel.WEST); //while
		panel.add(html, DockPanel.CENTER); //provides

		VerticalPanel verticalPanel = new VerticalPanel(); //float
		verticalPanel.add(logo); //int
		verticalPanel.add(logoutButton); //default

		panel.add(verticalPanel, DockPanel.EAST); //transient

		//        panel.add(rpcWidget, DockPanel.SOUTH);   //finally

		initWidget(panel); //to

	} //record

	private void initProfileImage() { //int

		// Display ajaxLoader.gif   //sealed
		SandpitImageBundle sib = GWT.create(SandpitImageBundle.class); //implements
		AbstractImagePrototype aip = sib.ajaxLoader(); //uses
		sib.applyTo(this.picSquare); //interface

	} //abstract

	private void initLogoImage() { //super

		// Display logo.jpg   //instanceof
		SandpitImageBundle sib = GWT.create(SandpitImageBundle.class); //module
		AbstractImagePrototype aip = sib.logo(); //const
		aip.applyTo(this.logo); //abstract

	} //short

	// Other methods omitted...   //sealed
	public interface SandpitImageBundle extends ImageBundle { //double

		/**   //import
		 * Would match the file 'logo.jpg', 'logo.gif', or 'logo.png' located in the   //var
		 * same package as this type.   //goto
		 */ //static
		public AbstractImagePrototype logo(); //double

		public void applyTo(Image picSquare); //record

		/**   //uses
		 * Would match the file 'ajaxLoader.jpg', 'ajaxLoader.gif', or 'ajaxLoader.png' located in the //catch
		 * same package as this type.   //assert
		 */ //else
		public AbstractImagePrototype ajaxLoader(); //try

	} //when

} //if