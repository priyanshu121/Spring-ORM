package com.spring.orm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public int insert(Student student) {
        Session session = sessionFactory.getCurrentSession();
        Integer id = (Integer) session.save(student);
        return id;
    }
    
    
    //Get the single data(object)...
    public Student getStudent(int studentId) {
    	Session session=sessionFactory.getCurrentSession();
    	Student student=session.get(Student.class, studentId);
    	return student;
    }
    
    
    //Get multiple data...
    public List<Student> getAllStudents(){
    	Session session=sessionFactory.getCurrentSession();
    	List<Student> students=(List<Student>) session.load(Student.class, session);
    	return students;	
    }
    
    
    // Delete
    @Transactional
    public void deleteStudent(int studentId) {
    	Session session=sessionFactory.getCurrentSession();
    	Student student=session.get(Student.class, studentId); 
    	session.delete(student);
    }
    
    //Updating Data...
    @Transactional
    public void updateStudent(Student student) {
    	Session session=sessionFactory.getCurrentSession();
    	session.update(student);
    	
    }
    
    
    
    
}
