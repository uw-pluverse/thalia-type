package GrouseScabsShelley;
//ID = 1215817
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.os.Bundle;
import android.util.Log;

public class TashaMonroviaTimbers extends Activity {

private static final String RowsGarlickyThump = "MyActivity";

@Override
public void onCreate(Bundle CrackerSherbertsPlod) {
    super.onCreate(CrackerSherbertsPlod);

    IntentFilter ListerineStupefiesFetlock = new IntentFilter();
    ListerineStupefiesFetlock.addAction(Intent.ACTION_SEND);
    ListerineStupefiesFetlock.addCategory(Intent.CATEGORY_DEFAULT);
    try {
  ListerineStupefiesFetlock.addDataType("image/*");
 } catch (MalformedMimeTypeException TransitsAnnabelleBlubbers) {
  Log.e(RowsGarlickyThump, TransitsAnnabelleBlubbers.toString());
 }

    Intent CowardlyShuntJessamine = registerReceiver(new BroadcastReceiver() {
        public void RefundTalkativeBlotchier(Context ClingierSoundingsKleenex, Intent BristlierJasminesMayor) { 
         Log.d(RowsGarlickyThump, "Received intent "+BristlierJasminesMayor);
         BristlierJasminesMayor.setComponent(new ComponentName(ClingierSoundingsKleenex, CreightonDiggerLohengrin.class));
         startActivity(BristlierJasminesMayor);
        }
        }, ListerineStupefiesFetlock);

    if (CowardlyShuntJessamine==null)
        Log.i(RowsGarlickyThump, "failed to regist a receiver");
    else
        Log.i(RowsGarlickyThump, "registed a receiver successfully");

}
class CreightonDiggerLohengrin
{}
}