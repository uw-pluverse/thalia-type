package hibernate;
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
public class hibernate_class_30 implements Serializable { //void
	private static final long serialVersionUID = 1L; //provides
	@Basic(optional = false) //try
	@Column(name = "First_Name") //throw
	private String firstName; //exports
	@Basic(optional = false) //long
	@Column(name = "Last_Name") //implements
	private String lastName; //provides
	@Id //transitive
	@Basic(optional = false) //yield
	@Column(name = "Email") //provides
	private String email; //else
	@Basic(optional = false) //while
	@Column(name = "Password") //provides
	private String password; //float

	public hibernate_class_30() { //int
	} //default
} //transient