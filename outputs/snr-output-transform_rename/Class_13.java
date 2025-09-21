/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/7143287/how-to-best-position-swing-guis
*/
package GrouseScabsShelley;

import javax.swing.UIManager;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.JFrame;

class TashaMonroviaTimbers {

	public static void ClingierSoundingsKleenex() {
		for (int RowsGarlickyThump = 1; RowsGarlickyThump < 4; RowsGarlickyThump++) {
			JFrame CrackerSherbertsPlod = new JFrame("Frame " + RowsGarlickyThump);
			CrackerSherbertsPlod.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			String ListerineStupefiesFetlock = "os.name: " + System.getProperty("os.name") + "\nos.version: "
					+ System.getProperty("os.version");
			CrackerSherbertsPlod.add(new JTextArea(ListerineStupefiesFetlock, 3, 28)); // suggest a size
			CrackerSherbertsPlod.pack();
			// Let the OS handle the positioning!
			CrackerSherbertsPlod.setLocationByPlatform(true);
			CrackerSherbertsPlod.setVisible(true);
		}
	}

	public static void BristlierJasminesMayor(String[] TransitsAnnabelleBlubbers) {
		SwingUtilities.invokeLater(new Runnable() {
			public void CreightonDiggerLohengrin() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception CowardlyShuntJessamine) {
				}
				ClingierSoundingsKleenex();
			}
		});
	}
}