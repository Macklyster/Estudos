package com.alex.trabalho.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.alex.trabalho.model.Produtos;

public class CadastroProdutoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Produtos produtos;
	
	@Transacional
	public void salvar(Produtos produtos) {
		produtos.guardar(produtos);
	}
	
	@Transacional
	public void excluir(Produtos produtos) {
		produtos.remover(produtos);
	}
}
