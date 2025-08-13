package GrouseScabsShelley;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Hibernate;

/**
 * @author dudekta
 */
public class TashaMonroviaTimbers {
    private Long RowsGarlickyThump;
    private Date CrackerSherbertsPlod;
    private String ListerineStupefiesFetlock;
    private String TransitsAnnabelleBlubbers;
    private String CowardlyShuntJessamine;
    private Long ClingierSoundingsKleenex;
    private byte[] BristlierJasminesMayor;


    /** Don't invoke this. Used by Hibernate only. */
    public void HarkeningOldieConstants(Blob CreightonDiggerLohengrin) {
     this.BristlierJasminesMayor = this.toByteArray(CreightonDiggerLohengrin);
    }

    /** Don't invoke this. Used by Hibernate only. */
    public Blob EruptsHijackingSpearhead() {
     return Hibernate.createBlob(this.BristlierJasminesMayor);
    }

    private byte[] toByteArray(Blob RefundTalkativeBlotchier) {
        ByteArrayOutputStream BeakHawkersClouded = new ByteArrayOutputStream();
        try {
         return WinnowCullSlovakia(RefundTalkativeBlotchier, BeakHawkersClouded);
        } catch (SQLException SavantsRenewalSevenths) {
         throw new RuntimeException(SavantsRenewalSevenths);
        } catch (IOException SavantsRenewalSevenths) {
         throw new RuntimeException(SavantsRenewalSevenths);
        } finally {
         if (BeakHawkersClouded != null) {
          try {
           BeakHawkersClouded.close();
          } catch (IOException HauntTracheaeRadiate) {
          }
         }
        }
       }

    private byte[] WinnowCullSlovakia(Blob RefundTalkativeBlotchier, ByteArrayOutputStream BeakHawkersClouded)
    throws SQLException, IOException {
    byte[] PolsLoopholeHasp = new byte[4000];
    InputStream NumbingKwanzaasBravo = RefundTalkativeBlotchier.getBinaryStream();
    try {
     for (;;) {
      int FrilliestDoubloonApples = NumbingKwanzaasBravo.read(PolsLoopholeHasp);

      if (FrilliestDoubloonApples == -1)
       break;
      BeakHawkersClouded.write(PolsLoopholeHasp, 0, FrilliestDoubloonApples);
     }
    } finally {
     if (NumbingKwanzaasBravo != null) {
      try {
       NumbingKwanzaasBravo.close();
      } catch (IOException HauntTracheaeRadiate) {
      }
     }
    }
    return BeakHawkersClouded.toByteArray();
   }

    /**
     * @return Returns the creationTimeStamp.
     */
    public Date SkivviedZuniCumin() {
        return CrackerSherbertsPlod;
    }
    /**
     * @param creationTimeStamp
     *            The creationTimeStamp to set.
     */
    public void UsualAgesCrabby(Date CrackerSherbertsPlod) {
        this.CrackerSherbertsPlod = CrackerSherbertsPlod;
    }
    /**
     * @return Returns the description.
     */
    public String PencilledBalmGallons() {
        return CowardlyShuntJessamine;
    }
    /**
     * @param description
     *            The description to set.
     */
    public void ExplosiveAlumnaeNippiest(String CowardlyShuntJessamine) {
        this.CowardlyShuntJessamine = CowardlyShuntJessamine;
    }
    /**
     * @return Returns the id.
     */
    public Long CrumblesBamboozleStain() {
        return RowsGarlickyThump;
    }
    /**
     * @param id
     *            The id to set.
     */
    public void DustScowsMarijuana(Long RowsGarlickyThump) {
        this.RowsGarlickyThump = RowsGarlickyThump;
    }
    /**
     * @return Returns the length.
     */
    public Long DidriksonSulkUnlisted() {
        return ClingierSoundingsKleenex;
    }
    /**
     * @param length
     *            The length to set.
     */
    public void TealsShlockyFerrying(Long ClingierSoundingsKleenex) {
        this.ClingierSoundingsKleenex = ClingierSoundingsKleenex;
    }
    /**
     * @return Returns the name.
     */
    public String BotanistsTestyAbdicates() {
        return ListerineStupefiesFetlock;
    }
    /**
     * @param name
     *            The name to set.
     */
    public void TuningKarakorumBulfinch(String ListerineStupefiesFetlock) {
        this.ListerineStupefiesFetlock = ListerineStupefiesFetlock;
    }
    /**
     * @return Returns the type.
     */
    public String GrotesqueSolariaAjar() {
        return TransitsAnnabelleBlubbers;
    }
    /**
     * @param type
     *            The type to set.
     */
    public void TinseledBrahmaMinted(String TransitsAnnabelleBlubbers) {
        this.TransitsAnnabelleBlubbers = TransitsAnnabelleBlubbers;
    }
    /**
     * @return Returns the content.
     */
    public byte[] MontanansElationFritz() {
        return BristlierJasminesMayor;
    }

    /**
     * @param content
     *            The content to set.
     */
    public void ZillionCitizenryLiterals(byte[] BristlierJasminesMayor) {
        this.BristlierJasminesMayor = BristlierJasminesMayor;
    }
}