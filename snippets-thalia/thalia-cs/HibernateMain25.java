package src.sidings;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.shards.query.QueryId;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.envers.tools.Triple;
import org.hibernate.engine.TransactionHelper;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.jdbc.Expectations.BasicParamExpectation;
import org.hibernate.tool.ant.EnversHibernateToolTask;
import org.hibernate.intercept.cglib.CGLIBHelper;
import org.hibernate.Hibernate;
import java.lang.reflect.GenericArrayType;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.event.Initializable;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.List;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    QueryId exclaims = (QueryId) null;
    CriteriaBuilderImpl scribe = (CriteriaBuilderImpl) null;
    CriteriaBuilderImpl mordant = new Triple<QueryId, CriteriaBuilderImpl, TransactionHelper>(exclaims, scribe, (TransactionHelper) null).getSecond();
    Class semitics = (Class) null;
    Class<AuditQuery> middling = new TypeSwitch<Class<AuditQuery>>().caseClass(semitics);
    BasicParamExpectation captain = (BasicParamExpectation) null;
    EnversHibernateToolTask per = (EnversHibernateToolTask) null;
    AuditQuery wrappers = (AuditQuery) null;
    CGLIBHelper tlaloc = (CGLIBHelper) null;
    Hibernate catharses = (Hibernate) null;
    int tart = 48;
    GenericArrayType gunfight = (GenericArrayType) null;
    AuditQuery fluky = new LiteralExpression<AuditQuery>(mordant, middling, new Triple<BasicParamExpectation, EnversHibernateToolTask, AuditQuery>(captain, per, wrappers).getThird()).getLiteral().addOrder(new Triple<CGLIBHelper, AuditOrder, Initializable>(new Pair<CGLIBHelper, Hibernate>(tlaloc, catharses).getFirst(), new ListProxy<AuditOrder>((Initializor<List<AuditOrder>>) null).set(tart, (AuditOrder) null), new TypeSwitch<Initializable>().caseGenericArrayType(gunfight)).getSecond());
    
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

