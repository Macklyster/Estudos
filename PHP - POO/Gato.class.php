<?php
class Gato extends Animal
{
	function Fale()
	{
		echo "Meu nome é: " . $this->Nome . " - Miauuuuu!!!<br>";
	}

	function Arranhar()
	{
		echo "Não meche comigo se não eu arranho!<br>";
	}
}
?>