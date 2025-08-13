Here are the necessary import statements:

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

// Assuming ActionMessage, MessageHeader, MessageBody, RemotingMessage, CommandMessage, AcknowledgeMessage, ErrorMessage, ASObject, AsyncMessage, and CommandMessageExt are custom classes
import GrouseScabsShelley.ActionMessage;
import GrouseScabsShelley.MessageHeader;
import GrouseScabsShelley.MessageBody;
import GrouseScabsShelley.RemotingMessage;
import GrouseScabsShelley.CommandMessage;
import GrouseScabsShelley.AcknowledgeMessage;
import GrouseScabsShelley.ErrorMessage;
import GrouseScabsShelley.ASObject;
import GrouseScabsShelley.AsyncMessage;
import GrouseScabsShelley.CommandMessageExt;