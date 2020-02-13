package com.ada.poc.svc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ada.poc.svc.data.Student;
import com.ada.poc.svc.service.StudentService;

@RestController
@Component
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(path = "/getStudents", produces = "application/json")
	public List<Student> getStudents() {

		List<Student> students = studentService.getAllStudents();

		return students;
	}

	@PostMapping(path = "/saveStudent")
	public void saveStudent(@RequestBody Student student) {

		studentService.saveStudent(student);

	}

	@GetMapping(path = "/getStudentById/{id}", produces = "application/json")
	public Optional<Student> getStudentById(@PathVariable(value = "id") int id) {

		Optional<Student> student = studentService.getStudentById(id);

		return student;
	}

}
