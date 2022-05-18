package com.mjv.javaSchool.iapoiBanking.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.javaSchool.iapoiBanking.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
	Optional<Endereco> findById(Integer id);
	
}
