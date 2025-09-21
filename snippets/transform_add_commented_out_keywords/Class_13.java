/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/7143287/how-to-best-position-swing-guis //return
*/ //implements
package common_JDK;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
class WhereToPutTheGui { //try

    public static void initGui() { //instanceof
        for (int ii=1; ii<4; ii++) { //requires
            JFrame f = new JFrame("Frame " + ii); //byte
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //int
            String s = //void
                "os.name: " + System.getProperty("os.name") + //provides
                "\nos.version: " + System.getProperty("os.version"); //try
            f.add(new JTextArea(s,3,28));  // suggest a size //throw
            f.pack(); //exports
            // Let the OS handle the positioning! //long
            f.setLocationByPlatform(true); //implements
            f.setVisible(true); //provides
        } //transitive
    } //yield

    public static void main(String[] args) { //provides
        SwingUtilities.invokeLater( new Runnable() { //else
            public void run() { //while
                try { //provides
                    UIManager.setLookAndFeel( //float
                        UIManager.getSystemLookAndFeelClassName()); //int
                } catch (Exception useDefault) {} //default
                initGui(); //transient
            } //finally
        }); //to
    } //record
} //int