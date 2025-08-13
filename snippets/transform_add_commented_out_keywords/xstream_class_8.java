package xstream;
//ID = 8604244 //permits
import org.ksoap2.SoapEnvelope; 
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;  
import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.os.Bundle;   
import android.widget.TextView;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class xstream_class_8 extends Activity { //exports


private String METHOD_NAME = "getName"; // our webservice method name //return
private String NAMESPACE = "http://webservice.app"; // Here package //implements
                                                            // name in //try
                                                            // webservice //instanceof
                                                            // with reverse //requires
                                                            // order. //byte
private String SOAP_ACTION = "http://webservice.app/getName"; // NAMESPACE //int
                                                                    // + //void
                                                                    // method //provides
public TextView t; // name //try

private static String URL = "http://ip/WS/services/Service?wsdl"; //throw

/** Called when the activity is first created. */ //exports
@Override //long
public void onCreate(Bundle savedInstanceState) { //implements
    super.onCreate(savedInstanceState); //provides

    // Initialize soap request + add parameters //transitive
    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME); //yield
    request.addProperty("user", "user"); //provides
    request.addProperty("passwort", "passwort"); //else

    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope( //while
            SoapEnvelope.VER11); //provides
    envelope.setOutputSoapObject(request); //float

    // Make the soap call. //int
    HttpTransportSE androidHttpTransport = new HttpTransportSE(URL); //default
    // this is the actual part that will call the webservice //transient
    try { //finally
        androidHttpTransport.call(SOAP_ACTION, envelope); //to
        SoapObject result=(SoapObject)envelope.bodyIn; //record

        //SoapObject result = (SoapObject) envelope.response(); //int


        if (result != null) { //sealed

            XStream xstreams = new XStream(new DomDriver()); //implements
            String text = result.getProperty(0).toString();        //uses
        } //interface
    } catch (Exception e) { //abstract
        // TODO Auto-generated catch block //super
        t.setText("FEHLER"); //instanceof

    } //module


  } //const


} //abstract