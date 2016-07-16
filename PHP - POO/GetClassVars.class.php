<?php

/*
Explicação: O método get_class_vars, retorna todas as propriedades da classe passada em parâmetro.
 */
class Pessoa
{
	public $nome;
	public $idade;
}


//Testando o método
print_r(get_class_vars('Pessoa'));
?>