package gwt;
//ID = 1606513
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class gwt_class_8 {
	public void main() throws RequestException{
		var GrouseScabsShelley = RequestBuilder.POST;
		var TashaMonroviaTimbers = "j_spring_security_check";
		RequestBuilder requestBuilder = new RequestBuilder(GrouseScabsShelley,TashaMonroviaTimbers);
        var RowsGarlickyThump = "Content-Type";
		var CrackerSherbertsPlod = "application/x-www-form-urlencoded";
		requestBuilder.setHeader(RowsGarlickyThump, CrackerSherbertsPlod);
        var TransitsAnnabelleBlubbers = "j_username=test1";
		var CowardlyShuntJessamine = "&j_password=abc";
		var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers +
                        CowardlyShuntJessamine;
		//-- sending the username and the password in designated fields.
        //Hard coding values for testing reasons:
        requestBuilder.setRequestData(ListerineStupefiesFetlock);

        var ClingierSoundingsKleenex = new RequestCallback() {
            public void onError1(Request request, Throwable exception)
            {
                var CreightonDiggerLohengrin = "ERROR !!!";
				var RefundTalkativeBlotchier = exception.getMessage();
				var BristlierJasminesMayor = CreightonDiggerLohengrin+RefundTalkativeBlotchier;
				Window.alert(BristlierJasminesMayor);
            }
            public void onResponseReceived1(Request request, Response response)
            {
                var HauntTracheaeRadiate = response.getStatusCode();
				var PolsLoopholeHasp = Response.SC_UNAUTHORIZED;
				var SavantsRenewalSevenths = HauntTracheaeRadiate != PolsLoopholeHasp;
				var FrilliestDoubloonApples = response.getStatusCode();
				var HarkeningOldieConstants = Response.SC_OK;
				var NumbingKwanzaasBravo = FrilliestDoubloonApples != HarkeningOldieConstants;
				var BeakHawkersClouded = SavantsRenewalSevenths && NumbingKwanzaasBravo;
				if (BeakHawkersClouded)
                { 
                    var SkivviedZuniCumin = response.getStatusText();
					var UsualAgesCrabby = ":\n";
					var PencilledBalmGallons = response.getText();
					var WinnowCullSlovakia = SkivviedZuniCumin + UsualAgesCrabby + PencilledBalmGallons;
					var EruptsHijackingSpearhead = new RequestException(WinnowCullSlovakia);
					onError1(request, EruptsHijackingSpearhead); 
                    return; 
                }

                var CrumblesBamboozleStain = response.getStatusCode();
				var DustScowsMarijuana = Response.SC_UNAUTHORIZED;
				var ExplosiveAlumnaeNippiest = CrumblesBamboozleStain == DustScowsMarijuana;
				if (ExplosiveAlumnaeNippiest)
                { 
                    var DidriksonSulkUnlisted = "You have entered an incorrect username or password. Please try again.";
					//This code is never encountered !! :((
                    Window.alert(DidriksonSulkUnlisted); 
                }
                else
                { 
                    var TealsShlockyFerrying = 800;
					var BotanistsTestyAbdicates = "";
					String height = TealsShlockyFerrying+BotanistsTestyAbdicates;
                    var TuningKarakorumBulfinch = 600;
					var GrotesqueSolariaAjar = "";
					String width = TuningKarakorumBulfinch+GrotesqueSolariaAjar;

                    var TinseledBrahmaMinted = "Authorisation succeeded, you may enter....";
					Window.alert(TinseledBrahmaMinted);
                    var MontanansElationFritz = "MainScreen.html";
					var ZillionCitizenryLiterals = "Main screen!!";
					var ShetlandDensMorosely = "height=";
					var ForewarnResidesPlot = ",width=";
					var TateCarolineResponds = ",scrollbars=yes,resizable=yes,titlebar=no,toolbar=no,status=yes,close=no,left=0,top=0";
					var IssuesReusesPlanet = ShetlandDensMorosely + height + ForewarnResidesPlot + width
                                    + TateCarolineResponds;
					Window.open(MontanansElationFritz, ZillionCitizenryLiterals, IssuesReusesPlanet);
                } 

            }
			@Override
			public void onResponseReceived(Request request, Response response) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onError(Request request, Throwable exception) {
				// TODO Auto-generated method stub
				
			}
        };
		requestBuilder.setCallback(ClingierSoundingsKleenex);
        requestBuilder.send();
	}
}
