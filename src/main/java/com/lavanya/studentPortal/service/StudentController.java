package com.lavanya.studentPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lavanya.studentPortal.model.Student;

//http:localhost:1234/student
@RestController
@CrossOrigin(origins = "http://localhost:5173")

@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping("hello")
	String hello() {
		return "Hello, Good Morning";
	}
	//http:localhost:1234/student/getAllStudents
	@GetMapping("/getAllStudents")
	List<Student>getAllStudentsApp(){
		return studentService.getAllStudents();
	}

	// http:localhost:1234/student//CreateStudent
	@PostMapping("/CreateStudent")
	Student createStudent(@RequestBody Student s) {
		return studentService.saveStudent(s);
	}
	
	//http:localhost:1234/student/deleteStudent
	@DeleteMapping("deleteStudent/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		studentService.deleteStudent(id) ;
		return "Deleted Succussfully";
		
	}
	//http:localhost:1234/student/updateStudent
	@PutMapping("updateStudent/{id}")
	Student updateStudent(@PathVariable Integer id, @RequestBody Student s) {
		Student studentFromDB = studentService.getStudent(id);

		    studentFromDB.setAge(s.getAge());
		    studentFromDB.setCity(s.getCity());
		    studentFromDB.setFirstname(s.getFirstname());
		    studentFromDB.setLastname(s.getLastname());
		    studentFromDB.setTotalmarks(s.getTotalmarks());

		    return studentService.updateStudent(studentFromDB);
		}
		
		 
	}
	  
		

	


