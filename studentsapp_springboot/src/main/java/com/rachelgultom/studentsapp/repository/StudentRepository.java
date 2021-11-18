package com.rachelgultom.studentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rachelgultom.studentsapp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
