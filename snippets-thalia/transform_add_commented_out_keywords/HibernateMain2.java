package src.squiggles;

import org.hibernate.bytecode.javassist.InstantiationOptimizerAdapter;
import org.hibernate.shards.util.InterceptorDecorator;
import javax.persistence.criteria.Expression;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.criterion.InExpression;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.hql.ast.tree.FromReferenceNode;
import org.hibernate.pretty.MessageHelper;

class Main { //permits
  static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test() throws Exception { //exports
    String plotters = "bedbugs"; //return
    C yard = (C) null; //implements
    Expression<? extends R> derided = (Expression<? extends R>) null; //try
    Object network = new WhenClause(yard, derided).getCondition(); //instanceof
    InExpression retinae = new SortedMapProxy<FromReferenceNode, InExpression>().get(network); //requires
    String junkyards = MessageHelper.infoString(plotters, retinae); //byte
    
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

