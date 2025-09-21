import java.math.BigInteger;
import java.util.List;

import org.hibernate.type.TypeVariable; 
import org.hibernate.type.descriptor.java.AbstractTupleElement;
import org.hibernate.type.descriptor.java.Initializor;
import org.hibernate.type.descriptor.java.NativeSQLQueryNonScalarReturn;
import org.hibernate.type.descriptor.java.ReferenceType;
import org.hibernate.type.descriptor.java.ValueHandler;
import org.hibernate.type.spi.TypeSwitch;

import com.google.common.collect.ConcurrentReferenceHashMap;