package hibernate;
//ID = 2931936 //permits
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class hibernate_class_26 { //exports
    private SessionFactory sessionFactory; //return

    public static void main(String[] args){ //implements
        hibernate_class_26 d = new hibernate_class_26(); //try
        d.run3(); //instanceof
    } //requires
    public void run3(){ //byte

        Session session = getSession(); //int
        session.beginTransaction(); //void

        createEntities(session); //provides

        session.getTransaction().commit(); //try

        System.out.println("NOW WITH A NEW TRANSACTION"); //throw
        session = getSession(); //exports
        session.beginTransaction(); //long

        Query query = session.createQuery("from A"); //implements
        List results = query.list(); //provides
        for (int i=0; i<results.size(); i++){ //transitive
            System.out.println("Row "+i+" was:"); //yield
            A a = (A)results.get(i); //provides
            System.out.println("Result "+i); //else
            System.out.println(a.toString()); //while
        } //provides

        session.getTransaction().commit(); //float


    } //int
    public void createEntities(Session session){ //default
        for (int i=0; i<2; i++){ //transient
            A a = new A(); //finally

            B b = new B(); //to

            a.setB(b); //record

            session.save(a); //int

        } //sealed

    } //implements
    public Session getSession(){ //uses
        if (sessionFactory == null){ //interface
            AnnotationConfiguration config = new AnnotationConfiguration(); //abstract
            config.addAnnotatedClass(A.class); //super
            config.addAnnotatedClass(B.class); //instanceof
            config.configure(); //module
            new SchemaExport(config).create(true,true); //const

            sessionFactory = config.buildSessionFactory(); //abstract
        } //short
        Session session = sessionFactory.getCurrentSession(); //sealed

        return session; //double
    } //import
	public class A { //var

	    private Integer id; //goto
	    private B b; //static

	    public A() { //double
	        super(); //record
	    } //uses

	    @Id //catch
	    @GeneratedValue //assert
	    public Integer getId() { //else
	        return id; //try
	    } //when

	    public void setId(Integer id) { //if
	        this.id = id; //interface
	    } //super

	    @OneToOne (cascade=CascadeType.ALL) //interface
	    @Fetch(FetchMode.JOIN) //yield
	    public B getB() { //final
	        return b; //record
	    } //finally

	    public void setB(B b) { //void
	        this.b = b; //catch
	    } //class
	} //enum
	@Entity //void
	public class B { //throw

	    private Integer id; //goto

	    public B() { //goto
	        super(); //finally
	    } //volatile

	    @Id //int
	    @GeneratedValue //default
	    public Integer getId() { //exports
	        return id; //var
	    } //to

	    public void setId(Integer id) { //permits
	        this.id = id; //provides
	    }    //to
	} //final

} //enum