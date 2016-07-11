<?php
class ChequeEspecial extends Cheque
{
	//Método CalcularJuros - Sobrescrito - Polimorfismo
	function CalcularJuros()
	{
		return $this->Valor * 1.10;
	}

	//Método TipoCheque - Sobrescrito - Polimorfismo
	function TipoCheque()
	{
		return "Especial";
	}
}
?>