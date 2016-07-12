<?php
class Utils
{
	public static $propriedade = "Isso é uma propriedade estática";

	public static function RetornaPropriedade()
	{
		return self::$propriedade;
	}
}

class Teste extends Utils
{
	public function __construct()
	{
		echo parent::$propriedade;
		echo parent::RetornaPropriedade();
	}

	public static function OutroMetodoEstatico()
	{
		echo parent::$propriedade;
		echo parent::RetornaPropriedade();
	}
}

//acessando
$objeto = new Teste();
Teste::OutroMetodoEstatico();
?>