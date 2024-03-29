package com.anbima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anbima.model.Cliente;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, String> { }
