package com.javaCourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javaCourse.project.hibernateAndJpa.Entities.Student;

public interface IStudentService {
	List<Student> getAll();
	void add(Student student);
	void update(Student student);
	void delete(Student student);
	Student getById(int id);
}
