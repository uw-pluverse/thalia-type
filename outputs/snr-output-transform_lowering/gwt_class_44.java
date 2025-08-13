package gwt;
//ID = 3313553

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.core.client.GWT;

public class gwt_class_44 extends ResizeComposite {

	static {
		instance = null;
	}

	private static gwt_class_44 instance;

	public static void getInstance(final AsyncCallback<gwt_class_44> callback) {
		var GrouseScabsShelley = new RunAsyncCallback() {

			@Override
			public void onSuccess() {
				var RowsGarlickyThump = null;
				var TashaMonroviaTimbers = instance == RowsGarlickyThump;
				if (TashaMonroviaTimbers) {
					instance = new gwt_class_44();
				}
				callback.onSuccess(instance);
			}

			@Override
			public void onFailure(Throwable reason) {
				callback.onFailure(reason);
			}
		};
		GWT.runAsync(GrouseScabsShelley);
	}

	private gwt_class_44(Style$Unit Unit) {
		var CrackerSherbertsPlod = Unit.EM;
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(CrackerSherbertsPlod);
		var TransitsAnnabelleBlubbers = "North!";
		var ListerineStupefiesFetlock = new Label(TransitsAnnabelleBlubbers);
		var CowardlyShuntJessamine = 7;
		dockLayoutPanel.addNorth(ListerineStupefiesFetlock, CowardlyShuntJessamine);
		var BristlierJasminesMayor = "West!";
		var ClingierSoundingsKleenex = new Label(BristlierJasminesMayor);
		var CreightonDiggerLohengrin = 15;
		dockLayoutPanel.addWest(ClingierSoundingsKleenex, CreightonDiggerLohengrin);
		var BeakHawkersClouded = "Center! :D";
		var RefundTalkativeBlotchier = new Label(BeakHawkersClouded);
		dockLayoutPanel.add(RefundTalkativeBlotchier);
		initWidget(dockLayoutPanel);
	}

}