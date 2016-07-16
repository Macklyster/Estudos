<?php

/*
Explicação: O método get_class, retorna o nome da classe em que o objeto pertence.
 */
class Pessoa
{
	public $Nome;
	public $Idade;

}

$newPessoa = new Pessoa();
$newPessoa->Nome = "Alex";
$newPessoa->Idade = 23;

//Testando o método:
print_r(get_class($newPessoa));
?>