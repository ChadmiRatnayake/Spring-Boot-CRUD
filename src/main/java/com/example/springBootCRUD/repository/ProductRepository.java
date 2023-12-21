package com.example.springBootCRUD.repository;

import com.example.springBootCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}
