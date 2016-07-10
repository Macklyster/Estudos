<?php

class Conta
{
	public $Titular;
	public $Agencia;
	public $CodigoAgencia;
	public $Conta;
	public $CodigoConta;
	public $DataDeCriacao;
	public $Saldo;
	public $Cancelada;

	//Método Sacar: Pega a quantia passada pelo parâmetro e subtrai pelo Saldo
	function Sacar($quantia)
	{
		if($quantia > 0)
		{
			$this->Saldo -= $quantia;
		}
	}

	//Método Depositar: pega a quantia pelo parâmetro e soma com o Saldo atual.
	function Depositar($quantia)
	{
		if($quantia > 0)
		{
			$this->Saldo += $quantia;
		}
	}

	//Método ObterSaldo: Apenas retorna o Saldo atual
	function ObterSaldo()
	{
		return $this->Saldo;
	}
}

?>