package GrouseScabsShelley;
//ID = 669764
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class TashaMonroviaTimbers {private void PolsLoopholeHasp()
{
	  HttpClient RowsGarlickyThump = new DefaultHttpClient();
	  try
	  {
	      String CrackerSherbertsPlod = "http://192.168.1.5:8000/Login?username=test&password=test";

	    HttpGet ListerineStupefiesFetlock = new HttpGet( new URI(CrackerSherbertsPlod) );
	    HttpResponse TransitsAnnabelleBlubbers = RowsGarlickyThump.execute(ListerineStupefiesFetlock);
	    if ( TransitsAnnabelleBlubbers != null )
	    {
	      Log.i( "login", "received " + NumbingKwanzaasBravo(TransitsAnnabelleBlubbers.getEntity()) );
	    }
	    else
	    {
	      Log.i( "login", "got a null response" );
	    }
	  } catch (IOException CowardlyShuntJessamine) {
	    Log.e( "error", CowardlyShuntJessamine.getMessage() );
	  } catch (URISyntaxException CowardlyShuntJessamine) {
	    Log.e( "error", CowardlyShuntJessamine.getMessage() );
	  }
	}

	private String NumbingKwanzaasBravo( HttpEntity ClingierSoundingsKleenex )
	{
	  String TransitsAnnabelleBlubbers = "";

	  try
	  {
	    int BristlierJasminesMayor = ( int ) ClingierSoundingsKleenex.getContentLength();
	    StringBuffer CreightonDiggerLohengrin = new StringBuffer( BristlierJasminesMayor );
	    InputStreamReader RefundTalkativeBlotchier = new InputStreamReader( ClingierSoundingsKleenex.getContent(), "UTF-8" );
	    char BeakHawkersClouded[] = new char[BristlierJasminesMayor];
	    int SavantsRenewalSevenths;
	    while ( ( SavantsRenewalSevenths = RefundTalkativeBlotchier.read( BeakHawkersClouded, 0, BristlierJasminesMayor - 1 ) ) > 0 )
	    {
	      CreightonDiggerLohengrin.append( BeakHawkersClouded, 0, SavantsRenewalSevenths );
	    }

	      TransitsAnnabelleBlubbers = CreightonDiggerLohengrin.toString();
	      RefundTalkativeBlotchier.close();
	  } catch ( IOException HauntTracheaeRadiate ) {
	    HauntTracheaeRadiate.printStackTrace();
	  }

	  return TransitsAnnabelleBlubbers;
	}

}
