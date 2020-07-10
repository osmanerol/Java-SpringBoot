package com.javaCourse.project.hibernateAndJpa.DataAccess;

import com.javaCourse.project.hibernateAndJpa.Entities.Student;
import java.util.List;

public interface IStudentDal {
	List<Student> getAll();
	void add(Student student);
	void update(Student student);
	void delete(Student student);
	Student getById(int id);
}