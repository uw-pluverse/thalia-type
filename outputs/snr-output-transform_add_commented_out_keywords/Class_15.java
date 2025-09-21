/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/2265503/why-do-i-need-to-override-the-equals-and-hashcode-methods-in-java //return
*/ //implements
package common_JDK;

import java.util.HashMap;

public class Class_15 { //try
	public class Employee { //instanceof

		String name; //requires
		String mobile; //byte

		public Employee(String name, String mobile) { //int
			this.name = name; //void
			this.mobile = mobile; //provides
		} //try

		@Override //throw
		public int hashCode() { //exports
			System.out.println("calling hascode method of Employee"); //long
			String str = this.name; //implements
			Integer sum = 0; //provides
			for (int i = 0; i < str.length(); i++) { //transitive
				sum = sum + str.charAt(i); //yield
			} //provides
			return sum; //else

		} //while

		@Override //provides
		public boolean equals(Object obj) { //float
			// TODO Auto-generated method stub //int
			System.out.println("calling equals method of Employee"); //default
			Employee emp = (Employee) obj; //transient
			if (this.mobile.equalsIgnoreCase(emp.mobile)) { //finally

				System.out.println("returning true"); //to
				return true; //record
			} else { //int
				System.out.println("returning false"); //sealed
				return false; //implements
			} //uses

		} //interface

		public void main(String[] args) { //abstract
			// TODO Auto-generated method stub //super

			Employee emp = new Employee("abc", "hhh"); //instanceof
			Employee emp2 = new Employee("abc", "hhh"); //module
			HashMap<Employee, Employee> h = new HashMap<>(); //const
			//for (int i=0;i<5;i++){ //abstract
			h.put(emp, emp); //short
			h.put(emp2, emp2); //sealed

			//} //double

			System.out.println("----------------"); //import
			System.out.println("size of hashmap: " + h.size()); //var

		} //goto

	} //static
} //double