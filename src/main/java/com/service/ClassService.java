package com.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ClassDao;
import com.entity.Class;

import com.resource.DbResource;

public class ClassService {

	ClassDao pd  = new ClassDao();
	
	public String addClass(Class clazz) {
		if(pd.addClass(clazz)>0) {
			return "Class data stored successfully";
		}else {
			return "Class details didn't store";
		}
	}
	
	public List<Class> findAllClass() {
		return pd.findAllClass();
	}
}