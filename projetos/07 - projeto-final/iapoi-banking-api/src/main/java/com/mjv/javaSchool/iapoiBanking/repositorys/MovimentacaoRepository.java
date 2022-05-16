package com.mjv.javaSchool.iapoiBanking.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
	
		//public List<Movimentacao>buscarMovimentacaoIdConta(Integer idConta);

}
