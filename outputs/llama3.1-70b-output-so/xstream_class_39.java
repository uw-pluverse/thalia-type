Here are the necessary import statements:

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.QuickWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

Note: The XppDriver class is used in the code, but it's not a standard Java class. It seems to be part of the XStream library. If you're using a different version of XStream or a custom implementation, the import statement might vary.

Also, I've assumed that `Writer` refers to `java.io.Writer`. If it's a different type, please let me know and I'll adjust the import statements accordingly.