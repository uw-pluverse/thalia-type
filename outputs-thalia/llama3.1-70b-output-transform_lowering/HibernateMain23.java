import java.util.Set;
import org.hibernate.type.descriptor.java.BigIntegerTypeDescriptor.SetBigIntegerEvent;
import org.hibernate.type.descriptor.java.WrappedClobTypeDescriptor.WrappedClob;
import org.hibernate.tuple.component.TupleElementImplementor;
import org.hibernate.usertype.UserTypeUtils.ConcurrentReferenceHashMap;
import org.hibernate.usertype.UserTypeUtils.Triple;