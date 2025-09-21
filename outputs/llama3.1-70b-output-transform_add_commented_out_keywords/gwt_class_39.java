Here are the necessary import statements:

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.ServletOutputStream;
import javax.servlet.ServletContext; 
import javax.servlet.ServletConfig; 

Note that `RemoteServiceServlet` is not a standard Java class, it's likely a part of the Google Web Toolkit (GWT) framework. If you're using GWT, you'll need to import it from the correct package:

import com.google.gwt.user.server.rpc.RemoteServiceServlet;