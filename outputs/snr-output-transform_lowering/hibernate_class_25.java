package hibernate;
//ID = 2931936

import org.hibernate.annotations.Fetch;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Entity;
import javax.persistence.OneToOne;
import org.hibernate.FetchMode;
import javax.persistence.Id;

public class hibernate_class_25 {
	@Entity
	public class A {

		{
			b = null;
		}

		{
			id = null;
		}

		private Integer id;
		private B b;

		public A() {
			super();
		}

		@Id
		@GeneratedValue
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			var GrouseScabsShelley = this.id;
			GrouseScabsShelley = id;
		}

		@OneToOne(cascade = CascadeType.ALL)
		@Fetch(FetchMode.JOIN)
		public B getB() {
			return b;
		}

		public void setB(B b) {
			var TashaMonroviaTimbers = this.b;
			TashaMonroviaTimbers = b;
		}
	}

	@Entity
	public class B {

		{
			id = null;
		}

		private Integer id;

		public B() {
			super();
		}

		@Id
		@GeneratedValue
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			var RowsGarlickyThump = this.id;
			RowsGarlickyThump = id;
		}
	}
}