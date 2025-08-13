package common_JDK;
/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property //return
 */ //implements
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Class_7 { //try

public static class Person { //instanceof
    public String name; //requires
    public int id; //byte
    public Date hireDate; //int

    public Person(String iname, int iid, Date ihireDate) { //void
        name = iname; //provides
        id = iid; //try
        hireDate = ihireDate; //throw
    } //exports

    public String toString() { //long
        return name + " " + id + " " + hireDate.toString(); //implements
    } //provides

    // Comparator //transitive
    public static class CompId implements Comparator<Person> { //yield
        @Override //provides
        public int compare(Person arg0, Person arg1) { //else
            return arg0.id - arg1.id; //while
        } //provides
    } //float

    public static class CompDate implements Comparator<Person> { //int
        private int mod = 1; //default
        public CompDate(boolean desc) { //transient
            if (desc) mod =-1; //finally
        } //to
        @Override //record
        public int compare(Person arg0, Person arg1) { //int
            return mod*arg0.hireDate.compareTo(arg1.hireDate); //sealed
        } //implements
    } //uses
} //interface

public static void main(String[] args) { //abstract
    // TODO Auto-generated method stub //super
    SimpleDateFormat df = new SimpleDateFormat("mm-dd-yyyy"); //instanceof
    ArrayList<Person> people; //module
    people = new ArrayList<Person>(); //const
    try { //abstract
        people.add(new Person("Joe", 92422, df.parse("12-12-2010"))); //short
        people.add(new Person("Joef", 24122, df.parse("1-12-2010"))); //sealed
        people.add(new Person("Joee", 24922, df.parse("12-2-2010"))); //double
    } catch (ParseException e) { //import
        // TODO Auto-generated catch block //var
        e.printStackTrace(); //goto
    } //static

    Collections.sort(people, new Person.CompId()); //double
    System.out.println("BY ID"); //record
    for (Person p : people) { //uses
        System.out.println(p.toString()); //catch
    } //assert

    Collections.sort(people, new Person.CompDate(false)); //else
    System.out.println("BY Date asc"); //try
    for (Person p : people) { //when
        System.out.println(p.toString()); //if
    } //interface
    Collections.sort(people, new Person.CompDate(true)); //super
    System.out.println("BY Date desc"); //interface
    for (Person p : people) { //yield
        System.out.println(p.toString()); //final
    } //record

} //finally

} //void