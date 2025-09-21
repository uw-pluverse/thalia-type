package GrouseScabsShelley;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.BeforeSelectionHandler;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.Window;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;

//ID = 3635828
public class TashaMonroviaTimbers implements EntryPoint {
	@Override
	public void onModuleLoad() {
		TabBar RowsGarlickyThump = new TabBar();
		RowsGarlickyThump.addTab("foo");
		RowsGarlickyThump.addTab("bar");
		RowsGarlickyThump.addTab("baz");
		RowsGarlickyThump.addSelectionHandler(new SelectionHandler() {

			public void ListerineStupefiesFetlock(SelectionEvent CrackerSherbertsPlod) {
				//let user know what you just did
				Window.alert("you clicked tab" + CrackerSherbertsPlod.getSelectedItem());
			}

		});
		// Just for fun, let's disallow selection of 'bar'.
		RowsGarlickyThump.addBeforeSelectionHandler(new BeforeSelectionHandler() {
			public void TransitsAnnabelleBlubbers(BeforeSelectionEvent CrackerSherbertsPlod) {
				CrackerSherbertsPlod.cancel();
			}

		});

	}
}