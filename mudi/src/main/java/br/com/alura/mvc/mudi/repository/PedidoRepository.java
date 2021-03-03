package br.com.alura.mvc.mudi.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public interface PedidoRepository {
	
	public List<Pedido> findAll();
}
