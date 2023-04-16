package com.springdatajpa.springboot;
import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {
	
	@Autowired
	private ProductRepository productRepository;

	@Test
	void saveMethod() {
		//create product
		Product product=new Product();
		product.setName("product 1");
		product.setDescription("product 1 description");
		product.setSku("100ABC");
		product.setActive(true);
		product.setImageUrl("product1.png");
	
		//save product
		Product savedObject=productRepository.save(product);
	//display product info
	
	System.out.println(savedObject.getId());
	System.out.println(savedObject.toString());
	
	}
	@Test
	void updateUsingSaveMethod() {
		
		//find or retrive on entity by id
		Long id=1L;
		Product product =productRepository.findById(id).get();
		
		//update entity information
		product.setName("updated product 1");
		product.setDescription("updated product 1 desc");
		
		//save update entity
		productRepository.save(product);
		
		}
	@Test
	void findByIdMethod() {
		Long id=1L;
		
		Product product=productRepository.findById(id).get();
	}
	
	@Test
	void saveAllMethod() {
		Product product=new Product();
		product.setName("product 2");
		product.setDescription("product 2 description");
		product.setSku("100ABCD");
		product.setActive(true);
		product.setImageUrl("product2.png");
		
		Product product3=new Product();
		product3.setName("product 3");
		product3.setDescription("product 3 description");
		product3.setSku("100ABCDE");
		product3.setActive(true);
		product3.setImageUrl("product3.png");
		
		productRepository.saveAll(List.of(product,product3));
	}
	@Test
	void findAllMethod() {
		List<Product>products=productRepository.findAll();
		products.forEach((p)->{
			System.out.println(p.getName());
		});
		}
	@Test
	void deleteByIdMethod() {
		Long id=1L;
		productRepository.deleteById(id);
	}
	
	@Test
	void deleteMethod() {
		//find on entity by id
		Long id=2L;
		Product product=productRepository.findById(id).get();
		
		//delete(entity)
		productRepository.delete(product);
		
	}
	//for delating all entities in database
//	@Test
//	void deleteAllMethod() {
//		productRepository.deleteAll();
//	}
	}


