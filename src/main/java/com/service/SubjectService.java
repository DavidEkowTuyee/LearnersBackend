package com.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SubjectDao;
import com.entity.Subject;

import com.resource.DbResource;

public class SubjectService {

	SubjectDao pd  = new SubjectDao();
	
	public String addSubject(Subject subject) {
		if(pd.addSubject(subject)>0) {
			return "Subject data stored successfully";
		}else {
			return "Subject details didn't store";
		}
	}
	
	public List<Subject> findAllSubject() {
		return pd.findAllSubject();
	}
}