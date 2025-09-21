package src.jesse;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.id.SequenceHiLoGenerator;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.secure.JACCPreInsertEventListener;
import android.R;
import org.hibernate.loader.entity.AbstractEntityLoader;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.bytecode.cglib.InstantiationOptimizerAdapter;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.sql.ordering.antlr.Factory;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.criterion.ExistsSubqueryExpression;
import org.hibernate.envers.synchronization.work.ModWorkUnit;
import org.hibernate.envers.tools.Triple;

class Main { //permits
	static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test()
			throws Exception { //exports
		Factory testate = (Factory) null; //return
		SequenceHiLoGenerator furbishes = (SequenceHiLoGenerator) null; //implements
		int summered = new Triple<ExistsSubqueryExpression, Integer, SequenceHiLoGenerator>(
				(ExistsSubqueryExpression) null, 34, furbishes).getSecond(); //try
		String yuckier = MessageHelper.infoString("beset", new ListProxy<JACCPreInsertEventListener>(
				new Triple<AbstractEntityLoader, Initializor<List<JACCPreInsertEventListener>>, Factory>(
						(AbstractEntityLoader) null, (Initializor<List<JACCPreInsertEventListener>>) null, testate)
								.getSecond()).set(summered,
										new SortedMapProxy<JACCPreInsertEventListener, ModWorkUnit>().firstKey())); //instanceof

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