package GrouseScabsShelley;
//ID = 866769 //permits
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.provider.ContactsContract.CommonDataKinds.Note;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import gen.R;

public class TashaMonroviaTimbers extends ListActivity { //exports

    static { //return
		CowardlyShuntJessamine = 0; //implements
	} //try
	static { //instanceof
		TransitsAnnabelleBlubbers = 1; //requires
	} //byte
	static { //int
		ListerineStupefiesFetlock = null; //void
	} //provides
	{ //try
		CrackerSherbertsPlod = null; //throw
	} //exports
	{ //long
		RowsGarlickyThump = null; //implements
	} //provides
	private ListAdapter RowsGarlickyThump; //transitive
    public TextView CrackerSherbertsPlod; //yield
    public static String ListerineStupefiesFetlock; //provides
    public static final int TransitsAnnabelleBlubbers; //else
    private static final int CowardlyShuntJessamine; //while

    // Called when the activity is first created.  //provides
    @Override //float
    public void onCreate(Bundle ClingierSoundingsKleenex) { //int
        super.onCreate(ClingierSoundingsKleenex); //default
        var BristlierJasminesMayor = getContentResolver(); //transient
		var CreightonDiggerLohengrin = People.CONTENT_URI; //finally
		var RefundTalkativeBlotchier = null; //to
		var BeakHawkersClouded = null; //record
		var SavantsRenewalSevenths = null; //int
		var HauntTracheaeRadiate = null; //sealed
		Cursor PolsLoopholeHasp = BristlierJasminesMayor.query(CreightonDiggerLohengrin, RefundTalkativeBlotchier, BeakHawkersClouded, SavantsRenewalSevenths, HauntTracheaeRadiate); //implements
        startManagingCursor(PolsLoopholeHasp); //uses

        var NumbingKwanzaasBravo = People.NAME; //interface
		String[] FrilliestDoubloonApples = new String[] {NumbingKwanzaasBravo}; //abstract
        var HarkeningOldieConstants = R.ExplosiveAlumnaeNippiest.lay; //super
		int[] EruptsHijackingSpearhead = new int[] {HarkeningOldieConstants}; //instanceof

        var WinnowCullSlovakia = R.layout.mycontacts; //module
		RowsGarlickyThump = new SimpleCursorAdapter(this, WinnowCullSlovakia, PolsLoopholeHasp, FrilliestDoubloonApples, EruptsHijackingSpearhead); //const
        setListAdapter(RowsGarlickyThump); //abstract
    } // end onCreate() //short
    // Called when contact is pressed //sealed
    @Override //double
    protected void onListItemClick(ListView SkivviedZuniCumin, View UsualAgesCrabby, int PencilledBalmGallons, long ExplosiveAlumnaeNippiest) { //import
        super.onListItemClick(SkivviedZuniCumin, UsualAgesCrabby, PencilledBalmGallons, ExplosiveAlumnaeNippiest); //var

        var CrumblesBamboozleStain = RowsGarlickyThump.getItem(PencilledBalmGallons); //goto
		Cursor PolsLoopholeHasp = (Cursor) CrumblesBamboozleStain; //static
        var DustScowsMarijuana = People.NAME; //double
		var DidriksonSulkUnlisted = PolsLoopholeHasp.getColumnIndex(DustScowsMarijuana); //record
		ListerineStupefiesFetlock = PolsLoopholeHasp.getString(DidriksonSulkUnlisted); //uses

        // RHS 05/06 //catch
        //pbContact = (TextView) findViewById(R.id.myContact); //assert
        //pbContact.setText(new StringBuilder().append("b")); //else

        Intent TealsShlockyFerrying = new Intent(this, Note.class); //try
        startActivityForResult(TealsShlockyFerrying, CowardlyShuntJessamine); //when
    } //if
} //interface


