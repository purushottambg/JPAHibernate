package com.hibernate.HibernateWithMySQL.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@Table(name = "product_table",
    uniqueConstraints = {
        @UniqueConstraint(name = "product_cat", columnNames ="productCat" ),
        @UniqueConstraint(name = "type_qty_price", columnNames = {"quantity", "type", "price"})
}
)
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    @CreationTimestamp
    private LocalDateTime registeredAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(length = 20, nullable = false)
    private String prodName;

    @Column(nullable = false)
    private String productCat;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private BigDecimal price;

    @Column
    private String prodDescription;

    @UpdateTimestamp
    private LocalDateTime lastUpdate;

}
