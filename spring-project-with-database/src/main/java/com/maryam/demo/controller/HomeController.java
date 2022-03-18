package com.maryam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maryam.demo.model.Student;
import com.maryam.demo.service.StudentService;

@RestController
public class HomeController {
	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/home")
	public String homePage() {
		System.out.println("Hello, this is home page");
		return "Hello, this is home page";
	}
	
	@GetMapping("/students")  
	private List<Student> getAllstudents()   
	{  
		return studentService.getAllstudents();  
	}  

	@GetMapping("/students/{student_id}")  
	private Student getStudents(@PathVariable("student_id") int student_id)   
	{  
		return studentService.getStudentsById(student_id);  
	}  
	
	@PostMapping("/profiles")  
	private int saveBook(@RequestBody Student student)   
	{  
	studentService.saveOrUpdate(student);  
	return student.getStudent_id();  
	}  
	
	@PutMapping("/edit")  
	private Student update(@RequestBody Student student)   
	{  
		studentService.saveOrUpdate(student); 
		return student;  
	}  
	
	@DeleteMapping("/delete/{student_id}")  
	private void deleteStudent(@PathVariable("student_id") int student_id)   
	{  
		studentService.delete(student_id);  
	}  
}
