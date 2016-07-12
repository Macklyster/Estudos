<?php
class Cliente
{
	private $Codigo;
	public $Nome;
	private $Idade;
	private $Sexo;

	public function setIdade($Idade)
	{
		$this->Idade = $Idade;
	}

	public function setSexo($Sexo)
	{
		if(strtoupper($Sexo) == "M" || strtoupper($Sexo) == "F")
		{
			$this->Sexo = $Sexo;
		}
	}

	public function getIdade()
	{
		return $this->Idade;
	}

	public function getSexo()
	{
		return $this->Sexo;
	}
}

$alex = new Cliente();
$alex->Nome = "AlexMCoder";
$alex->setIdade(23);
$alex->setSexo("M");

echo "<strong>Nome: </strong> {$alex->Nome}<br>
		<strong>Idade: </strong> {$alex->getIdade()}<br>
		<strong>Sexo: </strong>{$alex->getSexo()}<br>";
?>