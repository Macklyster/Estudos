<?php
abstract class Animal
{
	public $Nome;
	public $Idade;

	abstract function Alimentar();
}

/*
As classes que estebderem de Animal, obrigatóriamente devem ter o método Alimentar();
Iremos abaixo criar uma classe Chachorro com o método Alimentar.
 */

class Cachorro extends Animal
{
	public $Raca;

	function Alimentar()
	{
		echo "Minha raça é: {$this->Raca} <br>
			E me Alimentou muito bem!!!";
	}
}

$bob = new Cachorro();
$bob->Nome = "Dog";
$bob->Raca = "Labrador";
$bob->Idade = 2;
$bob->Alimentar();
?>