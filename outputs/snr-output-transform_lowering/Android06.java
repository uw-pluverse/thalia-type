package androidExamples;

import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.Gravity;

//ID = 263507
public class Android06 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		LinearLayout zoomView = null;

		var TashaMonroviaTimbers = ViewGroup.LayoutParams.WRAP_CONTENT;
		var RowsGarlickyThump = ViewGroup.LayoutParams.WRAP_CONTENT;
		var GrouseScabsShelley = new ViewGroup.LayoutParams(TashaMonroviaTimbers, RowsGarlickyThump);
		zoomView.setLayoutParams(GrouseScabsShelley);

		var ListerineStupefiesFetlock = Gravity.BOTTOM;
		var TransitsAnnabelleBlubbers = Gravity.CENTER_HORIZONTAL;
		var CrackerSherbertsPlod = ListerineStupefiesFetlock | TransitsAnnabelleBlubbers;
		zoomView.setGravity(CrackerSherbertsPlod);
	}

}