package com.rachelgultom.studentsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rachelgultom.studentsapp.model.Student;
import com.rachelgultom.studentsapp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	
	
}
