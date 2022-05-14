package br.com.mjv.javaSchool.iapoiBanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mjv.javaSchool.iapoiBanking.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Integer>{

}
