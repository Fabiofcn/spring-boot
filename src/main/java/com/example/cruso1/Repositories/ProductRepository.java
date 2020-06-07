package com.example.cruso1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cruso1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
