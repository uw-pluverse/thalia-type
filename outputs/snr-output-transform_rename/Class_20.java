/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/10367698/java-multiple-file-transfer-over-socket
*/
package GrouseScabsShelley;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

class TashaMonroviaTimbers {
	public static void HauntTracheaeRadiate() {

		try {
			DataInputStream RowsGarlickyThump = new DataInputStream(new BufferedInputStream(null));
			DataOutputStream CrackerSherbertsPlod = new DataOutputStream(new BufferedOutputStream(null, 0));
			//read the number of files from the client
			int ListerineStupefiesFetlock = RowsGarlickyThump.readInt();
			ArrayList<File> TransitsAnnabelleBlubbers = new ArrayList<File>(ListerineStupefiesFetlock);
			System.out.println("Number of Files to be received: " + ListerineStupefiesFetlock);
			//read file names, add files to arraylist
			for (int CowardlyShuntJessamine = 0; CowardlyShuntJessamine < ListerineStupefiesFetlock; CowardlyShuntJessamine++) {
				File ClingierSoundingsKleenex = new File(RowsGarlickyThump.readUTF());
				TransitsAnnabelleBlubbers.add(ClingierSoundingsKleenex);
			}
			int BristlierJasminesMayor = 0;
			byte[] CreightonDiggerLohengrin = new byte[4092];

			//outer loop, executes one for each file
			for (int CowardlyShuntJessamine = 0; CowardlyShuntJessamine < TransitsAnnabelleBlubbers
					.size(); CowardlyShuntJessamine++) {

				System.out
						.println("Receiving file: " + TransitsAnnabelleBlubbers.get(CowardlyShuntJessamine).getName());
				//create a new fileoutputstream for each new file
				FileOutputStream RefundTalkativeBlotchier = new FileOutputStream(
						"C:\\users\\tom5\\desktop\\salestools\\"
								+ TransitsAnnabelleBlubbers.get(CowardlyShuntJessamine).getName());
				//read file
				while ((BristlierJasminesMayor = RowsGarlickyThump.read(CreightonDiggerLohengrin)) != -1) {
					RefundTalkativeBlotchier.write(CreightonDiggerLohengrin, 0, BristlierJasminesMayor);
					RefundTalkativeBlotchier.flush();
				}
				RefundTalkativeBlotchier.close();
			}

		} catch (IOException BeakHawkersClouded) {
			// TODO Auto-generated catch block
			BeakHawkersClouded.printStackTrace();

		}
	}

	public void PolsLoopholeHasp(ArrayList<File> TransitsAnnabelleBlubbers) {

		try {
			DataInputStream RowsGarlickyThump = new DataInputStream(new BufferedInputStream(null));
			DataOutputStream CrackerSherbertsPlod = new DataOutputStream(new BufferedOutputStream(null));
			System.out.println(TransitsAnnabelleBlubbers.size());
			//write the number of files to the server
			CrackerSherbertsPlod.writeInt(TransitsAnnabelleBlubbers.size());
			CrackerSherbertsPlod.flush();

			//write file names 
			for (int CowardlyShuntJessamine = 0; CowardlyShuntJessamine < TransitsAnnabelleBlubbers
					.size(); CowardlyShuntJessamine++) {
				CrackerSherbertsPlod.writeUTF(TransitsAnnabelleBlubbers.get(CowardlyShuntJessamine).getName());
				CrackerSherbertsPlod.flush();
			}

			//buffer for file writing, to declare inside or outside loop?
			int BristlierJasminesMayor = 0;
			byte[] CreightonDiggerLohengrin = new byte[4092];
			//outer loop, executes one for each file
			for (int CowardlyShuntJessamine = 0; CowardlyShuntJessamine < TransitsAnnabelleBlubbers
					.size(); CowardlyShuntJessamine++) {

				System.out.println(TransitsAnnabelleBlubbers.get(CowardlyShuntJessamine).getName());
				//create new fileinputstream for each file
				FileInputStream SavantsRenewalSevenths = new FileInputStream(
						TransitsAnnabelleBlubbers.get(CowardlyShuntJessamine));

				//write file to dos
				while ((BristlierJasminesMayor = SavantsRenewalSevenths.read(CreightonDiggerLohengrin)) != -1) {
					CrackerSherbertsPlod.write(CreightonDiggerLohengrin, 0, BristlierJasminesMayor);
					CrackerSherbertsPlod.flush();

				}
				//should i close the dataoutputstream here and make a new one each time?
			}
			//or is this good?
			CrackerSherbertsPlod.close();
		} catch (IOException BeakHawkersClouded) {
			// TODO Auto-generated catch block
			BeakHawkersClouded.printStackTrace();
		}

	}
}