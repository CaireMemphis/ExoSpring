package com.example.exospring.entities.Classes;

import com.example.exospring.entities.Interface.ISubject;
import org.springframework.data.annotation.Id;
import org.w3c.dom.stylesheets.LinkStyle;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "Subject")
public class Subject implements ISubject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Column(name = "name",nullable = false)
@Size(max = 100)
    private String name;
@Column(name = "time")
    private int time;
@Column(name = "difficulty")
@Size(max = 50)
    private String difficulty;

@ManyToMany(mappedBy = "subjects")
private List<Formator> formators;

    public Subject() {
    }

    public Subject(Long id, String name, int time, String difficulty, List<Formator> formators) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.difficulty = difficulty;
        this.formators = formators;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public List<Formator> getFormators() {
        return formators;
    }

    public void setFormators(List<Formator> formators) {
        this.formators = formators;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
