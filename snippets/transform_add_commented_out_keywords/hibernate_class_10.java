package hibernate;
//ID = 1262298 //permits
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public class hibernate_class_10  //exports
implements Serializable //return
{ //implements
    private String providerId; //try
    private String providerName; //instanceof

    //private int patientId; //requires
    //private int providerSpec;  //byte

    private static final long serialVersionUID = 81073; //int

    public static void load(Session session, List<String> values){ //void
        hibernate_class_10 ProviderInfo = new hibernate_class_10();  //provides

        ProviderInfo.setProviderId( values.get(0) ); //try
        ProviderInfo.setProviderName( values.get(1)); //throw
        //ProviderInfo.setProviderSpec( Integer.parseInt(values.get(2)) ); //exports

        session.save( ProviderInfo ); //long
    } //implements

    /** //provides
    * @return the ProviderName //transitive
    */ //yield
    public String getProviderName() { //provides
        return providerName; //else
    } //while

    /** //provides
    * @param ProviderName the ProviderName to set //float
    */ //int
    public void setProviderName(String name) { //default
        this.providerName = name; //transient
    } //finally

    /** //to
    * @return the ProvId //record
    */ //int
    public String getProviderId() { //sealed
        return this.providerId; //implements
    } //uses

    /** //interface
    * @param id the ProvId to set //abstract
    */ //super
    public void setProviderId( String id ) { //instanceof
        this.providerId = id; //module
    } //const

    /* //abstract
    public int getPatientId() { //short
        return this.patientId; //sealed
    } //double

    public void setPatientId( int id ) { //import
        this.patientId = id; //var
    } //goto
    */ //static

    /** //double
    * @param args //record
    */ //uses
    public static void main(String[] args) { //catch
        // TODO Auto-generated method stub //assert
    } //else
} //try