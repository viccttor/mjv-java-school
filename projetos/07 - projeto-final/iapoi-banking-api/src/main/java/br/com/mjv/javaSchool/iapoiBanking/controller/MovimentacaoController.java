package br.com.mjv.javaSchool.iapoiBanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mjv.javaSchool.iapoiBanking.model.Movimentacao;
import br.com.mjv.javaSchool.iapoiBanking.repository.MovimentacaoRepository;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	// CRUD
	
	//POST
	@PostMapping
	public void gerarMovimentacao(@RequestBody Movimentacao movimentacao) {
		repository.save(movimentacao);
	}
	
	//GET
	@GetMapping
	public List<Movimentacao> listarMovimentacao(Integer id){
		return repository.findAll();
	}
	
	
}
