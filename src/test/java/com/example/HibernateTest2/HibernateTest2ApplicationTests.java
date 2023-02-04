package com.example.HibernateTest2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.HibernateTest2.entities.Product;
import com.example.HibernateTest2.repos.ProductRepo;

@SpringBootTest
class HibernateTest2ApplicationTests {
	@Autowired
	ProductRepo productRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setDesc("HELLO DESC");
		productRepo.save(product);
	}

}
