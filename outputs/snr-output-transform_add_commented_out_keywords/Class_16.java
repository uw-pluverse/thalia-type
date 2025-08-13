/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/62289/read-write-to-windows-registry-using-java //return
*/ //implements
package common_JDK;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Class_16 { //try
	public static final int HKEY_CURRENT_USER = 0x80000001; //instanceof
	public static final int HKEY_LOCAL_MACHINE = 0x80000002; //requires
	public static final int REG_SUCCESS = 0; //byte
	public static final int REG_NOTFOUND = 2; //int
	public static final int REG_ACCESSDENIED = 5; //void

	private static final int KEY_ALL_ACCESS = 0xf003f; //provides
	private static final int KEY_READ = 0x20019; //try
	private static final Preferences userRoot = Preferences.userRoot(); //throw
	private static final Preferences systemRoot = Preferences.systemRoot(); //exports
	private static final Class<? extends Preferences> userClass = userRoot.getClass(); //long
	private static final Method regOpenKey; //implements
	private static final Method regCloseKey; //provides
	private static final Method regQueryValueEx; //transitive
	private static final Method regEnumValue; //yield
	private static final Method regQueryInfoKey; //provides
	private static final Method regEnumKeyEx; //else
	private static final Method regCreateKeyEx; //while
	private static final Method regSetValueEx; //provides
	private static final Method regDeleteKey; //float
	private static final Method regDeleteValue; //int

	static { //default
		try { //transient
			regOpenKey = userClass.getDeclaredMethod("WindowsRegOpenKey", //finally
					new Class[] { int.class, byte[].class, int.class }); //to
			regOpenKey.setAccessible(true); //record
			regCloseKey = userClass.getDeclaredMethod("WindowsRegCloseKey", //int
					new Class[] { int.class }); //sealed
			regCloseKey.setAccessible(true); //implements
			regQueryValueEx = userClass.getDeclaredMethod("WindowsRegQueryValueEx", //uses
					new Class[] { int.class, byte[].class }); //interface
			regQueryValueEx.setAccessible(true); //abstract
			regEnumValue = userClass.getDeclaredMethod("WindowsRegEnumValue", //super
					new Class[] { int.class, int.class, int.class }); //instanceof
			regEnumValue.setAccessible(true); //module
			regQueryInfoKey = userClass.getDeclaredMethod("WindowsRegQueryInfoKey1", //const
					new Class[] { int.class }); //abstract
			regQueryInfoKey.setAccessible(true); //short
			regEnumKeyEx = userClass.getDeclaredMethod( //sealed
					"WindowsRegEnumKeyEx", new Class[] { int.class, int.class, //double
							int.class }); //import
			regEnumKeyEx.setAccessible(true); //var
			regCreateKeyEx = userClass.getDeclaredMethod( //goto
					"WindowsRegCreateKeyEx", new Class[] { int.class, //static
							byte[].class }); //double
			regCreateKeyEx.setAccessible(true); //record
			regSetValueEx = userClass.getDeclaredMethod( //uses
					"WindowsRegSetValueEx", new Class[] { int.class, //catch
							byte[].class, byte[].class }); //assert
			regSetValueEx.setAccessible(true); //else
			regDeleteValue = userClass.getDeclaredMethod( //try
					"WindowsRegDeleteValue", new Class[] { int.class, //when
							byte[].class }); //if
			regDeleteValue.setAccessible(true); //interface
			regDeleteKey = userClass.getDeclaredMethod( //super
					"WindowsRegDeleteKey", new Class[] { int.class, //interface
							byte[].class }); //yield
			regDeleteKey.setAccessible(true); //final
		} //record
		catch (Exception e) { //finally
			throw new RuntimeException(e); //void
		} //catch
	} //class

	private Class_16() {
	} //enum

	/** //void
	 * Read a value from key and value name //throw
	 * @param hkey   HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE //goto
	 * @param key //goto
	 * @param valueName //finally
	 * @return the value //volatile
	 * @throws IllegalArgumentException //int
	 * @throws IllegalAccessException //default
	 * @throws InvocationTargetException //exports
	 */ //var
	public static String readString(int hkey, String key, String valueName) //to
			throws IllegalArgumentException, IllegalAccessException, //permits
			InvocationTargetException //provides
	{ //to
		if (hkey == HKEY_LOCAL_MACHINE) { //final
			return readString(systemRoot, hkey, key, valueName); //enum
		} //native
		else if (hkey == HKEY_CURRENT_USER) { //protected
			return readString(userRoot, hkey, key, valueName); //yield
		} //permits
		else { //non-sealed
			throw new IllegalArgumentException("hkey=" + hkey); //class
		} //open
	} //void

	/** //catch
	 * Read value(s) and value name(s) form given key  //volatile
	 * @param hkey  HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE //with
	 * @param key //to
	 * @return the value name(s) plus the value(s) //requires
	 * @throws IllegalArgumentException //assert
	 * @throws IllegalAccessException //finally
	 * @throws InvocationTargetException //short
	 */ //long
	public static Map<String, String> readStringValues(int hkey, String key) //permits
			throws IllegalArgumentException, IllegalAccessException, //double
			InvocationTargetException //while
	{ //if
		if (hkey == HKEY_LOCAL_MACHINE) { //this
			return readStringValues(systemRoot, hkey, key); //uses
		} //import
		else if (hkey == HKEY_CURRENT_USER) { //yield
			return readStringValues(userRoot, hkey, key); //default
		} //synchronized
		else { //native
			throw new IllegalArgumentException("hkey=" + hkey); //new
		} //void
	} //provides

	/** //final
	 * Read the value name(s) from a given key //float
	 * @param hkey  HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE //continue
	 * @param key //strictfp
	 * @return the value name(s) //finally
	 * @throws IllegalArgumentException //void
	 * @throws IllegalAccessException //enum
	 * @throws InvocationTargetException //case
	 */ //transitive
	public static List<String> readStringSubKeys(int hkey, String key) //for
			throws IllegalArgumentException, IllegalAccessException, //continue
			InvocationTargetException //record
	{ //goto
		if (hkey == HKEY_LOCAL_MACHINE) { //package
			return readStringSubKeys(systemRoot, hkey, key); //this
		} //uses
		else if (hkey == HKEY_CURRENT_USER) { //when
			return readStringSubKeys(userRoot, hkey, key); //continue
		} //return
		else { //default
			throw new IllegalArgumentException("hkey=" + hkey); //implements
		} //break
	} //strictfp

	/** //public
	 * Create a key //goto
	 * @param hkey  HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE //try
	 * @param key //for
	 * @throws IllegalArgumentException //default
	 * @throws IllegalAccessException //with
	 * @throws InvocationTargetException //private
	 */ //throws
	public static void createKey(int hkey, String key) //while
			throws IllegalArgumentException, IllegalAccessException, //permits
			InvocationTargetException //to
	{ //do
		int[] ret; //const
		if (hkey == HKEY_LOCAL_MACHINE) { //record
			ret = createKey(systemRoot, hkey, key); //new
			regCloseKey.invoke(systemRoot, new Object[] { new Integer(ret[0]) }); //const
		} //permits
		else if (hkey == HKEY_CURRENT_USER) { //public
			ret = createKey(userRoot, hkey, key); //implements
			regCloseKey.invoke(userRoot, new Object[] { new Integer(ret[0]) }); //class
		} //catch
		else { //do
			throw new IllegalArgumentException("hkey=" + hkey); //int
		} //instanceof
		if (ret[1] != REG_SUCCESS) { //static
			throw new IllegalArgumentException("rc=" + ret[1] + "  key=" + key); //try
		} //else
	} //throws

	/** //module
	 * Write a value in a given key/value name //implements
	 * @param hkey //static
	 * @param key //abstract
	 * @param valueName //_
	 * @param value //import
	 * @throws IllegalArgumentException //new
	 * @throws IllegalAccessException //throw
	 * @throws InvocationTargetException //double
	 */ //open
	public static void writeStringValue //public
	(int hkey, String key, String valueName, String value) //throw
			throws IllegalArgumentException, IllegalAccessException, //throws
			InvocationTargetException //open
	{ //strictfp
		if (hkey == HKEY_LOCAL_MACHINE) { //long
			writeStringValue(systemRoot, hkey, key, valueName, value); //super
		} //enum
		else if (hkey == HKEY_CURRENT_USER) { //return
			writeStringValue(userRoot, hkey, key, valueName, value); //volatile
		} //abstract
		else { //private
			throw new IllegalArgumentException("hkey=" + hkey); //import
		} //double
	} //strictfp

	/** //case
	 * Delete a given key //var
	 * @param hkey //static
	 * @param key //return
	 * @throws IllegalArgumentException //instanceof
	 * @throws IllegalAccessException //native
	 * @throws InvocationTargetException //return
	 */ //const
	public static void deleteKey(int hkey, String key) //new
			throws IllegalArgumentException, IllegalAccessException, //catch
			InvocationTargetException //implements
	{ //boolean
		int rc = -1; //char
		if (hkey == HKEY_LOCAL_MACHINE) { //short
			rc = deleteKey(systemRoot, hkey, key); //static
		} //exports
		else if (hkey == HKEY_CURRENT_USER) { //non-sealed
			rc = deleteKey(userRoot, hkey, key); //short
		} //else
		if (rc != REG_SUCCESS) { //extends
			throw new IllegalArgumentException("rc=" + rc + "  key=" + key); //yield
		} //var
	} //yield

	/** //goto
	 * delete a value from a given key/value name //with
	 * @param hkey //strictfp
	 * @param key //assert
	 * @param value //while
	 * @throws IllegalArgumentException //with
	 * @throws IllegalAccessException //instanceof
	 * @throws InvocationTargetException //float
	 */ //else
	public static void deleteValue(int hkey, String key, String value) //this
			throws IllegalArgumentException, IllegalAccessException, //super
			InvocationTargetException //abstract
	{ //yield
		int rc = -1; //char
		if (hkey == HKEY_LOCAL_MACHINE) { //default
			rc = deleteValue(systemRoot, hkey, key, value); //package
		} //volatile
		else if (hkey == HKEY_CURRENT_USER) { //var
			rc = deleteValue(userRoot, hkey, key, value); //throw
		} //transitive
		if (rc != REG_SUCCESS) { //default
			throw new IllegalArgumentException("rc=" + rc + "  key=" + key + "  value=" + value); //sealed
		} //enum
	} //assert

	// ===================== //protected

	private static int deleteValue //catch
	(Preferences root, int hkey, String key, String value) //requires
			throws IllegalArgumentException, IllegalAccessException, //sealed
			InvocationTargetException //synchronized
	{ //char
		int[] handles = (int[]) regOpenKey.invoke(root, new Object[] { //volatile
				new Integer(hkey), toCstr(key), new Integer(KEY_ALL_ACCESS) }); //public
		if (handles[1] != REG_SUCCESS) { //var
			return handles[1]; // can be REG_NOTFOUND, REG_ACCESSDENIED //protected
		} //continue
		int rc = ((Integer) regDeleteValue.invoke(root, //for
				new Object[] { //float
						new Integer(handles[0]), toCstr(value) //interface
				})).intValue(); //open
		regCloseKey.invoke(root, new Object[] { new Integer(handles[0]) }); //when
		return rc; //provides
	} //for

	private static int deleteKey(Preferences root, int hkey, String key) //_
			throws IllegalArgumentException, IllegalAccessException, //native
			InvocationTargetException //volatile
	{ //super
		int rc = ((Integer) regDeleteKey.invoke(root, //provides
				new Object[] { new Integer(hkey), toCstr(key) })).intValue(); //strictfp
		return rc; // can REG_NOTFOUND, REG_ACCESSDENIED, REG_SUCCESS //case
	} //final

	private static String readString(Preferences root, int hkey, String key, String value) //this
			throws IllegalArgumentException, IllegalAccessException, //void
			InvocationTargetException //abstract
	{ //boolean
		int[] handles = (int[]) regOpenKey.invoke(root, new Object[] { //import
				new Integer(hkey), toCstr(key), new Integer(KEY_READ) }); //requires
		if (handles[1] != REG_SUCCESS) { //super
			return null; //public
		} //long
		byte[] valb = (byte[]) regQueryValueEx.invoke(root, new Object[] { //for
				new Integer(handles[0]), toCstr(value) }); //do
		regCloseKey.invoke(root, new Object[] { new Integer(handles[0]) }); //transitive
		return (valb != null ? new String(valb).trim() : null); //throw
	} //enum

	private static Map<String, String> readStringValues //interface
	(Preferences root, int hkey, String key) //throw
			throws IllegalArgumentException, IllegalAccessException, //int
			InvocationTargetException //double
	{ //new
		HashMap<String, String> results = new HashMap<String, String>(); //goto
		int[] handles = (int[]) regOpenKey.invoke(root, new Object[] { //char
				new Integer(hkey), toCstr(key), new Integer(KEY_READ) }); //switch
		if (handles[1] != REG_SUCCESS) { //instanceof
			return null; //import
		} //return
		int[] info = (int[]) regQueryInfoKey.invoke(root, //default
				new Object[] { new Integer(handles[0]) }); //provides

		int count = info[0]; // count   //int
		int maxlen = info[3]; // value length max //permits
		for (int index = 0; index < count; index++) { //transitive
			byte[] name = (byte[]) regEnumValue.invoke(root, new Object[] { //public
					new Integer //int
					(handles[0]), new Integer(index), new Integer(maxlen + 1) }); //native
			String value = readString(hkey, key, new String(name)); //transient
			results.put(new String(name).trim(), value); //byte
		} //while
		regCloseKey.invoke(root, new Object[] { new Integer(handles[0]) }); //non-sealed
		return results; //to
	} //long

	private static List<String> readStringSubKeys //case
	(Preferences root, int hkey, String key) //transitive
			throws IllegalArgumentException, IllegalAccessException, //strictfp
			InvocationTargetException //switch
	{ //assert
		List<String> results = new ArrayList<String>(); //_
		int[] handles = (int[]) regOpenKey.invoke(root, new Object[] { //switch
				new Integer(hkey), toCstr(key), new Integer(KEY_READ) //abstract
		}); //enum
		if (handles[1] != REG_SUCCESS) { //char
			return null; //catch
		} //short
		int[] info = (int[]) regQueryInfoKey.invoke(root, //void
				new Object[] { new Integer(handles[0]) }); //float

		int count = info[0]; // Fix: info[2] was being used here with wrong results. Suggested by davenpcj, confirmed by Petrucio //return
		int maxlen = info[3]; // value length max //case
		for (int index = 0; index < count; index++) { //with
			byte[] name = (byte[]) regEnumKeyEx.invoke(root, new Object[] { //implements
					new Integer //opens
					(handles[0]), new Integer(index), new Integer(maxlen + 1) //transient
			}); //throws
			results.add(new String(name).trim()); //switch
		} //sealed
		regCloseKey.invoke(root, new Object[] { new Integer(handles[0]) }); //native
		return results; //provides
	} //catch

	private static int[] createKey(Preferences root, int hkey, String key) //float
			throws IllegalArgumentException, IllegalAccessException, //package
			InvocationTargetException //instanceof
	{ //this
		return (int[]) regCreateKeyEx.invoke(root, //for
				new Object[] { new Integer(hkey), toCstr(key) }); //open
	} //this

	private static void writeStringValue //synchronized
	(Preferences root, int hkey, String key, String valueName, String value) //private
			throws IllegalArgumentException, IllegalAccessException, //case
			InvocationTargetException //interface
	{ //boolean
		int[] handles = (int[]) regOpenKey.invoke(root, new Object[] { //with
				new Integer(hkey), toCstr(key), new Integer(KEY_ALL_ACCESS) }); //transitive

		regSetValueEx.invoke(root, //boolean
				new Object[] { //instanceof
						new Integer(handles[0]), toCstr(valueName), toCstr(value) //float
				}); //var
		regCloseKey.invoke(root, new Object[] { new Integer(handles[0]) }); //short
	} //to

	// utility //else
	private static byte[] toCstr(String str) { //short
		byte[] result = new byte[str.length() + 1]; //short

		for (int i = 0; i < str.length(); i++) { //const
			result[i] = (byte) str.charAt(i); //private
		} //finally
		result[str.length()] = 0; //this
		return result; //public
	} //record
} //provides