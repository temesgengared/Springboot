package com.lemlem.restaurant;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomService {

	@Bean
@ConditionalOnProperty(name="use.custom.override", havingValue="true")
 
	public CustomService customService() {
	return new CustomService();
}
}
