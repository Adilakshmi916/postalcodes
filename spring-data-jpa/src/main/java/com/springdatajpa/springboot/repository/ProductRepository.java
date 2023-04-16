package com.springdatajpa.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
 
	//product-get all the methods to perform CRUD operations for product entity
   //product repository-we don't have to create class to implement this interface


}
