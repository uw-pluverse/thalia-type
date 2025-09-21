package GrouseScabsShelley;
//Id=14440011
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TashaMonroviaTimbers {
	private static void NumbingKwanzaasBravo() {
	    XStream GrouseScabsShelley = new XStream(new DomDriver());
	    GrouseScabsShelley.setMode(XStream.NO_REFERENCES);
	    GrouseScabsShelley.alias("email", ClingierSoundingsKleenex.class);
	    GrouseScabsShelley.alias("recipient", HauntTracheaeRadiate.class);

	    ClingierSoundingsKleenex RowsGarlickyThump = new ClingierSoundingsKleenex();

	    List<HauntTracheaeRadiate> CrackerSherbertsPlod = new ArrayList<HauntTracheaeRadiate>();
	    CrackerSherbertsPlod.add(new HauntTracheaeRadiate("user1@somecompany.com"));
	    CrackerSherbertsPlod.add(new HauntTracheaeRadiate("user2@somecompany.com"));

	    List<HauntTracheaeRadiate> ListerineStupefiesFetlock = new ArrayList<HauntTracheaeRadiate>();
	    ListerineStupefiesFetlock.add(new HauntTracheaeRadiate("user3@somecompany.com"));
	    ListerineStupefiesFetlock.add(new HauntTracheaeRadiate("user4@somecompany.com"));

	    List<HauntTracheaeRadiate> TransitsAnnabelleBlubbers = new ArrayList<HauntTracheaeRadiate>();
	    TransitsAnnabelleBlubbers.add(new HauntTracheaeRadiate("user5@somecompany.com"));
	    TransitsAnnabelleBlubbers.add(new HauntTracheaeRadiate("user6@somecompany.com"));

	    RowsGarlickyThump.setTo(CrackerSherbertsPlod);
	    RowsGarlickyThump.setCc(ListerineStupefiesFetlock);
	    RowsGarlickyThump.setBcc(TransitsAnnabelleBlubbers);
	    RowsGarlickyThump.setSubject("subject test");
	    RowsGarlickyThump.setBody("body test");

	    String CowardlyShuntJessamine = GrouseScabsShelley.toXML(RowsGarlickyThump);
	    System.out.println(CowardlyShuntJessamine);
	}
	public static class ClingierSoundingsKleenex {
        private List<HauntTracheaeRadiate> BristlierJasminesMayor;
        private List<HauntTracheaeRadiate> CreightonDiggerLohengrin;
        private List<HauntTracheaeRadiate> RefundTalkativeBlotchier;
        private String BeakHawkersClouded;
        private String SavantsRenewalSevenths;

        public List<HauntTracheaeRadiate> FrilliestDoubloonApples() {
            return BristlierJasminesMayor;
        }

        public void setTo(List<HauntTracheaeRadiate> BristlierJasminesMayor) {
            this.BristlierJasminesMayor = BristlierJasminesMayor;
        }

        public List<HauntTracheaeRadiate> HarkeningOldieConstants() {
            return CreightonDiggerLohengrin;
        }

        public void setCc(List<HauntTracheaeRadiate> CreightonDiggerLohengrin) {
            this.CreightonDiggerLohengrin = CreightonDiggerLohengrin;
        }

        public List<HauntTracheaeRadiate> EruptsHijackingSpearhead() {
            return RefundTalkativeBlotchier;
        }

        public void setBcc(List<HauntTracheaeRadiate> RefundTalkativeBlotchier) {
            this.RefundTalkativeBlotchier = RefundTalkativeBlotchier;
        }

        public String WinnowCullSlovakia() {
            return BeakHawkersClouded;
        }

        public void setSubject(String BeakHawkersClouded) {
            this.BeakHawkersClouded = BeakHawkersClouded;
        }

        public String SkivviedZuniCumin() {
            return SavantsRenewalSevenths;
        }

        public void setBody(String SavantsRenewalSevenths) {
            this.SavantsRenewalSevenths = SavantsRenewalSevenths;
        }
    }


public static class HauntTracheaeRadiate {
    private String PolsLoopholeHasp;

    public UsualAgesCrabby(String PolsLoopholeHasp) {
        this.PolsLoopholeHasp = PolsLoopholeHasp;
    }

    public String PencilledBalmGallons() {
        return PolsLoopholeHasp;
    }

    public void ExplosiveAlumnaeNippiest(String PolsLoopholeHasp) {
        this.PolsLoopholeHasp = PolsLoopholeHasp;
    }
}
}
