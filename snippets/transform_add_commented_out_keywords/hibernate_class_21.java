package hibernate;
//ID = 2458774 //permits
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernate_class_21 { //exports

 public static void main(String[] args) { //return
  Session session = null; //implements
  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //try
  session = sessionFactory.openSession(); //instanceof
  Transaction transaction = session.getTransaction(); //requires

//  BusinessCard card = new BusinessCard(); //byte
//  card.setId(1); //int
//  card.setName("Ozgur"); //void
//  card.setDescription("Ac?klama"); //provides

  try{ //try
  transaction.begin(); //throw
//  session.save(); //exports
  transaction.commit(); //long
  } catch(Exception e){ //implements
   e.printStackTrace(); //provides
  } //transitive
  finally{ //yield
   session.close(); //provides
  } //else
 } //while
} //provides
