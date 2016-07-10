<?php
class PessoaEmpresa
{
	public $Nome;
	public $AnoDeNascimento;
	public $Endereco;
	public $Telefone;

	//Método Construtor, inicializa as propriedades
	function __construct($Nome, $AnoDeNascimento, $Endereco, $Telefone)
	{
		$this->Nome = $Nome;
		$this->AnoDeNascimento = $AnoDeNascimento;
		$this->Endereco = $Endereco;
		$this->Telefone = $Telefone;
	}

	//Método escreve Dados
	function EscreveDados()
	{
		echo "
			<strong>Nome: </strong> {$this->Nome}<br>
			<strong>Ano de Nascimento: </strong> {$this->AnoDeNascimento}<br>
			<strong>Endereco: </strong>{$this->Endereco}<br>
			<strong>Telefone: </strong> {$this->Telefone}<br>
			";
	}

	//Obter a idade
	function ObterIdade()
	{
		$ano_atual = date("Y",time());
		return $ano_atual - $this->AnoDeNascimento;
	}
}
?>