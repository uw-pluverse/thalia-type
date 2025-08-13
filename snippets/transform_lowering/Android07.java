package androidExamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import gen.R;
//ID = 288044
public class Android07 extends Activity{

			String[] mainItems = {
			    "Inbox", "Projects", "Contexts", "Next Actions"
			};

			@Override
			public void onCreate(Bundle icicle) {
			    super.onCreate(icicle);
			    var GrouseScabsShelley = R.layout.main;
				setContentView(GrouseScabsShelley);

			    var RowsGarlickyThump = android.R.layout.simple_list_item_1;
				var TashaMonroviaTimbers = new ArrayAdapter<String>(
			            this, RowsGarlickyThump, mainItems);
				setListAdapter(TashaMonroviaTimbers);
			    var CrackerSherbertsPlod = getListView();
				registerForContextMenu(CrackerSherbertsPlod);
			}

			private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
				// TODO Auto-generated method stub
				
			}

			private View getListView() {
				var ListerineStupefiesFetlock = null;
				// TODO Auto-generated method stub
				return ListerineStupefiesFetlock;
			}

}
