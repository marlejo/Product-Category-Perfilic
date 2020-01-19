package com.prueba.perfiltic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.perfiltic.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
