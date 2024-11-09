package com.hibernate.HibernateWithMySQL;

import com.hibernate.HibernateWithMySQL.Repository.ProductRepository;
import com.hibernate.HibernateWithMySQL.entities.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;


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
	}//
}
