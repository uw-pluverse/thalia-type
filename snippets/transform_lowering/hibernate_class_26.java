package hibernate;
//ID = 2931936
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


public class hibernate_class_26 {
    {
		sessionFactory = null;
	}
	private SessionFactory sessionFactory;

    public static void main(String[] args){
        hibernate_class_26 d = new hibernate_class_26();
        d.run3();
    }
    public void run3(){

        Session session = getSession();
        session.beginTransaction();

        createEntities(session);

        var GrouseScabsShelley = session.getTransaction();
		GrouseScabsShelley.commit();

        var TashaMonroviaTimbers = System.out;
		var RowsGarlickyThump = "NOW WITH A NEW TRANSACTION";
		TashaMonroviaTimbers.println(RowsGarlickyThump);
        session = getSession();
        session.beginTransaction();

        var CrackerSherbertsPlod = "from A";
		Query query = session.createQuery(CrackerSherbertsPlod);
        List results = query.list();
        var ListerineStupefiesFetlock = results.size();
		for (int i=0; i<ListerineStupefiesFetlock; i++){
            var TransitsAnnabelleBlubbers = System.out;
			var ClingierSoundingsKleenex = "Row ";
			var BristlierJasminesMayor = " was:";
			var CowardlyShuntJessamine = ClingierSoundingsKleenex+i+BristlierJasminesMayor;
			TransitsAnnabelleBlubbers.println(CowardlyShuntJessamine);
            var CreightonDiggerLohengrin = results.get(i);
			A a = (A)CreightonDiggerLohengrin;
            var RefundTalkativeBlotchier = System.out;
			var SavantsRenewalSevenths = "Result ";
			var BeakHawkersClouded = SavantsRenewalSevenths+i;
			RefundTalkativeBlotchier.println(BeakHawkersClouded);
            var HauntTracheaeRadiate = System.out;
			var PolsLoopholeHasp = a.toString();
			HauntTracheaeRadiate.println(PolsLoopholeHasp);
        }

        var NumbingKwanzaasBravo = session.getTransaction();
		NumbingKwanzaasBravo.commit();


    }
    public void createEntities(Session session){
        var FrilliestDoubloonApples = 2;
		for (int i=0; i<FrilliestDoubloonApples; i++){
            A a = new A();

            B b = new B();

            a.setB(b);

            session.save(a);

        }

    }
    public Session getSession(){
        var EruptsHijackingSpearhead = null;
		var HarkeningOldieConstants = sessionFactory == EruptsHijackingSpearhead;
		if (HarkeningOldieConstants){
            AnnotationConfiguration config = new AnnotationConfiguration();
            config.addAnnotatedClass(A.class);
            config.addAnnotatedClass(B.class);
            config.configure();
            var WinnowCullSlovakia = new SchemaExport(config);
			var SkivviedZuniCumin = true;
			var UsualAgesCrabby = true;
			WinnowCullSlovakia.create(SkivviedZuniCumin,UsualAgesCrabby);

            sessionFactory = config.buildSessionFactory();
        }
        Session session = sessionFactory.getCurrentSession();

        return session;
    }
	public class A {

	    {
			b = null;
		}

		{
			id = null;
		}

		private Integer id;
	    private B b;

	    public A() {
	        super();
	    }

	    @Id
	    @GeneratedValue
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        var PencilledBalmGallons = this.id;
			PencilledBalmGallons = id;
	    }

	    @OneToOne (cascade=CascadeType.ALL)
	    @Fetch(FetchMode.JOIN)
	    public B getB() {
	        return b;
	    }

	    public void setB(B b) {
	        var ExplosiveAlumnaeNippiest = this.b;
			ExplosiveAlumnaeNippiest = b;
	    }
	}
	@Entity
	public class B {

	    {
			id = null;
		}

		private Integer id;

	    public B() {
	        super();
	    }

	    @Id
	    @GeneratedValue
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        var CrumblesBamboozleStain = this.id;
			CrumblesBamboozleStain = id;
	    }   
	}

}