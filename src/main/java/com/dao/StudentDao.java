package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.dao.TeacherDao;
import com.entity.Teacher;
import com.resource.DbResource;

public class StudentDao {

	 public int addStudent(Student student) {
	    	SessionFactory sf1 = DbResource.getSessionFactory();
			Session session = sf1.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(student);
			tran.commit();		
			return 1;
	        }
	 
	 public int assignStudentToTeacher(int sid, int tid) {
	    	SessionFactory sf1 = DbResource.getSessionFactory();
			Session session = sf1.openSession();
			Transaction tran = session.getTransaction();
			TeacherDao teacherdao = new TeacherDao();
			
			tran.begin();
			Student studentFromDb = findStudent(sid);
//			Teacher teacher ;
			//=teacherdao.findTeacher(tid);
//			studentFromDb.setTeacher(teacher);
				session.save(studentFromDb);
			tran.commit();		
			return 1;
	        }
	 public Student findStudent(int id) {
	    	SessionFactory sf1 = DbResource.getSessionFactory();
			Session session = sf1.openSession();
			TypedQuery<Student> query = session.createQuery("SELECT s FROM Student s where s.id=:id", Student.class);
			query.setParameter("id", id);
			
						
			return query.getSingleResult();
	        }
	 
	 public List<Student> findAllStudent() {
			SessionFactory sf1 = DbResource.getSessionFactory();
			Session session = sf1.openSession();
			TypedQuery tq = session.createQuery("from Student");
			List<Student> listOfStudent = tq.getResultList();
			return listOfStudent;
           }
}
