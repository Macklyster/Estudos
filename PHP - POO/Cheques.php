<?php
require_once("Cheque.class.php");
require_once("ChequeEspecial.class.php");

$Cheques[1] = new Cheque(300.00);
$Cheques[2] = new ChequeEspecial(800.00);
$Cheques[3] = new Cheque(400.00);

foreach ($Cheques as $key => $Cheque) {
	echo "Cheque $key ({$Cheque->TipoCheque()}) <br>
		com juros: R$ {$Cheque->CalcularJuros()}<br>";
}
?>