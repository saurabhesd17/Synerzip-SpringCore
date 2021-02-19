package com.saurabh.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Earth implements InitializingBean, DisposableBean{
	private int years;

	
	public Earth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Earth [years=" + years + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Initialized destroy method using interface");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialized init method using interface");
		
	}
}
