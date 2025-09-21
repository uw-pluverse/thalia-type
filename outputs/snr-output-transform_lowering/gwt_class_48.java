package gwt;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.BeforeSelectionHandler;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.Window;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;

//ID = 3635828
public class gwt_class_48 implements EntryPoint {
	@Override
	public void onModuleLoad() {
		TabBar bar = new TabBar();
		var GrouseScabsShelley = "foo";
		bar.addTab(GrouseScabsShelley);
		var TashaMonroviaTimbers = "bar";
		bar.addTab(TashaMonroviaTimbers);
		var RowsGarlickyThump = "baz";
		bar.addTab(RowsGarlickyThump);
		var CrackerSherbertsPlod = new SelectionHandler() {

			public void onSelection(SelectionEvent event) {
				var TransitsAnnabelleBlubbers = "you clicked tab";
				var CowardlyShuntJessamine = event.getSelectedItem();
				var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + CowardlyShuntJessamine;
				//let user know what you just did
				Window.alert(ListerineStupefiesFetlock);
			}

		};
		bar.addSelectionHandler(CrackerSherbertsPlod);
		var ClingierSoundingsKleenex = new BeforeSelectionHandler() {
			public void onBeforeSelection(BeforeSelectionEvent event) {
				event.cancel();
			}

		};
		// Just for fun, let's disallow selection of 'bar'.
		bar.addBeforeSelectionHandler(ClingierSoundingsKleenex);

	}
}