<?php
/*
Um método com a palavra FINAL, significa que ela não pode sobrescrever nas classes filhas.
No exemplo abaixo, iremos colocar na função Testador() a palavra final, se tentarmos fazer
essas mesma função na Classe Teste ocorrerá um erro, informando que ela não pode ser sobrescrita.
 */
abstract class MetodosFinal
{
	public $Nome;
	public $Idade;

	final function Testador()
	{
		echo "Isso é só um teste!";
	}
}

class Teste extends MetodosFinal
{
	public $Testando;

}

$bob = new Teste();
$bob->Nome = "Test";
$bob->Testando = "Testing...";
$bob->Idade = 2;
$bob->Testador();
?>