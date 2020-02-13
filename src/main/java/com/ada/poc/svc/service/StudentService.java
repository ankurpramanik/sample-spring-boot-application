package com.ada.poc.svc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.ada.poc.svc.data.Student;
import com.ada.poc.svc.repo.StudentRepo;

@Service
public class StudentService {

	private StudentRepo studentRepo;

	@Autowired
	public void setStudentRepo(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();

		students = studentRepo.findAll();

		return students;
	}

	public void saveStudent(Student student) {
		studentRepo.save(student);

	}

	public Optional<Student> getStudentById(int id) {
		Optional<Student> student=studentRepo.findById(id);
		return student;
	}

}
