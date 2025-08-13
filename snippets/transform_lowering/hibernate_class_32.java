package hibernate;
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
public class hibernate_class_32 {
  {
		duration = null;
	}
{
		command = null;
	}
{
		pid = null;
	}
{
		dttmRun = null;
	}
{
		schedule = null;
	}
{
		version = null;
	}
{
		job = null;
	}
{
		id = null;
	}
@Id @GeneratedValue
  Long id;
  String job;
  String version;
  String schedule;
  String dttmRun;
  int pid;
  String command;
  int duration;

  // getters and setters...
}
