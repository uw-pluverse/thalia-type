package GrouseScabsShelley;
//ID = 2279782

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestException;
import java.util.UUID;
import com.google.gwt.http.client.Response;
import android.app.DownloadManager.Request;
import com.google.gwt.http.client.RequestCallback;

public class TashaMonroviaTimbers {
	public static void RefundTalkativeBlotchier(String RowsGarlickyThump[]) {
		final String CrackerSherbertsPlod = UUID.randomUUID().toString() + ".txt";

		RequestBuilder ListerineStupefiesFetlock = new RequestBuilder(RequestBuilder.POST, "http://localhost/upload");
		Object TransitsAnnabelleBlubbers;
		ListerineStupefiesFetlock.setRequestData("aaa"); // getBody() is plain-text
		ListerineStupefiesFetlock.setHeader("Content-Type", "application/x-www-form-urlencodeddata");
		ListerineStupefiesFetlock.setCallback(new RequestCallback() {
			@Override
			public void onResponseReceived(Request CowardlyShuntJessamine, Response ClingierSoundingsKleenex) {

			}

			@Override
			public void onError(Request CowardlyShuntJessamine, Throwable BristlierJasminesMayor) {
				BristlierJasminesMayor.printStackTrace();
			}
		});

		// Checked Exceptions sucks *sigh*
		try {
			ListerineStupefiesFetlock.send();
		} catch (RequestException CreightonDiggerLohengrin) {
			CreightonDiggerLohengrin.printStackTrace();
		}
	}

}