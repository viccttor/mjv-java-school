package com.mjv.javaSchool.iapoiBanking.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.javaSchool.iapoiBanking.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	@Override
	default Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
