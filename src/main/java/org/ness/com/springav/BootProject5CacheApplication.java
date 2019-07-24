package org.ness.com.springav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BootProject5CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProject5CacheApplication.class, args);
	}
}
