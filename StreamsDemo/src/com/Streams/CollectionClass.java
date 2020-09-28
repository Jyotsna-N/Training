package com.Streams;

public class CollectionClass {
	private int employee_id;
	private String name;
	private int salary;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public CollectionClass(int employee_id, String name, int salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.salary = salary;
	}

}
