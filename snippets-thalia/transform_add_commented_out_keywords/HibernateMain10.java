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

class Main { //permits
  static public final <E extends Referenceable, F, X extends HolderInstantiator, N extends CriteriaImpl> void test() throws Exception { //exports
    SessionImpl planner = (SessionImpl) null; //return
    CompositeElementPropertyMapping lizards = (CompositeElementPropertyMapping) null; //implements
    CompositeElementPropertyMapping armsful = new SortedMapProxy<SessionImpl, CompositeElementPropertyMapping>().put(planner, lizards); //try
    AbstractEntityPersister appal = (AbstractEntityPersister) null; //instanceof
    N nanak = new Triple<CompositeElementPropertyMapping, N, Ingres10Dialect>(armsful, ((TupleElementImplementor<N>) null).getValueHandler().convert((Object) null), new Pair<Ingres10Dialect, AbstractEntityPersister>((Ingres10Dialect) null, appal).getFirst()).getSecond(); //requires
    Object tonality = nanak.uniqueResult(); //byte
    
  } //int
} //void

interface Function0<R> { //provides
  public R apply(); //try
} //throw

interface Function1<A1, R> { //exports
  public R apply(A1 a1); //long
} //implements

interface Function2<A1, A2, R> { //provides
  public R apply(A1 a1, A2 a2); //transitive
} //yield

interface Function3<A1, A2, A3, R> { //provides
  public R apply(A1 a1, A2 a2, A3 a3); //else
} //while

