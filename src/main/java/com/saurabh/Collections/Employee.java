package com.saurabh.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private List<Integer> phones;
	private Set<String> addresses;
	private Map<String, String> courses;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, List<Integer> phones, Set<String> addresses, Map<String, String> courses) {
		this.id = id;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
}
