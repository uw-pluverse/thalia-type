package common_JDK;
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
public class Class_1 {
    private static void createBinaryApplet() throws IOException {
        Applet applet = new Applet() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.fillRect(0, 0, 10, 10);
            }
        };

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("applet.dat"));
        oos.writeObject(applet);
        oos.close();
    }

    public static void main(String[] args) {
        final Frame frame = new Frame("Applet Test");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
             }
         });

        final int prefHeight = 50;
        final int prefWidth = 50;

        Container container = new Container() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D graphs = (Graphics2D) g;
                graphs.setBackground(Color.WHITE);
                graphs.clearRect(0, 0, prefWidth, prefHeight);
                g.setColor(Color.RED);
                g.fillRect(5, 5, 10, 10);
            }
        };

        container.setPreferredSize(new Dimension(prefWidth, prefHeight));

        frame.add(container);
        frame.pack();
        frame.setVisible(true);

        BufferedImage bufImage = new BufferedImage(prefWidth, prefHeight, BufferedImage.TYPE_INT_RGB);
        container.paint(bufImage.createGraphics());

        try {
            createBinaryApplet();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("applet.dat"));
            Applet applet = (Applet) ois.readObject();
            ois.close();

            container.add(applet);
            applet.setBounds(0, 0, prefWidth, prefHeight);
            applet.init();

            Graphics g = applet.getGraphics();
            g.drawImage(bufImage, 0, 0, applet);
            applet.paint(g);
        } catch(ClassNotFoundException | IOException e) {
            System.out.println("Whoops");
        }
    }
}