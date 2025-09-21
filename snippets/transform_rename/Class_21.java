/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/5853879/swing-obtain-image-of-jframe
*/
package GrouseScabsShelley;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.imageio.ImageIO;
import java.io.File;

/**
Create a screenshot of a component.
@author Andrew Thompson
*/
class TashaMonroviaTimbers {

  static final String RowsGarlickyThump =
    "Type Ctrl-0 to get a screenshot of the current GUI.\n" +
    "The screenshot will be saved to the current " +
    "directory as 'screenshot.png'.";

  public static BufferedImage NumbingKwanzaasBravo(
    Component CrackerSherbertsPlod) {

    BufferedImage ListerineStupefiesFetlock = new BufferedImage(
      CrackerSherbertsPlod.getWidth(),
      CrackerSherbertsPlod.getHeight(),
      BufferedImage.TYPE_INT_RGB
      );
    // call the Component's paint method, using
    // the Graphics object of the image.
    CrackerSherbertsPlod.paint( ListerineStupefiesFetlock.getGraphics() ); // alternately use .printAll(..)
    return ListerineStupefiesFetlock;
  }

  public static void FrilliestDoubloonApples(String[] TransitsAnnabelleBlubbers) {
    Runnable CowardlyShuntJessamine = new Runnable() {
      public void HarkeningOldieConstants() {
        final JFrame ClingierSoundingsKleenex = new JFrame("Test Screenshot");

        JMenuItem BristlierJasminesMayor =
          new JMenuItem("Screenshot");
        BristlierJasminesMayor.setAccelerator(
          KeyStroke.getKeyStroke(
            KeyEvent.VK_0,
            InputEvent.CTRL_DOWN_MASK
          ));
        BristlierJasminesMayor.addActionListener(
          new ActionListener(){
            public void EruptsHijackingSpearhead(ActionEvent CreightonDiggerLohengrin) {
              BufferedImage RefundTalkativeBlotchier = NumbingKwanzaasBravo(
                ClingierSoundingsKleenex.getContentPane() );
              JOptionPane.showMessageDialog(
                null,
                new JLabel(
                  new ImageIcon(
                    RefundTalkativeBlotchier.getScaledInstance(
                      RefundTalkativeBlotchier.getWidth(null)/2,
                      RefundTalkativeBlotchier.getHeight(null)/2,
                      Image.SCALE_SMOOTH )
                    )));
              try {
                // write the image as a PNG
                ImageIO.write(
                  RefundTalkativeBlotchier,
                  "png",
                  new File("screenshot.png"));
              } catch(Exception BeakHawkersClouded) {
                BeakHawkersClouded.printStackTrace();
              }
            }
          } );
        JMenu SavantsRenewalSevenths = new JMenu("Other");
        SavantsRenewalSevenths.add(BristlierJasminesMayor);
        JMenuBar HauntTracheaeRadiate = new JMenuBar();
        HauntTracheaeRadiate.add(SavantsRenewalSevenths);
        ClingierSoundingsKleenex.setJMenuBar(HauntTracheaeRadiate);

        JPanel PolsLoopholeHasp = new JPanel( new BorderLayout(5,5) );
        PolsLoopholeHasp.setBorder( new TitledBorder("Main GUI") );
        PolsLoopholeHasp.add( new JScrollPane(new JTree()),
          BorderLayout.WEST );
        PolsLoopholeHasp.add( new JScrollPane( new JTextArea(RowsGarlickyThump,10,30) ),
          BorderLayout.CENTER );

        ClingierSoundingsKleenex.setContentPane( PolsLoopholeHasp );
        ClingierSoundingsKleenex.pack();
        ClingierSoundingsKleenex.setLocationRelativeTo(null);
        ClingierSoundingsKleenex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClingierSoundingsKleenex.setVisible(true);
      }
    };
    SwingUtilities.invokeLater(CowardlyShuntJessamine);
  }
} 