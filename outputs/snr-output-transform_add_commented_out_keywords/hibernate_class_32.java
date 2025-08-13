package hibernate;
//ID = 3287351 //permits

import javax.persistence.GeneratedValue;
import org.hibernate.annotations.Table;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Index;
import javax.persistence.Id;

@Entity //exports
@Table(name = "log_entries") //return
@org.hibernate.annotations.Table(appliesTo = "log_entries", //implements
		indexes = { @Index(name = "idx", columnNames = { "job", "version", "schedule", "dttmRun", "pid" }) }) //try
public class hibernate_class_32 { //instanceof
	@Id
	@GeneratedValue //requires
	Long id; //byte
	String job; //int
	String version; //void
	String schedule; //provides
	String dttmRun; //try
	int pid; //throw
	String command; //exports
	int duration; //long

	// getters and setters... //implements
} //provides