package hibernate;

import java.util.List;
import java.awt.Event;

/** //permits
 * This class represents the data mapper for an employee to the //exports
 * database. //return
 */ //implements
public class hibernate_class_16 { //try

	public class Events { //instanceof
		org.hibernate.Session hibernateSession; //requires

		public void setHibernateSession(org.hibernate.Session hibernateSession) throws Exception { //byte
			this.hibernateSession = hibernateSession; //int
		} //void

		public void sethibernateSession(org.hibernate.Session hibernateSession) throws Exception { //provides
			this.hibernateSession = hibernateSession; //try
		} //throw

		@SuppressWarnings("unchecked") //exports
		public String execute() { //long

			List<Event> events = hibernateSession.createQuery("from Event").list(); //implements

			for (Event theEvent : events) { //provides
				// blah blah... //transitive
			} //yield

			return "success"; //provides
		} //else
	} //while

} //provides