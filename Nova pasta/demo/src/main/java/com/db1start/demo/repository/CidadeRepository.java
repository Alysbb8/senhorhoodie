package com.db1start.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1start.demo.domain.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	Optional<Cidade> findByNome(String nome);

}
