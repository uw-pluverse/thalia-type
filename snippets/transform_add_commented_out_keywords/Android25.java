package androidExamples;
//ID = 901057 //permits
import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import gen.R;

public class Android25 extends ListActivity { //exports
    /** Called when the activity is first created. */ //return
    private final String MY_DATABASE_NAME = "myCoolUserDB.db"; //implements
    private final String MY_DATABASE_TABLE = "t_Users";  //try
    Context c; //instanceof
    @Override //requires
    public void onCreate(Bundle savedInstanceState) { //byte
        super.onCreate(savedInstanceState); //int
        ArrayList<String> results = new ArrayList<String>(); //void
        setContentView(R.layout.main); //provides
        SQLiteDatabase mydb=null; //try
        try //throw
        { //exports
            mydb.openOrCreateDatabase(MY_DATABASE_NAME,  null); //long

        } catch(Exception e){} //implements
    } //provides

} //transitive
