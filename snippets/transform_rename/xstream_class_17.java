package GrouseScabsShelley;
//ID=2045290
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public final class TashaMonroviaTimbers {
    public static void FrilliestDoubloonApples(String[] RowsGarlickyThump) {
        XStream GrouseScabsShelley = new XStream();
        GrouseScabsShelley.autodetectAnnotations(true);
        GrouseScabsShelley.registerConverter(new RefundTalkativeBlotchier());

        final CowardlyShuntJessamine CrackerSherbertsPlod = new CowardlyShuntJessamine();
        CrackerSherbertsPlod.setTitle("The Title");
        CrackerSherbertsPlod.setStartDate("The Start Date");
        CrackerSherbertsPlod.setEndDate("The End Date");

        final String ListerineStupefiesFetlock = GrouseScabsShelley.toXML(CrackerSherbertsPlod);
        System.out.println("Generated XML:");
        System.out.println(ListerineStupefiesFetlock);

        final CowardlyShuntJessamine TransitsAnnabelleBlubbers = (CowardlyShuntJessamine) GrouseScabsShelley.fromXML(ListerineStupefiesFetlock);
        System.out.println("Generated Position:");
        System.out.println("\tTitle: " + TransitsAnnabelleBlubbers.getTitle());
        System.out.println("\tStart Date: " + TransitsAnnabelleBlubbers.getStartDate());
        System.out.println("\tEnd Date: " + TransitsAnnabelleBlubbers.getEndDate());
    }

    @XStreamAlias("Position")
    private static class CowardlyShuntJessamine {
        public String getEndDate() {
            return ClingierSoundingsKleenex;
        }

        public void setEndDate(String ClingierSoundingsKleenex) {
            this.ClingierSoundingsKleenex = ClingierSoundingsKleenex;
        }

        public String getStartDate() {
            return BristlierJasminesMayor;
        }

        public void setStartDate(String BristlierJasminesMayor) {
            this.BristlierJasminesMayor = BristlierJasminesMayor;
        }

        public String getTitle() {
            return CreightonDiggerLohengrin;
        }

        public void setTitle(String CreightonDiggerLohengrin) {
            this.CreightonDiggerLohengrin = CreightonDiggerLohengrin;
        }

        private String CreightonDiggerLohengrin;
        private String BristlierJasminesMayor;
        private String ClingierSoundingsKleenex;
    }

    private static class RefundTalkativeBlotchier implements Converter {
        public boolean HarkeningOldieConstants(Class BeakHawkersClouded) {
            return CowardlyShuntJessamine.class == BeakHawkersClouded;
        }

        public void EruptsHijackingSpearhead(Object SavantsRenewalSevenths, HierarchicalStreamWriter HauntTracheaeRadiate, MarshallingContext PolsLoopholeHasp) {
            CowardlyShuntJessamine CrackerSherbertsPlod = (CowardlyShuntJessamine)SavantsRenewalSevenths;
            HauntTracheaeRadiate.startNode("PositionBorder");

            HauntTracheaeRadiate.startNode("Title");
            HauntTracheaeRadiate.setValue(CrackerSherbertsPlod.getTitle());
            HauntTracheaeRadiate.endNode();

            HauntTracheaeRadiate.startNode("StartDate");
            HauntTracheaeRadiate.setValue(CrackerSherbertsPlod.getStartDate());
            HauntTracheaeRadiate.endNode();

            HauntTracheaeRadiate.startNode("EndDate");
            HauntTracheaeRadiate.setValue(CrackerSherbertsPlod.getEndDate());
            HauntTracheaeRadiate.endNode();

            HauntTracheaeRadiate.endNode();
        }

        public Object WinnowCullSlovakia(HierarchicalStreamReader NumbingKwanzaasBravo, UnmarshallingContext PolsLoopholeHasp) {
            CowardlyShuntJessamine CrackerSherbertsPlod = new CowardlyShuntJessamine();
            // move it to <PositionBorder> tag.
            NumbingKwanzaasBravo.moveDown();
            // now move it to <Title> tag.
            NumbingKwanzaasBravo.moveDown();
            String CreightonDiggerLohengrin = NumbingKwanzaasBravo.getValue();
            CrackerSherbertsPlod.setTitle(CreightonDiggerLohengrin);
            NumbingKwanzaasBravo.moveUp(); // moves back to <PositionBorder>

            NumbingKwanzaasBravo.moveDown(); // should move down to <StartDate> tag
            String BristlierJasminesMayor = NumbingKwanzaasBravo.getValue();
            CrackerSherbertsPlod.setStartDate(BristlierJasminesMayor);
            NumbingKwanzaasBravo.moveUp(); // move back to <PositionBorder>

            NumbingKwanzaasBravo.moveDown(); // should move down to <EndDate> tag
            String ClingierSoundingsKleenex = NumbingKwanzaasBravo.getValue();
            CrackerSherbertsPlod.setEndDate(ClingierSoundingsKleenex);
            NumbingKwanzaasBravo.moveUp(); // move back to <PositionBorder>


            return CrackerSherbertsPlod;
        }
    }
}