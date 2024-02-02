package com.lemlem.restaurant;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
	@Value ("${spring.datasource.url}")
	String dburl;
	@Value ("${spring.datasource.password}")
	String password;
     @Value ("${spring.datasource.username}")
	String username;
     @Value ("${spring.datasource.driver-class-name}")
 	String drivername;
     
     @Bean 
     @ConditionalOnProperty(name = "use.custom.override", havingValue = "true")
     public DataSource datasource() {
    	 DriverManagerDataSource datasource = new DriverManagerDataSource();
    	 datasource.setDriverClassName(drivername);
    	 datasource.setUrl(dburl);
    	 datasource.setUsername(username);
    	 datasource.setPassword(password);
    	 
    	 return datasource;
     }
	

	}


