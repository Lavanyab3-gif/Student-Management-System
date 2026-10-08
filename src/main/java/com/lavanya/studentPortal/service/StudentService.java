package com.lavanya.studentPortal.service;

import java.util.List;

import com.lavanya.studentPortal.model.Student;

public interface StudentService {
	Student saveStudent(Student s);
	
	Student getStudent(Integer id);
	
	List <Student> getAllStudents();
	
	void deleteStudent(Integer id);
	
	

	Student updateStudent(Student s);
	

}
