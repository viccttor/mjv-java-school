package com.mjv.javaSchool.iapoiBanking.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.javaSchool.iapoiBanking.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	List<Cliente> findByCpf(String cpf);
	
}
