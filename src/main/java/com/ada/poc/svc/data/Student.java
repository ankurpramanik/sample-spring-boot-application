package com.ada.poc.svc.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name = "student_name", nullable = false)
	private String studentName;
	
	@Column(name = "phone_no", nullable = false)
	private String phoneNo;
	
	@Column(name = "address", nullable = false)
	private String address;
}
