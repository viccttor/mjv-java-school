package com.mjv.projetoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetoFinal.model.cadastro.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
