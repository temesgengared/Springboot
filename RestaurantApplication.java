package com.lemlem.restaurant;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestaurantApplication {
	@Autowired
	DataSource datasource;
@GetMapping("/hello")
public String hello() {
	try {
		if(datasource.getConnection()!=null) {
		System.out.println("connectedsuccesfull");	
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return "Hello, Spring Boot!";
}


	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

}
