package hibernate;
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
	@Id
	@GeneratedValue
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