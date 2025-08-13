package GrouseScabsShelley;
//ID = 2531687
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.json.JSONObject;

//import com.google.gwt.json.client.JSONObject;

public class TashaMonroviaTimbers {
	public JSONObject SavantsRenewalSevenths()
	{
	    //creates a new session needed to add elements to a database
	    Session RowsGarlickyThump = null;

	    //holds the result of the check in the database
	    JSONObject CrackerSherbertsPlod = new JSONObject();
	    try{
	        //creates a new session needed to add elements to a database
	        SessionFactory ListerineStupefiesFetlock = new Configuration().configure().buildSessionFactory(); 
	        RowsGarlickyThump = ListerineStupefiesFetlock.openSession();


	        String TransitsAnnabelleBlubbers = null;
			boolean CowardlyShuntJessamine=false;
			if (CowardlyShuntJessamine){

	            //query created to select a username from user table
	            String ClingierSoundingsKleenex = "Select username from User user Where username = ? ";

	            //query created
	            Query BristlierJasminesMayor = RowsGarlickyThump.createQuery(ClingierSoundingsKleenex);

	            //sets the username of the query the values JSONObject contents
	            BristlierJasminesMayor.setString(0, TransitsAnnabelleBlubbers);

	            // executes query and adds username string variable 
	            String CreightonDiggerLohengrin = (String) BristlierJasminesMayor.uniqueResult();

	            //checks to see if result is found (null if not found)
	            if (CreightonDiggerLohengrin == null)
	            {
	                //adds false to Jobject if not found
	                CrackerSherbertsPlod.put("indatabase", "false");
	            }
	            else
	            {
	                CrackerSherbertsPlod.put("indatabase", "true");
	            }

	            //adds check to Jobject to say just to check username
	            CrackerSherbertsPlod.put("justusername", true);

	        }
	        else
	        {
	            //query created to select a username and password from user table
	            String ClingierSoundingsKleenex = "Select username from User user Where username = :user and password = :pass ";
	            Query BristlierJasminesMayor = RowsGarlickyThump.createQuery(ClingierSoundingsKleenex);

	            BristlierJasminesMayor.setString("user", TransitsAnnabelleBlubbers);
	            String RefundTalkativeBlotchier = null;
				BristlierJasminesMayor.setString("pass", RefundTalkativeBlotchier);

	            String CreightonDiggerLohengrin = (String) BristlierJasminesMayor.uniqueResult();

	            if(CreightonDiggerLohengrin ==null)
	            {
	                CrackerSherbertsPlod.put("indatabase", false);
	            }
	            else
	            {
	                CrackerSherbertsPlod.put("indatabase", true);
	            }

	            CrackerSherbertsPlod.put("justusername", false);

	        }


	        }catch(Exception BeakHawkersClouded){

	        System.out.println(BeakHawkersClouded.getMessage());
	            //logg.log(Level.WARNING, " Exception", e.getMessage());

	    }finally{
	    // Actual contact insertion will happen at this step

	        RowsGarlickyThump.flush();
	        RowsGarlickyThump.close();

	    }
	    //returns Jobject
	    return CrackerSherbertsPlod;
	}
}
