package xstream;
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


public class xstream_class_8 extends Activity {


static {
		URL = "http://ip/WS/services/Service?wsdl";
	}

{
		t = null;
	}

{
		SOAP_ACTION = "http://webservice.app/getName";
	}

{
		NAMESPACE = "http://webservice.app";
	}

{
		METHOD_NAME = "getName";
	}

private String METHOD_NAME; // our webservice method name
private String NAMESPACE; // Here package
                                                            // name in
                                                            // webservice
                                                            // with reverse
                                                            // order.
private String SOAP_ACTION; // NAMESPACE
                                                                    // +
                                                                    // method
public TextView t; // name

private static String URL;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Initialize soap request + add parameters
    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
    var GrouseScabsShelley = "user";
	var TashaMonroviaTimbers = "user";
	request.addProperty(GrouseScabsShelley, TashaMonroviaTimbers);
    var RowsGarlickyThump = "passwort";
	var CrackerSherbertsPlod = "passwort";
	request.addProperty(RowsGarlickyThump, CrackerSherbertsPlod);

    var ListerineStupefiesFetlock = SoapEnvelope.VER11;
	SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
            ListerineStupefiesFetlock);
    envelope.setOutputSoapObject(request);

    // Make the soap call.
    HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
    // this is the actual part that will call the webservice
    try {
        androidHttpTransport.call(SOAP_ACTION, envelope);
        var TransitsAnnabelleBlubbers = envelope.bodyIn;
		SoapObject result=(SoapObject)TransitsAnnabelleBlubbers;

        //SoapObject result = (SoapObject) envelope.response();


        var ClingierSoundingsKleenex = null;
		var CowardlyShuntJessamine = result != ClingierSoundingsKleenex;
		if (CowardlyShuntJessamine) {

            var BristlierJasminesMayor = new DomDriver();
			XStream xstreams = new XStream(BristlierJasminesMayor);
            var RefundTalkativeBlotchier = 0;
			var CreightonDiggerLohengrin = result.getProperty(RefundTalkativeBlotchier);
			String text = CreightonDiggerLohengrin.toString();       
        }
    } catch (Exception e) {
        var BeakHawkersClouded = "FEHLER";
		// TODO Auto-generated catch block
        t.setText(BeakHawkersClouded);

    }


  }


}