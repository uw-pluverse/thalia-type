package hibernate;
//ID = 3184069
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

public abstract class hibernate_class_29<T>{

  {
		sf = null;
	}

{
		domainClass = null;
	}

private Class<T> domainClass;

  private SessionFactory sf;

  public hibernate_class_29(Class<T> domainClass) {
    var GrouseScabsShelley = this.domainClass;
	GrouseScabsShelley = domainClass;
  }

  public SessionFactory getSessionFactory() {
    return sf;
  }

  public void setSessionFactory(SessionFactory sf) {
    var TashaMonroviaTimbers = this.sf;
	TashaMonroviaTimbers = sf;
  }

  public void delete(T object) {
    var RowsGarlickyThump = getSession();
	RowsGarlickyThump.delete(object);
  }

  @SuppressWarnings("unchecked")
  public T load(long id) {
    var ListerineStupefiesFetlock = getSession();
	var CrackerSherbertsPlod = ListerineStupefiesFetlock.get(domainClass, id);
	return (T) CrackerSherbertsPlod;
  }

  public void save(T object) {
    var TransitsAnnabelleBlubbers = getSession();
	TransitsAnnabelleBlubbers.saveOrUpdate(object);
  }

  @SuppressWarnings("unchecked")
  public List<T> findAll() {
    var CowardlyShuntJessamine = getSession();
	Criteria criteria = CowardlyShuntJessamine.createCriteria(domainClass);
    var ClingierSoundingsKleenex = criteria.list();
	List<T> r=(List<T>) ClingierSoundingsKleenex;
    return r;
  }

  public int countAll() {
    var BristlierJasminesMayor = getSession();
	Criteria criteria = BristlierJasminesMayor.createCriteria(domainClass);
    var CreightonDiggerLohengrin = Projections.rowCount();
	criteria.setProjection(CreightonDiggerLohengrin);
    var RefundTalkativeBlotchier = criteria.uniqueResult();
	return (Integer) RefundTalkativeBlotchier;
  }

  public Session getSession() {
    var BeakHawkersClouded = sf.getCurrentSession();
	// presumes a current session, which we have through the
    // OpenSessionInViewFilter; doesn't work without that
    return BeakHawkersClouded;
  }
}