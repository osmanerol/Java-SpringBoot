package com.javaCourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javaCourse.project.hibernateAndJpa.Business.IStudentService;
import com.javaCourse.project.hibernateAndJpa.Entities.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	private IStudentService studentService;

	@Autowired
	public StudentController(IStudentService studentService) {	
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public List<Student> get(){
		return studentService.getAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getById(@PathVariable int id){
		return studentService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Student student) {
		studentService.add(student);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Student student) {
		studentService.update(student);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Student student) {
		studentService.delete(student);
	}
	
	
	
}
