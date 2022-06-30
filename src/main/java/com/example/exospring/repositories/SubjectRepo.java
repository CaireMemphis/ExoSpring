package com.example.exospring.repositories;

import com.example.exospring.entities.Classes.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepo extends JpaRepository<Subject,Long> {



}
