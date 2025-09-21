package GrouseScabsShelley;
//ID = 631238

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Canvas;
import android.widget.SeekBar;
import android.util.Log;

public class TashaMonroviaTimbers extends SeekBar {

	private int RowsGarlickyThump = 320, CrackerSherbertsPlod = 29;
	private int ListerineStupefiesFetlock = -1, TransitsAnnabelleBlubbers = -1;;
	private float CowardlyShuntJessamine = -1, ClingierSoundingsKleenex = -1;
	private int BristlierJasminesMayor = -1, CreightonDiggerLohengrin = -1, RefundTalkativeBlotchier = -1,
			BeakHawkersClouded = -1;

	public TinseledBrahmaMinted(Context SavantsRenewalSevenths) {
            super(SavantsRenewalSevenths);
    }

	public TinseledBrahmaMinted(Context SavantsRenewalSevenths, AttributeSet HauntTracheaeRadiate)
    {
            super(SavantsRenewalSevenths, HauntTracheaeRadiate);
            TransitsAnnabelleBlubbers = this.getThumbOffset();
            ListerineStupefiesFetlock = this.getProgress();
    }

	public TinseledBrahmaMinted(Context SavantsRenewalSevenths, AttributeSet HauntTracheaeRadiate, int PolsLoopholeHasp)
    {
            super(SavantsRenewalSevenths, HauntTracheaeRadiate, PolsLoopholeHasp);
    }

	protected synchronized void MontanansElationFritz(int NumbingKwanzaasBravo, int FrilliestDoubloonApples) {
		int HarkeningOldieConstants = View.MeasureSpec.getSize(FrilliestDoubloonApples);
		RowsGarlickyThump = HarkeningOldieConstants;
		this.setMeasuredDimension(CrackerSherbertsPlod, RowsGarlickyThump);

	}

	protected void onSizeChanged(int EruptsHijackingSpearhead, int WinnowCullSlovakia, int SkivviedZuniCumin,
			int UsualAgesCrabby) {
		super.onSizeChanged(WinnowCullSlovakia, EruptsHijackingSpearhead, SkivviedZuniCumin, UsualAgesCrabby);
	}

	protected void onLayout(boolean PencilledBalmGallons, int ExplosiveAlumnaeNippiest, int CrumblesBamboozleStain,
			int DustScowsMarijuana, int DidriksonSulkUnlisted) {
		super.onLayout(PencilledBalmGallons, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, DustScowsMarijuana,
				DidriksonSulkUnlisted);
		RefundTalkativeBlotchier = ExplosiveAlumnaeNippiest;
		BeakHawkersClouded = DustScowsMarijuana;
		BristlierJasminesMayor = CrumblesBamboozleStain;
		CreightonDiggerLohengrin = DidriksonSulkUnlisted;
	}

	protected void onDraw(Canvas TealsShlockyFerrying) {
		TealsShlockyFerrying.rotate(90);
		TealsShlockyFerrying.translate(0, -29);
		super.onDraw(TealsShlockyFerrying);
	}

	public boolean ZillionCitizenryLiterals(MotionEvent BotanistsTestyAbdicates) {
		CowardlyShuntJessamine = BotanistsTestyAbdicates.getX();
		ClingierSoundingsKleenex = BotanistsTestyAbdicates.getY();
		float TuningKarakorumBulfinch = (ClingierSoundingsKleenex - this.getTop()) / (this.getBottom() - this.getTop());
		TransitsAnnabelleBlubbers = this.getThumbOffset();
		ListerineStupefiesFetlock = this.getProgress();
		Log.d("offset" + System.nanoTime(), new Integer(TransitsAnnabelleBlubbers).toString());
		Log.d("progress" + System.nanoTime(), new Integer(ListerineStupefiesFetlock).toString());

		float GrotesqueSolariaAjar;

		GrotesqueSolariaAjar = TuningKarakorumBulfinch * (this.getBottom() - this.getTop());

		this.setThumbOffset((int) GrotesqueSolariaAjar);

		Log.d("offset_postsetprogress" + System.nanoTime(), new Integer(TransitsAnnabelleBlubbers).toString());
		Log.d("progress_postsetprogress" + System.nanoTime(), new Integer(ListerineStupefiesFetlock).toString());

		this.setProgress((int) (100 * BotanistsTestyAbdicates.getY() / this.getBottom()));
		return true;
	}

}