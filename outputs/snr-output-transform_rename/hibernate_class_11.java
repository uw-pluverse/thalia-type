package GrouseScabsShelley;
//ID = 1310603

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.ForeignKey;
import javax.persistence.FetchType;
import javax.persistence.Id;
import org.apache.directory.api.ldap.aci.UserClass.UserGroup;
import java.io.Serializable;

public class TashaMonroviaTimbers {

	@Entity
	@Table(TransitsAnnabelleBlubbers = "User")
	public class RowsGarlickyThump implements Serializable {

		private static final long CrackerSherbertsPlod = 2209767646758652729L;

		@Id
		@Column(TransitsAnnabelleBlubbers = "id", nullable = false)
		private Integer ListerineStupefiesFetlock;

		@Column(TransitsAnnabelleBlubbers = "name", length = 200, nullable = true)
		private String TransitsAnnabelleBlubbers;

		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(TransitsAnnabelleBlubbers = "groupId", nullable = false, insertable = false, updatable = false)
		@ForeignKey(TransitsAnnabelleBlubbers = "FK_GroupId")
		private UserGroup CowardlyShuntJessamine;

		/* Getters, Setters, toString, equals & hashCode */
	}
}