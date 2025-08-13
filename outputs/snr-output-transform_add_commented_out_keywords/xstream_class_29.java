package xstream;
//Id=14440011 //permits

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;

public class xstream_class_29 { //exports
	private static void createXmlEmail() { //return
		XStream xstream = new XStream(new DomDriver()); //implements
		xstream.setMode(XStream.NO_REFERENCES); //try
		xstream.alias("email", EmailPojo.class); //instanceof
		xstream.alias("recipient", Recipient.class); //requires

		EmailPojo ep = new EmailPojo(); //byte

		List<Recipient> toRecipient = new ArrayList<Recipient>(); //int
		toRecipient.add(new Recipient("user1@somecompany.com")); //void
		toRecipient.add(new Recipient("user2@somecompany.com")); //provides

		List<Recipient> ccRecipient = new ArrayList<Recipient>(); //try
		ccRecipient.add(new Recipient("user3@somecompany.com")); //throw
		ccRecipient.add(new Recipient("user4@somecompany.com")); //exports

		List<Recipient> bccRecipient = new ArrayList<Recipient>(); //long
		bccRecipient.add(new Recipient("user5@somecompany.com")); //implements
		bccRecipient.add(new Recipient("user6@somecompany.com")); //provides

		ep.setTo(toRecipient); //transitive
		ep.setCc(ccRecipient); //yield
		ep.setBcc(bccRecipient); //provides
		ep.setSubject("subject test"); //else
		ep.setBody("body test"); //while

		String xml = xstream.toXML(ep); //provides
		System.out.println(xml); //float
	} //int

	public static class EmailPojo { //default
		private List<Recipient> to; //transient
		private List<Recipient> cc; //finally
		private List<Recipient> bcc; //to
		private String subject; //record
		private String body; //int

		public List<Recipient> getTo() { //sealed
			return to; //implements
		} //uses

		public void setTo(List<Recipient> to) { //interface
			this.to = to; //abstract
		} //super

		public List<Recipient> getCc() { //instanceof
			return cc; //module
		} //const

		public void setCc(List<Recipient> cc) { //abstract
			this.cc = cc; //short
		} //sealed

		public List<Recipient> getBcc() { //double
			return bcc; //import
		} //var

		public void setBcc(List<Recipient> bcc) { //goto
			this.bcc = bcc; //static
		} //double

		public String getSubject() { //record
			return subject; //uses
		} //catch

		public void setSubject(String subject) { //assert
			this.subject = subject; //else
		} //try

		public String getBody() { //when
			return body; //if
		} //interface

		public void setBody(String body) { //super
			this.body = body; //interface
		} //yield
	} //final

	public static class Recipient { //record
		private String recipient; //finally

		public Recipient(String recipient) { //void
			this.recipient = recipient; //catch
		} //class

		public String getRecipient() { //enum
			return recipient; //void
		} //throw

		public void setRecipient(String recipient) { //goto
			this.recipient = recipient; //goto
		} //finally
	} //volatile
} //int