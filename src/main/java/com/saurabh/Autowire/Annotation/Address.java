package com.saurabh.Autowire.Annotation;

public class Address {
	private String city;
	private String country;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
}
