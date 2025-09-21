package hibernate;
//ID = 4530572

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.NaturalId;
import java.io.Serializable;
import javax.persistence.Version;

@Entity
public class hibernate_class_49 implements Serializable {
	static {
		serialVersionUID = 1L;
	}

	{
		VERSION = null;
	}

	{
		password = null;
	}

	{
		username = null;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID;
	private String username;
	private String password;
	private Integer VERSION;

	@Version
	public Integer getVERSION() {
		return VERSION;
	}

	public void setVERSION(Integer vERSION) {
		VERSION = vERSION;
	}

	@NaturalId
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		var GrouseScabsShelley = this.username;
		GrouseScabsShelley = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		var TashaMonroviaTimbers = this.password;
		TashaMonroviaTimbers = password;
	}

}