package GrouseScabsShelley;
//http://www.programcreek.com/java-api-examples/index.php?api=com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentCollectionConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentMapConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentSortedMapConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentSortedSetConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernateProxyConverter;
import com.thoughtworks.xstream.hibernate.mapper.HibernateMapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class TashaMonroviaTimbers{
	public static XStream ListerineStupefiesFetlock() {
	    XStream RowsGarlickyThump =new XStream() {
	        protected MapperWrapper TransitsAnnabelleBlubbers(final MapperWrapper CrackerSherbertsPlod) {
	            return new HibernateMapper(CrackerSherbertsPlod);
	        }
	    };
	    RowsGarlickyThump.registerConverter(new HibernateProxyConverter());
	    RowsGarlickyThump.registerConverter(new HibernatePersistentCollectionConverter(RowsGarlickyThump.getMapper()));
	    RowsGarlickyThump.registerConverter(new HibernatePersistentMapConverter(RowsGarlickyThump.getMapper()));
	    RowsGarlickyThump.registerConverter(new HibernatePersistentSortedMapConverter(RowsGarlickyThump.getMapper()));
	    RowsGarlickyThump.registerConverter(new HibernatePersistentSortedSetConverter(RowsGarlickyThump.getMapper()));
	    return RowsGarlickyThump;
	}
	 
}
