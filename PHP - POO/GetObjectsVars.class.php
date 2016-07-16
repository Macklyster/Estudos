<?php
/*
Explicação: O método get_objets_vars, retorna os valores da propriedade do objeto passado no parâmetro.
 */
class Pessoa
{
	public $Nome;
	public $Idade = 30;
	public $BandoFavorita;
}

$testePessoa = new Pessoa();
$testePessoa->Nome = "Alex";
$testePessoa->Idade = 23;
$testePessoa->BandoFavorita = "Primeiramente, Nocivo Shomon, Legião Urbana, ColdPlay.";

//Imprimindo os valores do objeto:
print_r(get_object_vars($testePessoa));
?>