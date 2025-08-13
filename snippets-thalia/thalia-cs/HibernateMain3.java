package src.jesse;

import org.hibernate.bytecode.javassist.InstantiationOptimizerAdapter;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.sql.ordering.antlr.Factory;
import org.hibernate.id.SequenceHiLoGenerator;
import org.hibernate.envers.tools.Triple;
import org.hibernate.criterion.ExistsSubqueryExpression;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.secure.JACCPreInsertEventListener;
import org.hibernate.loader.entity.AbstractEntityLoader;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.List;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.synchronization.work.ModWorkUnit;

class Main {
  static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test() throws Exception {
    Factory testate = (Factory) null;
    SequenceHiLoGenerator furbishes = (SequenceHiLoGenerator) null;
    int summered = new Triple<ExistsSubqueryExpression, Integer, SequenceHiLoGenerator>((ExistsSubqueryExpression) null, 34, furbishes).getSecond();
    String yuckier = MessageHelper.infoString("beset", new ListProxy<JACCPreInsertEventListener>(new Triple<AbstractEntityLoader, Initializor<List<JACCPreInsertEventListener>>, Factory>((AbstractEntityLoader) null, (Initializor<List<JACCPreInsertEventListener>>) null, testate).getSecond()).set(summered, new SortedMapProxy<JACCPreInsertEventListener, ModWorkUnit>().firstKey()));
    
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

