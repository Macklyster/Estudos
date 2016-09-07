<?php

$nome = "Alex ";
$sobrenome = "MCoder";

function imprimir(){
	$variaveis = array(
		"nome" => "Faculdade",
		"sobrenome" => "Alfa"
		);

	extract($variaveis);

}
//chama a função imprimir
imprimir();

//imprime as variáveis
echo $nome . $sobrenome;

/*
Nesse caso será imprimido o nome Alex e o sobrenome MCoder
 */