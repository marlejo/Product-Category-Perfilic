package com.prueba.perfiltic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.perfiltic.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
