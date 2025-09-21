package androidExamples;
//ID = 738817

import android.content.Context;
import android.widget.GridView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;

public class Android19 {
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = convertView == TashaMonroviaTimbers;
		if (GrouseScabsShelley) {
			Context mContext = null;
			// if it's not recycled, initialize some attributes
			imageView = new ImageView(mContext);
			var CrackerSherbertsPlod = 85;
			var ListerineStupefiesFetlock = 85;
			var RowsGarlickyThump = new GridView.LayoutParams(CrackerSherbertsPlod, ListerineStupefiesFetlock);
			imageView.setLayoutParams(RowsGarlickyThump);
			var TransitsAnnabelleBlubbers = ImageView.ScaleType.CENTER_CROP;
			imageView.setScaleType(TransitsAnnabelleBlubbers);
			var CowardlyShuntJessamine = 8;
			var ClingierSoundingsKleenex = 8;
			var BristlierJasminesMayor = 8;
			var CreightonDiggerLohengrin = 8;
			imageView.setPadding(CowardlyShuntJessamine, ClingierSoundingsKleenex, BristlierJasminesMayor,
					CreightonDiggerLohengrin);
			//does this need imageView.onKeyDown(keyCode, event)?
		} else {
			imageView = (ImageView) convertView;
		}

		int[] mThumbIds = null;
		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}

}