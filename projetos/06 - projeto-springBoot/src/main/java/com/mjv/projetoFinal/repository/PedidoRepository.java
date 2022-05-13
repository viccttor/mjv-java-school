package com.mjv.projetoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetoFinal.model.pedido.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
