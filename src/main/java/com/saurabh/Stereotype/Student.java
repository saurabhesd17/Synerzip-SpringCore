package com.saurabh.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Saurabh Bhende")
	private String name;
	@Value("23")
	private int age;
	@Value("#{city}")
	private List<String> city;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
}
