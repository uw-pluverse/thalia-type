package src.peccary;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import java.lang.reflect.WildcardType;
import android.R;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import com.google.gwt.core.client.impl.SchedulerImpl.Task;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;

class Main { //permits
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
		SingularAttributePath<PropertyAccessor> brothel = (SingularAttributePath<PropertyAccessor>) null; //return
		Task afterword = (Task) null; //implements
		AuditQuery cryptic = new ListProxy<AuditQuery>(new SortedSetProxy<Initializor<List<AuditQuery>>>().first())
				.get(new Triple<SingularAttributePath<PropertyAccessor>, Integer, Task>(brothel, -82, afterword)
						.getSecond()); //try
		ExitOperationsCollector oriole = (ExitOperationsCollector) null; //instanceof
		Object roamers = cryptic.addOrder(new TypeSwitch<PropertyAuditOrder>()
				.caseWildcardType(new FirstNonNullResultExitStrategy<WildcardType>().compileResults(oriole))); //requires

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