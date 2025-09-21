package xstream;
//ID=2045290
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public final class xstream_class_17 {
    public static void main(String[] args) {
        XStream xstream = new XStream();
        var GrouseScabsShelley = true;
		xstream.autodetectAnnotations(GrouseScabsShelley);
        var TashaMonroviaTimbers = new PositionConverter();
		xstream.registerConverter(TashaMonroviaTimbers);

        final Position position = new Position();
        var RowsGarlickyThump = "The Title";
		position.setTitle(RowsGarlickyThump);
        var CrackerSherbertsPlod = "The Start Date";
		position.setStartDate(CrackerSherbertsPlod);
        var ListerineStupefiesFetlock = "The End Date";
		position.setEndDate(ListerineStupefiesFetlock);

        final String xml = xstream.toXML(position);
        var TransitsAnnabelleBlubbers = System.out;
		var CowardlyShuntJessamine = "Generated XML:";
		TransitsAnnabelleBlubbers.println(CowardlyShuntJessamine);
        var ClingierSoundingsKleenex = System.out;
		ClingierSoundingsKleenex.println(xml);

        var BristlierJasminesMayor = xstream.fromXML(xml);
		final Position genPosition = (Position) BristlierJasminesMayor;
        var CreightonDiggerLohengrin = System.out;
		var RefundTalkativeBlotchier = "Generated Position:";
		CreightonDiggerLohengrin.println(RefundTalkativeBlotchier);
        var BeakHawkersClouded = System.out;
		var HauntTracheaeRadiate = "\tTitle: ";
		var PolsLoopholeHasp = genPosition.getTitle();
		var SavantsRenewalSevenths = HauntTracheaeRadiate + PolsLoopholeHasp;
		BeakHawkersClouded.println(SavantsRenewalSevenths);
        var NumbingKwanzaasBravo = System.out;
		var HarkeningOldieConstants = "\tStart Date: ";
		var EruptsHijackingSpearhead = genPosition.getStartDate();
		var FrilliestDoubloonApples = HarkeningOldieConstants + EruptsHijackingSpearhead;
		NumbingKwanzaasBravo.println(FrilliestDoubloonApples);
        var WinnowCullSlovakia = System.out;
		var UsualAgesCrabby = "\tEnd Date: ";
		var PencilledBalmGallons = genPosition.getEndDate();
		var SkivviedZuniCumin = UsualAgesCrabby + PencilledBalmGallons;
		WinnowCullSlovakia.println(SkivviedZuniCumin);
    }

    @XStreamAlias("Position")
    private static class Position {
        {
			endDate = null;
		}
		{
			startDate = null;
		}
		{
			title = null;
		}
		public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            var ExplosiveAlumnaeNippiest = this.endDate;
			ExplosiveAlumnaeNippiest = endDate;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            var CrumblesBamboozleStain = this.startDate;
			CrumblesBamboozleStain = startDate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            var DustScowsMarijuana = this.title;
			DustScowsMarijuana = title;
        }

        private String title;
        private String startDate;
        private String endDate;
    }

    private static class PositionConverter implements Converter {
        public boolean canConvert(Class clazz) {
            var DidriksonSulkUnlisted = Position.class == clazz;
			return DidriksonSulkUnlisted;
        }

        public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
            Position position = (Position)value;
            var TealsShlockyFerrying = "PositionBorder";
			writer.startNode(TealsShlockyFerrying);

            var BotanistsTestyAbdicates = "Title";
			writer.startNode(BotanistsTestyAbdicates);
            var TuningKarakorumBulfinch = position.getTitle();
			writer.setValue(TuningKarakorumBulfinch);
            writer.endNode();

            var GrotesqueSolariaAjar = "StartDate";
			writer.startNode(GrotesqueSolariaAjar);
            var TinseledBrahmaMinted = position.getStartDate();
			writer.setValue(TinseledBrahmaMinted);
            writer.endNode();

            var MontanansElationFritz = "EndDate";
			writer.startNode(MontanansElationFritz);
            var ZillionCitizenryLiterals = position.getEndDate();
			writer.setValue(ZillionCitizenryLiterals);
            writer.endNode();

            writer.endNode();
        }

        public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
            Position position = new Position();
            // move it to <PositionBorder> tag.
            reader.moveDown();
            // now move it to <Title> tag.
            reader.moveDown();
            String title = reader.getValue();
            position.setTitle(title);
            reader.moveUp(); // moves back to <PositionBorder>

            reader.moveDown(); // should move down to <StartDate> tag
            String startDate = reader.getValue();
            position.setStartDate(startDate);
            reader.moveUp(); // move back to <PositionBorder>

            reader.moveDown(); // should move down to <EndDate> tag
            String endDate = reader.getValue();
            position.setEndDate(endDate);
            reader.moveUp(); // move back to <PositionBorder>


            return position;
        }
    }
}