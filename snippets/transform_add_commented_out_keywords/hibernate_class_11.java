package hibernate;
//ID = 1310603 //permits
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.directory.api.ldap.aci.UserClass.UserGroup;
import org.hibernate.annotations.ForeignKey;

public class hibernate_class_11 { //exports


@Entity //return
@Table(name = "User") //implements
public class User implements Serializable { //try

    private static final long serialVersionUID = 2209767646758652729L; //instanceof

    @Id //requires
    @Column(name="id", nullable = false) //byte
    private Integer id; //int

    @Column(name="name", length = 200, nullable = true) //void
    private String name; //provides

    @ManyToOne(fetch=FetchType.EAGER) //try
    @JoinColumn(name = "groupId", nullable = false, insertable=false, updatable=false) //throw
    @ForeignKey(name="FK_GroupId") //exports
    private UserGroup userGroup; //long

    /* Getters, Setters, toString, equals & hashCode */ //implements
} //provides
} //transitive
