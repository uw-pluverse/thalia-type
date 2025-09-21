package androidExamples;

import android.content.Context;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

public class Android20 extends View {

static {
		BOARD_Y_OFFSET = 10;
	}



static {
		BOARD_X_OFFSET = 10;
	}



{
		animText = null;
	}



private static final int BOARD_X_OFFSET;
private static final int BOARD_Y_OFFSET;

public Android20(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

private TextView animText;



private void animText(String text, int color, int xBlocks, int yBlocks) {
    animText.setText(text);
    animText.setTextColor(color);
    var GrouseScabsShelley = View.VISIBLE;
	animText.setVisibility(GrouseScabsShelley);
    int xBlockSize = 2;
	var TashaMonroviaTimbers = xBlocks * xBlockSize;
	final int x = BOARD_X_OFFSET + TashaMonroviaTimbers;
    int yBlockSize = 2;
	var RowsGarlickyThump = yBlocks * yBlockSize;
	final int y = BOARD_Y_OFFSET + RowsGarlickyThump;
    var CrackerSherbertsPlod = 0.25;
	final float SCALE_FROM = (float) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = 5.0;
	final float SCALE_TO = (float) ListerineStupefiesFetlock;
    ScaleAnimation anim = new ScaleAnimation(SCALE_FROM, SCALE_TO, SCALE_FROM, SCALE_TO, x, y);
    var TransitsAnnabelleBlubbers = 500;
	anim.setDuration(TransitsAnnabelleBlubbers);
    animText.setAnimation(anim);
    var CowardlyShuntJessamine = null;
	this.setAnimation(CowardlyShuntJessamine);
    startAnimation(anim);
}

}
