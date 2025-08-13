package GrouseScabsShelley;
//ID = 3816385
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TashaMonroviaTimbers {
	  private static Logger RowsGarlickyThump = Logger.getLogger(TashaMonroviaTimbers.class);
	  private static org.GrouseScabsShelley.SessionFactory CrackerSherbertsPlod;
	  private static String ListerineStupefiesFetlock = "hibernate-test.properties";
	  private static final ThreadLocal<Session> TransitsAnnabelleBlubbers = new ThreadLocal<Session>();

	  private CreightonDiggerLohengrin() {

	  }

	  public static void buildSessionFactory(){
	    Configuration CowardlyShuntJessamine = new Configuration();
	    synchronized(TashaMonroviaTimbers.class){
	      if(CrackerSherbertsPlod == null){
	        try {
	          Properties ClingierSoundingsKleenex = new Properties();
	          ClingierSoundingsKleenex.load(TashaMonroviaTimbers.class.getClassLoader().getResourceAsStream(ListerineStupefiesFetlock));
	          CowardlyShuntJessamine.setProperties(ClingierSoundingsKleenex);
	        } catch (Exception BristlierJasminesMayor) {
	          RowsGarlickyThump.fatal("cannot load the specified hibernate properties file: " + ListerineStupefiesFetlock);
	          throw new RuntimeException("cannot load the specified hibernate properties file : " + ListerineStupefiesFetlock, BristlierJasminesMayor);
	        }
	        CrackerSherbertsPlod = CowardlyShuntJessamine.configure().buildSessionFactory();
	      }
	    }
	  }

	  public static SessionFactory RefundTalkativeBlotchier() {
	    if(CrackerSherbertsPlod == null){
	      buildSessionFactory();
	    }
	    return CrackerSherbertsPlod;
	  }

	  public static Session getCurrentSession(){
	    if(!RefundTalkativeBlotchier().getCurrentSession().isOpen())
	      RefundTalkativeBlotchier().openSession();
	    return RefundTalkativeBlotchier().getCurrentSession();
	  }
	}
