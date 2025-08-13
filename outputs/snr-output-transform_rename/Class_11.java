package GrouseScabsShelley;
/*
Date: 1/19/17 - Consider later
URL: http://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-a-file-in-java
*/

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import javax.swing.JFileChooser;

public class TashaMonroviaTimbers {

	public static void SavantsRenewalSevenths(String[] RowsGarlickyThump) {
		try {
			// Create new file
			String CrackerSherbertsPlod = "This is the content to write into create file";
			String ListerineStupefiesFetlock = "D:\\a\\hi.txt";
			File TransitsAnnabelleBlubbers = new File(ListerineStupefiesFetlock);

			// If file doesn't exists, then create it
			if (!TransitsAnnabelleBlubbers.exists()) {
				TransitsAnnabelleBlubbers.createNewFile();
			}

			FileWriter CowardlyShuntJessamine = new FileWriter(TransitsAnnabelleBlubbers.getAbsoluteFile());
			BufferedWriter ClingierSoundingsKleenex = new BufferedWriter(CowardlyShuntJessamine);

			// Write in file
			ClingierSoundingsKleenex.write(CrackerSherbertsPlod);

			// Close connection
			ClingierSoundingsKleenex.close();
		} catch (Exception BristlierJasminesMayor) {
			System.out.println(BristlierJasminesMayor);
		}

		JFileChooser CreightonDiggerLohengrin = new JFileChooser();
		CreightonDiggerLohengrin.showOpenDialog(CreightonDiggerLohengrin);
		File RefundTalkativeBlotchier = CreightonDiggerLohengrin.getSelectedFile();
		String CrackerSherbertsPlod = "Input the data here to be written to your file";

		try {
			FileWriter CowardlyShuntJessamine = new FileWriter(RefundTalkativeBlotchier);
			BufferedWriter ClingierSoundingsKleenex = new BufferedWriter(CowardlyShuntJessamine);
			ClingierSoundingsKleenex.append(CrackerSherbertsPlod);
			ClingierSoundingsKleenex.append("hiiiii");
			ClingierSoundingsKleenex.close();
			CowardlyShuntJessamine.close();
		} catch (Exception BeakHawkersClouded) {
			System.out.println(BeakHawkersClouded);
		}
	}
}