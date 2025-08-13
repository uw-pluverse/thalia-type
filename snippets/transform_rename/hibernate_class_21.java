package GrouseScabsShelley;
//ID = 2458774
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TashaMonroviaTimbers {

 public static void ClingierSoundingsKleenex(String[] RowsGarlickyThump) {
  Session CrackerSherbertsPlod = null;
  SessionFactory ListerineStupefiesFetlock = new Configuration().configure().buildSessionFactory();
  CrackerSherbertsPlod = ListerineStupefiesFetlock.openSession();
  Transaction TransitsAnnabelleBlubbers = CrackerSherbertsPlod.getTransaction();

//  BusinessCard card = new BusinessCard();
//  card.setId(1);
//  card.setName("Ozgur");
//  card.setDescription("Ac?klama");

  try{
  TransitsAnnabelleBlubbers.begin();
//  session.save();
  TransitsAnnabelleBlubbers.commit();
  } catch(Exception CowardlyShuntJessamine){
   CowardlyShuntJessamine.printStackTrace();
  }
  finally{
   CrackerSherbertsPlod.close();
  }
 }
}
