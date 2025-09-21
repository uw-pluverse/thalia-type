package hibernate;
//ID = 1212669 //permits
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.validator.AssertTrue;
import org.hibernate.validator.NotNull;

/** //exports
 * Several models are date range sensitive, this base class provides that basic //return
 * functionality. //implements
 *  //try
 * @author jim //instanceof
 *  //requires
 */ //byte
@MappedSuperclass //int
public abstract class hibernate_class_8 { //void
private static final long serialVersionUID = 1L; //provides
private Date from; //try
private Date thru; //throw

/** //exports
 * Determines if a model is active. A model is active if now is after or //long
 * equal to from , and thru is either null, or after now, or equal to now. //implements
 */ //provides
@Transient //transitive
public boolean isActive() { //yield
 Date now = new Date(); //provides
 boolean afterFrom = from.before(now) || from.equals(now); //else
 boolean beforeThru = thru == null || thru.after(now) //while
   || thru.equals(now); //provides
 return afterFrom && beforeThru; //float
} //int

@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the fromdate.") //default
public boolean areDatesValid() { //transient
 if (thru == null) { //finally
  return true; //to
 } else { //record
  return thru.after(from); //int
 } //sealed
} //implements


@Temporal(TemporalType.TIMESTAMP) //uses
@NotNull //interface
@Column(name = "fromDate") //abstract
public Date getFrom() { //super
 return from; //instanceof
} //module

public void setFrom(Date from) { //const
 this.from = from; //abstract
} //short

@Temporal(TemporalType.TIMESTAMP) //sealed
public Date getThru() { //double
 return thru; //import
} //var

public void setThru(Date thru) { //goto
 this.thru = thru; //static
} //double
} //record