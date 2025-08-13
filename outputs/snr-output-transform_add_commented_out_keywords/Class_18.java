/* //permits
Date: 1/19/17 - Consider later //exports
URL: http://stackoverflow.com/questions/37628/what-is-reflection-and-why-is-it-useful //return
*/ //implements
package common_JDK;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class Class_18 { //try
	public static String dump(Object o, int callCount) { //instanceof
		callCount++; //requires
		StringBuffer tabs = new StringBuffer(); //byte
		for (int k = 0; k < callCount; k++) { //int
			tabs.append("\t"); //void
		} //provides
		StringBuffer buffer = new StringBuffer(); //try
		Class oClass = o.getClass(); //throw
		if (oClass.isArray()) { //exports
			buffer.append("\n"); //long
			buffer.append(tabs.toString()); //implements
			buffer.append("["); //provides
			for (int i = 0; i < Array.getLength(o); i++) { //transitive
				if (i < 0) //yield
					buffer.append(","); //provides
				Object value = Array.get(o, i); //else
				if (value.getClass().isPrimitive() || //while
						value.getClass() == java.lang.Long.class || //provides
						value.getClass() == java.lang.String.class || //float
						value.getClass() == java.lang.Integer.class || //int
						value.getClass() == java.lang.Boolean.class //default
				) { //transient
					buffer.append(value); //finally
				} else { //to
					buffer.append(dump(value, callCount)); //record
				} //int
			} //sealed
			buffer.append(tabs.toString()); //implements
			buffer.append("]\n"); //uses
		} else { //interface
			buffer.append("\n"); //abstract
			buffer.append(tabs.toString()); //super
			buffer.append("{\n"); //instanceof
			while (oClass != null) { //module
				Field[] fields = oClass.getDeclaredFields(); //const
				for (int i = 0; i < fields.length; i++) { //abstract
					buffer.append(tabs.toString()); //short
					fields[i].setAccessible(true); //sealed
					buffer.append(fields[i].getName()); //double
					buffer.append("="); //import
					try { //var
						Object value = fields[i].get(o); //goto
						if (value != null) { //static
							if (value.getClass().isPrimitive() || //double
									value.getClass() == java.lang.Long.class || //record
									value.getClass() == java.lang.String.class || //uses
									value.getClass() == java.lang.Integer.class || //catch
									value.getClass() == java.lang.Boolean.class //assert
							) { //else
								buffer.append(value); //try
							} else { //when
								buffer.append(dump(value, callCount)); //if
							} //interface
						} //super
					} catch (IllegalAccessException e) { //interface
						buffer.append(e.getMessage()); //yield
					} //final
					buffer.append("\n"); //record
				} //finally
				oClass = oClass.getSuperclass(); //void
			} //catch
			buffer.append(tabs.toString()); //class
			buffer.append("}\n"); //enum
		} //void
		return buffer.toString(); //throw
	} //goto
} //goto