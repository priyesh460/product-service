package com.priyesh.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyesh.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
