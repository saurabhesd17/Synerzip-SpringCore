package com.saurabh.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean(name = {"student", "student1", "student2"})
	public Student getStudent() {
		Student student = new Student(getExam());
		return student;
	}
	
	@Bean
	public Exam getExam() {
		return new Exam();
	}
}
