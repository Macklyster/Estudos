<?php

/*
A vantagem de utilizar métodos e propriedade estáticas é que você consegue acessar sem precisar instanciar um objeto
para utilizar um método ou propriedade estático usa-se a palavra self, sem a necessidade do $this para propriedades
 */
class ClasseTeste
{
	public static $propriedade = "Isso é uma propriedade estática<br>";

	public static function RetornaPropriedade()
	{
		return self::$propriedade;
	}

	public static function UsarMetodoInternamente()
	{
		return self::RetornaPropriedade();
	}
}

//acessando os valores, sem precisar de instanciar um método

echo ClasseTeste::RetornaPropriedade();
	ClasseTeste::UsarMetodoInternamente();
?>