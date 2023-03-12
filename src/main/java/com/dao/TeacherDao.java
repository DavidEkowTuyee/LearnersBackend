package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.entity.Teacher;

import com.resource.DbResource;

public class TeacherDao {

	 public int addTeacher(Teacher teacher) {
	    	SessionFactory sf3 = DbResource.getSessionFactory();
			Session session = sf3.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(teacher);
			tran.commit();		
			return 1;
	        }
	 
	 public Teacher findTeacher(int id) {
	    	SessionFactory sf4 = DbResource.getSessionFactory();
			Session session = sf4.openSession();
			TypedQuery<Teacher> query = session.createQuery("SELECT s FROM Teacher s where s.id=:id", Teacher.class);
			query.setParameter("id", id);
			
						
			return query.getSingleResult();
	        }
	 
	 public List<Teacher> findAllTeacher() {
			SessionFactory sf5 = DbResource.getSessionFactory();
			Session session = sf5.openSession();
			TypedQuery tq = session.createQuery("from Teacher");
			List<Teacher> listOfTeacher = tq.getResultList();
			return listOfTeacher;
           }
}
