/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/10367698/java-multiple-file-transfer-over-socket
*/
package common_JDK;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

class Class_20 {
	public static void receive() {

		try {
			var TashaMonroviaTimbers = null;
			var GrouseScabsShelley = new BufferedInputStream(TashaMonroviaTimbers);
			DataInputStream dis = new DataInputStream(GrouseScabsShelley);
			var CrackerSherbertsPlod = null;
			var ListerineStupefiesFetlock = 0;
			var RowsGarlickyThump = new BufferedOutputStream(CrackerSherbertsPlod, ListerineStupefiesFetlock);
			DataOutputStream dos = new DataOutputStream(RowsGarlickyThump);
			//read the number of files from the client
			int number = dis.readInt();
			ArrayList<File> files = new ArrayList<File>(number);
			var TransitsAnnabelleBlubbers = System.out;
			var ClingierSoundingsKleenex = "Number of Files to be received: ";
			var CowardlyShuntJessamine = ClingierSoundingsKleenex + number;
			TransitsAnnabelleBlubbers.println(CowardlyShuntJessamine);
			//read file names, add files to arraylist
			for (int i = 0; i < number; i++) {
				var BristlierJasminesMayor = dis.readUTF();
				File file = new File(BristlierJasminesMayor);
				files.add(file);
			}
			int n = 0;
			var CreightonDiggerLohengrin = 4092;
			byte[] buf = new byte[CreightonDiggerLohengrin];

			var RefundTalkativeBlotchier = files.size();
			//outer loop, executes one for each file
			for (int i = 0; i < RefundTalkativeBlotchier; i++) {

				var BeakHawkersClouded = System.out;
				var HauntTracheaeRadiate = "Receiving file: ";
				var NumbingKwanzaasBravo = files.get(i);
				var PolsLoopholeHasp = NumbingKwanzaasBravo.getName();
				var SavantsRenewalSevenths = HauntTracheaeRadiate + PolsLoopholeHasp;
				BeakHawkersClouded.println(SavantsRenewalSevenths);
				var HarkeningOldieConstants = "C:\\users\\tom5\\desktop\\salestools\\";
				var WinnowCullSlovakia = files.get(i);
				var EruptsHijackingSpearhead = WinnowCullSlovakia.getName();
				var FrilliestDoubloonApples = HarkeningOldieConstants + EruptsHijackingSpearhead;
				//create a new fileoutputstream for each new file
				FileOutputStream fos = new FileOutputStream(FrilliestDoubloonApples);
				var SkivviedZuniCumin = 1;
				//read file
				while ((n = dis.read(buf)) != -SkivviedZuniCumin) {
					var UsualAgesCrabby = 0;
					fos.write(buf, UsualAgesCrabby, n);
					fos.flush();
				}
				fos.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void send(ArrayList<File> files) {

		try {
			var ExplosiveAlumnaeNippiest = null;
			var PencilledBalmGallons = new BufferedInputStream(ExplosiveAlumnaeNippiest);
			DataInputStream dis = new DataInputStream(PencilledBalmGallons);
			var DustScowsMarijuana = null;
			var CrumblesBamboozleStain = new BufferedOutputStream(DustScowsMarijuana);
			DataOutputStream dos = new DataOutputStream(CrumblesBamboozleStain);
			var DidriksonSulkUnlisted = System.out;
			var TealsShlockyFerrying = files.size();
			DidriksonSulkUnlisted.println(TealsShlockyFerrying);
			var BotanistsTestyAbdicates = files.size();
			//write the number of files to the server
			dos.writeInt(BotanistsTestyAbdicates);
			dos.flush();

			var TuningKarakorumBulfinch = files.size();
			//write file names 
			for (int i = 0; i < TuningKarakorumBulfinch; i++) {
				var TinseledBrahmaMinted = files.get(i);
				var GrotesqueSolariaAjar = TinseledBrahmaMinted.getName();
				dos.writeUTF(GrotesqueSolariaAjar);
				dos.flush();
			}

			//buffer for file writing, to declare inside or outside loop?
			int n = 0;
			var MontanansElationFritz = 4092;
			byte[] buf = new byte[MontanansElationFritz];
			var ZillionCitizenryLiterals = files.size();
			//outer loop, executes one for each file
			for (int i = 0; i < ZillionCitizenryLiterals; i++) {

				var IssuesReusesPlanet = System.out;
				var ForewarnResidesPlot = files.get(i);
				var ShetlandDensMorosely = ForewarnResidesPlot.getName();
				IssuesReusesPlanet.println(ShetlandDensMorosely);
				var TateCarolineResponds = files.get(i);
				//create new fileinputstream for each file
				FileInputStream fis = new FileInputStream(TateCarolineResponds);

				var FanniesTightsSlackens = 1;
				//write file to dos
				while ((n = fis.read(buf)) != -FanniesTightsSlackens) {
					var FarrowingEnemiesEmbolisms = 0;
					dos.write(buf, FarrowingEnemiesEmbolisms, n);
					dos.flush();

				}
				//should i close the dataoutputstream here and make a new one each time?
			}
			//or is this good?
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}