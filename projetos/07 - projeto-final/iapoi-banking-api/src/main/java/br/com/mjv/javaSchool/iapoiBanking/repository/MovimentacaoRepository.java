package br.com.mjv.javaSchool.iapoiBanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mjv.javaSchool.iapoiBanking.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
