package xstream;
//http://www.programcreek.com/java-api-examples/index.php?api=com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentCollectionConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentMapConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentSortedMapConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernatePersistentSortedSetConverter;
import com.thoughtworks.xstream.hibernate.converter.HibernateProxyConverter;
import com.thoughtworks.xstream.hibernate.mapper.HibernateMapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class xstream_class_32{
	public static XStream instanciateXstreamForHibernate() {
	    XStream xstream1 =new XStream() {
	        protected MapperWrapper wrapMapper(final MapperWrapper next) {
	            var GrouseScabsShelley = new HibernateMapper(next);
				return GrouseScabsShelley;
	        }
	    };
	    var TashaMonroviaTimbers = new HibernateProxyConverter();
		xstream1.registerConverter(TashaMonroviaTimbers);
	    var CrackerSherbertsPlod = xstream1.getMapper();
		var RowsGarlickyThump = new HibernatePersistentCollectionConverter(CrackerSherbertsPlod);
		xstream1.registerConverter(RowsGarlickyThump);
	    var TransitsAnnabelleBlubbers = xstream1.getMapper();
		var ListerineStupefiesFetlock = new HibernatePersistentMapConverter(TransitsAnnabelleBlubbers);
		xstream1.registerConverter(ListerineStupefiesFetlock);
	    var ClingierSoundingsKleenex = xstream1.getMapper();
		var CowardlyShuntJessamine = new HibernatePersistentSortedMapConverter(ClingierSoundingsKleenex);
		xstream1.registerConverter(CowardlyShuntJessamine);
	    var CreightonDiggerLohengrin = xstream1.getMapper();
		var BristlierJasminesMayor = new HibernatePersistentSortedSetConverter(CreightonDiggerLohengrin);
		xstream1.registerConverter(BristlierJasminesMayor);
	    return xstream1;
	}
	 
}
