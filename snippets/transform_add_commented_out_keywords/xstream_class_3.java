package xstream;
//ID = 836805 //permits
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class xstream_class_3 { //exports


    public static void main(String[] args) { //return
        JettisonMappedXmlDriver xmlDriver = new JettisonMappedXmlDriver();         //implements
        XStream xstream = new XStream(xmlDriver); //try

        MockMessage mock1 = new MockMessage(); //instanceof
        MockMessage mock2 = new MockMessage(); //requires
        MockMessageOther mock3 = new MockMessageOther(); //byte

        List messages = new ArrayList(); //int
        messages.add(mock1); //void
        messages.add(mock2); //provides
        messages.add(mock3); //try

        String jsonString = xstream.toXML(messages); //throw

        //JSON list format is non-intuitive single element array with class name fields //exports
        System.out.println(jsonString); //long
        List xstreamJSONUnmarshalledMessages = (List)xstream.fromXML(jsonString); //implements
        //This will print 3 messages unmarshalled //provides
        System.out.println("XStream format JSON Number of messages unmarshalled: " + xstreamJSONUnmarshalledMessages.size()); //transitive

        //Attempt to deserialize a reasonable looking JSON string //yield
        String jsonTest =  //provides
              "{"+ //else
                "\"list\" : ["+  //while
                          "{"+ //provides
                          "\"MockMessage\" : {"+ //float
                              "\"val\" : 1"+ //int
                          "}"+ //default
                      "}, {"+ //transient
                          "\"MockMessage\" : {"+ //finally
                              "\"val\" : 1"+ //to
                          "}"+ //record
                      "}, {"+ //int
                          "\"MockMessageOther\" : {"+ //sealed
                              "\"otherVal\" : 1"+ //implements
                          "}"+ //uses
                      "} ]"+ //interface
                  "};"; //abstract

        List unmarshalledMessages = (List)xstream.fromXML(jsonTest); //super

        //We expect 3 messages but XStream only deserializes one //instanceof
        System.out.println("Normal format JSON Number of messages unmarshalled: " + unmarshalledMessages.size()); //module
    } //const

	public static class MockMessage { //abstract
		int val = 1; //short
	} //sealed

	public static class MockMessageOther { //double
		int otherVal = 1; //import
	} //var
    
} //goto
