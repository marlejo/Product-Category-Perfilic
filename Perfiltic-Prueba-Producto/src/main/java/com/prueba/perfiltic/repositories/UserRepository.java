package com.prueba.perfiltic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.perfiltic.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
