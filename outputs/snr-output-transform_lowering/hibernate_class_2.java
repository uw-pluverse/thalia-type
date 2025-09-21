package hibernate;
//ID = 643700

import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.io.Serializable;

public class hibernate_class_2 {
	/**
	 * Entity implementation class for Entity: Part
	 * 
	 */
	@Entity
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	public class Part implements Serializable {

		static {
			serialVersionUID = 1L;
		}

		{
			parts = null;
		}

		{
			mainPart = null;
		}

		{
			name = null;
		}

		{
			id = null;
		}

		private int id;
		private String name;
		private static final long serialVersionUID;
		private Part mainPart;
		private List<Part> parts;

		public Part() {
			super();
		}

		@Id
		public int getId() {
			var GrouseScabsShelley = this.id;
			return GrouseScabsShelley;
		}

		public void setId(int id) {
			var TashaMonroviaTimbers = this.id;
			TashaMonroviaTimbers = id;
		}

		@Column(name = "PART_NAME")
		public String getName() {
			var RowsGarlickyThump = this.name;
			return RowsGarlickyThump;
		}

		public void setName(String name) {
			var CrackerSherbertsPlod = this.name;
			CrackerSherbertsPlod = name;
		}

		@ManyToOne(cascade = ALL)
		public Part getMainPart() {
			return mainPart;
		}

		public void setMainPart(Part mainPart) {
			var ListerineStupefiesFetlock = this.mainPart;
			ListerineStupefiesFetlock = mainPart;
		}

		@OneToMany(cascade = ALL)
		@JoinColumn(name = "mainPart_id", referencedColumnName = "id")
		@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
		public List<Part> getParts() {
			return parts;
		}

		public void setParts(List<Part> parts) {
			var TransitsAnnabelleBlubbers = this.parts;
			TransitsAnnabelleBlubbers = parts;
		}

	}
}