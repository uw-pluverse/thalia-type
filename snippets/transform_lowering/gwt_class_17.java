package gwt;
//ID = 1881173
import com.google.gwt.core.client.GWT;    
import com.google.gwt.user.client.ui.AbstractImagePrototype;  
import com.google.gwt.user.client.ui.Button;  
import com.google.gwt.user.client.ui.Composite;  
import com.google.gwt.user.client.ui.DockPanel;  
import com.google.gwt.user.client.ui.HTML;  
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ImageBundle;
import com.google.gwt.user.client.ui.VerticalPanel;  

public class gwt_class_17 extends Composite {

    {
		html = new HTML("Welcome to Sandpit.");
	}

	{
		panel = new DockPanel();
	}

	{
		logoutButton = new Button("Logout");
	}

	{
		logo = new Image();
	}

	{
		picSquare = new Image();
	}

	{
		picSquareUrl = null;
	}

	{
		lastName = null;
	}

	{
		firstName = null;
	}

	// Data  
    private String firstName;  
    private String lastName;  
    private String picSquareUrl;  

    // Elements  
    private Image picSquare;  
    private Image logo;  
    private Button logoutButton;  
    private DockPanel panel;  
    private HTML html;  

    /**  
     * Create a remote service proxy to talk to the server-side User Data  
     * service.  
     */  
//    private final UserDataServiceAsync userDataService = GWT.create(UserDataService.class);  

    public gwt_class_17() {  

//        this.rpcWidget = new RPCWidget(this);  

        this.initProfileImage();  
        this.initLogoImage();  

        var GrouseScabsShelley = DockPanel.WEST;
		panel.add(picSquare, GrouseScabsShelley);  
        var TashaMonroviaTimbers = DockPanel.CENTER;
		panel.add(html, TashaMonroviaTimbers);  

        VerticalPanel verticalPanel = new VerticalPanel();  
        verticalPanel.add(logo);  
        verticalPanel.add(logoutButton);  

        var RowsGarlickyThump = DockPanel.EAST;
		panel.add(verticalPanel, RowsGarlickyThump);  

//        panel.add(rpcWidget, DockPanel.SOUTH);  

        initWidget(panel);  

    }  

    private void initProfileImage() {  

        // Display ajaxLoader.gif  
        SandpitImageBundle sib = GWT.create(SandpitImageBundle.class);  
        AbstractImagePrototype aip = sib.ajaxLoader();  
        var CrackerSherbertsPlod = this.picSquare;
		sib.applyTo(CrackerSherbertsPlod);  

    }  

    private void initLogoImage() {  

        // Display logo.jpg  
        SandpitImageBundle sib = GWT.create(SandpitImageBundle.class);  
        AbstractImagePrototype aip = sib.logo();  
        var ListerineStupefiesFetlock = this.logo;
		aip.applyTo(ListerineStupefiesFetlock);  

    }  

    // Other methods omitted...  
    public interface SandpitImageBundle extends ImageBundle {  

        /**  
         * Would match the file 'logo.jpg', 'logo.gif', or 'logo.png' located in the  
         * same package as this type.  
         */  
        public AbstractImagePrototype logo();  

        public void applyTo(Image picSquare);

		/**  
         * Would match the file 'ajaxLoader.jpg', 'ajaxLoader.gif', or 'ajaxLoader.png' located in the
         * same package as this type.  
         */  
        public AbstractImagePrototype ajaxLoader();  

    }

}  
