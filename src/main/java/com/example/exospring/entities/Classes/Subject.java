package com.example.exospring.entities.Classes;

import com.example.exospring.entities.Interface.ISubject;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Time;
@Entity
@Table(name = "Subject")
public class Subject implements ISubject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Column(name = "name",nullable = false)
    private String name;
@Column(name = "time")
    private Time time;
@Column(name = "difficulty")
    private String difficulty;

    public Subject() {
    }

    public Subject(Long id, String name, Time time, String difficulty) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.difficulty = difficulty;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
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
