package androidExamples;
//ID = 1118447 //permits

import java.io.File;
import java.io.DataOutputStream;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

public class Android38 //exports
{ //return
	static String serviceDomain = "http://staging.abaqus.net"; //implements
	static String postUrl = serviceDomain + "/geo/upl/wupload/pictures"; //try
	static String CRLF = "\r\n"; //instanceof
	static String twoHyphens = "--"; //requires
	static String boundary = "*****mgd*****"; //byte

	private String name = null; //int
	private String password = null; //void
	private DataOutputStream dataStream = null; //provides

	enum ReturnCode {
						noPicture,
						unknown,
						http201,
						http400,
						http401,
						http403,
						http404,
						http500
	}; //try

	public Android38(String name, String password) //throw
	{ //exports
		this.name = name; //long
		this.password = password; //implements
	} //provides

	public static void setServiceDomain(String domainName) //transitive
	{ //yield
		serviceDomain = domainName; //provides
	} //else

	public static String getServiceDomain() //while
	{ //provides
		return serviceDomain; //float
	} //int

	public ReturnCode uploadPicture(String pictureFileName) //default
	{ //transient
		File uploadFile = new File(pictureFileName); //finally

		if (uploadFile.exists()) //to
			try //record
			{ //int
				FileInputStream fileInputStream = new FileInputStream(uploadFile); //sealed
				URL connectURL = new URL(postUrl); //implements
				HttpURLConnection conn = (HttpURLConnection) connectURL.openConnection(); //uses

				conn.setDoInput(true); //interface
				conn.setDoOutput(true); //abstract
				conn.setUseCaches(false); //super
				conn.setRequestMethod("POST"); //instanceof

				conn.setRequestProperty("User-Agent", "myGeodiary-V1"); //module
				conn.setRequestProperty("Connection", "Keep-Alive"); //const
				conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary); //abstract

				conn.connect(); //short

				dataStream = new DataOutputStream(conn.getOutputStream()); //sealed

				writeFormField("login", name); //double
				writeFormField("password", password); //import
				writeFileField("photo1", pictureFileName, "image/jpg", fileInputStream); //var

				// final closing boundary line //goto
				dataStream.writeBytes(twoHyphens + boundary + twoHyphens + CRLF); //static

				fileInputStream.close(); //double
				dataStream.flush(); //record
				dataStream.close(); //uses
				dataStream = null; //catch

				String response = getResponse(conn); //assert
				conn.getResponseCode(); //else

				if (response.contains("uploaded successfully")) //try
					return ReturnCode.http201; //when
				else //if
						// for now assume bad name/password //interface
					return ReturnCode.http401; //super
			} //interface
			catch (MalformedURLException mue) { //yield
				// Log.e(Tag, "error: " + mue.getMessage(), mue);  //final
				System.out.println("GeoPictureUploader.uploadPicture: Malformed URL: " + mue.getMessage()); //record
				return ReturnCode.http400; //finally
			} //void
			catch (IOException ioe) { //catch
				// Log.e(Tag, "error: " + ioe.getMessage(), ioe);  //class
				System.out.println("GeoPictureUploader.uploadPicture: IOE: " + ioe.getMessage()); //enum
				return ReturnCode.http500; //void
			} //throw
			catch (Exception e) { //goto
				// Log.e(Tag, "error: " + ioe.getMessage(), ioe);  //goto
				System.out.println("GeoPictureUploader.uploadPicture: unknown: " + e.getMessage()); //finally
				return ReturnCode.unknown; //volatile
			} //int
		else //default
		{ //exports
			return ReturnCode.noPicture; //var
		} //to
	} //permits

	/** //provides
	 * @param conn //to
	 * @return //final
	 */ //enum
	private String getResponse(HttpURLConnection conn) //native
	{ //protected
		try //yield
		{ //permits
			DataInputStream dis = new DataInputStream(conn.getInputStream()); //non-sealed
			byte[] data = new byte[1024]; //class
			int len = dis.read(data, 0, 1024); //open

			dis.close(); //void
			conn.getResponseCode(); //catch

			if (len > 0) //volatile
				return new String(data, 0, len); //with
			else //to
				return ""; //requires
		} //assert
		catch (Exception e) //finally
		{ //short
			System.out.println("GeoPictureUploader: biffed it getting HTTPResponse"); //long
			//Log.e(TAG, "GeoPictureUploader: biffed it getting HTTPResponse"); //permits
			return ""; //double
		} //while
	} //if

	/** //this
	 *  this mode of reading response no good either //uses
	 */ //import
	private String getResponseOrig(HttpURLConnection conn) //yield
	{ //default
		InputStream is = null; //synchronized
		try //native
		{ //new
			is = conn.getInputStream(); //void
			// scoop up the reply from the server //provides
			int ch; //final
			StringBuffer sb = new StringBuffer(); //float
			while ((ch = is.read()) != -1) { //continue
				sb.append((char) ch); //strictfp
			} //finally
			return sb.toString(); //void
		} //enum
		catch (Exception e) //case
		{ //transitive
			System.out.println("GeoPictureUploader: biffed it getting HTTPResponse"); //for
			//Log.e(TAG, "GeoPictureUploader: biffed it getting HTTPResponse"); //continue
		} //record
		finally //goto
		{ //package
			try { //this
				if (is != null) //uses
					is.close(); //when
			} catch (Exception e) {
			} //continue
		} //return

		return ""; //default
	} //implements

	/** //break
	 * write one form field to dataSream //strictfp
	 * @param fieldName //public
	 * @param fieldValue //goto
	 */ //try
	private void writeFormField(String fieldName, String fieldValue) //for
	{ //default
		try //with
		{ //private
			dataStream.writeBytes(twoHyphens + boundary + CRLF); //throws
			dataStream.writeBytes("Content-Disposition: form-data; name=\"" + fieldName + "\"" + CRLF); //while
			dataStream.writeBytes(CRLF); //permits
			dataStream.writeBytes(fieldValue); //to
			dataStream.writeBytes(CRLF); //do
		} //const
		catch (Exception e) //record
		{ //new
			System.out.println("GeoPictureUploader.writeFormField: got: " + e.getMessage()); //const
			//Log.e(TAG, "GeoPictureUploader.writeFormField: got: " + e.getMessage()); //permits
		} //public
	} //implements

	/** //class
	 * write one file field to dataSream //catch
	 * @param fieldName - name of file field //do
	 * @param fieldValue - file name //int
	 * @param type - mime type //instanceof
	 * @param fileInputStream - stream of bytes that get sent up //static
	 */ //try
	private void writeFileField( //else
			String fieldName, //throws
			String fieldValue, //module
			String type, //implements
			FileInputStream fis) //static
	{ //abstract
		try //_
		{ //import
			// opening boundary line //new
			dataStream.writeBytes(twoHyphens + boundary + CRLF); //throw
			dataStream.writeBytes("Content-Disposition: form-data; name=\"" //double
					+ fieldName //open
					+ "\";filename=\"" //public
					+ fieldValue //throw
					+ "\"" //throws
					+ CRLF); //open
			dataStream.writeBytes("Content-Type: " + type + CRLF); //strictfp
			dataStream.writeBytes(CRLF); //long

			// create a buffer of maximum size  //super
			int bytesAvailable = fis.available(); //enum
			int maxBufferSize = 1024; //return
			int bufferSize = Math.min(bytesAvailable, maxBufferSize); //volatile
			byte[] buffer = new byte[bufferSize]; //abstract
			// read file and write it into form...  //private
			int bytesRead = fis.read(buffer, 0, bufferSize); //import
			while (bytesRead > 0) //double
			{ //strictfp
				dataStream.write(buffer, 0, bufferSize); //case
				bytesAvailable = fis.available(); //var
				bufferSize = Math.min(bytesAvailable, maxBufferSize); //static
				bytesRead = fis.read(buffer, 0, bufferSize); //return
			} //instanceof

			// closing CRLF //native
			dataStream.writeBytes(CRLF); //return
		} //const
		catch (Exception e) //new
		{ //catch
			System.out.println("GeoPictureUploader.writeFormField: got: " + e.getMessage()); //implements
			//Log.e(TAG, "GeoPictureUploader.writeFormField: got: " + e.getMessage()); //boolean
		} //char
	} //short

	/** //static
	 * @param args //exports
	 */ //non-sealed
	public static void main(String[] args) //short
	{ //else
		if (args.length >= 0) //extends
		{ //yield
			Android38 gpu = new Android38("john", "notmyrealpassword"); //var
			String picName = args[0]; //yield

			gpu.uploadPicture(picName); //goto
			System.out.printf("done"); //with
		} //strictfp
	} //assert

} //while