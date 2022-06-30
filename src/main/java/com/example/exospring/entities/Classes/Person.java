package com.example.exospring.entities.Classes;

import com.example.exospring.entities.Interface.IPerson;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public abstract class Person implements IPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

@Column(name = "last_name", nullable = false)

    private String last_Name;

    @Column(name = "first_name", nullable = false)
    private String first_Name;

    @Column(name = "civility", nullable = false)
    private String Civility;

    @Column(name = "email")
    private String email;

    @Column(name = "adress")
    private String adress;

    public Person() {
    }

    public Person(Long id, String last_Name, String first_Name, String civility, String email, String adress) {
        this.id = id;
        this.last_Name = last_Name;
        this.first_Name = first_Name;
        Civility = civility;
        this.email = email;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getCivility() {
        return Civility;
    }

    public void setCivility(String civility) {
        Civility = civility;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", last_Name='" + last_Name + '\'' +
                ", first_Name='" + first_Name + '\'' +
                ", Civility='" + Civility + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
