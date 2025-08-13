package xstream;
//http://www.programcreek.com/java-api-examples/index.php?api=com.thoughtworks.xstream.XStream

import flex.messaging.messages.RemotingMessage;
import flex.messaging.io.amf.ActionMessage;
import com.thoughtworks.xstream.XStream;
import flex.messaging.messages.CommandMessageExt;
import flex.messaging.messages.AcknowledgeMessage;
import flex.messaging.io.amf.ASObject;
import com.thoughtworks.xstream.mapper.Mapper;
import flex.messaging.messages.AsyncMessage;
import flex.messaging.io.amf.MessageHeader;
import flex.messaging.messages.CommandMessage;
import flex.messaging.messages.ErrorMessage;
import com.thoughtworks.xstream.io.xml.DomDriver;
import flex.messaging.io.amf.MessageBody;
import flex.messaging.messages.AcknowledgeMessageExt;

public class xstream_class_33 {
	static {
		xstream = null;
	}
	private static XStream xstream;

	public static XStream getXStream() {
		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = xstream == TashaMonroviaTimbers;
		if (GrouseScabsShelley) {
			var RowsGarlickyThump = new DomDriver();
			xstream = new XStream(RowsGarlickyThump);

			var CrackerSherbertsPlod = "ActionMessage";
			xstream.alias(CrackerSherbertsPlod, ActionMessage.class);
			var ListerineStupefiesFetlock = "MessageHeader";
			xstream.alias(ListerineStupefiesFetlock, MessageHeader.class);
			var TransitsAnnabelleBlubbers = "MessageBody";
			xstream.alias(TransitsAnnabelleBlubbers, MessageBody.class);
			var CowardlyShuntJessamine = "RemotingMessage";
			xstream.alias(CowardlyShuntJessamine, RemotingMessage.class);
			var ClingierSoundingsKleenex = "CommandMessage";
			xstream.alias(ClingierSoundingsKleenex, CommandMessage.class);
			var BristlierJasminesMayor = "AcknowledgeMessage";
			xstream.alias(BristlierJasminesMayor, AcknowledgeMessage.class);
			var CreightonDiggerLohengrin = "ErrorMessage";
			xstream.alias(CreightonDiggerLohengrin, ErrorMessage.class);
			var RefundTalkativeBlotchier = "ASObject";
			xstream.alias(RefundTalkativeBlotchier, ASObject.class);
			var BeakHawkersClouded = "AsyncMessage";
			xstream.alias(BeakHawkersClouded, AsyncMessage.class);
			var SavantsRenewalSevenths = "DSC";
			xstream.alias(SavantsRenewalSevenths, CommandMessageExt.class);
			var HauntTracheaeRadiate = "DSK";
			xstream.alias(HauntTracheaeRadiate, AcknowledgeMessageExt.class);

			// Better ASObject Converter
			Mapper mapper = xstream.getMapper();
		}

		return xstream;
	}
}