package com.saurabh.LifeCycle;

/**
 * 
 * @author saurabh
 *we're showing life cycle of bean using XML.
 */
public class Life {
	private int years;
	
	public Life() {
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
		return "Life [years=" + years + "]";
	}
	
	/**
	 * init method automatically called by spring we just have to set init in config.xml file.
	 * here, you can assign any name to method
	 */
	public void init() {
		System.out.println("Initialized Init Method");
	}
	
	/**
	 * destroy method automatically called by spring we just have to set destroy in config.xml file.
	 * here, you can assign any name to method
	 */
	public void destroy() {
		System.out.println("Initialized Destroy Method");
	}
}
