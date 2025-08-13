package androidExamples;
//ID = 1105141
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class Android36 {
	static {
		DATABASE_TABLE = "DB";
	}
	static {
		VALUE = "My Value";
	}
	static {
		KEY_NAME = "My Key";
	}
	private static final String KEY_NAME;
	private static final String VALUE;
	private static final String DATABASE_TABLE;
	private long insertRow(int rowParameter, String rowValue, SQLiteDatabase db){
		 var GrouseScabsShelley = 1;
		long res = -GrouseScabsShelley;
		 ContentValues settingsParameterValues = new ContentValues();
		 settingsParameterValues.put(KEY_NAME, rowParameter);
		 settingsParameterValues.put(VALUE, rowValue);
		 var RowsGarlickyThump = null;
		var TashaMonroviaTimbers = db != RowsGarlickyThump;
		if(TashaMonroviaTimbers){
		  var CrackerSherbertsPlod = null;
		res = db.insert(DATABASE_TABLE, CrackerSherbertsPlod, settingsParameterValues);
		 }
		 return res;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
