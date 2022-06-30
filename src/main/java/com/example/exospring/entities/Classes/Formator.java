package com.example.exospring.entities.Classes;

import com.example.exospring.entities.Interface.IFormator;


import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@DiscriminatorValue("Formator")
public class Formator extends Person implements IFormator {

@Column(name = "hiredDate",nullable = false)
@Temporal(TemporalType.DATE)
    private Date hiredDate;
@Column(name = "experience")
    private String experience;
@Column(name = "status")
    private String status;


@ManyToMany
@JoinTable
        (name = "skills",
        joinColumns = @JoinColumn(name = "person_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_id")
)
private List<Subject> subjects;

@OneToMany
@JoinColumn(name = "person_id")
private List<Student> students;



    public Formator() {
    }

    public Formator(Long id, String last_Name, String first_Name, String civility, String email, String adress, Date hiredDate, String experience, String status) {
        super(id, last_Name, first_Name, civility, email, adress);
        this.hiredDate = hiredDate;
        this.experience = experience;
        this.status = status;
    }
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Formator{" +
                "hiredDate=" + hiredDate +
                ", experience='" + experience + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
