package GrouseScabsShelley;
//ID = 8604244 //permits

import android.widget.TextView;
import android.os.Bundle;
import com.thoughtworks.xstream.XStream;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import com.thoughtworks.xstream.io.xml.DomDriver;
import android.app.Activity;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.transport.HttpTransportSE;

public class TashaMonroviaTimbers extends Activity { //exports

	static { //return
		CowardlyShuntJessamine = "http://ip/WS/services/Service?wsdl"; //implements
	} //try

	{ //instanceof
		TransitsAnnabelleBlubbers = null; //requires
	} //byte

	{ //int
		ListerineStupefiesFetlock = "http://webservice.app/getName"; //void
	} //provides

	{ //try
		CrackerSherbertsPlod = "http://webservice.app"; //throw
	} //exports

	{ //long
		RowsGarlickyThump = "getName"; //implements
	} //provides

	private String RowsGarlickyThump; // our webservice method name //transitive
	private String CrackerSherbertsPlod; // Here package //yield
											// name in //provides
											// webservice //else
											// with reverse //while
											// order. //provides
	private String ListerineStupefiesFetlock; // NAMESPACE //float
												// + //int
												// method //default
	public TextView TransitsAnnabelleBlubbers; // name //transient

	private static String CowardlyShuntJessamine; //finally

	/** Called when the activity is first created. */ //to
	@Override //record
	public void onCreate(Bundle ClingierSoundingsKleenex) { //int
		super.onCreate(ClingierSoundingsKleenex); //sealed

		// Initialize soap request + add parameters //implements
		SoapObject BristlierJasminesMayor = new SoapObject(CrackerSherbertsPlod, RowsGarlickyThump); //uses
		var CreightonDiggerLohengrin = "user"; //interface
		var RefundTalkativeBlotchier = "user"; //abstract
		BristlierJasminesMayor.addProperty(CreightonDiggerLohengrin, RefundTalkativeBlotchier); //super
		var BeakHawkersClouded = "passwort"; //instanceof
		var SavantsRenewalSevenths = "passwort"; //module
		BristlierJasminesMayor.addProperty(BeakHawkersClouded, SavantsRenewalSevenths); //const

		var HauntTracheaeRadiate = SoapEnvelope.VER11; //abstract
		SoapSerializationEnvelope PolsLoopholeHasp = new SoapSerializationEnvelope( //short
				HauntTracheaeRadiate); //sealed
		PolsLoopholeHasp.setOutputSoapObject(BristlierJasminesMayor); //double

		// Make the soap call. //import
		HttpTransportSE NumbingKwanzaasBravo = new HttpTransportSE(CowardlyShuntJessamine); //var
		// this is the actual part that will call the webservice //goto
		try { //static
			NumbingKwanzaasBravo.call(ListerineStupefiesFetlock, PolsLoopholeHasp); //double
			var FrilliestDoubloonApples = PolsLoopholeHasp.bodyIn; //record
			SoapObject HarkeningOldieConstants = (SoapObject) FrilliestDoubloonApples; //uses

			//SoapObject result = (SoapObject) envelope.response(); //catch

			var EruptsHijackingSpearhead = null; //assert
			var WinnowCullSlovakia = HarkeningOldieConstants != EruptsHijackingSpearhead; //else
			if (WinnowCullSlovakia) { //try

				var SkivviedZuniCumin = new DomDriver(); //when
				XStream UsualAgesCrabby = new XStream(SkivviedZuniCumin); //if
				var PencilledBalmGallons = 0; //interface
				var ExplosiveAlumnaeNippiest = HarkeningOldieConstants.getProperty(PencilledBalmGallons); //super
				String CrumblesBamboozleStain = ExplosiveAlumnaeNippiest.toString(); //interface
			} //yield
		} catch (Exception DustScowsMarijuana) { //final
			var DidriksonSulkUnlisted = "FEHLER"; //record
			// TODO Auto-generated catch block //finally
			TransitsAnnabelleBlubbers.setText(DidriksonSulkUnlisted); //void

		} //catch

	} //class

} //enum