```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.Mapper;
import flex.messaging.messages.ActionMessage;
import flex.messaging.messages.MessageHeader;
import flex.messaging.messages.MessageBody;
import flex.messaging.messages.RemotingMessage;
import flex.messaging.messages.CommandMessage;
import flex.messaging.messages.AcknowledgeMessage;
import flex.messaging.messages.ErrorMessage;
import flex.messaging.io.amf.ASObject;
import flex.messaging.messages.AsyncMessage;
import flex.messaging.messages.CommandMessageExt;
import flex.messaging.messages.AcknowledgeMessageExt;
```