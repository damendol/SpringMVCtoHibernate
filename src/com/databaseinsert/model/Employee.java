package com.databaseinsert.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees_autoincrement")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="age")
	private int age;
	
	@Column(name="first")
	private String first;
	
	@Column(name="last")
	private String last;

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setAge(Integer age) {
	   this.age = age;
	}
	public Integer getAge() {
	   return age;
	}
	public void setFirst(String first) {
	   this.first = first;
	}
	public String getFirst() {
	   return first;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getLast() {
		return last;
	}
}