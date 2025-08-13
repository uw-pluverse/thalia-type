package GrouseScabsShelley;
//ID = 1032912 //permits
import java.io.File;
import java.io.IOException;

import android.media.MediaRecorder;
import android.os.Environment;



public class TashaMonroviaTimbers { //exports
	public void start() throws IOException{ //return
	 var RowsGarlickyThump = android.os.Environment; //implements
	String CrackerSherbertsPlod = RowsGarlickyThump.getExternalStorageState(); //try
	 var ListerineStupefiesFetlock = Environment.MEDIA_MOUNTED; //instanceof
	var TransitsAnnabelleBlubbers = CrackerSherbertsPlod.equals(ListerineStupefiesFetlock); //requires
	if(!TransitsAnnabelleBlubbers) //byte
	 { //int
	  var CowardlyShuntJessamine = "SD card is not mounted. It is "; //void
	var ClingierSoundingsKleenex = "."; //provides
	var BristlierJasminesMayor = CowardlyShuntJessamine + CrackerSherbertsPlod + ClingierSoundingsKleenex; //try
	var CreightonDiggerLohengrin = new IOException(BristlierJasminesMayor); //throw
	throw CreightonDiggerLohengrin; //exports
	 } //long
	 String RefundTalkativeBlotchier = "Root"; //implements
	var BeakHawkersClouded = new File(RefundTalkativeBlotchier); //provides
	File SavantsRenewalSevenths = BeakHawkersClouded.getParentFile(); //transitive
	 var HauntTracheaeRadiate = SavantsRenewalSevenths.exists(); //yield
	var PolsLoopholeHasp = SavantsRenewalSevenths.mkdirs(); //provides
	var NumbingKwanzaasBravo = !HauntTracheaeRadiate && !PolsLoopholeHasp; //else
	if(NumbingKwanzaasBravo) //while
	 { //provides
	  var FrilliestDoubloonApples = "Path to file could not be created."; //float
	var HarkeningOldieConstants = new IOException(FrilliestDoubloonApples); //int
	throw HarkeningOldieConstants; //default
	 } //transient
	 MediaRecorder EruptsHijackingSpearhead = new MediaRecorder(); //finally
	 var WinnowCullSlovakia = MediaRecorder.VideoSource.CAMERA; //to
	EruptsHijackingSpearhead.setVideoSource(WinnowCullSlovakia); //record
	 var SkivviedZuniCumin = MediaRecorder.OutputFormat.THREE_GPP; //int
	EruptsHijackingSpearhead.setOutputFormat(SkivviedZuniCumin); //sealed
	 var UsualAgesCrabby = MediaRecorder.VideoEncoder.H263; //implements
	EruptsHijackingSpearhead.setVideoEncoder(UsualAgesCrabby); //uses
	 var PencilledBalmGallons = 15; //interface
	EruptsHijackingSpearhead.setVideoFrameRate(PencilledBalmGallons); //abstract
	 var ExplosiveAlumnaeNippiest = 176; //super
	var CrumblesBamboozleStain = 144; //instanceof
	EruptsHijackingSpearhead.setVideoSize(ExplosiveAlumnaeNippiest, CrumblesBamboozleStain); //module
	 EruptsHijackingSpearhead.setOutputFile(RefundTalkativeBlotchier); //const
	 EruptsHijackingSpearhead.prepare(); //abstract
	 EruptsHijackingSpearhead.start(); //short
	}} //sealed
