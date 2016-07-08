<?php

//inserindo a classe carro
require_once "Carro.class.php";

//instanciando um novo objeto
$carro = new Carro();

//Inserindo valor em nosso objeto
$carro->Modelo = "Peugeot 307";
$carro->Cilindradas = 1800;
$carro->Portas = 4;
$carro->Cor = "Azul";
$carro->Ano = 2010;

//imprimindo os valores inseridos no objeto
$carro->VerCarro();