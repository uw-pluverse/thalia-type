package GrouseScabsShelley;

import java.io.File;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.webkit.URLUtil;
import java.net.URL;
import java.io.FileOutputStream;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import java.net.URLConnection;
import android.view.SurfaceView;
import java.io.IOException;
import android.media.MediaPlayer;
import android.graphics.PixelFormat;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.media.MediaPlayer.OnPreparedListener;
import android.content.pm.ActivityInfo;
import android.app.Activity;
import android.view.SurfaceHolder;
import java.io.InputStream;
import android.media.MediaPlayer.OnErrorListener;
import android.util.Log;

//ID = 1188346
public class TashaMonroviaTimbers extends Activity implements OnErrorListener,

		OnBufferingUpdateListener, OnCompletionListener, OnPreparedListener, SurfaceHolder.Callback {

	private static final String RowsGarlickyThump = "MediaPreview";

	private MediaPlayer CrackerSherbertsPlod;
	private SurfaceView ListerineStupefiesFetlock;
	private SurfaceHolder TransitsAnnabelleBlubbers;
	private Button CowardlyShuntJessamine;
	private Button ClingierSoundingsKleenex;
	private Button BristlierJasminesMayor;
	private Button CreightonDiggerLohengrin;

	private String RefundTalkativeBlotchier;

	@Override
	protected void onCreate(Bundle BeakHawkersClouded) {

		super.onCreate(BeakHawkersClouded);
		setContentView(R.layout.media_preview);

		ListerineStupefiesFetlock = (SurfaceView) findViewById(R.id.myImage);
		CowardlyShuntJessamine = (Button) findViewById(100);
		ClingierSoundingsKleenex = (Button) findViewById(101);
		BristlierJasminesMayor = (Button) findViewById(102);
		CreightonDiggerLohengrin = (Button) findViewById(103);

		IssuesReusesPlanet();

		CowardlyShuntJessamine.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View SavantsRenewalSevenths) {
				ZillionCitizenryLiterals();
			}
		});

		ClingierSoundingsKleenex.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View SavantsRenewalSevenths) {
				// TODO Auto-generated method stub
				if (CrackerSherbertsPlod != null) {
					CrackerSherbertsPlod.pause();
				}
			}
		});

		BristlierJasminesMayor.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View SavantsRenewalSevenths) {
				if (CrackerSherbertsPlod != null) {
					CrackerSherbertsPlod.seekTo(0);
				}
			}
		});

		CreightonDiggerLohengrin.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View SavantsRenewalSevenths) {
				if (CrackerSherbertsPlod != null) {
					CrackerSherbertsPlod.stop();
					CrackerSherbertsPlod.release();
				}
			}
		});

		getWindow().setFormat(PixelFormat.TRANSPARENT);
		TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.getHolder();
		TransitsAnnabelleBlubbers.addCallback(this);
		TransitsAnnabelleBlubbers.setFixedSize(400, 300);
	}

	@Override
	protected void onResume() {

		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		super.onResume();
	}

	@Override
	public boolean onError(MediaPlayer CrackerSherbertsPlod, int HauntTracheaeRadiate, int PolsLoopholeHasp) {
		if (CrackerSherbertsPlod != null) {
			CrackerSherbertsPlod.stop();
			CrackerSherbertsPlod.release();
		}
		return false;
	}

	@Override
	public void onBufferingUpdate(MediaPlayer CrackerSherbertsPlod, int NumbingKwanzaasBravo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCompletion(MediaPlayer CrackerSherbertsPlod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPrepared(MediaPlayer CrackerSherbertsPlod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void surfaceChanged(SurfaceHolder TransitsAnnabelleBlubbers, int FrilliestDoubloonApples,
			int HarkeningOldieConstants, int EruptsHijackingSpearhead) {
		// TODO Auto-generated method stub

	}

	@Override
	public void surfaceCreated(SurfaceHolder TransitsAnnabelleBlubbers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void surfaceDestroyed(SurfaceHolder TransitsAnnabelleBlubbers) {
		// TODO Auto-generated method stub

	}

	private void ZillionCitizenryLiterals() {
		try {
			CrackerSherbertsPlod = new MediaPlayer();
			CrackerSherbertsPlod.setOnErrorListener(this);
			CrackerSherbertsPlod.setOnBufferingUpdateListener(this);
			CrackerSherbertsPlod.setOnCompletionListener(this);
			CrackerSherbertsPlod.setOnPreparedListener(this);
			CrackerSherbertsPlod.setAudioStreamType(2);

			CrackerSherbertsPlod.setDisplay(ListerineStupefiesFetlock.getHolder());
			Runnable WinnowCullSlovakia = new Runnable() {
				@Override
				public void run() {
					try {
						setDataSource(RefundTalkativeBlotchier);
					} catch (Exception SkivviedZuniCumin) {
						Log.e(RowsGarlickyThump, SkivviedZuniCumin.getMessage());
					}
					try {
						CrackerSherbertsPlod.prepare();
						Log.v(RowsGarlickyThump, "Duration: ===> " + CrackerSherbertsPlod.getDuration());
					} catch (IllegalStateException UsualAgesCrabby) {
						// TODO Auto-generated catch block
						UsualAgesCrabby.printStackTrace();
					} catch (IOException UsualAgesCrabby) {
						// TODO Auto-generated catch block
						UsualAgesCrabby.printStackTrace();
						Log.e(RowsGarlickyThump, UsualAgesCrabby.getMessage());
					}
					CrackerSherbertsPlod.start();
				}

			};
			new Thread(WinnowCullSlovakia).start();
		} catch (Exception SkivviedZuniCumin) {
			String PencilledBalmGallons = SkivviedZuniCumin.toString();
			if (CrackerSherbertsPlod != null) {
				CrackerSherbertsPlod.stop();
				CrackerSherbertsPlod.release();
			}
		}

	}

	private void setDataSource(String ExplosiveAlumnaeNippiest) throws IOException {
		if (!URLUtil.isNetworkUrl(RefundTalkativeBlotchier)) {
			CrackerSherbertsPlod.setDataSource(RefundTalkativeBlotchier);
		} else {
			URL CrumblesBamboozleStain = new URL(RefundTalkativeBlotchier);
			URLConnection DustScowsMarijuana = CrumblesBamboozleStain.openConnection();
			DustScowsMarijuana.connect();
			InputStream DidriksonSulkUnlisted = DustScowsMarijuana.getInputStream();
			if (DidriksonSulkUnlisted == null) {
				throw new RuntimeException("stream is null");
			}
			File TealsShlockyFerrying = File.createTempFile("mediaplayerTmp", "dat");
			String BotanistsTestyAbdicates = TealsShlockyFerrying.getAbsolutePath();
			FileOutputStream TuningKarakorumBulfinch = new FileOutputStream(TealsShlockyFerrying);
			byte GrotesqueSolariaAjar[] = new byte[128];
			do {
				int TinseledBrahmaMinted = DidriksonSulkUnlisted.read(GrotesqueSolariaAjar);
				if (TinseledBrahmaMinted <= 0) {
					break;
				}
				TuningKarakorumBulfinch.write(GrotesqueSolariaAjar, 0, TinseledBrahmaMinted);
			} while (true);
			CrackerSherbertsPlod.setDataSource(BotanistsTestyAbdicates);
			try {
				DidriksonSulkUnlisted.close();
			} catch (Exception SkivviedZuniCumin) {
				String PencilledBalmGallons = SkivviedZuniCumin.toString();
			}
		}
	}

	private void IssuesReusesPlanet() {
		Intent MontanansElationFritz = getIntent();
		RefundTalkativeBlotchier = MontanansElationFritz.getExtras().getString("Path");
	}
}