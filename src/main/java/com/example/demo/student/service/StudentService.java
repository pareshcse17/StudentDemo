package com.example.demo.student.service;

import com.example.demo.student.pojo.Student;

public interface StudentService {
	
	Student saveOrUpdateStudent(Student student);
	Student deleteStudentById(String id);
	Student deleteStudentByRollNo(String rollNo);

}
