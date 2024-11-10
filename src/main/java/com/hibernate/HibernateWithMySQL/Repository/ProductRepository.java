package com.hibernate.HibernateWithMySQL.Repository;

import com.hibernate.HibernateWithMySQL.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByproductCat(String cat);

    List<ProductEntity> findByRegisteredAtAfter(LocalDateTime of);

    List<ProductEntity> findByQuantityBetween(int qty1, int qty2);
}
