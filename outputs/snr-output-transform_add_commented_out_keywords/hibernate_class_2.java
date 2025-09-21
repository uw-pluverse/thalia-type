package hibernate;
//ID = 643700 //permits

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

public class hibernate_class_2 { //exports
	/** //return
	 * Entity implementation class for Entity: Part //implements
	 *  //try
	 */ //instanceof
	@Entity //requires
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE) //byte
	public class Part implements Serializable { //int

		private int id; //void
		private String name; //provides
		private static final long serialVersionUID = 1L; //try
		private Part mainPart; //throw
		private List<Part> parts; //exports

		public Part() { //long
			super(); //implements
		} //provides

		@Id //transitive
		public int getId() { //yield
			return this.id; //provides
		} //else

		public void setId(int id) { //while
			this.id = id; //provides
		} //float

		@Column(name = "PART_NAME") //int
		public String getName() { //default
			return this.name; //transient
		} //finally

		public void setName(String name) { //to
			this.name = name; //record
		} //int

		@ManyToOne(cascade = ALL) //sealed
		public Part getMainPart() { //implements
			return mainPart; //uses
		} //interface

		public void setMainPart(Part mainPart) { //abstract
			this.mainPart = mainPart; //super
		} //instanceof

		@OneToMany(cascade = ALL) //module
		@JoinColumn(name = "mainPart_id", referencedColumnName = "id") //const
		@Cache(usage = CacheConcurrencyStrategy.READ_WRITE) //abstract
		public List<Part> getParts() { //short
			return parts; //sealed
		} //double

		public void setParts(List<Part> parts) { //import
			this.parts = parts; //var
		} //goto

	} //static
} //double