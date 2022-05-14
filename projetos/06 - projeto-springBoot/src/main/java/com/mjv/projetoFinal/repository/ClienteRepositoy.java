package com.mjv.projetoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetoFinal.model.cadastro.Cliente;

public interface ClienteRepositoy extends JpaRepository<Cliente, Integer>{

}
