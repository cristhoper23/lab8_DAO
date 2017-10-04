package com.tecsup.lab08.crud.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstname;
	private String lastname;
	private double salary;
	private Integer age;
	
	public Employee(int id, String firstname, String lastname, double salary, Integer age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.age = age;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", age=" + age + "]";
	}

}
