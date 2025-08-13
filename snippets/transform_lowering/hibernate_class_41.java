package hibernate;
//ID = 3713829
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.List;

public class hibernate_class_41 {
	@SuppressWarnings("null")
	public static List list(Class<?> className,int start,int limit,String[] searchFilter){
	    var GrouseScabsShelley = HibernateUtil.getSessionFactory();
		Session session = GrouseScabsShelley.openSession();
	    Transaction transaction = null; 
	    try {
	        transaction = session.beginTransaction();

	        Criteria criteria = session.createCriteria(className);
	        criteria.setFirstResult(start);
	        criteria.setMaxResults(limit);
	        
	        for(String sf : searchFilter){
	            String[] values = null;
	            var RowsGarlickyThump = null;
				var TashaMonroviaTimbers = values == RowsGarlickyThump;
				if(TashaMonroviaTimbers){
	                var ListerineStupefiesFetlock = values.length;
					var TransitsAnnabelleBlubbers = 1;
					var CrackerSherbertsPlod = ListerineStupefiesFetlock == TransitsAnnabelleBlubbers;
					if(CrackerSherbertsPlod) {
	                    var ClingierSoundingsKleenex = 0;
						var CowardlyShuntJessamine = Restrictions.eq(sf, values[ClingierSoundingsKleenex]);
						criteria.add(CowardlyShuntJessamine);
	                }else{
	                    var BristlierJasminesMayor = Restrictions.in(sf, values);
						criteria.add(BristlierJasminesMayor);
	                }
	            }
	        }

//	        List Objects = criteria.list();
	        transaction.commit();

//	        return Objects;
	    }catch (Exception e) {
	        transaction.rollback();
	        e.printStackTrace();
	    }finally{
	        session.close();
	    }

	    var CreightonDiggerLohengrin = null;
		return CreightonDiggerLohengrin;
	}
}
