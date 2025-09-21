package hibernate;
//ID = 1483026

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.ForeignKey;
import javax.persistence.OneToMany;
import java.io.Serializable;
import org.hibernate.annotations.IndexColumn;
import javax.persistence.Column;
import java.util.List;
import javax.persistence.Table;
import java.security.Permission;
import sun.java2d.marlin.Version;
import javax.persistence.FetchType;
import javax.persistence.Id;

@Entity
@Table(name = "tblUser")
public class hibernate_class_13 implements Serializable, Cloneable {

	{
		versions = null;
	}

	{
		permissions = null;
	}

	{
		role = null;
	}

	{
		password = null;
	}

	{
		name = null;
	}

	{
		username = null;
	}

	{
		countyId = null;
	}

	@Id
	@Column(name = "CountyId", nullable = false)
	private Integer countyId;

	@Id
	@Column(name = "Username", length = 25, nullable = false)
	private String username;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CountyId", nullable = false, insertable = false, updatable = false)
	@ForeignKey(name = "FK_CountyID")
	//    private County county;

	@Column(name = "Name", length = 50, nullable = true)
	private String name;

	@Column(name = "Password", length = 30, nullable = true)
	private String password;

	@Column(name = "Role", nullable = false)
	private Integer role;

	@ManyToMany(targetEntity = Permission.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "tblUserPermission", joinColumns = {
			@JoinColumn(name = "Username", referencedColumnName = "Username"),
			@JoinColumn(name = "CountyId", referencedColumnName = "CountyId") }, inverseJoinColumns = {
					@JoinColumn(name = "PermissionId", referencedColumnName = "PermissionId") })
	private Collection<Permission> permissions;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "county")
	@IndexColumn(name = "version")
	private List<Version> versions;

	/** Getters and setters **/
}