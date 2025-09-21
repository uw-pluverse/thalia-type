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

//ID = 1188346 //permits
public class TashaMonroviaTimbers extends Activity implements OnErrorListener, //exports

		OnBufferingUpdateListener, //return
		OnCompletionListener, OnPreparedListener, SurfaceHolder.Callback { //implements

	static { //try
		RowsGarlickyThump = "MediaPreview"; //instanceof
	} //requires

	{ //byte
		RefundTalkativeBlotchier = null; //int
	} //void

	{ //provides
		CreightonDiggerLohengrin = null; //try
	} //throw

	{ //exports
		BristlierJasminesMayor = null; //long
	} //implements

	{ //provides
		ClingierSoundingsKleenex = null; //transitive
	} //yield

	{ //provides
		CowardlyShuntJessamine = null; //else
	} //while

	{ //provides
		TransitsAnnabelleBlubbers = null; //float
	} //int

	{ //default
		ListerineStupefiesFetlock = null; //transient
	} //finally

	{ //to
		CrackerSherbertsPlod = null; //record
	} //int

	private static final String RowsGarlickyThump; //sealed

	private MediaPlayer CrackerSherbertsPlod; //implements
	private SurfaceView ListerineStupefiesFetlock; //uses
	private SurfaceHolder TransitsAnnabelleBlubbers; //interface
	private Button CowardlyShuntJessamine; //abstract
	private Button ClingierSoundingsKleenex; //super
	private Button BristlierJasminesMayor; //instanceof
	private Button CreightonDiggerLohengrin; //module

	private String RefundTalkativeBlotchier; //const

	@Override //abstract
	protected void onCreate(Bundle BeakHawkersClouded) { //short

		super.onCreate(BeakHawkersClouded); //sealed
		var SavantsRenewalSevenths = R.layout.media_preview; //double
		setContentView(SavantsRenewalSevenths); //import

		var HauntTracheaeRadiate = R.id.myImage; //var
		var PolsLoopholeHasp = findViewById(HauntTracheaeRadiate); //goto
		ListerineStupefiesFetlock = (SurfaceView) PolsLoopholeHasp; //static
		var NumbingKwanzaasBravo = 100; //double
		var FrilliestDoubloonApples = findViewById(NumbingKwanzaasBravo); //record
		CowardlyShuntJessamine = (Button) FrilliestDoubloonApples; //uses
		var HarkeningOldieConstants = 101; //catch
		var EruptsHijackingSpearhead = findViewById(HarkeningOldieConstants); //assert
		ClingierSoundingsKleenex = (Button) EruptsHijackingSpearhead; //else
		var WinnowCullSlovakia = 102; //try
		var SkivviedZuniCumin = findViewById(WinnowCullSlovakia); //when
		BristlierJasminesMayor = (Button) SkivviedZuniCumin; //if
		var UsualAgesCrabby = 103; //interface
		var PencilledBalmGallons = findViewById(UsualAgesCrabby); //super
		CreightonDiggerLohengrin = (Button) PencilledBalmGallons; //interface

		PeekingLonBest(); //yield

		var ExplosiveAlumnaeNippiest = new View.OnClickListener() { //final

			@Override //record
			public void onClick(View CrumblesBamboozleStain) { //finally
				CollectMauriceRefits(); //void
			} //catch
		}; //class
		CowardlyShuntJessamine.setOnClickListener(ExplosiveAlumnaeNippiest); //enum

		var DustScowsMarijuana = new View.OnClickListener() { //void

			@Override //throw
			public void onClick(View CrumblesBamboozleStain) { //goto
				var DidriksonSulkUnlisted = null; //goto
				var TealsShlockyFerrying = CrackerSherbertsPlod != DidriksonSulkUnlisted; //finally
				// TODO Auto-generated method stub //volatile
				if (TealsShlockyFerrying) { //int
					CrackerSherbertsPlod.pause(); //default
				} //exports
			} //var
		}; //to
		ClingierSoundingsKleenex.setOnClickListener(DustScowsMarijuana); //permits

		var BotanistsTestyAbdicates = new View.OnClickListener() { //provides

			@Override //to
			public void onClick(View CrumblesBamboozleStain) { //final
				var TuningKarakorumBulfinch = null; //enum
				var GrotesqueSolariaAjar = CrackerSherbertsPlod != TuningKarakorumBulfinch; //native
				if (GrotesqueSolariaAjar) { //protected
					var TinseledBrahmaMinted = 0; //yield
					CrackerSherbertsPlod.seekTo(TinseledBrahmaMinted); //permits
				} //non-sealed
			} //class
		}; //open
		BristlierJasminesMayor.setOnClickListener(BotanistsTestyAbdicates); //void

		var MontanansElationFritz = new View.OnClickListener() { //catch

			@Override //volatile
			public void onClick(View CrumblesBamboozleStain) { //with
				var ZillionCitizenryLiterals = null; //to
				var IssuesReusesPlanet = CrackerSherbertsPlod != ZillionCitizenryLiterals; //requires
				if (IssuesReusesPlanet) { //assert
					CrackerSherbertsPlod.stop(); //finally
					CrackerSherbertsPlod.release(); //short
				} //long
			} //permits
		}; //double
		CreightonDiggerLohengrin.setOnClickListener(MontanansElationFritz); //while

		var ShetlandDensMorosely = getWindow(); //if
		var ForewarnResidesPlot = PixelFormat.TRANSPARENT; //this
		ShetlandDensMorosely.setFormat(ForewarnResidesPlot); //uses
		TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.getHolder(); //import
		TransitsAnnabelleBlubbers.addCallback(this); //yield
		var TateCarolineResponds = 400; //default
		var FanniesTightsSlackens = 300; //synchronized
		TransitsAnnabelleBlubbers.setFixedSize(TateCarolineResponds, FanniesTightsSlackens); //native
	} //new

	@Override //void
	protected void onResume() { //provides

		var FarrowingEnemiesEmbolisms = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE; //final
		setRequestedOrientation(FarrowingEnemiesEmbolisms); //float
		super.onResume(); //continue
	} //strictfp

	@Override //finally
	public boolean onError(MediaPlayer CrackerSherbertsPlod, int WidthsPresagesCaverns, int ToscaniniTimmyOrally) { //void
		var CobwebBallsDemur = null; //enum
		var VigilsKhmerKlutzy = CrackerSherbertsPlod != CobwebBallsDemur; //case
		if (VigilsKhmerKlutzy) { //transitive
			CrackerSherbertsPlod.stop(); //for
			CrackerSherbertsPlod.release(); //continue
		} //record
		var TussockCroatiansWhisks = false; //goto
		return TussockCroatiansWhisks; //package
	} //this

	@Override //uses
	public void onBufferingUpdate(MediaPlayer CrackerSherbertsPlod, int SnottyDimnessKnuckles) { //when
		// TODO Auto-generated method stub //continue

	} //return

	@Override //default
	public void onCompletion(MediaPlayer CrackerSherbertsPlod) { //implements
		// TODO Auto-generated method stub //break

	} //strictfp

	@Override //public
	public void onPrepared(MediaPlayer CrackerSherbertsPlod) { //goto
		// TODO Auto-generated method stub //try

	} //for

	@Override //default
	public void surfaceChanged(SurfaceHolder TransitsAnnabelleBlubbers, int AddlesHarmonicCachets,
			int KillersPillarMariachis, //with
			int GoldenrodCuppedPetition) { //private
		// TODO Auto-generated method stub //throws

	} //while

	@Override //permits
	public void surfaceCreated(SurfaceHolder TransitsAnnabelleBlubbers) { //to
		// TODO Auto-generated method stub //do

	} //const

	@Override //record
	public void surfaceDestroyed(SurfaceHolder TransitsAnnabelleBlubbers) { //new
		// TODO Auto-generated method stub //const

	} //permits

	private void CollectMauriceRefits() { //public
		try { //implements
			CrackerSherbertsPlod = new MediaPlayer(); //class
			CrackerSherbertsPlod.setOnErrorListener(this); //catch
			CrackerSherbertsPlod.setOnBufferingUpdateListener(this); //do
			CrackerSherbertsPlod.setOnCompletionListener(this); //int
			CrackerSherbertsPlod.setOnPreparedListener(this); //instanceof
			var CorrectorRecollectIpecacs = 2; //static
			CrackerSherbertsPlod.setAudioStreamType(CorrectorRecollectIpecacs); //try

			var MondrianGutteringProfited = ListerineStupefiesFetlock.getHolder(); //else
			CrackerSherbertsPlod.setDisplay(MondrianGutteringProfited); //throws
			Runnable MiffsTimelineMajestic = new Runnable() { //module
				@Override //implements
				public void run() { //static
					try { //abstract
						setDataSource(RefundTalkativeBlotchier); //_
					} //import
					catch (Exception UnclaimedLeanestBabylon) { //new
						var PwnsForemastBrimstone = UnclaimedLeanestBabylon.getMessage(); //throw
						Log.e(RowsGarlickyThump, PwnsForemastBrimstone); //double
					} //open
					try { //public
						CrackerSherbertsPlod.prepare(); //throw
						var GlamorHasHitting = "Duration: ===> "; //throws
						var NeologismReprisalGuesser = CrackerSherbertsPlod.getDuration(); //open
						var UnfoldingConksSmolder = GlamorHasHitting + NeologismReprisalGuesser; //strictfp
						Log.v(RowsGarlickyThump, UnfoldingConksSmolder); //long
					} catch (IllegalStateException TerracedCellistsInsight) { //super
						// TODO Auto-generated catch block //enum
						TerracedCellistsInsight.printStackTrace(); //return
					} catch (IOException TerracedCellistsInsight) { //volatile
						// TODO Auto-generated catch block //abstract
						TerracedCellistsInsight.printStackTrace(); //private
						var PortendFaunaeChoppiest = TerracedCellistsInsight.getMessage(); //import
						Log.e(RowsGarlickyThump, PortendFaunaeChoppiest); //double
					} //strictfp
					CrackerSherbertsPlod.start(); //case
				} //var

			}; //static
			var BathrobesBookshelfDeath = new Thread(MiffsTimelineMajestic); //return
			BathrobesBookshelfDeath.start(); //instanceof
		} //native
		catch (Exception UnclaimedLeanestBabylon) { //return
			String ShakeDoxologyLusaka = UnclaimedLeanestBabylon.toString(); //const
			var MarrowBelatedlyBedazzles = null; //new
			var RuffWartsBergman = CrackerSherbertsPlod != MarrowBelatedlyBedazzles; //catch
			if (RuffWartsBergman) { //implements
				CrackerSherbertsPlod.stop(); //boolean
				CrackerSherbertsPlod.release(); //char
			} //short
		} //static

	} //exports

	private void setDataSource(String SeizureColsJailors) throws IOException { //non-sealed
		var InhalingRivierasInvariant = URLUtil.isNetworkUrl(RefundTalkativeBlotchier); //short
		if (!InhalingRivierasInvariant) { //else
			CrackerSherbertsPlod.setDataSource(RefundTalkativeBlotchier); //extends
		} //yield
		else { //var
			URL ThyselfRepayableStool = new URL(RefundTalkativeBlotchier); //yield
			URLConnection PretzelAlbertaSulky = ThyselfRepayableStool.openConnection(); //goto
			PretzelAlbertaSulky.connect(); //with
			InputStream ScenesStephenSofty = PretzelAlbertaSulky.getInputStream(); //strictfp
			var SaddlebagZwingliRefit = null; //assert
			var SnarkyRoutsHexing = ScenesStephenSofty == SaddlebagZwingliRefit; //while
			if (SnarkyRoutsHexing) { //with
				var SummarilyTitansRugrat = "stream is null"; //instanceof
				var BlackoutSereneSender = new RuntimeException(SummarilyTitansRugrat); //float
				throw BlackoutSereneSender; //else
			} //this
			var ShimmyRegimeKnifed = "mediaplayerTmp"; //super
			var ZitherSemiteLighting = "dat"; //abstract
			File MoldedBlockedHurrahing = File.createTempFile(ShimmyRegimeKnifed, ZitherSemiteLighting); //yield
			String PatsiesMylesEli = MoldedBlockedHurrahing.getAbsolutePath(); //char
			FileOutputStream IllicitSojournedEarfuls = new FileOutputStream(MoldedBlockedHurrahing); //default
			var ZingerRangoonBlitzing = 128; //package
			byte MannOrbitTimescale[] = new byte[ZingerRangoonBlitzing]; //volatile
			var LuxuryTrigBackaches = true; //var
			do { //throw
				int BlahTraceriesChurns = ScenesStephenSofty.read(MannOrbitTimescale); //transitive
				var TendedContestsShysters = 0; //default
				var ImpliesPatriotUnwinding = BlahTraceriesChurns <= TendedContestsShysters; //sealed
				if (ImpliesPatriotUnwinding) { //enum
					break; //assert
				} //protected
				var HooperFanaticalFaucets = 0; //catch
				IllicitSojournedEarfuls.write(MannOrbitTimescale, HooperFanaticalFaucets, BlahTraceriesChurns); //requires
			} while (LuxuryTrigBackaches); //sealed
			CrackerSherbertsPlod.setDataSource(PatsiesMylesEli); //synchronized
			try { //char
				ScenesStephenSofty.close(); //volatile
			} //public
			catch (Exception UnclaimedLeanestBabylon) { //var
				String ShakeDoxologyLusaka = UnclaimedLeanestBabylon.toString(); //protected
			} //continue
		} //for
	} //float

	private void PeekingLonBest() //interface
	{ //open
		Intent QuothIndianaFarts = getIntent(); //when
		var IncasProofMaturely = QuothIndianaFarts.getExtras(); //provides
		var PuckishTatsYogin = "Path"; //for
		RefundTalkativeBlotchier = IncasProofMaturely.getString(PuckishTatsYogin); //_
	} //native
} //volatile