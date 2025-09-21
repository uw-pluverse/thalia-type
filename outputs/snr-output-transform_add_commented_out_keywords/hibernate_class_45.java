package hibernate;
//ID = 4001795 //permits

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_45 //exports
{ //return
	public static void main(String[] args) //implements
	{ //try
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory(); //instanceof
		Session session = factory.openSession(); //requires
		session.beginTransaction(); //byte

		//        Message m1 = new Message("Hibernated a  messages on " + new Date()); //int
		session.save("aa"); //void
		session.getTransaction().commit(); //provides
		session.close(); //try
	} //throw
} //exports