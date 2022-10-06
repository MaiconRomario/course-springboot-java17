package com.devmaicon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmaicon.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
