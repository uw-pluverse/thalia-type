package GrouseScabsShelley;

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

public class TashaMonroviaTimbers {
	private static XStream GrouseScabsShelley; 
	public static XStream CrackerSherbertsPlod() {
		if (GrouseScabsShelley == null) {
			GrouseScabsShelley = new XStream(new DomDriver());

			GrouseScabsShelley.alias("ActionMessage", ActionMessage.class);
			GrouseScabsShelley.alias("MessageHeader", MessageHeader.class);
			GrouseScabsShelley.alias("MessageBody", MessageBody.class);
			GrouseScabsShelley.alias("RemotingMessage", RemotingMessage.class);
			GrouseScabsShelley.alias("CommandMessage", CommandMessage.class);
			GrouseScabsShelley.alias("AcknowledgeMessage", AcknowledgeMessage.class);
			GrouseScabsShelley.alias("ErrorMessage", ErrorMessage.class);
			GrouseScabsShelley.alias("ASObject", ASObject.class);
			GrouseScabsShelley.alias("AsyncMessage", AsyncMessage.class);
			GrouseScabsShelley.alias("DSC", CommandMessageExt.class);
			GrouseScabsShelley.alias("DSK", AcknowledgeMessageExt.class);

			// Better ASObject Converter
			Mapper RowsGarlickyThump = GrouseScabsShelley.getMapper();
		}

		return GrouseScabsShelley;
	}
}
