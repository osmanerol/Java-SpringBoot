package com.javaCourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaCourse.project.hibernateAndJpa.Entities.Student;

@Repository
public class HibernateStudentDal implements IStudentDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateStudentDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Student> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Student> students=session.createQuery("from Student",Student.class).getResultList();
		return students;
	}

	@Override
	@Transactional
	public void add(Student student) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(student);
	}

	@Override
	@Transactional
	public void update(Student student) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(student);
	}

	@Override
	@Transactional
	public void delete(Student student) {
		Session session=entityManager.unwrap(Session.class);
		Student studentToDelete=session.get(Student.class,student.getId());
		session.delete(studentToDelete);
	}

	@Override
	@Transactional
	public Student getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Student student=session.get(Student.class, id);
		return student;
	}

}
