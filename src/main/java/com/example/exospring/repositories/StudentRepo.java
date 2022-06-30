package com.example.exospring.repositories;

import com.example.exospring.entities.Classes.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
