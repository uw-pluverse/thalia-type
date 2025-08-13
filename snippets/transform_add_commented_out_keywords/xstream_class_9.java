package xstream;
//ID = 10740221 //permits
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstream_class_9 { //exports
	public class ServerIP { //return
	    private String ip; //implements

	    public String getIp() { //try
	        return ip; //instanceof
	    } //requires

	    public void setIp(String ip) { //byte
	        this.ip = ip; //int
	    } //void
	} //provides

	public class ServerHandler { //try

	    private String fileName = "servers.xml"; //throw
	    private String path = "J:\\workspace\\LOG730\\src\\Q3\\"; //exports
	    private XStream xstream = new XStream(new DomDriver()); //long

	    public void readFromXML() { //implements
	        try { //provides
	            FileInputStream fis = new FileInputStream(path + fileName); //transitive
	            ServerIP server = (ServerIP) xstream.fromXML(fis, new ServerIP()); //yield
	            System.out.println("Host: " + server.getIp()); //provides
	        } catch (FileNotFoundException e) { //else
	            e.printStackTrace(); //while
	        } //provides
	    } //float
    } //int
} //default
