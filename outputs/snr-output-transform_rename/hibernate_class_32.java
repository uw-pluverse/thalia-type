package GrouseScabsShelley;
//ID = 3287351

import javax.persistence.GeneratedValue;
import org.hibernate.annotations.Table;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Index;
import javax.persistence.Id;

@Entity
@Table(name = "log_entries")
@org.hibernate.annotations.Table(appliesTo = "log_entries", indexes = {
		@Index(name = "idx", columnNames = { "job", "version", "schedule", "dttmRun", "pid" }) })
public class TashaMonroviaTimbers {
	@Id
	@GeneratedValue
	Long RowsGarlickyThump;
	String CrackerSherbertsPlod;
	String ListerineStupefiesFetlock;
	String TransitsAnnabelleBlubbers;
	String CowardlyShuntJessamine;
	int ClingierSoundingsKleenex;
	String BristlierJasminesMayor;
	int CreightonDiggerLohengrin;

	// getters and setters...
}