package com.saurabh.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{45+55}")
	private int num1;
	
	@Value("#{100>50 ? 100:50}")
	private int num2;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double sqrt;
	
	@Value("#{T(java.lang.Math).PI}")
	private double PI;
	
	@Value("#{new java.lang.String('Saurabh Bhende')}")
	private String name;
	
	@Value("#{ 2>1 }")
	private boolean isActive;
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public double getSqrt() {
		return sqrt;
	}
	public double getPI() {
		return PI;
	}
	public String getName() {
		return name;
	}
	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Demo [num1=" + num1 + ", num2=" + num2 + ", sqrt=" + sqrt + ", PI=" + PI + ", name=" + name + ", isActive=" + isActive + "]";
	}
}
