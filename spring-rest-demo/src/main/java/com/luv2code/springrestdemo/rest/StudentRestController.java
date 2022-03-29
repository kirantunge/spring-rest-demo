package com.luv2code.springrestdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springrestdemo.rest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students = new ArrayList<Student>();

	@PostConstruct
	public void loadStudents() {
		students.add(new Student("Kiran", "Tunge"));
		students.add(new Student("Sandeep", "Panchal"));
		students.add(new Student("Vishu", "Don"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}

	@GetMapping("/students/{id}")
	public Student getStudents(@PathVariable int id) {

		if (id >= students.size() || id < 0) {
			throw new StudentNotFoundException("Student id not found - " + id);
		}

		return students.get(id);
	}
	
}






