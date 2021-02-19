package com.saurabh.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 
 * @author saurabh
 *We're showing life cycle of bean using Annotations @PostConstruct and @PreDestroy
 */
public class Sun {
	private String life;

	public Sun() {
		// TODO Auto-generated constructor stub
	}

	public String getLife() {
		return life;
	}

	public void setLife(String life) {
		this.life = life;
	}

	@Override
	public String toString() {
		return "Sun [life=" + life + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initialized init method using annotations");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Initialized destroy method using annotations");
	}
}
