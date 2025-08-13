package GrouseScabsShelley;
//ID = 8604244
import org.ksoap2.SoapEnvelope; 
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;  
import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.os.Bundle;   
import android.widget.TextView;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class TashaMonroviaTimbers extends Activity {


private String RowsGarlickyThump = "getName"; // our webservice method name
private String CrackerSherbertsPlod = "http://webservice.app"; // Here package
                                                            // name in
                                                            // webservice
                                                            // with reverse
                                                            // order.
private String ListerineStupefiesFetlock = "http://webservice.app/getName"; // NAMESPACE
                                                                    // +
                                                                    // method
public TextView TransitsAnnabelleBlubbers; // name

private static String CowardlyShuntJessamine = "http://ip/WS/services/Service?wsdl";

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle ClingierSoundingsKleenex) {
    super.onCreate(ClingierSoundingsKleenex);

    // Initialize soap request + add parameters
    SoapObject BristlierJasminesMayor = new SoapObject(CrackerSherbertsPlod, RowsGarlickyThump);
    BristlierJasminesMayor.addProperty("user", "user");
    BristlierJasminesMayor.addProperty("passwort", "passwort");

    SoapSerializationEnvelope CreightonDiggerLohengrin = new SoapSerializationEnvelope(
            SoapEnvelope.VER11);
    CreightonDiggerLohengrin.setOutputSoapObject(BristlierJasminesMayor);

    // Make the soap call.
    HttpTransportSE RefundTalkativeBlotchier = new HttpTransportSE(CowardlyShuntJessamine);
    // this is the actual part that will call the webservice
    try {
        RefundTalkativeBlotchier.call(ListerineStupefiesFetlock, CreightonDiggerLohengrin);
        SoapObject BeakHawkersClouded=(SoapObject)CreightonDiggerLohengrin.bodyIn;

        //SoapObject result = (SoapObject) envelope.response();


        if (BeakHawkersClouded != null) {

            XStream SavantsRenewalSevenths = new XStream(new DomDriver());
            String HauntTracheaeRadiate = BeakHawkersClouded.getProperty(0).toString();       
        }
    } catch (Exception PolsLoopholeHasp) {
        // TODO Auto-generated catch block
        TransitsAnnabelleBlubbers.setText("FEHLER");

    }


  }


}