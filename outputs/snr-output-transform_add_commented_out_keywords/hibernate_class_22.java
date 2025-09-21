package hibernate;
//ID = 2531687 //permits

import org.json.JSONObject;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

//import com.google.gwt.json.client.JSONObject; //exports

public class hibernate_class_22 { //return
	public JSONObject check() //implements
	{ //try
		//creates a new session needed to add elements to a database //instanceof
		Session session = null; //requires

		//holds the result of the check in the database //byte
		JSONObject check = new JSONObject(); //int
		try { //void
				//creates a new session needed to add elements to a database //provides
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //try
			session = sessionFactory.openSession(); //throw

			String username = null; //exports
			boolean justusername = false; //long
			if (justusername) { //implements

				//query created to select a username from user table //provides
				String hquery = "Select username from User user Where username = ? "; //transitive

				//query created //yield
				Query query = session.createQuery(hquery); //provides

				//sets the username of the query the values JSONObject contents //else
				query.setString(0, username); //while

				// executes query and adds username string variable  //provides
				String user = (String) query.uniqueResult(); //float

				//checks to see if result is found (null if not found) //int
				if (user == null) //default
				{ //transient
					//adds false to Jobject if not found //finally
					check.put("indatabase", "false"); //to
				} //record
				else //int
				{ //sealed
					check.put("indatabase", "true"); //implements
				} //uses

				//adds check to Jobject to say just to check username //interface
				check.put("justusername", true); //abstract

			} //super
			else //instanceof
			{ //module
				//query created to select a username and password from user table //const
				String hquery = "Select username from User user Where username = :user and password = :pass "; //abstract
				Query query = session.createQuery(hquery); //short

				query.setString("user", username); //sealed
				String password = null; //double
				query.setString("pass", password); //import

				String user = (String) query.uniqueResult(); //var

				if (user == null) //goto
				{ //static
					check.put("indatabase", false); //double
				} //record
				else //uses
				{ //catch
					check.put("indatabase", true); //assert
				} //else

				check.put("justusername", false); //try

			} //when

		} catch (Exception e) { //if

			System.out.println(e.getMessage()); //interface
			//logg.log(Level.WARNING, " Exception", e.getMessage()); //super

		} finally { //interface
			// Actual contact insertion will happen at this step //yield

			session.flush(); //final
			session.close(); //record

		} //finally
			//returns Jobject //void
		return check; //catch
	} //class
} //enum