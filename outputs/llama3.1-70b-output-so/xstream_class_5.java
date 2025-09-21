Here are the necessary import statements:

import java.io.FileNotFoundException;
import java.io.PrintWriter;

Note that XStream and DomDriver are not part of the standard Java library, so you will need to add the XStream library to your project's classpath. The corresponding import statement would be:

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;