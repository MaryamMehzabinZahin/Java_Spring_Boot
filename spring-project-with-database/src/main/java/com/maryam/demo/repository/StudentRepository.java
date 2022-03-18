package com.maryam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryam.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
