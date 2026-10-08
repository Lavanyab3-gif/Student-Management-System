package com.lavanya.studentPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavanya.studentPortal.Repository.StudentRepo;
import com.lavanya.studentPortal.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student s) {

		return studentRepo.save(s);

	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).orElse(null);
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		

	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepo.save(s);
	}

}
