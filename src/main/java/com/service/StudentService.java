package com.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.StudentDao;
import com.entity.Student;

import com.resource.DbResource;

public class StudentService {

	StudentDao pd  = new StudentDao();
	
	public String addStudent(Student student) {
		if(pd.addStudent(student)>0) {
			return "Student data stored successfully";
		}else {
			return "Student details didn't store";
		}
	}
	
	public List<Student> findAllStudent() {
		return pd.findAllStudent();
	}
}