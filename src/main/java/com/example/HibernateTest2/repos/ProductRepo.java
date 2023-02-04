package com.example.HibernateTest2.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.HibernateTest2.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {
    
}
