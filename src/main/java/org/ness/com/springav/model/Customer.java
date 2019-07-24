/**
 * 
 */
package org.ness.com.springav.model;

/**
 * @author P7108899
 *
 */
public class Customer {

	private int customerNo;
	private String name;
	private String location;
	
	public Customer() {
		
	}
	
	/**
	 * @param customerNo
	 * @param name
	 * @param location
	 */
	public Customer(int customerNo, String name, String location) {
		super();
		this.customerNo = customerNo;
		this.name = name;
		this.location = location;
	}
	
	/**
	 * @return the customerNo
	 */
	public int getCustomerNo() {
		return customerNo;
	}
	/**
	 * @param customerNo the customerNo to set
	 */
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
}
