package com.javaCourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaCourse.project.hibernateAndJpa.DataAccess.IStudentDal;
import com.javaCourse.project.hibernateAndJpa.Entities.Student;

@Service
public class StudentManager implements IStudentService {

	private IStudentDal studentDal;
	
	@Autowired
	public StudentManager(IStudentDal studentDal) {
		this.studentDal = studentDal;
	}

	@Override
	@Transactional
	public List<Student> getAll() {
		return this.studentDal.getAll();
	}

	@Override
	@Transactional
	public void add(Student student) {
		this.studentDal.add(student);
		
	}

	@Override
	@Transactional
	public void update(Student student) {
		this.studentDal.update(student);
	}

	@Override
	@Transactional
	public void delete(Student student) {
		this.studentDal.delete(student);
	}

	@Override
	@Transactional
	public Student getById(int id) {
		return this.studentDal.getById(id);
	}
	
}
