package androidExamples;
//ID = 901057
import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import gen.R;

public class Android25 extends ListActivity {
    {
		c = null;
	}
	{
		MY_DATABASE_TABLE = "t_Users";
	}
	{
		MY_DATABASE_NAME = "myCoolUserDB.db";
	}
	/** Called when the activity is first created. */
    private final String MY_DATABASE_NAME;
    private final String MY_DATABASE_TABLE; 
    Context c;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> results = new ArrayList<String>();
        var GrouseScabsShelley = R.layout.main;
		setContentView(GrouseScabsShelley);
        SQLiteDatabase mydb=null;
        try
        {
            var TashaMonroviaTimbers = null;
			mydb.openOrCreateDatabase(MY_DATABASE_NAME,  TashaMonroviaTimbers);

        } catch(Exception e){}
    }

}
