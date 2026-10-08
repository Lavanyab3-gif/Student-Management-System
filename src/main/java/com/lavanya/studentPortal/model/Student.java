package com.lavanya.studentPortal.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Student77")
@Setter
@Getter
public class Student {
 
	@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Sid;

	String firstname;
	String lastname;
	int age;
	double totalmarks;
	String city;

	
}
