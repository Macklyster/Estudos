<?php
class MeAcesseEstatico{
	public static $contador;

	public function __construct()
	{
		self::$contador ++;
	}

	public static function QuantasVezesFuiUtilizada()
	{
		echo "Fui utilizado {".self::$contador."} vezes";
	}
}

$objeto1 = new MeAcesseEstatico();
$objeto2 = new MeAcesseEstatico();
$objeto3 = new MeAcesseEstatico();
$objeto4 = new MeAcesseEstatico();
$objeto5 = new MeAcesseEstatico();
$objeto6 = new MeAcesseEstatico();
$objeto7 = new MeAcesseEstatico();
$objeto8 = new MeAcesseEstatico();

echo MeAcesseEstatico::QuantasVezesFuiUtilizada();
?>