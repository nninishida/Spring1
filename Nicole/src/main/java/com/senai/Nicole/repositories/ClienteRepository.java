package com.senai.Nicole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Nicole.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
