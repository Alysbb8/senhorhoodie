package com.db1start.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1start.demo.domain.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

	Optional<Cliente> findByNome(String nome);
}
