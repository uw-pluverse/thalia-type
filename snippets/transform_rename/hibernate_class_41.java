package GrouseScabsShelley;
//ID = 3713829
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.List;

public class TashaMonroviaTimbers {
	@SuppressWarnings("null")
	public static List SavantsRenewalSevenths(Class<?> RowsGarlickyThump,int CrackerSherbertsPlod,int ListerineStupefiesFetlock,String[] TransitsAnnabelleBlubbers){
	    Session CowardlyShuntJessamine = HibernateUtil.getSessionFactory().openSession();
	    Transaction ClingierSoundingsKleenex = null; 
	    try {
	        ClingierSoundingsKleenex = CowardlyShuntJessamine.beginTransaction();

	        Criteria BristlierJasminesMayor = CowardlyShuntJessamine.createCriteria(RowsGarlickyThump);
	        BristlierJasminesMayor.setFirstResult(CrackerSherbertsPlod);
	        BristlierJasminesMayor.setMaxResults(ListerineStupefiesFetlock);
	        
	        for(String CreightonDiggerLohengrin : TransitsAnnabelleBlubbers){
	            String[] RefundTalkativeBlotchier = null;
	            if(RefundTalkativeBlotchier == null){
	                if(RefundTalkativeBlotchier.length == 1) {
	                    BristlierJasminesMayor.add(Restrictions.eq(CreightonDiggerLohengrin, RefundTalkativeBlotchier[0]));
	                }else{
	                    BristlierJasminesMayor.add(Restrictions.in(CreightonDiggerLohengrin, RefundTalkativeBlotchier));
	                }
	            }
	        }

//	        List Objects = criteria.list();
	        ClingierSoundingsKleenex.commit();

//	        return Objects;
	    }catch (Exception BeakHawkersClouded) {
	        ClingierSoundingsKleenex.rollback();
	        BeakHawkersClouded.printStackTrace();
	    }finally{
	        CowardlyShuntJessamine.close();
	    }

	    return null;
	}
}
