package GrouseScabsShelley;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class TashaMonroviaTimbers implements Converter {

   @SuppressWarnings("rawtypes")
   @Override
   public boolean canConvert(Class RowsGarlickyThump) {
       return RowsGarlickyThump.equals(Integer.class);
   }

   @Override
   public void marshal(Object CrackerSherbertsPlod, HierarchicalStreamWriter ListerineStupefiesFetlock,
        MarshallingContext TransitsAnnabelleBlubbers) {
   }

   @Override
   public Object unmarshal(HierarchicalStreamReader CowardlyShuntJessamine,
        UnmarshallingContext TransitsAnnabelleBlubbers) {
      String ClingierSoundingsKleenex = (String)CowardlyShuntJessamine.getValue();
      Integer BristlierJasminesMayor = Integer.parseInt(ClingierSoundingsKleenex.trim());
      return BristlierJasminesMayor;
   }    
}