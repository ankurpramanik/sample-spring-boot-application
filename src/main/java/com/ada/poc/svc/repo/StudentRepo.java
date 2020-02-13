package com.ada.poc.svc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ada.poc.svc.data.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//	Student findById(int id);

}
