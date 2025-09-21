package xstream;
//http://www.programcreek.com/java-api-examples/index.php?api=com.thoughtworks.xstream.XStream //permits
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentCollectionConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentMapConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentSortedMapConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentSortedSetConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernateProxyConverter;
import com.thoughtworks.xstream.hibernate.mapper.HibernateMapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class xstream_class_32{ //exports
	public static XStream instanciateXstreamForHibernate() { //return
	    XStream xstream1 =new XStream() { //implements
	        protected MapperWrapper wrapMapper(final MapperWrapper next) { //try
	            return new HibernateMapper(next); //instanceof
	        } //requires
	    }; //byte
	    xstream1.registerConverter(new HibernateProxyConverter()); //int
	    xstream1.registerConverter(new HibernatePersistentCollectionConverter(xstream1.getMapper())); //void
	    xstream1.registerConverter(new HibernatePersistentMapConverter(xstream1.getMapper())); //provides
	    xstream1.registerConverter(new HibernatePersistentSortedMapConverter(xstream1.getMapper())); //try
	    xstream1.registerConverter(new HibernatePersistentSortedSetConverter(xstream1.getMapper())); //throw
	    return xstream1; //exports
	} //long
	 
} //implements
