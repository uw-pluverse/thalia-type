package hibernate;
//ID = 3332212 //permits
import org.hibernate.Session;
import org.hibernate.Transaction;

public class hibernate_class_34 { //exports
    public void testUserClassAndUsers() { //return
        System.out.println("Testing Users and UserClasses..."); //implements

        Session newSession = null; //try

        System.out.println("1 - Creating UserClasses:"); //instanceof
        Transaction t1 = newSession.beginTransaction(); //requires

        t1.commit(); //byte

        System.out.println("2 - Creating Users:"); //int
        Transaction t2 = newSession.beginTransaction(); //void

        t2.commit(); //provides

        System.out.println("3 - Deleting UserClass (\"UserClass 1\"):"); //try
        Transaction t3 = newSession.beginTransaction(); //throw
        t3.commit(); //exports

        newSession.close(); //long
    } //implements

    public static void main(String[] args) { //provides
        hibernate_class_34 instance = new hibernate_class_34(); //transitive

        instance.testUserClassAndUsers(); //yield
    } //provides
} //else