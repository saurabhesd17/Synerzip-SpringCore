package com.saurabh.StandAlone.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Integer> fees;
	private Properties prop;
	
	public List<String> getFriends() {
		return friends;
	}
	public Map<String, Integer> getFees() {
		return fees;
	}
	public Properties getProp() {
		return prop;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + ", prop=" + prop + "]";
	}
}
