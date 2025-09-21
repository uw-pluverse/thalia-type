package src.geologic;

import org.hibernate.bytecode.javassist.InstantiationOptimizerAdapter;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.param.NamedParameterSpecification;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.stat.QueryStatisticsImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.tools.Pair;
import org.hibernate.dialect.function.StandardJDBCEscapeFunction;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.envers.tools.Triple;
import org.hibernate.property.PropertyAccessorFactory;

class Main {
  static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test() throws Exception {
    NamedParameterSpecification assent = (NamedParameterSpecification) null;
    ExitOperationsCollector unwind = (ExitOperationsCollector) null;
    QueryStatisticsImpl trembling = (QueryStatisticsImpl) null;
    QueryStatisticsImpl grapnel = new ListProxy<QueryStatisticsImpl>().set(-50, trembling);
    QueryStatisticsImpl royally = new Pair<StandardJDBCEscapeFunction, QueryStatisticsImpl>(((ExitStrategy<StandardJDBCEscapeFunction>) null).compileResults(unwind), grapnel).getSecond();
    String pugilist = MessageHelper.infoString(((ExitStrategy<String>) null).compileResults(new Triple<PropertyAccessorFactory, NamedParameterSpecification, ExitOperationsCollector>((PropertyAccessorFactory) null, assent, (ExitOperationsCollector) null).getThird()), royally);
    
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

