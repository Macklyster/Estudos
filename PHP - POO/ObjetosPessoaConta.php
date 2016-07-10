<?php
	require_once("Pessoa.class.php");
	require_once("Conta.class.php");

	//Criando um objeto Alex
	$alex = new Pessoa();
	$alex->Codigo = 5;
	$alex->Nome = "AlexMCoder";
	$alex->Altura = 1.70;
	$alex->AnoNascimento = 1993;
	$alex->Salario = 8000;

	//Criação do objeto Conta Alex
	$conta_alex = new Conta();
	$conta_alex->Titular = $alex;
	$conta_alex->Agencia = 8888;
	$conta_alex->CodigoAgencia = 33;
	$conta_alex->Conta = 887522;
	$conta_alex->CodigoConta = 4444;
	$conta_alex->Saldo = 1500;
	$conta_alex->Cancelada = false;

	//Manipulando os Dados;
	echo "<strong>Nome: </strong>". $alex->Nome. "<br>".
		"<strong>Idade: </strong>". $alex->ObterIdade() . "<br>".
		"<strong>Saldo Atual: </strong>" . $conta_alex->Saldo. "<br><br>";

	$conta_alex->Depositar(5000);
	echo "<strong>Depósito - Novo Saldo: </strong>" . $conta_alex->Saldo . "<br><br>";

	$conta_alex->Sacar(2000);
	echo "<strong>Saque - Novo Saldo: </strong>" . $conta_alex->Saldo;
?>