<?php
class Produto
{
	public $Nome;
	public $Codigo;
	public $Preco;
	public $Fornecedor;

	public function __construct($Nome, $Codigo, $Preco, $Fornecedor)
	{
		$this->Nome = $Nome;
		$this->Codigo = $Codigo;
		$this->Preco = $Preco;
		$this->Fornecedor = $Fornecedor;
	}
}

class Fornecedor{
	public $Codigo;
	public $RazaoSocial;
	public $Endereco;
	public $Telefone;

	public function __construct($Codigo, $RazaoSocial, $Endereco, $Telefone)
	{
		$this->Codigo = $Codigo;
		$this->RazaoSocial = $RazaoSocial;
		$this->Endereco = $Endereco;
		$this->Telefone = $Telefone;
	}
}

$fornecedor = new Fornecedor("AlexMCoder", "GitHub/AlexMCoder", "Rua GitHub", 44444444);

$produto = new Produto("Sistema de Vendas", 44558, 5.000,$fornecedor);

echo "
	<strong>Código: </strong> {$produto->Codigo}<br>
	<strong>Nome: </strong>{$produto->Nome}<br>
	<strong>Razão Social: </strong>{$produto->Fornecedor->RazaoSocial}<br>";
?>