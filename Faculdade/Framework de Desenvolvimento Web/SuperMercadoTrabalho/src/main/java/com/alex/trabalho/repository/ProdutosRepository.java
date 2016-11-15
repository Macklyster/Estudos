package com.alex.trabalho.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.alex.trabalho.model.Produtos;

public class ProdutosRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	EntityManager manager;
	
	public Produtos porId(Long id) {
		return manager.find(Produtos.class, id);
	}
	
	public List<Produtos> todos() {
		return manager.createQuery("FROM Produtos", Produtos.class).getResultList();
	}
	
	public Produtos guardar(Produtos produto) {
		return manager.merge(produto);
	}
	
	public void remover(Produtos produto) {
		produto = porId(produto.getId());
		manager.remove(produto);
	}
	
}
