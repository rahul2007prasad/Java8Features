package com.java8.interview;

public class Employee {
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String id, String city, double salary, String department, int age, String active,
			int yearOfJoining) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.salary = salary;
		this.department = department;
		this.age = age;
		this.active = active;
		this.yearOfJoining = yearOfJoining;
	}

	private String name;
	private String id;
	private String city;
	private double salary;
	private String department;
	private int age;
	private String active;
	private int yearOfJoining;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
