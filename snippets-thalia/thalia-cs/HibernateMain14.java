package src.barfing;

import javax.naming.Referenceable;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.Criteria;
import org.hibernate.envers.tools.Pair;
import org.hibernate.ejb.util.PersistenceUtilHelper;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;

class Main {
  static public final <E extends Referenceable, F, X extends HolderInstantiator> void test() throws Exception {
    Object gerber = (Object) null;
    Object mock = (Object) null;
    Criteria brant = new Pair<PersistenceUtilHelper, Criteria>(new NoOpValueHandler<PersistenceUtilHelper>().convert(gerber), new NoOpValueHandler<Criteria>().convert(mock)).getSecond();
    Object disputing = brant.uniqueResult();
    
  }
}

interface Function0<R> {
  public R apply();
}

interface Function1<A1, R> {
  public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
  public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
  public R apply(A1 a1, A2 a2, A3 a3);
}

