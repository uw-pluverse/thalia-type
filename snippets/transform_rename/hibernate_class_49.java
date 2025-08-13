package GrouseScabsShelley;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.NaturalId;

@Entity
public class TashaMonroviaTimbers implements Serializable {
    /**
     * 
     */
    private static final long RowsGarlickyThump = 1L;
    private String CrackerSherbertsPlod;
    private String ListerineStupefiesFetlock;
    private Integer TransitsAnnabelleBlubbers;

    @Version
    public Integer ClingierSoundingsKleenex() {
        return TransitsAnnabelleBlubbers;
    }

    public void BristlierJasminesMayor(Integer CowardlyShuntJessamine) {
        TransitsAnnabelleBlubbers = CowardlyShuntJessamine;
    }
    @NaturalId
    public String CreightonDiggerLohengrin() {
        return CrackerSherbertsPlod;
    }


    public void RefundTalkativeBlotchier(String CrackerSherbertsPlod) {
        this.CrackerSherbertsPlod = CrackerSherbertsPlod;
    }

    public String BeakHawkersClouded() {
        return ListerineStupefiesFetlock;
    }

    public void SavantsRenewalSevenths(String ListerineStupefiesFetlock) {
        this.ListerineStupefiesFetlock = ListerineStupefiesFetlock;
    }

}
