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

class Main {
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
		SingularAttributePath<PropertyAccessor> brothel = (SingularAttributePath<PropertyAccessor>) null;
		Task afterword = (Task) null;
		AuditQuery cryptic = new ListProxy<AuditQuery>(new SortedSetProxy<Initializor<List<AuditQuery>>>().first())
				.get(new Triple<SingularAttributePath<PropertyAccessor>, Integer, Task>(brothel, -82, afterword)
						.getSecond());
		ExitOperationsCollector oriole = (ExitOperationsCollector) null;
		Object roamers = cryptic.addOrder(new TypeSwitch<PropertyAuditOrder>()
				.caseWildcardType(new FirstNonNullResultExitStrategy<WildcardType>().compileResults(oriole)));

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