package com.mjv.projetoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetoFinal.model.cadastro.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
