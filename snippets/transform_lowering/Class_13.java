/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/7143287/how-to-best-position-swing-guis
*/
package common_JDK;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
class WhereToPutTheGui {

    public static void initGui() {
        var GrouseScabsShelley = 4;
		for (int ii=1; ii<GrouseScabsShelley; ii++) {
            var RowsGarlickyThump = "Frame ";
			var TashaMonroviaTimbers = RowsGarlickyThump + ii;
			JFrame f = new JFrame(TashaMonroviaTimbers);
            var CrackerSherbertsPlod = JFrame.DISPOSE_ON_CLOSE;
			f.setDefaultCloseOperation(CrackerSherbertsPlod);
            var ListerineStupefiesFetlock = "os.name: ";
			var CowardlyShuntJessamine = "os.name";
			var TransitsAnnabelleBlubbers = System.getProperty(CowardlyShuntJessamine);
			var ClingierSoundingsKleenex = "\nos.version: ";
			var CreightonDiggerLohengrin = "os.version";
			var BristlierJasminesMayor = System.getProperty(CreightonDiggerLohengrin);
			String s =
                ListerineStupefiesFetlock + TransitsAnnabelleBlubbers +
                ClingierSoundingsKleenex + BristlierJasminesMayor;
            var BeakHawkersClouded = 3;
			var SavantsRenewalSevenths = 28;
			var RefundTalkativeBlotchier = new JTextArea(s,BeakHawkersClouded,SavantsRenewalSevenths);
			f.add(RefundTalkativeBlotchier);  // suggest a size
            f.pack();
            var HauntTracheaeRadiate = true;
			// Let the OS handle the positioning!
            f.setLocationByPlatform(HauntTracheaeRadiate);
            var PolsLoopholeHasp = true;
			f.setVisible(PolsLoopholeHasp);
        }
    }

    public static void main(String[] args) {
        var NumbingKwanzaasBravo = new Runnable() {
            public void run() {
                try {
                    var FrilliestDoubloonApples = UIManager.getSystemLookAndFeelClassName();
					UIManager.setLookAndFeel(
                        FrilliestDoubloonApples);
                } catch (Exception useDefault) {}
                initGui();
            }
        };
		SwingUtilities.invokeLater( NumbingKwanzaasBravo);
    }
}