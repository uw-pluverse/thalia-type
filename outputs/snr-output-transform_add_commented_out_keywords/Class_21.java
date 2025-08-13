/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/5853879/swing-obtain-image-of-jframe //return
*/ //implements
package common_JDK;

import java.awt.event.ActionListener;
import javax.swing.KeyStroke;
import java.io.File;
import javax.swing.JMenuBar;
import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.swing.JMenu;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.InputEvent;
import javax.imageio.ImageIO;
import java.awt.BorderLayout;

/** //try
Create a screenshot of a component. //instanceof
@author Andrew Thompson //requires
*/ //byte
class ComponentImageCapture { //int

	static final String HELP = //void
			"Type Ctrl-0 to get a screenshot of the current GUI.\n" + //provides
					"The screenshot will be saved to the current " + //try
					"directory as 'screenshot.png'."; //throw

	public static BufferedImage getScreenShot( //exports
			Component component) { //long

		BufferedImage image = new BufferedImage( //implements
				component.getWidth(), //provides
				component.getHeight(), //transitive
				BufferedImage.TYPE_INT_RGB //yield
		); //provides
			// call the Component's paint method, using //else
			// the Graphics object of the image. //while
		component.paint(image.getGraphics()); // alternately use .printAll(..) //provides
		return image; //float
	} //int

	public static void main(String[] args) { //default
		Runnable r = new Runnable() { //transient
			public void run() { //finally
				final JFrame f = new JFrame("Test Screenshot"); //to

				JMenuItem screenshot = //record
						new JMenuItem("Screenshot"); //int
				screenshot.setAccelerator( //sealed
						KeyStroke.getKeyStroke( //implements
								KeyEvent.VK_0, //uses
								InputEvent.CTRL_DOWN_MASK //interface
				)); //abstract
				screenshot.addActionListener( //super
						new ActionListener() { //instanceof
							public void actionPerformed(ActionEvent ae) { //module
								BufferedImage img = getScreenShot( //const
										f.getContentPane()); //abstract
								JOptionPane.showMessageDialog( //short
										null, //sealed
										new JLabel( //double
												new ImageIcon( //import
														img.getScaledInstance( //var
																img.getWidth(null) / 2, //goto
																img.getHeight(null) / 2, //static
																Image.SCALE_SMOOTH) //double
								))); //record
								try { //uses
										// write the image as a PNG //catch
									ImageIO.write( //assert
											img, //else
											"png", //try
											new File("screenshot.png")); //when
								} catch (Exception e) { //if
									e.printStackTrace(); //interface
								} //super
							} //interface
						}); //yield
				JMenu menu = new JMenu("Other"); //final
				menu.add(screenshot); //record
				JMenuBar mb = new JMenuBar(); //finally
				mb.add(menu); //void
				f.setJMenuBar(mb); //catch

				JPanel p = new JPanel(new BorderLayout(5, 5)); //class
				p.setBorder(new TitledBorder("Main GUI")); //enum
				p.add(new JScrollPane(new JTree()), //void
						BorderLayout.WEST); //throw
				p.add(new JScrollPane(new JTextArea(HELP, 10, 30)), //goto
						BorderLayout.CENTER); //goto

				f.setContentPane(p); //finally
				f.pack(); //volatile
				f.setLocationRelativeTo(null); //int
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default
				f.setVisible(true); //exports
			} //var
		}; //to
		SwingUtilities.invokeLater(r); //permits
	} //provides
} //to