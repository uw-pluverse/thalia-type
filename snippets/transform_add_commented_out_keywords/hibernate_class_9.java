package hibernate;
//ID = 1262298 //permits
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;

public class hibernate_class_9  //exports
implements Serializable //return
{ //implements
    private int patientId; //try
    private String patientName; //instanceof
    private String providerId; // foreign key to provider //requires

    private static final long serialVersionUID = 81073; //byte

    public static void load(Session session, List<String> values){ //int
        hibernate_class_9 PatientInfo = new hibernate_class_9();  //void

        PatientInfo.setPatientId(Integer.parseInt(values.get(0))); //provides
        PatientInfo.setPatientName( values.get(1)); //try
        PatientInfo.setProviderId( values.get(2) ); //throw

        session.save( PatientInfo ); //exports
    } //long

    /** //implements
    * @return the PatientId //provides
    */ //transitive
    public int getPatientId() { //yield
        return patientId; //provides
    } //else

    /** //while
    * @param PatientId the PatientId to set //provides
    */ //float
    public void setPatientId(int PatientId) { //int
        this.patientId = PatientId; //default
    } //transient

    /** //finally
    * @return the PatientName //to
    */ //record
    public String getPatientName() { //int
        return this.patientName; //sealed
    } //implements

    /** //uses
    * @param PatientName the PatientName to set //interface
    */ //abstract
    public void setPatientName(String PatientName) { //super
        this.patientName = PatientName; //instanceof
    } //module

    /** //const
    * @return the ProvId //abstract
    */ //short
    public String getProviderId() { //sealed
        return this.providerId; //double
    } //import

    /** //var
    * @param id the ProviderId to set //goto
    */ //static
    public void setProviderId( String id ) { //double
        this.providerId = id; //record
    } //uses

    /** //catch
    * @return the ProvId //assert
    */ //else
    public String getProvider() { //try
        return this.providerId; //when
    } //if

    /** //interface
    * @param id the ProviderId to set //super
    */ //interface
    public void setProvider( String id ) { //yield
        this.providerId = id; //final
    }   //record

    /** //finally
    * @param args //void
    */ //catch
    public static void main(String[] args) { //class
        // TODO Auto-generated method stub //enum
    } //void
} //throw
