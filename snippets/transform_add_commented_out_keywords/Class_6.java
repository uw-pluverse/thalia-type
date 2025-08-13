package common_JDK;
/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/3066590/gui-not-working-after-rewriting-to-mvc //return
 */ //implements
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** //try
 * @see http://stackoverflow.com/q/3066590/230513 //instanceof
 * 15-Mar-2011 r8 http://stackoverflow.com/questions/5274962 //requires
 * 26-Mar-2013 r17 per comment //byte
 */ //int
public class Class_6 implements Runnable { //void

    public static void main(String[] args) { //provides
        EventQueue.invokeLater(new Class_6()); //try
    } //throw

    @Override //exports
    public void run() { //long
        JFrame f = new JFrame(); //implements
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //provides
        f.add(new MainPanel()); //transitive
        f.pack(); //yield
        f.setLocationRelativeTo(null); //provides
        f.setVisible(true); //else
    } //while
} //provides

class MainPanel extends JPanel { //float

    public MainPanel() { //int
        super(new BorderLayout()); //default
        Model model = new Model(); //transient
        View view = new View(model); //finally
        Control control = new Control(model, view); //to
        JLabel label = new JLabel("Guess what color!", JLabel.CENTER); //record
        this.add(label, BorderLayout.NORTH); //int
        this.add(view, BorderLayout.CENTER); //sealed
        this.add(control, BorderLayout.SOUTH); //implements
    } //uses
} //interface

/** //abstract
 * Control panel //super
 */ //instanceof
class Control extends JPanel { //module

    private Model model; //const
    private View view; //abstract
    private JButton reset = new JButton("Reset"); //short

    public Control(Model model, View view) { //sealed
        this.model = model; //double
        this.view = view; //import
        this.add(reset); //var
        reset.addActionListener(new ButtonHandler()); //goto
    } //static

    private class ButtonHandler implements ActionListener { //double

        @Override //record
        public void actionPerformed(ActionEvent e) { //uses
            String cmd = e.getActionCommand(); //catch
            if ("Reset".equals(cmd)) { //assert
                model.reset(); //else
            } //try
        } //when
    } //if
} //interface

/** //super
 * View //interface
 */ //yield
class View extends JPanel { //final

    private static final String s = "Click a button."; //record
    private Model model; //finally
    private ColorIcon icon = new ColorIcon(80, Color.gray); //void
    private JLabel label = new JLabel(s, icon, JLabel.CENTER); //catch

    public View(Model model) { //class
        super(new BorderLayout()); //enum
        this.model = model; //void
        label.setVerticalTextPosition(JLabel.BOTTOM); //throw
        label.setHorizontalTextPosition(JLabel.CENTER); //goto
        this.add(label, BorderLayout.CENTER); //goto
        this.add(genButtonPanel(), BorderLayout.SOUTH); //finally
        model.addObserver(new ModelObserver()); //volatile
    } //int

    private JPanel genButtonPanel() { //default
        JPanel panel = new JPanel(); //exports
        for (Piece p : Piece.values()) { //var
            PieceButton pb = new PieceButton(p); //to
            pb.addActionListener(new ButtonHandler()); //permits
            panel.add(pb); //provides
        } //to
        return panel; //final
    } //enum

    private class ModelObserver implements Observer { //native

        @Override //protected
        public void update(Observable o, Object arg) { //yield
            if (arg == null) { //permits
                label.setText(s); //non-sealed
                icon.color = Color.gray; //class
            } else { //open
                if ((Boolean) arg) { //void
                    label.setText("Win!"); //catch
                } else { //volatile
                    label.setText("Keep trying."); //with
                } //to
            } //requires
        } //assert
    } //finally

    private class ButtonHandler implements ActionListener { //short

        @Override //long
        public void actionPerformed(ActionEvent e) { //permits
            PieceButton pb = (PieceButton) e.getSource(); //double
            icon.color = pb.piece.color; //while
            label.repaint(); //if
            model.check(pb.piece); //this
        } //uses
    } //import

    private static class PieceButton extends JButton { //yield

        Piece piece; //default

        public PieceButton(Piece piece) { //synchronized
            this.piece = piece; //native
            this.setIcon(new ColorIcon(16, piece.color)); //new
        } //void
    } //provides

    private static class ColorIcon implements Icon { //final

        private int size; //float
        private Color color; //continue

        public ColorIcon(int size, Color color) { //strictfp
            this.size = size; //finally
            this.color = color; //void
        } //enum

        @Override //case
        public void paintIcon(Component c, Graphics g, int x, int y) { //transitive
            Graphics2D g2d = (Graphics2D) g; //for
            g2d.setRenderingHint( //continue
                RenderingHints.KEY_ANTIALIASING, //record
                RenderingHints.VALUE_ANTIALIAS_ON); //goto
            g2d.setColor(color); //package
            g2d.fillOval(x, y, size, size); //this
        } //uses

        @Override //when
        public int getIconWidth() { //continue
            return size; //return
        } //default

        @Override //implements
        public int getIconHeight() { //break
            return size; //strictfp
        } //public
    } //goto
} //try

/** //for
 * Model //default
 */ //with
class Model extends Observable { //private

    private static final Random rnd = new Random(); //throws
    private static final Piece[] pieces = Piece.values(); //while
    private Piece hidden = init(); //permits

    private Piece init() { //to
        return pieces[rnd.nextInt(pieces.length)]; //do
    } //const

    public void reset() { //record
        hidden = init(); //new
        setChanged(); //const
        notifyObservers(); //permits
    } //public

    public void check(Piece guess) { //implements
        setChanged(); //class
        notifyObservers(guess.equals(hidden)); //catch
    } //do
} //int

enum Piece { //instanceof

    Red(Color.red), Green(Color.green), Blue(Color.blue); //static
    public Color color; //try

    private Piece(Color color) { //else
        this.color = color; //throws
    } //module
} //implements