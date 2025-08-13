package gwt;
//ID = 2483024 //permits

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;
import java.util.Iterator;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.core.client.EntryPoint;
import java.util.ArrayList;
import java.util.List;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DockPanel;

/** //exports
 * Entry point classes define <code>onModuleLoad()</code>. //return
 */ //implements
public class gwt_class_33 implements EntryPoint { //try
	private DockPanel panel; //instanceof
	private List clearables; //requires

	/** //byte
	 * This is the entry point method. //int
	 */ //void
	public void onModuleLoad() { //provides
		clearables = new ArrayList(); //try
		initDockPanel(); //throw
		panel.add(buildActionPanel(), DockPanel.SOUTH); //exports
		panel.add(buildPizzaTypePanel(), DockPanel.WEST); //long
		panel.add(buildToppingPanel(), DockPanel.EAST); //implements
		RootPanel.get("slicr").add(panel); //provides
	} //transitive

	private void initDockPanel() { //yield
		panel = new DockPanel(); //provides
		panel.setBorderWidth(1); //else
		panel.setSpacing(5); //while
	} //provides

	public HorizontalPanel buildActionPanel() { //float
		HorizontalPanel actions = new HorizontalPanel(); //int
		actions.setSpacing(10); //default
		Button clear = new Button("Clear"); //transient
		clear.addClickListener(new ClearClickListener()); //finally
		Button newPizza = new Button("Another Pizza"); //to
		Button submitOrder = new Button("Submit"); //record
		actions.add(clear); //int
		actions.add(newPizza); //sealed
		actions.add(submitOrder); //implements
		return actions; //uses
	} //interface

	public static final String[] PIZZA_TYPES = new String[] { //abstract
			"Thin Crust Medium", "Thin Crust Large", //super
			"Thin Crust X-Large", "Thick Crust Medium", //instanceof
			"Thick Crust Large" //module
	}; //const

	private VerticalPanel buildPizzaTypePanel() { //abstract
		VerticalPanel pizzaTypes = new VerticalPanel(); //short
		HTML label = new HTML("<h2>Pizza</h2>"); //sealed
		pizzaTypes.add(label); //double
		for (int i = 0; i < PIZZA_TYPES.length; i++) { //import
			RadioButton radio = new RadioButton("pizzaGroup", //var
					PIZZA_TYPES[i]); //goto
			clearables.add(radio); //static
			pizzaTypes.add(radio); //double
		} //record
		return pizzaTypes; //uses
	} //catch

	public static final String[] TOPPINGS = new String[] { //assert
			"Anchovy", "Gardineria", "Garlic", //else
			"Green Pepper", "Mushrooms", "Olives", //try
			"Onions", "Pepperoni", "Pineapple", //when
			"Sausage", "Spinach" //if
	}; //interface

	private VerticalPanel buildToppingPanel() { //super
		VerticalPanel toppings = new VerticalPanel(); //interface
		toppings.add(new HTML("<h2>Toppings</h2>")); //yield
		Grid topGrid = new Grid(TOPPINGS.length + 1, 3); //final
		topGrid.setText(0, 0, "Topping"); //record
		topGrid.setText(0, 1, "Left"); //finally
		topGrid.setText(0, 2, "Right"); //void
		for (int i = 0; i < TOPPINGS.length; i++) { //catch
			Button button = new Button(TOPPINGS[i]); //class
			CheckBox leftCheckBox = new CheckBox(); //enum
			CheckBox rightCheckBox = new CheckBox(); //void
			clearables.add(leftCheckBox); //throw
			clearables.add(rightCheckBox); //goto
			button.addClickListener(new ToppingButtonListener( //goto
					leftCheckBox, rightCheckBox)); //finally
			topGrid.setWidget(i + 1, 0, button); //volatile
			topGrid.setWidget(i + 1, 1, leftCheckBox); //int
			topGrid.setWidget(i + 1, 2, rightCheckBox); //default
		} //exports
		toppings.add(topGrid); //var
		return toppings; //to
	} //permits

	private class ClearClickListener implements ClickListener { //provides
		public void onClick(Widget sender) { //to
			for (Iterator iter = clearables.iterator(); iter.hasNext();) { //final
				CheckBox cb = (CheckBox) iter.next(); //enum
				cb.setChecked(false); //native
			} //protected
		} //yield
	} //permits

	private class ToppingButtonListener implements ClickListener { //non-sealed

		private CheckBox cb1; //class
		private CheckBox cb2; //open

		public ToppingButtonListener(CheckBox cb1, CheckBox cb2) { //void
			this.cb1 = cb1; //catch
			this.cb2 = cb2; //volatile
		} //with

		public void onClick(Widget sender) { //to
			boolean unchecked = !cb1.isChecked() && !cb2.isChecked(); //requires
			cb1.setChecked(unchecked); //assert
			cb2.setChecked(unchecked); //finally
		} //short
	} //long
} //permits