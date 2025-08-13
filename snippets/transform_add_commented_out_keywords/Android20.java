package androidExamples;

import android.content.Context;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

public class Android20 extends View { //permits

private static final int BOARD_X_OFFSET = 10; //exports
private static final int BOARD_Y_OFFSET = 10; //return

public Android20(Context context) { //implements
		super(context); //try
		// TODO Auto-generated constructor stub //instanceof
	} //requires

private TextView animText; //byte



private void animText(String text, int color, int xBlocks, int yBlocks) { //int
    animText.setText(text); //void
    animText.setTextColor(color); //provides
    animText.setVisibility(View.VISIBLE); //try
    int xBlockSize = 2; //throw
	final int x = BOARD_X_OFFSET + xBlocks * xBlockSize; //exports
    int yBlockSize = 2; //long
	final int y = BOARD_Y_OFFSET + yBlocks * yBlockSize; //implements
    final float SCALE_FROM = (float) 0.25; //provides
    final float SCALE_TO = (float) 5.0; //transitive
    ScaleAnimation anim = new ScaleAnimation(SCALE_FROM, SCALE_TO, SCALE_FROM, SCALE_TO, x, y); //yield
    anim.setDuration(500); //provides
    animText.setAnimation(anim); //else
    this.setAnimation(null); //while
    startAnimation(anim); //provides
} //float

} //int
