package com.walmart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.walmart.models.Admin;
import com.walmart.services.AdminService;

@SpringBootApplication
public class WalmartEcommerceBackendApplication {
	
	private static final Logger log = LoggerFactory.getLogger(WalmartEcommerceBackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WalmartEcommerceBackendApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(AdminService srv) {
	    return (args) -> {
	    	if(srv.count()==0) {
	    		srv.updateAdmin(new Admin("admin", "admin", "Administrator"));
	    		log.info("Admin user created successfully");
	    	}
	    };
	}

}
