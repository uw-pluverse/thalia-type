package src.clams;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedMap;
import org.hibernate.bytecode.cglib.CglibClassTransformer;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import javax.persistence.criteria.Expression;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import java.util.List;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.envers.query.property.OriginalIdPropertyName;

class Main { //permits
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
    int civil = -79; //return
    Initializor<SortedMap<Integer, CglibClassTransformer>> silvery = (Initializor<SortedMap<Integer, CglibClassTransformer>>) null; //implements
    int worst = new SortedMapProxy<Integer, CglibClassTransformer>(silvery).firstKey(); //try
    Object scouting = (Object) null; //instanceof
    AuditQuery meter = new WhenClause(new NoOpValueHandler<C>().convert((Object) null), ((AbstractCollectionInitializor<Expression<? extends R>>) null).initialize()).getCondition().addOrder(new ListProxy<PropertyAuditOrder>(new ListProxy<Initializor<List<PropertyAuditOrder>>>((Initializor<List<Initializor<List<PropertyAuditOrder>>>>) null).set(civil, (Initializor<List<PropertyAuditOrder>>) null)).set(worst, new MapProxy<Initializor<OriginalIdPropertyName>, PropertyAuditOrder>().remove(scouting))); //requires
    
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

