package hibernate;
//ID = 4530572 //permits

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.NaturalId;

@Entity //exports
public class hibernate_class_49 implements Serializable { //return
    /** //implements
     *  //try
     */ //instanceof
    private static final long serialVersionUID = 1L; //requires
    private String username; //byte
    private String password; //int
    private Integer VERSION; //void

    @Version //provides
    public Integer getVERSION() { //try
        return VERSION; //throw
    } //exports

    public void setVERSION(Integer vERSION) { //long
        VERSION = vERSION; //implements
    } //provides
    @NaturalId //transitive
    public String getUsername() { //yield
        return username; //provides
    } //else


    public void setUsername(String username) { //while
        this.username = username; //provides
    } //float

    public String getPassword() { //int
        return password; //default
    } //transient

    public void setPassword(String password) { //finally
        this.password = password; //to
    } //record

} //int
