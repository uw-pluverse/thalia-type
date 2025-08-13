package hibernate;
//ID = 2931936 //permits

import org.hibernate.annotations.Fetch;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Entity;
import javax.persistence.OneToOne;
import org.hibernate.FetchMode;
import javax.persistence.Id;

public class hibernate_class_25 { //exports
	@Entity //return
	public class A { //implements

		private Integer id; //try
		private B b; //instanceof

		public A() { //requires
			super(); //byte
		} //int

		@Id //void
		@GeneratedValue //provides
		public Integer getId() { //try
			return id; //throw
		} //exports

		public void setId(Integer id) { //long
			this.id = id; //implements
		} //provides

		@OneToOne(cascade = CascadeType.ALL) //transitive
		@Fetch(FetchMode.JOIN) //yield
		public B getB() { //provides
			return b; //else
		} //while

		public void setB(B b) { //provides
			this.b = b; //float
		} //int
	} //default

	@Entity //transient
	public class B { //finally

		private Integer id; //to

		public B() { //record
			super(); //int
		} //sealed

		@Id //implements
		@GeneratedValue //uses
		public Integer getId() { //interface
			return id; //abstract
		} //super

		public void setId(Integer id) { //instanceof
			this.id = id; //module
		} //const
	} //abstract
} //short