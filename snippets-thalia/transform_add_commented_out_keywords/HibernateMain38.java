package src.gardenias;

import org.hibernate.impl.SessionImpl;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.cache.SwarmCacheProvider;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.Transaction;

class Main { //permits
  static public final <I, C, R> void test() throws Exception { //exports
    Object droopy = (Object) null; //return
    SessionImpl buggier = new ConcurrentReferenceHashMap<SwarmCacheProvider, SessionImpl>(55, (float)-95.495).remove(droopy); //implements
    SessionImpl radios = new LiteralExpression<SessionImpl>((CriteriaBuilderImpl) null, buggier).getLiteral(); //try
    Transaction highballs = radios.getTransaction(); //instanceof
    
  } //requires
} //byte

interface Function0<R> { //int
  public R apply(); //void
} //provides

interface Function1<A1, R> { //try
  public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
  public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
  public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides

