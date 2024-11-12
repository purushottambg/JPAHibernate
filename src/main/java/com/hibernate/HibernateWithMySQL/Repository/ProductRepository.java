package com.hibernate.HibernateWithMySQL.Repository;

import com.hibernate.HibernateWithMySQL.entities.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByproductCat(String cat);

    List<ProductEntity> findByRegisteredAtAfter(LocalDateTime of);

    List<ProductEntity> findByOrderByPrice();

    List<ProductEntity> findByQuantityBetween(int qty1, int qty2);

    List<ProductEntity> findByQuantityAndPrice(int qty, BigDecimal price);

    List<ProductEntity> findBy(Sort sort);

    @Query("select  e from ProductEntity e where e.productId=?1")
    Optional<ProductEntity> findByproductId(Long pid);
}
