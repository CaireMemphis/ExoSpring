package com.example.exospring.entities.Classes;

import com.example.exospring.entities.Interface.IStudent;
import org.hibernate.annotations.Table;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
@Entity

@DiscriminatorValue("Student")
public class Student extends Person implements IStudent {


 @Column(name = "bornDate",nullable = false)
 @Temporal(TemporalType.DATE)
    private Date bornDate;



    public Student() {
    }

    public Student(Long id, String last_Name, String first_Name, String civility, String email, String adress, Date bornDate, Formator formator) {
        super(id, last_Name, first_Name, civility, email, adress);
        this.bornDate = bornDate;

    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }


    @Override
    public String toString() {
        return "Student{" +
                "bornDate=" + bornDate +
                ", formator="  +
                '}';
    }
}
