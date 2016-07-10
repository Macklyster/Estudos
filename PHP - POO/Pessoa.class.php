<?php
class Pessoa
{
	public $Codigo;
	public $Nome;
	public $Altura;
	public $AnoNascimento;
	public $Salario;

	//Método Crescer: Aumenta a estatura em centimetros, pega altura atual e soma com o centimetros passado em parãmetro
	function Crescer($centimetros)
	{
		if($centimetros > 0)
		{
			$this->Altura += $centimetros;
		}
	}

	//Método AumentaSalario: Pega o valor passado no parâmetro e soma com o Salario atual.
	function AumentaSalario($reais)
	{
		if($reais > 0)
		{
			$this->Salario += $reais;
		}
	}

	//Método ObterIdade;
	function ObterIdade()
	{
		$ano_atual = date("Y",time()); //Método Date para pegar o ano
		return $ano_atual - $this->AnoNascimento;
	}
}
?>