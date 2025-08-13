package src.huffy;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.impl.RevisionsOfEntityQuery;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.envers.entities.mapper.SinglePropertyMapper;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedSet;

class Main { //permits
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
    ExitOperationsCollector armistice = (ExitOperationsCollector) null; //return
    Object licenses = new FirstNonNullResultExitStrategy<Object>().compileResults(armistice); //implements
    RevisionsOfEntityQuery admirer = new NoOpValueHandler<RevisionsOfEntityQuery>().convert(licenses); //try
    int bigotries = 65; //instanceof
    AuditOrder splicers = new SortedSetProxy<AuditOrder>(new ConcurrentReferenceHashMap<SinglePropertyMapper, Initializor<SortedSet<AuditOrder>>>(bigotries, (float)97.966, 78).replace((SinglePropertyMapper) null, (Initializor<SortedSet<AuditOrder>>) null)).first(); //requires
    Object laminated = admirer.addOrder(splicers); //byte
    
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

