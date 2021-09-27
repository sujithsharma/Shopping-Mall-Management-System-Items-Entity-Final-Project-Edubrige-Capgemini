package com.shopping.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.mall.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

