package com.hibernate.HibernateWithMySQL.controller;

import com.hibernate.HibernateWithMySQL.Repository.ProductRepository;
import com.hibernate.HibernateWithMySQL.entities.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/")

public class Product_Controller {
    private final ProductRepository productRepository;
    private final int PAGE_SIZE=5;
    Product_Controller(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @GetMapping(path = "byprice")
    public List<ProductEntity> sortByPrice(){
        return productRepository.findByOrderByPrice();
    }
    @GetMapping(path = "one")
    public String one(){
        return "one";
    }

    @GetMapping(path = "two")
    public String two(){
        return "two";
    }

//    @GetMapping(path = "autovalued")
//    public List<ProductEntity> sortingMethod(@RequestParam String sortBy){
//        return productRepository.findBy(Sort.by(Sort.Direction.DESC, sortBy, "price"));  //Pass multiple attributes so you can sort by multiple values
//    }
    @GetMapping(path = "autovalued")
    public List<ProductEntity> sortingMethod(@RequestParam String sortBy) {
        return productRepository.findAll(Sort.by(Sort.Direction.DESC, sortBy, "price"));
    }
    @GetMapping(path = "paging")
    public Page<ProductEntity> pagesData(@RequestParam(defaultValue = "price") String sortBy,
                                         @RequestParam(defaultValue = "1") Integer pageNumber){
        Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(sortBy));

        return productRepository.findAll(pageable);
    }

}