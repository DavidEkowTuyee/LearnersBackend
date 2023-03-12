package com.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
@Table(name="teachers")


public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    
    @OneToMany(mappedBy="teacher")
    		                         // this annotation is use to link fk in student table 
    private List<Student> listOfStd;// trainer has more than one student

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getListOfStd() {
		return listOfStd;
	}

	public void setListOfStd(List<Student> listOfStd) {
		this.listOfStd = listOfStd;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", listOfStd=" + listOfStd + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getListOfStd()=" + getListOfStd() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

//    @OneToMany(mappedBy="teacher")
//    // this annotation is use to link fk in student table 
//     private List<Subject> listOfSub;

	

	
}