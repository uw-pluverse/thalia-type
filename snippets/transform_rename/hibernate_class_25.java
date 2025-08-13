package GrouseScabsShelley;
//ID = 2931936
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
public class TashaMonroviaTimbers{
	@Entity
	public class RowsGarlickyThump {

	    private Integer CrackerSherbertsPlod;
	    private TransitsAnnabelleBlubbers ListerineStupefiesFetlock;

	    public CowardlyShuntJessamine() {
	        super();
	    }

	    @Id
	    @GeneratedValue
	    public Integer ClingierSoundingsKleenex() {
	        return CrackerSherbertsPlod;
	    }

	    public void BristlierJasminesMayor(Integer CrackerSherbertsPlod) {
	        this.CrackerSherbertsPlod = CrackerSherbertsPlod;
	    }

	    @OneToOne (cascade=CascadeType.ALL)
	    @Fetch(FetchMode.JOIN)
	    public TransitsAnnabelleBlubbers CreightonDiggerLohengrin() {
	        return ListerineStupefiesFetlock;
	    }

	    public void RefundTalkativeBlotchier(TransitsAnnabelleBlubbers ListerineStupefiesFetlock) {
	        this.ListerineStupefiesFetlock = ListerineStupefiesFetlock;
	    }
	}
	@Entity
	public class TransitsAnnabelleBlubbers {

	    private Integer CrackerSherbertsPlod;

	    public BeakHawkersClouded() {
	        super();
	    }

	    @Id
	    @GeneratedValue
	    public Integer ClingierSoundingsKleenex() {
	        return CrackerSherbertsPlod;
	    }

	    public void BristlierJasminesMayor(Integer CrackerSherbertsPlod) {
	        this.CrackerSherbertsPlod = CrackerSherbertsPlod;
	    }   
	}
}
