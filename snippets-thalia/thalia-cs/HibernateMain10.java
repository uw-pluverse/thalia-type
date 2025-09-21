package src.rashest;

import javax.naming.Referenceable;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.impl.CriteriaImpl;
import org.hibernate.impl.SessionImpl;
import org.hibernate.persister.collection.CompositeElementPropertyMapping;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.envers.tools.Triple;
import org.hibernate.dialect.Ingres10Dialect;
import org.hibernate.ejb.criteria.TupleElementImplementor;
import org.hibernate.envers.tools.Pair;

class Main {
  static public final <E extends Referenceable, F, X extends HolderInstantiator, N extends CriteriaImpl> void test() throws Exception {
    SessionImpl planner = (SessionImpl) null;
    CompositeElementPropertyMapping lizards = (CompositeElementPropertyMapping) null;
    CompositeElementPropertyMapping armsful = new SortedMapProxy<SessionImpl, CompositeElementPropertyMapping>().put(planner, lizards);
    AbstractEntityPersister appal = (AbstractEntityPersister) null;
    N nanak = new Triple<CompositeElementPropertyMapping, N, Ingres10Dialect>(armsful, ((TupleElementImplementor<N>) null).getValueHandler().convert((Object) null), new Pair<Ingres10Dialect, AbstractEntityPersister>((Ingres10Dialect) null, appal).getFirst()).getSecond();
    Object tonality = nanak.uniqueResult();
    
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

