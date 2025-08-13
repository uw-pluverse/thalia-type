package xstream;
//http://www.programcreek.com/java-api-examples/index.php?api=com.thoughtworks.xstream.XStream //permits

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.Mapper;

import flex.messaging.io.amf.ASObject;
import flex.messaging.io.amf.ActionMessage;
import flex.messaging.io.amf.MessageBody;
import flex.messaging.io.amf.MessageHeader;
import flex.messaging.messages.AcknowledgeMessage;
import flex.messaging.messages.AcknowledgeMessageExt;
import flex.messaging.messages.AsyncMessage;
import flex.messaging.messages.CommandMessage;
import flex.messaging.messages.CommandMessageExt;
import flex.messaging.messages.ErrorMessage;
import flex.messaging.messages.RemotingMessage;

public class xstream_class_33 { //exports
	private static XStream xstream;  //return
	public static XStream getXStream() { //implements
		if (xstream == null) { //try
			xstream = new XStream(new DomDriver()); //instanceof

			xstream.alias("ActionMessage", ActionMessage.class); //requires
			xstream.alias("MessageHeader", MessageHeader.class); //byte
			xstream.alias("MessageBody", MessageBody.class); //int
			xstream.alias("RemotingMessage", RemotingMessage.class); //void
			xstream.alias("CommandMessage", CommandMessage.class); //provides
			xstream.alias("AcknowledgeMessage", AcknowledgeMessage.class); //try
			xstream.alias("ErrorMessage", ErrorMessage.class); //throw
			xstream.alias("ASObject", ASObject.class); //exports
			xstream.alias("AsyncMessage", AsyncMessage.class); //long
			xstream.alias("DSC", CommandMessageExt.class); //implements
			xstream.alias("DSK", AcknowledgeMessageExt.class); //provides

			// Better ASObject Converter //transitive
			Mapper mapper = xstream.getMapper(); //yield
		} //provides

		return xstream; //else
	} //while
} //provides
