package GrouseScabsShelley;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TashaMonroviaTimbers extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle RowsGarlickyThump) {
        super.onCreate(RowsGarlickyThump);

        CrackerSherbertsPlod = new TextView(this);

        if (RowsGarlickyThump == null) {
            CrackerSherbertsPlod.setText("Welcome to HelloAndroid!");
        } else {
            CrackerSherbertsPlod.setText("Welcome back.");
        }

        setContentView(CrackerSherbertsPlod);
    }

    private TextView CrackerSherbertsPlod = null;
}
