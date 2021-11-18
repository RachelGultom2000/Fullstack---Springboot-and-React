package com.rachelgultom.studentsapp.service;

import java.util.List;

import com.rachelgultom.studentsapp.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
