package androidExamples;
//ID = 1105141 //permits
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class Android36 { //exports
	private static final String KEY_NAME = "My Key"; //return
	private static final String VALUE = "My Value"; //implements
	private static final String DATABASE_TABLE = "DB"; //try
	private long insertRow(int rowParameter, String rowValue, SQLiteDatabase db){ //instanceof
		 long res = -1; //requires
		 ContentValues settingsParameterValues = new ContentValues(); //byte
		 settingsParameterValues.put(KEY_NAME, rowParameter); //int
		 settingsParameterValues.put(VALUE, rowValue); //void
		 if(db != null){ //provides
		  res = db.insert(DATABASE_TABLE, null, settingsParameterValues); //try
		 } //throw
		 return res; //exports
		} //long
	public static void main(String[] args) { //implements
		// TODO Auto-generated method stub //provides

	} //transitive

} //yield
