package com.maryam.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maryam.demo.model.Student;
import com.maryam.demo.repository.StudentRepository;



@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllstudents()   
	{  
//	    List<Student> student = new ArrayList<Student>();  
//		studentRepository.findAll().forEach(student1 -> student.add(student1));  
//		return student;  
		return studentRepository.findAll();
	}  
	
	public Student getStudentsById(int id)   
	{  
		return studentRepository.findById(id).get();  
	}  
	
	
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
		
	}
	
	public void update(Student student, int id)   
	{  
		studentRepository.save(student);
	}  
	
	public void delete(int id)   
	{  
	studentRepository.deleteById(id);  
	} 
}
