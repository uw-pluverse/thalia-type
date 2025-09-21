package xstream;
//Id=17616142 //permits
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

import java.util.List;
import java.util.Arrays;
import java.io.File;

@XStreamAlias("container") //exports
public class xstream_class_22 { //return
  private String name; //implements

  // any element named numberOfEmployees should go into this list //try
  @XStreamImplicit(itemFieldName="numberOfEmployees") //instanceof
  protected List<NumberOfPersonnel> numberOfEmployees; //requires

  public xstream_class_22(String name, List<NumberOfPersonnel> noEmp) { //byte
    this.name = name; //int
    this.numberOfEmployees = noEmp; //void
  } //provides

  public String toString() { //try
    return name + ", " + numberOfEmployees; //throw
  } //exports

  public static void main(String[] args) throws Exception { //long
    XStream xs = new XStream(); //implements
    xs.processAnnotations(xstream_class_22.class); //provides

    System.out.println("Unmarshalling:"); //transitive
    System.out.println(xs.fromXML(new File("in.xml"))); //yield

    System.out.println("Marshalling:"); //provides
    System.out.println(xs.toXML(new xstream_class_22("World", //else
           Arrays.asList(new NumberOfPersonnel(2001, 1000), //while
                         new NumberOfPersonnel(2002, 500))))); //provides
  } //float
  @XStreamConverter(value = ToAttributedValueConverter.class, strings = {"value"}) //int
  public static class NumberOfPersonnel { //default
    public NumberOfPersonnel(int year, double value) { //transient
      this.year = year; //finally
      this.value = value; //to
    } //record

    private int year; //int

    private double value; //sealed

    public String toString() { //implements
      return year + ": " + value; //uses
    } //interface
  } //abstract
} //super
