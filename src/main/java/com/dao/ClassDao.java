package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Class;

import com.resource.DbResource;

public class ClassDao {

	 public int addClass(Class clazz) {
	    	SessionFactory sf = DbResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(clazz);
			tran.commit();		
			return 1;
	        }
	 
	 public List<Class> findAllClass() {
			SessionFactory sf = DbResource.getSessionFactory();
			Session session = sf.openSession();
			TypedQuery tq = session.createQuery("from Class");
			List<Class> listOfClass = tq.getResultList();
			return listOfClass;
           }
}
