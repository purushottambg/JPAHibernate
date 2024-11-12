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

    @Column(length = 60)
    private String prodName;

    @Column
    private String productCat;

    @Column
    private int quantity;

    @Column
    private String type;

    @Column
    private BigDecimal price;

    @Column
    private String prodDescription;

    @UpdateTimestamp
    private LocalDateTime lastUpdate;

}
