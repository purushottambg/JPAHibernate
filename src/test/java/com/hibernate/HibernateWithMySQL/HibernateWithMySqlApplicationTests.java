package com.hibernate.HibernateWithMySQL;

import com.hibernate.HibernateWithMySQL.Repository.ProductRepository;
import com.hibernate.HibernateWithMySQL.entities.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
<<<<<<< HEAD
import java.util.List;
=======
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
>>>>>>> EmployeeTableCreation


@SpringBootTest
class HibernateWithMySqlApplicationTests {
	@Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void testRepo(){
		ProductEntity productEntity = ProductEntity.builder()
		.productId(29785L)
				.price(BigDecimal.valueOf(2300))
				.type("Food")
				.productCat("Grocery")
				.prodDescription("Pulses are pure and less processed, free of chemical")
				.quantity(2)
				.prodName("MasurDal")
		.build();

		ProductEntity saveProductEntity = productRepository.save(productEntity);
		System.out.println(saveProductEntity);
	}

	@Test
	void getRepository(){
		List<ProductEntity>  entities = productRepository.findAll();
		System.out.println(entities);
	}
<<<<<<< HEAD
=======

	@Test
	void getRepo1(){
		List<ProductEntity> titledEntities = productRepository.findByproductCat("Food");
		System.out.println(titledEntities);
	}

	@Test
	void findAfterDate(){
		List<ProductEntity> findCreatedAfter=
				productRepository.findByRegisteredAtAfter(LocalDateTime.of(2024, 11, 10, 0,0,0) );
		System.out.println(findCreatedAfter);
	}

	@Test
	void findByQuantityBetween(){
		List<ProductEntity> quntityEntities = productRepository.findByQuantityBetween(1, 2200);
		System.out.println("Found the below for quantity between "+quntityEntities);
	}

	@Test
	void findByqtyAndPrice(){
		List<ProductEntity> qtyAndPrice = productRepository.findByQuantityAndPrice(2, BigDecimal.valueOf(2300.00));
		System.out.println("Qty and Price: "+qtyAndPrice);
	}
	@Test
	void findByID(){
		Optional<ProductEntity> specificID = productRepository.findById(Long.valueOf(2));
		specificID.ifPresent(System.out::println);   //will check if present, and print if it presents
	}

	@Test
	void findByproductId(){
		Optional<ProductEntity> specificData = productRepository.findByproductId(Long.valueOf(23));
		specificData.ifPresent(System.out::println);  //will check if present, and print if it presents
	}
>>>>>>> EmployeeTableCreation
}
