package com.lemlem.restaurant;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTest {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductService productService;
	
	@Test
	public void createProduct() {
		Product product = new Product();
		product .setName("bag");
		product.setPrice(35.6);
		
		 
		Product result = productService.createProduct(product);
        assertEquals("bag",result.getName());
		
	}
	@Test
	public void getProductByID() {
//		Product product =new Product
		
		Optional<Product> result = productService.getProductByID(4L);
		assertEquals("bag",result.get().getName());
		
	}
	
		// TODO Auto-generated method stub
		
	}
	

