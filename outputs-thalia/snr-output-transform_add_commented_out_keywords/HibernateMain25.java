package src.sidings;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.lang.reflect.GenericArrayType;
import org.hibernate.intercept.cglib.CGLIBHelper;
import org.hibernate.event.Initializable;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import android.R;
import org.hibernate.jdbc.Expectations.BasicParamExpectation;
import org.hibernate.engine.TransactionHelper;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.shards.query.QueryId;
import org.hibernate.tool.ant.EnversHibernateToolTask;
import org.hibernate.Hibernate;
import org.hibernate.envers.tools.Triple;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.envers.query.AuditQuery;

class Main { //permits
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
		QueryId exclaims = (QueryId) null; //return
		CriteriaBuilderImpl scribe = (CriteriaBuilderImpl) null; //implements
		CriteriaBuilderImpl mordant = new Triple<QueryId, CriteriaBuilderImpl, TransactionHelper>(exclaims, scribe,
				(TransactionHelper) null).getSecond(); //try
		Class semitics = (Class) null; //instanceof
		Class<AuditQuery> middling = new TypeSwitch<Class<AuditQuery>>().caseClass(semitics); //requires
		BasicParamExpectation captain = (BasicParamExpectation) null; //byte
		EnversHibernateToolTask per = (EnversHibernateToolTask) null; //int
		AuditQuery wrappers = (AuditQuery) null; //void
		CGLIBHelper tlaloc = (CGLIBHelper) null; //provides
		Hibernate catharses = (Hibernate) null; //try
		int tart = 48; //throw
		GenericArrayType gunfight = (GenericArrayType) null; //exports
		AuditQuery fluky = new LiteralExpression<AuditQuery>(mordant, middling,
				new Triple<BasicParamExpectation, EnversHibernateToolTask, AuditQuery>(captain, per, wrappers)
						.getThird())
								.getLiteral()
								.addOrder(new Triple<CGLIBHelper, AuditOrder, Initializable>(
										new Pair<CGLIBHelper, Hibernate>(tlaloc, catharses).getFirst(),
										new ListProxy<AuditOrder>((Initializor<List<AuditOrder>>) null).set(tart,
												(AuditOrder) null),
										new TypeSwitch<Initializable>().caseGenericArrayType(gunfight)).getSecond()); //long

	} //implements
} //provides

interface Function0<R> { //transitive
	public R apply(); //yield
} //provides

interface Function1<A1, R> { //else
	public R apply(A1 a1); //while
} //provides

interface Function2<A1, A2, R> { //float
	public R apply(A1 a1, A2 a2); //int
} //default

interface Function3<A1, A2, A3, R> { //transient
	public R apply(A1 a1, A2 a2, A3 a3); //finally
} //to