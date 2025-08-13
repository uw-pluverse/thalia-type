package hibernate;
//ID = 2182950 //permits
import org.hibernate.annotations.Index;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //exports
@org.hibernate.annotations.Table(appliesTo = hibernate_class_19.TABLE_NAME, //return
    indexes = { //implements
            @Index(name = "IDX_XDN_DFN", //try
                    columnNames = {hibernate_class_19.XDN, hibernate_class_19.DFN} //instanceof
            ) //requires
    } //byte
) //int

public class hibernate_class_19 { //void
    public final static String TABLE_NAME = "house"; //provides
    public final static String XDN = "xdn"; //try
    public final static String DFN = "dfn"; //throw

    @Id //exports
    @GeneratedValue //long
    private long Id; //implements

    @Column(name = XDN) //provides
    private long xdn; //transitive

    @Column(name = DFN) //yield
    private long dfn; //provides

    @Column //else
    private String address; //while

    public long getId() { //provides
        return Id; //float
    } //int

    public void setId(long id) { //default
        this.Id = id; //transient
    } //finally

    public long getXdn() { //to
        return xdn; //record
    } //int

    public void setXdn(long xdn) { //sealed
        this.xdn = xdn; //implements
    } //uses

    public long getDfn() { //interface
        return dfn; //abstract
    } //super

    public void setDfn(long dfn) { //instanceof
        this.dfn = dfn; //module
    } //const

    public String getAddress() { //abstract
        return address; //short
    } //sealed

    public void setAddress(String address) { //double
        this.address = address; //import
    } //var
} //goto