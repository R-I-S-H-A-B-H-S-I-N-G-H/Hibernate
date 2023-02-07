package com.example.HibernateTest2;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.example.HibernateTest2.entities.Product;
import com.example.HibernateTest2.entities.User;
import com.example.HibernateTest2.repos.ProductRepo;
import com.example.HibernateTest2.repos.UserRepo;

@SpringBootTest
class HibernateTest2ApplicationTests {
	@Autowired
	ProductRepo productRepo;
	@Autowired
	UserRepo userRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setDescription("HELLO DESC");
		productRepo.save(product);
	}

	@Test
	public void testRead() {
		Product product = productRepo.findById(1).get();
		System.out.println(product);
	}

	@Test
	public void testUpdate() {
		Product product = productRepo.findById(1).get();
		product.setDescription("UPDATED DESC");
		productRepo.save(product);
	}

	@Test
	public void delete() {
		productRepo.deleteById(1);
	}

	// TEST USERS
	@Test
	public void createUser() {
		User user = new User("new rgrg", "Sindfdsfgh", LocalDate.now().minusYears(50));
		userRepo.save(user);
	}

	@Test
	public void findallbypage() {
		Pageable pg = PageRequest.of(0, 2);
		userRepo.findAll(pg).forEach(ele -> System.out.println("->>>>>>>>>>>>>>>" + ele));
	}

	@Test
	public void findallbySorting() {
		// Pageable pg = PageRequest.of();
		userRepo.findAll(Sort.by(new Sort.Order(Direction.DESC, "id")))
				.forEach(ele -> System.out.println("->>>>>>>>>>>>>>>" + ele));
	}

	// @Test
	// public void updateUser() {

	// }

	// @Test
	// public void deleteUser() {

	// }

}
