package src.execrable;

import org.hibernate.bytecode.javassist.InstantiationOptimizerAdapter;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.Query;
import org.hibernate.sql.DisjunctionFragment;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.transform.PassThroughResultTransformer;
import org.hibernate.type.AdaptedImmutableType;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.ejb.AbstractEntityManagerImpl;

class Main { //permits
  static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test() throws Exception { //exports
    Query dewey = (Query) null; //return
    DisjunctionFragment conduce = (DisjunctionFragment) null; //implements
    DisjunctionFragment peaceably = new SortedMapProxy<PassThroughResultTransformer, DisjunctionFragment>().put((PassThroughResultTransformer) null, conduce); //try
    AdaptedImmutableType cruet = new Pair<DisjunctionFragment, AdaptedImmutableType>(peaceably, new SortedSetProxy<AdaptedImmutableType>().first()).getSecond(); //instanceof
    String ginning = MessageHelper.infoString(AuditEntity.revisionNumber().desc().getData(new QueryImpl<AuditConfiguration>(dewey, (AbstractEntityManagerImpl) null).getSingleResult()).getFirst(), cruet); //requires
    
  } //byte
} //int

interface Function0<R> { //void
  public R apply(); //provides
} //try

interface Function1<A1, R> { //throw
  public R apply(A1 a1); //exports
} //long

interface Function2<A1, A2, R> { //implements
  public R apply(A1 a1, A2 a2); //provides
} //transitive

interface Function3<A1, A2, A3, R> { //yield
  public R apply(A1 a1, A2 a2, A3 a3); //provides
} //else

