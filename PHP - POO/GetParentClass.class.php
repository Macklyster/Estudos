<?php
/*
Explicação: O método get_parent_class, retorna o nome da classe ANCESTRAL (classe pai);
 */
class Pessoa
{
	public $Nome;
	public $Idade;
}

class Cliente extends Pessoa{}

$alex = new Cliente();

echo get_parent_class();

echo "<br>";

echo get_parent_class("Cliente");
?>