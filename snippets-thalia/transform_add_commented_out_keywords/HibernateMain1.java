package src.portable;

import org.hibernate.bytecode.javassist.InstantiationOptimizerAdapter;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import javax.persistence.criteria.Expression;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedMap;
import org.hibernate.event.AutoFlushEventListener;
import org.hibernate.engine.CascadeStyle.MultipleCascadeStyle;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.envers.query.AuditEntity;

class Main { //permits
  static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test() throws Exception { //exports
    AuditConfiguration ladies = new WhenClause((C) null, (Expression<? extends R>) null).getCondition(); //return
    ExitOperationsCollector unbiassed = (ExitOperationsCollector) null; //implements
    Initializor<SortedMap<AutoFlushEventListener, MultipleCascadeStyle>> roosevelt = ((ExitStrategy<Initializor<SortedMap<AutoFlushEventListener, MultipleCascadeStyle>>>) null).compileResults(unbiassed); //try
    AutoFlushEventListener nattily = new SortedMapProxy<AutoFlushEventListener, MultipleCascadeStyle>(roosevelt).firstKey(); //instanceof
    String mentors = MessageHelper.infoString(AuditEntity.revisionProperty(((Initializor<String>) null).initialize()).desc().getData(ladies).getFirst(), nattily); //requires
    
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

