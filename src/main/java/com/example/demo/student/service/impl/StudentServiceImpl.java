package com.example.demo.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.student.pojo.Student;
import com.example.demo.student.repo.StudentRepository;
import com.example.demo.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student saveOrUpdateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public String deleteStudentById(String id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Student deleted";
		
	}

	@Override
	public Student deleteStudentByRollNo(String rollNo) {
		// TODO Auto-generated method stub
		Student temp = studentRepository.findStudentByRollNo(rollNo);
		studentRepository.delete(temp);
		return temp;
	}

}
