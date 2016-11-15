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
import com.alex.trabalho.service.CadastroProdutoService;

@Named
@ViewScoped
public class GestaoProdutosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProdutosRepository produtosRepository;
	
	@Inject
	private CadastroProdutoService cadastroProduto;
	
	@Inject
	private FacesMessages messages;

	private List<Produtos> todosProdutos;
	private Produtos produtoEdicao = new Produtos();
	
	public void prepararNovoCadastro() {
		produtoEdicao = new Produtos();
	}
	
	public void salvar() {
		cadastroProduto.salvar(produtoEdicao);
		consultar();

		messages.info("Empresa salva com sucesso!");
		
		RequestContext.getCurrentInstance().update(Arrays.asList("frm:msgs", "frm:produtos-table"));
	}
	
	public void consultar() {
		todosProdutos = produtosRepository.todos();
	}

	public List<Produtos> getTodosProdutos() {
		return todosProdutos;
	}

	public Produtos getProdutoEdicao() {
		return produtoEdicao;
	}

	public void setProdutoEdicao(Produtos produtoEdicao) {
		this.produtoEdicao = produtoEdicao;
	}
	
	
	
}
