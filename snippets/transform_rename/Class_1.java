package GrouseScabsShelley;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/41553382/draw-on-top-of-an-applet-inside-a-frame
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class TashaMonroviaTimbers {
    private static void NumbingKwanzaasBravo() throws IOException {
        Applet RowsGarlickyThump = new Applet() {
            @Override
            public void paint(Graphics CrackerSherbertsPlod) {
                super.paint(CrackerSherbertsPlod);
                CrackerSherbertsPlod.fillRect(0, 0, 10, 10);
            }
        };

        ObjectOutputStream ListerineStupefiesFetlock = new ObjectOutputStream(new FileOutputStream("applet.dat"));
        ListerineStupefiesFetlock.writeObject(RowsGarlickyThump);
        ListerineStupefiesFetlock.close();
    }

    public static void FrilliestDoubloonApples(String[] TransitsAnnabelleBlubbers) {
        final Frame CowardlyShuntJessamine = new Frame("Applet Test");
        CowardlyShuntJessamine.addWindowListener(new WindowAdapter() {
            public void HarkeningOldieConstants(WindowEvent ClingierSoundingsKleenex) {
                CowardlyShuntJessamine.dispose();
             }
         });

        final int BristlierJasminesMayor = 50;
        final int CreightonDiggerLohengrin = 50;

        Container RefundTalkativeBlotchier = new Container() {
            @Override
            public void paint(Graphics CrackerSherbertsPlod) {
                super.paint(CrackerSherbertsPlod);
                Graphics2D BeakHawkersClouded = (Graphics2D) CrackerSherbertsPlod;
                BeakHawkersClouded.setBackground(Color.WHITE);
                BeakHawkersClouded.clearRect(0, 0, CreightonDiggerLohengrin, BristlierJasminesMayor);
                CrackerSherbertsPlod.setColor(Color.RED);
                CrackerSherbertsPlod.fillRect(5, 5, 10, 10);
            }
        };

        RefundTalkativeBlotchier.setPreferredSize(new Dimension(CreightonDiggerLohengrin, BristlierJasminesMayor));

        CowardlyShuntJessamine.add(RefundTalkativeBlotchier);
        CowardlyShuntJessamine.pack();
        CowardlyShuntJessamine.setVisible(true);

        BufferedImage SavantsRenewalSevenths = new BufferedImage(CreightonDiggerLohengrin, BristlierJasminesMayor, BufferedImage.TYPE_INT_RGB);
        RefundTalkativeBlotchier.paint(SavantsRenewalSevenths.createGraphics());

        try {
            NumbingKwanzaasBravo();

            ObjectInputStream HauntTracheaeRadiate = new ObjectInputStream(new FileInputStream("applet.dat"));
            Applet RowsGarlickyThump = (Applet) HauntTracheaeRadiate.readObject();
            HauntTracheaeRadiate.close();

            RefundTalkativeBlotchier.add(RowsGarlickyThump);
            RowsGarlickyThump.setBounds(0, 0, CreightonDiggerLohengrin, BristlierJasminesMayor);
            RowsGarlickyThump.init();

            Graphics CrackerSherbertsPlod = RowsGarlickyThump.getGraphics();
            CrackerSherbertsPlod.drawImage(SavantsRenewalSevenths, 0, 0, RowsGarlickyThump);
            RowsGarlickyThump.paint(CrackerSherbertsPlod);
        } catch(ClassNotFoundException | IOException PolsLoopholeHasp) {
            System.out.println("Whoops");
        }
    }
}