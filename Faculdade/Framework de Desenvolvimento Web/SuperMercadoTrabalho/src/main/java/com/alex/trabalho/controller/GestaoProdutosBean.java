package com.alex.trabalho.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.weld.context.RequestContext;

import com.alex.trabalho.model.Produtos;
import com.alex.trabalho.repository.ProdutosRepository;

@Named
@ViewScoped
public class GestaoProdutosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProdutosRepository produtosRepository;

	private List<Produtos> todosProdutos;
	
	public void consultar() {
		todosProdutos = produtosRepository.todos();
	}

	public List<Produtos> getTodosProdutos() {
		return todosProdutos;
	}
	
}
