<?php
class ContaProtected
{
	private $Limite;
	private $Saldo;
	protected $cpmf;

	function __construct($Saldo)
	{
		$this->Saldo = $Saldo;
		$this->Limite = 200;
		$this->cpmf = 0.0005;
	}

	function Depositar($Valor)
	{
		if($Valor > 0)
		{
			$this->Saldo += $Valor;
		}
	}

	function Sacar($Valor)
	{
		if($this->Saldo + $this->Limite >= $Valor)
		{
			$this->Saldo -= $Valor + $Valor * $this->cpmf;
		}else{
			return false;
		}
	}

	function getSaldo()
	{
		return $this->Saldo;
	}
}

class ContaCorrente extends ContaProtected
{
	function __construct($Saldo)
	{
		parent::__construct($Saldo);

		$this->cpmf = 0.01;
	}
}

$conta2 = new ContaCorrente(800.00);
$conta2->Depositar(100.00);

if(!($conta2->Sacar(800.00)))
{
	echo "Limite Indisponivel. <b>Saldo Indisponivel<b/> {$conta2->getSaldo()}<br>";
}else{
	echo "Limite disponivel. <b>Saldo disponivel<b/> {$conta2->getSaldo()}<br>";
}
?>