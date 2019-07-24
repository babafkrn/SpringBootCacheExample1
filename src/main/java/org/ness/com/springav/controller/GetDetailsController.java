/**
 * 
 */
package org.ness.com.springav.controller;

import java.util.Arrays;
import java.util.List;

import org.ness.com.springav.model.Customer;
import org.ness.com.springav.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author P7108899
 *
 */
@RestController
public class GetDetailsController {

	@GetMapping("/get-products-info")
	@Cacheable(value = "cacheProductInfo")
	public List<Product> getProductsInfo() {
		
		System.out.println("getProductsInfo method invoked");
		
		List<Product> productsList = Arrays.asList(
			new Product(101, "Biology", 29292L),
			new Product(103, "Mathematics", 39292L),
			new Product(103, "Mathematics", 39292L));
		
		return productsList;
	}
	
	@GetMapping("/get-customers-info")
	public List<Customer> getCustomersInfo() {
		
		System.out.println("getCustomersInfo method invoked");
		
		List<Customer> customersList = Arrays.asList(
			new Customer(101, "Rajesh", "Hyderabad"),
			new Customer(103, "Mahesh", "Chennai"),
			new Customer(103, "Lokesh", "Bangalore"));
		
		return customersList;
	}
}
