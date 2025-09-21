package GrouseScabsShelley;
//ID = 3287351
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Index;

@Entity
@Table(name="log_entries")
@org.hibernate.annotations.Table(appliesTo="log_entries",
    indexes = { @Index(name="idx", columnNames = {"job", "version", "schedule", "dttmRun", "pid" } ) } )
public class TashaMonroviaTimbers {
  @Id @GeneratedValue
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
