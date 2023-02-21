package com.example.demo.student.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.student.pojo.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
	
	Student findStudentByRollNo(String rollNo);

}
