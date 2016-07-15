<?php
function __autoload($classes)
{
	$dir = $classes.".class.php";
	if(file_exists($dir))
	{
		require_once($dir);
	}
}

$teste01 = new TesteAutoLoad01();
$teste01->propriedade = "Classe 01";
echo $teste01->propriedade . "<br>";

$teste02 = new TesteAutoLoad02();
$teste02->propriedade = "Classe 02";
echo $teste02->propriedade;
?>