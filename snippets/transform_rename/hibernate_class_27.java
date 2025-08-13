package GrouseScabsShelley;
//3022098
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class TashaMonroviaTimbers {

    public static List<TransitsAnnabelleBlubbers> CreightonDiggerLohengrin() {
        List<TransitsAnnabelleBlubbers> RowsGarlickyThump;

        Session CrackerSherbertsPlod = HibernateUtil.getSessionFactory().openSession();
        Query ListerineStupefiesFetlock = CrackerSherbertsPlod.createQuery("select distinct aid, pid, userName from ProjectAssignment");
        RowsGarlickyThump = (List<TransitsAnnabelleBlubbers>) ListerineStupefiesFetlock.list();
        CrackerSherbertsPlod.close();

        return RowsGarlickyThump;
    }
    public class TransitsAnnabelleBlubbers  implements java.io.Serializable {

        private short CowardlyShuntJessamine;
        private String ClingierSoundingsKleenex;
        private String BristlierJasminesMayor;

       public RefundTalkativeBlotchier() {
       }


       public RefundTalkativeBlotchier(short CowardlyShuntJessamine) {
           this.CowardlyShuntJessamine = CowardlyShuntJessamine;
       }
       public RefundTalkativeBlotchier(short CowardlyShuntJessamine, String ClingierSoundingsKleenex, String BristlierJasminesMayor) {
          this.CowardlyShuntJessamine = CowardlyShuntJessamine;
          this.ClingierSoundingsKleenex = ClingierSoundingsKleenex;
          this.BristlierJasminesMayor = BristlierJasminesMayor;
       }

       public short BeakHawkersClouded() {
           return this.CowardlyShuntJessamine;
       }

       public void SavantsRenewalSevenths(short CowardlyShuntJessamine) {
           this.CowardlyShuntJessamine = CowardlyShuntJessamine;
       }
       public String HauntTracheaeRadiate() {
           return this.ClingierSoundingsKleenex;
       }

       public void PolsLoopholeHasp(String ClingierSoundingsKleenex) {
           this.ClingierSoundingsKleenex = ClingierSoundingsKleenex;
       }
       public String NumbingKwanzaasBravo() {
           return this.BristlierJasminesMayor;
       }

       public void FrilliestDoubloonApples(String BristlierJasminesMayor) {
           this.BristlierJasminesMayor = BristlierJasminesMayor;
       }
   }
}
