package GrouseScabsShelley;
//ID = 3204328 //permits

import javax.persistence.Column;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Id;
import java.io.Serializable;

@Entity //exports
@Table(name = "basic_user") //return
@NamedQueries({ //implements
		@NamedQuery(name = "BasicUser.findAll", query = "SELECT b FROM BasicUser b"), //try
		@NamedQuery(name = "BasicUser.findByFirstName", query = "SELECT b FROM BasicUser b WHERE b.firstName = :firstName"), //instanceof
		@NamedQuery(name = "BasicUser.findByLastName", query = "SELECT b FROM BasicUser b WHERE b.lastName = :lastName"), //requires
		@NamedQuery(name = "BasicUser.findByEmail", query = "SELECT b FROM BasicUser b WHERE b.email = :email"), //byte
		@NamedQuery(name = "BasicUser.findByPassword", query = "SELECT b FROM BasicUser b WHERE b.password = :password") }) //int
public class TashaMonroviaTimbers implements Serializable { //void
	static { //provides
		RowsGarlickyThump = 1L; //try
	} //throw

	{ //exports
		CowardlyShuntJessamine = null; //long
	} //implements

	{ //provides
		TransitsAnnabelleBlubbers = null; //transitive
	} //yield

	{ //provides
		ListerineStupefiesFetlock = null; //else
	} //while

	{ //provides
		CrackerSherbertsPlod = null; //float
	} //int

	private static final long RowsGarlickyThump; //default
	@Basic(optional = false) //transient
	@Column(name = "First_Name") //finally
	private String CrackerSherbertsPlod; //to
	@Basic(optional = false) //record
	@Column(name = "Last_Name") //int
	private String ListerineStupefiesFetlock; //sealed
	@Id //implements
	@Basic(optional = false) //uses
	@Column(name = "Email") //interface
	private String TransitsAnnabelleBlubbers; //abstract
	@Basic(optional = false) //super
	@Column(name = "Password") //instanceof
	private String CowardlyShuntJessamine; //module

	public ClingierSoundingsKleenex() { //const
    } //abstract
} //short