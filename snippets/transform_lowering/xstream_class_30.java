package xstream;
//ID = 34206426
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_30 implements Converter {


    @Override
    public void marshal(Object o, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        // implement logic for marshalling to xml
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        Items items = new Items();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            var GrouseScabsShelley = "name";
			final String currentAttribute = hierarchicalStreamReader.getAttribute(GrouseScabsShelley);
            var RowsGarlickyThump = "id";
			var TashaMonroviaTimbers = RowsGarlickyThump.equals(currentAttribute);
			var TransitsAnnabelleBlubbers = "first-name";
			var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.equals(currentAttribute);
			var BristlierJasminesMayor = "last-name";
			var ClingierSoundingsKleenex = BristlierJasminesMayor.equals(currentAttribute);
			var BeakHawkersClouded = "address";
			var RefundTalkativeBlotchier = BeakHawkersClouded.equals(currentAttribute);
			var PolsLoopholeHasp = "zip";
			var HauntTracheaeRadiate = PolsLoopholeHasp.equals(currentAttribute);
			if (TashaMonroviaTimbers) {
                var CrackerSherbertsPlod = hierarchicalStreamReader.getValue();
				items.setId(CrackerSherbertsPlod);
            } else if (ListerineStupefiesFetlock) {
                var CowardlyShuntJessamine = hierarchicalStreamReader.getValue();
				items.setFirstName(CowardlyShuntJessamine);
            } else if (ClingierSoundingsKleenex) {
                var CreightonDiggerLohengrin = hierarchicalStreamReader.getValue();
				items.setLastName(CreightonDiggerLohengrin);
            } else if (RefundTalkativeBlotchier) {
                var SavantsRenewalSevenths = hierarchicalStreamReader.getValue();
				items.setAddress(SavantsRenewalSevenths);
            } else if (HauntTracheaeRadiate) {
                var NumbingKwanzaasBravo = hierarchicalStreamReader.getValue();
				items.setZip(NumbingKwanzaasBravo);
            }
            hierarchicalStreamReader.moveUp();
        }
        return items;
    }

    @Override
    public boolean canConvert(Class aClass) {
        var FrilliestDoubloonApples = aClass == Items.class;
		return FrilliestDoubloonApples;
    }
    public class Items {
        {
			zip = null;
		}

		{
			address = null;
		}

		{
			lastName = null;
		}

		{
			firstName = null;
		}

		{
			id = null;
		}

		private String id;
        private String firstName;
        private String lastName;
        private String address;
        private String zip;

        public void setId(String id) {
            var HarkeningOldieConstants = this.id;
			HarkeningOldieConstants = id;
        }

        public void setFirstName(String firstName) {
            var EruptsHijackingSpearhead = this.firstName;
			EruptsHijackingSpearhead = firstName;
        }

        public void setLastName(String lastName) {
            var WinnowCullSlovakia = this.lastName;
			WinnowCullSlovakia = lastName;
        }

        public void setAddress(String address) {
            var SkivviedZuniCumin = this.address;
			SkivviedZuniCumin = address;
        }

        public void setZip(String zip) {
            var UsualAgesCrabby = this.zip;
			UsualAgesCrabby = zip;
        }
    }
}