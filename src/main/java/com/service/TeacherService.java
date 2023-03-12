package com.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.TeacherDao;
import com.entity.Teacher;

import com.resource.DbResource;

public class TeacherService {

	TeacherDao pd  = new TeacherDao();
	
	public String addTeacher(Teacher teacher) {
		if(pd.addTeacher(teacher)>0) {
			return "Subject data stored successfully";
		}else {
			return "Subject details didn't store";
		}
	}
	
	public List<Teacher> findAllTeacher() {
		return pd.findAllTeacher();
	}
}
