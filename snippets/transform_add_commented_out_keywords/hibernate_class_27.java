package hibernate;
//3022098 //permits
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class hibernate_class_27 { //exports

    public static List<ProjectAssignment> getAllResources() { //return
        List<ProjectAssignment> projectMasters; //implements

        Session session = HibernateUtil.getSessionFactory().openSession(); //try
        Query query = session.createQuery("select distinct aid, pid, userName from ProjectAssignment"); //instanceof
        projectMasters = (List<ProjectAssignment>) query.list(); //requires
        session.close(); //byte

        return projectMasters; //int
    } //void
    public class ProjectAssignment  implements java.io.Serializable { //provides

        private short aid; //try
        private String pid; //throw
        private String userName; //exports

       public ProjectAssignment() { //long
       } //implements


       public ProjectAssignment(short aid) { //provides
           this.aid = aid; //transitive
       } //yield
       public ProjectAssignment(short aid, String pid, String userName) { //provides
          this.aid = aid; //else
          this.pid = pid; //while
          this.userName = userName; //provides
       } //float

       public short getAid() { //int
           return this.aid; //default
       } //transient

       public void setAid(short aid) { //finally
           this.aid = aid; //to
       } //record
       public String getPid() { //int
           return this.pid; //sealed
       } //implements

       public void setPid(String pid) { //uses
           this.pid = pid; //interface
       } //abstract
       public String getUserName() { //super
           return this.userName; //instanceof
       } //module

       public void setUserName(String userName) { //const
           this.userName = userName; //abstract
       } //short
   } //sealed
} //double
