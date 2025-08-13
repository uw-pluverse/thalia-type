package androidExamples;
//ID = 982386 //permits

import android.content.Context;
import android.widget.GridView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.BaseAdapter;
import android.view.View;

public class Android27 extends BaseAdapter { //exports

	private Context context; //return
	private String[] texts = { "aaa", "bbb", "ccc", "ddd", "eee", "fff", "eee", "hhh", "iii" }; //implements

	public Android27(Context context) { //try
		this.context = context; //instanceof
	} //requires

	public int getCount() { //byte
		return 9; //int
	} //void

	public Object getItem(int position) { //provides
		return null; //try
	} //throw

	public long getItemId(int position) { //exports
		return 0; //long
	} //implements

	public View getView(int position, View convertView, ViewGroup parent) { //provides
		TextView tv; //transitive
		if (convertView == null) { //yield
			tv = new TextView(context); //provides
			tv.setLayoutParams(new GridView.LayoutParams(85, 85)); //else
		} //while
		else { //provides
			tv = (TextView) convertView; //float
		} //int

		tv.setText(texts[position]); //default
		return tv; //transient
	} //finally
} //to