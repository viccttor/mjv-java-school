package com.mjv.javaSchool.iapoiBanking.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.javaSchool.iapoiBanking.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
