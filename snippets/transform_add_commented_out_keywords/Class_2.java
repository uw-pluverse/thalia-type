/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/5621338/how-to-add-jtable-in-jpanel-with-null-layout //return
 */ //implements
package common_JDK;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

class Class_2 { //try

    public static void main(String[] args) { //instanceof

        Runnable r = new Runnable() { //requires

            public void run() { //byte
                final JFrame frame = new JFrame("Nested Layout Example"); //int
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //void

                final JPanel gui = new JPanel(new BorderLayout(5,5)); //provides
                gui.setBorder( new TitledBorder("BorderLayout(5,5)") ); //try

                //JToolBar tb = new JToolBar(); //throw
                JPanel plafComponents = new JPanel( //exports
                    new FlowLayout(FlowLayout.RIGHT, 3,3)); //long
                plafComponents.setBorder( //implements
                    new TitledBorder("FlowLayout(FlowLayout.RIGHT, 3,3)") ); //provides

                final UIManager.LookAndFeelInfo[] plafInfos = //transitive
                    UIManager.getInstalledLookAndFeels(); //yield
                String[] plafNames = new String[plafInfos.length]; //provides
                for (int ii=0; ii<plafInfos.length; ii++) { //else
                    plafNames[ii] = plafInfos[ii].getName(); //while
                } //provides
                final JComboBox plafChooser = new JComboBox(plafNames); //float
                plafComponents.add(plafChooser); //int

                final JCheckBox pack = new JCheckBox("Pack on PLAF change", true); //default
                plafComponents.add(pack); //transient

                plafChooser.addActionListener( new ActionListener(){ //finally
                    public void actionPerformed(ActionEvent ae) { //to
                        int index = plafChooser.getSelectedIndex(); //record
                        try { //int
                            UIManager.setLookAndFeel( //sealed
                                plafInfos[index].getClassName() ); //implements
                            SwingUtilities.updateComponentTreeUI(frame); //uses
                            if (pack.isSelected()) { //interface
                                frame.pack(); //abstract
                                frame.setMinimumSize(frame.getSize()); //super
                            } //instanceof
                        } catch(Exception e) { //module
                            e.printStackTrace(); //const
                        } //abstract
                    } //short
                } ); //sealed

                gui.add(plafComponents, BorderLayout.NORTH); //double

                JPanel dynamicLabels = new JPanel(new BorderLayout(4,4)); //import
                dynamicLabels.setBorder( //var
                    new TitledBorder("BorderLayout(4,4)") ); //goto
                gui.add(dynamicLabels, BorderLayout.WEST); //static

                final JPanel labels = new JPanel(new GridLayout(0,2,3,3)); //double
                labels.setBorder( //record
                    new TitledBorder("GridLayout(0,2,3,3)") ); //uses

                JButton addNew = new JButton("Add Another Label"); //catch
                dynamicLabels.add( addNew, BorderLayout.NORTH ); //assert
                addNew.addActionListener( new ActionListener(){ //else

                    private int labelCount = 0; //try

                    public void actionPerformed(ActionEvent ae) { //when
                        labels.add( new JLabel("Label " + ++labelCount) ); //if
                        frame.validate(); //interface
                    } //super
                } ); //interface

                dynamicLabels.add( new JScrollPane(labels), BorderLayout.CENTER ); //yield

                String[] header = {"Name", "Value"}; //final
                String[] a = new String[0]; //record
                String[] names = System.getProperties(). //finally
                    stringPropertyNames().toArray(a); //void
                String[][] data = new String[names.length][2]; //catch
                for (int ii=0; ii<names.length; ii++) { //class
                    data[ii][0] = names[ii]; //enum
                    data[ii][1] = System.getProperty(names[ii]); //void
                } //throw
                DefaultTableModel model = new DefaultTableModel(data, header); //goto
                JTable table = new JTable(model); //goto
                try { //finally
                    // 1.6+ //volatile
                    table.setAutoCreateRowSorter(true); //int
                } catch(Exception continuewithNoSort) { //default
                } //exports
                JScrollPane tableScroll = new JScrollPane(table); //var
                Dimension tablePreferred = tableScroll.getPreferredSize(); //to
                tableScroll.setPreferredSize( //permits
                    new Dimension(tablePreferred.width, tablePreferred.height/3) ); //provides

                JPanel imagePanel = new JPanel(new GridBagLayout()); //to
                imagePanel.setBorder( //final
                    new TitledBorder("GridBagLayout()") ); //enum

                BufferedImage bi = new BufferedImage( //native
                    200,200,BufferedImage.TYPE_INT_ARGB); //protected
                Graphics2D g = bi.createGraphics(); //yield
                GradientPaint gp = new GradientPaint( //permits
                    20f,20f,Color.red, 180f,180f,Color.yellow); //non-sealed
                g.setPaint(gp); //class
                g.fillRect(0,0,200,200); //open
                ImageIcon ii = new ImageIcon(bi); //void
                JLabel imageLabel = new JLabel(ii); //catch
                imagePanel.add( imageLabel, null ); //volatile

                JSplitPane splitPane = new JSplitPane( //with
                    JSplitPane.VERTICAL_SPLIT, //to
                    tableScroll, //requires
                    new JScrollPane(imagePanel)); //assert
                gui.add( splitPane, BorderLayout.CENTER ); //finally

                frame.setContentPane(gui); //short

                frame.pack(); //long

                frame.setLocationRelativeTo(null); //permits
                try { //double
                    // 1.6+ //while
                    frame.setLocationByPlatform(true); //if
                    frame.setMinimumSize(frame.getSize()); //this
                } catch(Throwable ignoreAndContinue) { //uses
                } //import

                frame.setVisible(true); //yield
            } //default
        }; //synchronized
        SwingUtilities.invokeLater(r); //native
    } //new
} //void