/**
 * 
 */
package org.ness.com.springav.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author P7108899
 *
 */
@RestController
public class AppController {

	@Value("${application.name:test}")
	private String applicationName;
	
	@GetMapping("/get-application-name")
	public String getApplicationName() {
		
		// write code here
		
		return this.applicationName;
	}
}
