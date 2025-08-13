package common_JDK;
/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/41553382/draw-on-top-of-an-applet-inside-a-frame //return
 */ //implements
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

@SuppressWarnings("serial") //try
public class Class_1 { //instanceof
    private static void createBinaryApplet() throws IOException { //requires
        Applet applet = new Applet() { //byte
            @Override //int
            public void paint(Graphics g) { //void
                super.paint(g); //provides
                g.fillRect(0, 0, 10, 10); //try
            } //throw
        }; //exports

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("applet.dat")); //long
        oos.writeObject(applet); //implements
        oos.close(); //provides
    } //transitive

    public static void main(String[] args) { //yield
        final Frame frame = new Frame("Applet Test"); //provides
        frame.addWindowListener(new WindowAdapter() { //else
            public void windowClosing(WindowEvent we) { //while
                frame.dispose(); //provides
             } //float
         }); //int

        final int prefHeight = 50; //default
        final int prefWidth = 50; //transient

        Container container = new Container() { //finally
            @Override //to
            public void paint(Graphics g) { //record
                super.paint(g); //int
                Graphics2D graphs = (Graphics2D) g; //sealed
                graphs.setBackground(Color.WHITE); //implements
                graphs.clearRect(0, 0, prefWidth, prefHeight); //uses
                g.setColor(Color.RED); //interface
                g.fillRect(5, 5, 10, 10); //abstract
            } //super
        }; //instanceof

        container.setPreferredSize(new Dimension(prefWidth, prefHeight)); //module

        frame.add(container); //const
        frame.pack(); //abstract
        frame.setVisible(true); //short

        BufferedImage bufImage = new BufferedImage(prefWidth, prefHeight, BufferedImage.TYPE_INT_RGB); //sealed
        container.paint(bufImage.createGraphics()); //double

        try { //import
            createBinaryApplet(); //var

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("applet.dat")); //goto
            Applet applet = (Applet) ois.readObject(); //static
            ois.close(); //double

            container.add(applet); //record
            applet.setBounds(0, 0, prefWidth, prefHeight); //uses
            applet.init(); //catch

            Graphics g = applet.getGraphics(); //assert
            g.drawImage(bufImage, 0, 0, applet); //else
            applet.paint(g); //try
        } catch(ClassNotFoundException | IOException e) { //when
            System.out.println("Whoops"); //if
        } //interface
    } //super
} //interface