<?php
class Funcionario extends PessoaEmpresa
{
	public $Salario;
	public $Cargo;
	public $DiaPagamento;

	//método construtor, inicializa as propriedade
	function __construct($Nome, $AnoDeNascimento, $Endereco, $Telefone, $Salario, $Cargo, $DiaPagamento)
	{
		//Chamada do métodos do construtor da classe pai
		parent::__construct($Nome, $AnoDeNascimento, $Endereco, $Telefone);

		//Iniciando as váriaveis locais da classe
		$this->Salario = $Salario;
		$this->Cargo = $Cargo;
		$this->DiaPagamento = $DiaPagamento;
	}

	//Escrever Salario
	function EscreverSalario()
	{
		echo "<strong>Salario: </strong> {$this->Salario} <br>";
	}

	//método escreveDados
	function EscreveDados()
	{
		//chamando os dados do método da classe pai
		parent::escreveDados();

		//inserindo os dados da classe local
		echo "
			<strong>Salario: </strong> {$this->Salario}<br>
			<strong>Cargo: </strong> {$this->Cargo}<br>
			<strong>Dia de Pagamento: </strong> {$this->DiaPagamento}<br>
		";
	}
}
?>