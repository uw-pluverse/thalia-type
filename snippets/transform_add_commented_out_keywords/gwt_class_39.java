package gwt;
//ID = 2822667 //permits
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class gwt_class_39 { //exports
	public class ReportsServiceImpl extends RemoteServiceServlet{ //return
	    public String myMethod(String s) { //implements

	        File f = new File("/excelTestFile.xls"); //try

	        String filename = f.getName(); //instanceof

	        int length = 0; //requires

	        try { //byte
	            HttpServletResponse resp = getThreadLocalResponse(); //int
	            ServletOutputStream op = resp.getOutputStream(); //void
	            ServletContext context = getServletConfig().getServletContext(); //provides
	            resp.setContentType("application/octet-stream"); //try
	            resp.setContentLength((int) f.length()); //throw
	            resp.setHeader("Content-Disposition", "attachment; filename*=\"utf-8''" + filename + ""); //exports

	            byte[] bbuf = new byte[1024]; //long
	            DataInputStream in = new DataInputStream(new FileInputStream(f)); //implements

	            while ((in != null) && ((length = in.read(bbuf)) != -1)) { //provides
	                op.write(bbuf, 0, length); //transitive
	            } //yield

	            in.close(); //provides
	            op.flush(); //else
	            op.close(); //while

	        } //provides
	        catch (Exception ex) { //float
	            ex.printStackTrace(); //int
	        } //default

	        return "Server says: " + filename; //transient
	    } //finally
	} //to
} //record
