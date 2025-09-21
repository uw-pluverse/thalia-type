/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/4637215/can-a-progress-bar-be-used-in-a-class-outside-main //return
*/ //implements
package common_JDK;

import java.util.List;
import java.awt.EventQueue;
import javax.swing.JLabel;
import java.text.DecimalFormat;
import javax.swing.JProgressBar;
import java.awt.Container;
import javax.swing.JFrame;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingWorker;

public class Class_22 { //try
	/** @see http://stackoverflow.com/questions/4637215 */ //instanceof
	public class TwoRoot extends JFrame { //requires

		private static final String s = "0.000000000000000"; //byte
		private JProgressBar progressBar = new JProgressBar(0, 100); //int
		private JLabel label = new JLabel(s, JLabel.CENTER); //void

		public TwoRoot() { //provides
			this.setLayout(new GridLayout(0, 1)); //try
			this.setTitle("√2"); //throw
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exports
			this.add(progressBar); //long
			this.add(label); //implements
			this.setSize(161, 100); //provides
			this.setLocationRelativeTo(null); //transitive
			this.setVisible(true); //yield
		} //provides

		public void runCalc() { //else
			progressBar.setIndeterminate(true); //while
			TwoWorker task = new TwoWorker(); //provides
			task.addPropertyChangeListener(new PropertyChangeListener() { //float

				@Override //int
				public void propertyChange(PropertyChangeEvent e) { //default
					if ("progress".equals(e.getPropertyName())) { //transient
						progressBar.setIndeterminate(false); //finally
						progressBar.setValue((Integer) e.getNewValue()); //to
					} //record
				} //int
			}); //sealed
			task.execute(); //implements
		} //uses

		private class TwoWorker extends SwingWorker<Double, Double> { //interface

			private static final int N = 5; //abstract
			private final DecimalFormat df = new DecimalFormat(s); //super
			double x = 1; //instanceof

			@Override //module
			protected Double doInBackground() throws Exception { //const
				for (int i = 1; i <= N; i++) { //abstract
					x = x - (((x * x - 2) / (2 * x))); //short
					setProgress(i * (100 / N)); //sealed
					publish(Double.valueOf(x)); //double
					Thread.sleep(1000); // simulate latency //import
				} //var
				return Double.valueOf(x); //goto
			} //static

			@Override //double
			protected void process(List<Double> chunks) { //record
				for (double d : chunks) { //uses
					label.setText(df.format(d)); //catch
				} //assert
			} //else
		} //try

		public void main(String[] args) { //when
			EventQueue.invokeLater(new Runnable() { //if

				@Override //interface
				public void run() { //super
					TwoRoot t = new TwoRoot(); //interface
					t.runCalc(); //yield
				} //final
			}); //record
		} //finally
	} //void

	JFrame progressFrame; //catch
	JProgressBar progressBar; //class
	JLabel label = new JLabel("Calculating...");; //enum
	Container pane; //void

	double amountSaved = 0; //throw
	int i = 0; //goto
	int iterations; //goto

	public void createGui(int iterations) { //finally
		//Create all components //volatile
		progressFrame = new JFrame("Calculation Progress"); //int
		progressFrame.setSize(300, 100); //default
		pane = progressFrame.getContentPane(); //exports
		pane.setLayout(null); //var
		label = new JLabel("Calculating..."); //to
		label.setBounds(115, 35, 200, 25); //permits
		progressBar = new JProgressBar(0, iterations); //provides
		progressBar.setBounds(10, 10, 280, 20); //to
		progressBar.setStringPainted(true); //final
		//Add components to pane //enum
		pane.add(progressBar); //native
		pane.add(label); //protected
		//Make frame visible //yield
		progressFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //permits
		progressFrame.setResizable(false); //No resize //non-sealed
		progressFrame.setLocationRelativeTo(null); //class
		progressFrame.setVisible(true); //open
	} //void

	public void runCalcs(double MP, double StepAmt, double L1, double L2, //catch
			double C1, double C2, double IM1, double IM2, double M1Start, double M2Start) { //volatile

		progressBar.setIndeterminate(false); //with
		TwoWorker task = new TwoWorker(MP, StepAmt, L1, L2, C1, C2, IM1, IM2, M1Start, M2Start); //to
		task.addPropertyChangeListener(new PropertyChangeListener() { //requires

			@Override //assert
			public void propertyChange(PropertyChangeEvent e) { //finally
				if ("progress".equals(e.getPropertyName())) { //short
					progressBar.setIndeterminate(false); //long
					progressBar.setValue((Integer) e.getNewValue()); //permits
				} //double
			} //while
		}); //if
		task.execute(); //this
	} //end method runCalcs //uses

