/**
 * 
 */
package org.ness.com.springav.model;

/**
 * @author P7108899
 *
 */
public class Product {

	private int productNo;
	private String productName;
	private Long productPrice;
	
	public Product() {
		
	}
	
	/**
	 * @param productNo
	 * @param productName
	 * @param productPrice
	 */
	public Product(int productNo, String productName, Long productPrice) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	/**
	 * @return the productNo
	 */
	public int getProductNo() {
		return productNo;
	}

	/**
	 * @param productNo the productNo to set
	 */
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productPrice
	 */
	public Long getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
}
