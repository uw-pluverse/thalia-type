package androidExamples;
//ID = 982386
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Android27 extends BaseAdapter {

    {
		context = null;
	}

	private Context context;
    private String[] texts = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "eee", "hhh", "iii"};

    public Android27(Context context) {
        var GrouseScabsShelley = this.context;
		GrouseScabsShelley = context;
    }

    public int getCount() {
        var TashaMonroviaTimbers = 9;
		return TashaMonroviaTimbers;
    }

    public Object getItem(int position) {
        var RowsGarlickyThump = null;
		return RowsGarlickyThump;
    }

    public long getItemId(int position) {
        var CrackerSherbertsPlod = 0;
		return CrackerSherbertsPlod;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        var TransitsAnnabelleBlubbers = null;
		var ListerineStupefiesFetlock = convertView == TransitsAnnabelleBlubbers;
		if (ListerineStupefiesFetlock) {
            tv = new TextView(context);
            var ClingierSoundingsKleenex = 85;
			var BristlierJasminesMayor = 85;
			var CowardlyShuntJessamine = new GridView.LayoutParams(ClingierSoundingsKleenex, BristlierJasminesMayor);
			tv.setLayoutParams(CowardlyShuntJessamine);
        }
        else {
            tv = (TextView) convertView;
        }

            tv.setText(texts[position]);
        return tv;
    }
}