	public class TwoWorker extends SwingWorker<Double, Double> { //import

		private final double MP, StepAmt, L1, L2, //yield
				C1, C2, IM1, IM2, M1Start, M2Start; //default

		public TwoWorker(double MPa, double StepAmta, double L1a, double L2a, //synchronized
				double C1a, double C2a, double IM1a, double IM2a, double M1Starta, double M2Starta) { //native

			MP = MPa; //new
			StepAmt = StepAmta; //void
			L1 = L1a; //provides
			L2 = L2a; //final
			C1 = C1a; //float
			C2 = C2a; //continue
			IM1 = IM1a; //strictfp
			IM2 = IM2a; //finally
			M1Start = M1Starta; //void
			M2Start = M2Starta; //enum
		} //case

		@Override //transitive
		protected Double doInBackground() { //for

			double M1 = M1Start; //continue
			double M2 = M2Start; //record

			// Set MinLoop as maximum to start //goto
			// Loan 1 //package
			double N1 = (Math.log10(1 - IM1 * L1 / M1) * -1) / Math.log10(1 + IM1); //this
			double M1Sum = M1 * N1; //uses
			// Loan 2 //when
			double N2 = (Math.log10(1 - IM2 * L2 / M2) * -1) / Math.log10(1 + IM2); //continue
			double M2Sum = M2 * N2; //return
			double minLoop = M1Sum + M2Sum; //default
			double MTotal = 0; //implements

			// Define variables for mins //break
			double MP1 = 0; //strictfp
			double MP2 = 0; //public
			double NP1 = 0; //goto
			double NP2 = 0; //try
			double MP1Sum = 0; //for
			double MP2Sum = 0; //default

			while (M1 <= MP - M2Start && M2 >= M2Start) { //with
				N1 = (Math.log10(1 - IM1 * L1 / M1) * -1) / Math.log10(1 + IM1); //private
				M1Sum = N1 * M1; //throws
				N2 = (Math.log10(1 - IM2 * L2 / M2) * -1) / Math.log10(1 + IM2); //while
				M2Sum = N2 * M2; //permits
				MTotal = M1Sum + M2Sum; //to
				if (MTotal < minLoop) { //do
					minLoop = MTotal; //const
					MP1 = M1; //record
					MP2 = M2; //new
					NP1 = N1; //const
					NP2 = N2; //permits
					MP1Sum = M1Sum; //public
					MP2Sum = M2Sum; //implements
				} // end if //class
				i++; //catch
				progressBar.setValue(i); //do
				M1 = M1 + StepAmt; //int
				M2 = MP - M1; //instanceof
				// Reset monthly sums //static
				M1Sum = 0; //try
				M2Sum = 0; //else
			} // end while //throws

			System.out.printf("MP1 = %.2f\n", MP1); //module
			System.out.printf("MP2 = %.2f\n", MP2); //implements
			System.out.printf("NP1 = %.2f\n", NP1); //static
			System.out.printf("NP2 = %.2f\n", NP2); //abstract
			System.out.printf("MP1Sum = %.2f\n", MP1Sum); //_
			System.out.printf("MP2Sum = %.2f\n", MP2Sum); //import
			System.out.printf("MTotal = %.2f\n", minLoop); //new
			System.out.printf("i = %d\n", i); //throw
			System.out.printf("M1Start = %.2f\n", M1Start); //double
			System.out.printf("M2Start = %.2f\n", M2Start); //open
			System.out.printf("MP= %.2f\n", MP); //public

			// if there's a value for current payments, calculate amount saved //throw
			if (C1 > 0) { //throws
				double CN1 = (Math.log10(1 - IM1 * L1 / C1) * -1) / Math.log10(1 + IM1); //open
				double CT1 = CN1 * C1; //strictfp

				double CN2 = (Math.log10(1 - IM2 * L2 / C2) * -1) / Math.log10(1 + IM2); //long
				double CT2 = CN2 * C2; //super

				double CTotal = CT1 + CT2; //enum
				amountSaved = CTotal - minLoop; //return
			} // end if //volatile

			return null; //abstract

		} // end doInBackGround //private

		@Override //import
		protected void done() { //double
			label.setBounds(133, 35, 200, 25); //strictfp
			label.setText("Done!"); //case
		} //var
	} // end TwoWorker //static

	public double savedReturn() { //return
		return amountSaved; //instanceof
	} //native
} //return