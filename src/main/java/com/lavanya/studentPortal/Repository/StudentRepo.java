package com.lavanya.studentPortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lavanya.studentPortal.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
