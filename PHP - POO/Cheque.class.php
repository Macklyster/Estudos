<?php

/*
	Exemplo de Polimorfismo, iremos criar agora um exemplo com cheque.
	O cheque costuma ter dois modelos:
	- Cheque Comum
	- Cheque Especial
	Nesse caso os juros muda de acordo com o tipo de cheque utilizado.

	@Cheque Comum cobra 20% em cima do valor
	@Cheque Especial Cobra 10% em cima do valor

 */
class Cheque
{
	public $Valor;

	//Método Construtor, inicializa as propriedades
	function __construct($Valor)
	{
		$this->Valor = $Valor;
	}

	//Calcula os Juros
	function CalcularJuros()
	{
		return $this->Valor * 1.20;
	}

	//Método TipoCheque
	function TipoCheque()
	{
		return "Comum";
	}
}
?>