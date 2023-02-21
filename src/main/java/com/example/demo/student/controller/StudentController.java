package com.example.demo.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.dto.StudentDTO;
import com.example.demo.student.pojo.Student;
import com.example.demo.student.service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("/studStore/")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value = "welcome")
	String welcomeStudent() {
		return "Welcome Student store";
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping(value = "saveOrUpdate")
	public Student saveOrUpdate(@RequestBody Student student) {
		return studentService.saveOrUpdateStudent(student);
	}
	
	@DeleteMapping(value = "deleteById/{id}")
	public String deleteById(@PathVariable String id) {
		return studentService.deleteStudentById(id);
	}
	
	@DeleteMapping(value = "deleteByRollNo/{rollNo}")
	public Student deleteByRollNo(@PathVariable String rollNo) {
		return studentService.deleteStudentByRollNo(rollNo);
	}

}
