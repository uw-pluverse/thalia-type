package GrouseScabsShelley;
//ID = 1881173

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.ImageBundle;
import com.google.gwt.core.client.GWT;

public class TashaMonroviaTimbers extends Composite {

	// Data  
	private String RowsGarlickyThump = null;
	private String CrackerSherbertsPlod = null;
	private String ListerineStupefiesFetlock = null;

	// Elements  
	private Image TransitsAnnabelleBlubbers = new Image();
	private Image CowardlyShuntJessamine = new Image();
	private Button ClingierSoundingsKleenex = new Button("Logout");
	private DockPanel BristlierJasminesMayor = new DockPanel();
	private HTML CreightonDiggerLohengrin = new HTML("Welcome to Sandpit.");

	/**  
     * Create a remote service proxy to talk to the server-side User Data  
     * service.  
     */  
//    private final UserDataServiceAsync userDataService = GWT.create(UserDataService.class);  

    public PolsLoopholeHasp() {  

//        this.rpcWidget = new RPCWidget(this);  

        this.initProfileImage();  
        this.initLogoImage();  

        BristlierJasminesMayor.add(TransitsAnnabelleBlubbers, DockPanel.WEST);  
        BristlierJasminesMayor.add(CreightonDiggerLohengrin, DockPanel.CENTER);  

        VerticalPanel RefundTalkativeBlotchier = new VerticalPanel();  
        RefundTalkativeBlotchier.add(CowardlyShuntJessamine);  
        RefundTalkativeBlotchier.add(ClingierSoundingsKleenex);  

        BristlierJasminesMayor.add(RefundTalkativeBlotchier, DockPanel.EAST);  

//        panel.add(rpcWidget, DockPanel.SOUTH);  

        initWidget(BristlierJasminesMayor);  

    }

	private void initProfileImage() {

		// Display ajaxLoader.gif  
		HauntTracheaeRadiate BeakHawkersClouded = GWT.create(HauntTracheaeRadiate.class);
		AbstractImagePrototype SavantsRenewalSevenths = BeakHawkersClouded.ajaxLoader();
		BeakHawkersClouded.applyTo(this.TransitsAnnabelleBlubbers);

	}

	private void initLogoImage() {

		// Display logo.jpg  
		HauntTracheaeRadiate BeakHawkersClouded = GWT.create(HauntTracheaeRadiate.class);
		AbstractImagePrototype SavantsRenewalSevenths = BeakHawkersClouded.logo();
		SavantsRenewalSevenths.applyTo(this.CowardlyShuntJessamine);

	}

	// Other methods omitted...  
	public interface HauntTracheaeRadiate extends ImageBundle {

		/**  
		 * Would match the file 'logo.jpg', 'logo.gif', or 'logo.png' located in the  
		 * same package as this type.  
		 */
		public AbstractImagePrototype logo();

		public void applyTo(Image TransitsAnnabelleBlubbers);

		/**  
		 * Would match the file 'ajaxLoader.jpg', 'ajaxLoader.gif', or 'ajaxLoader.png' located in the
		 * same package as this type.  
		 */
		public AbstractImagePrototype ajaxLoader();

	}

}