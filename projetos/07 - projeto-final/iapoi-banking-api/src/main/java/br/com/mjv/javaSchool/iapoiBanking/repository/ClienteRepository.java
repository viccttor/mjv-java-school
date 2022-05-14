package br.com.mjv.javaSchool.iapoiBanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mjv.javaSchool.iapoiBanking.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
