<?php
abstract class Animal
{
	public $Nome;
	public $PesoGramas;

	//Método Construtor, inicializa as propriedades
	function __construct($Nome, $PesoGramas)
	{
		$this->Nome = $Nome;
		$this->PesoGramas = $PesoGramas;
	}

	//Método MeuPeso() - Comum em todas as Classes.
	function MeuPeso()
	{
		$PesoGramas = $this->PesoGramas / 1000;

		if($this->PesoGramas > 4000 && $this->PesoGramas < 15000)
		{
			echo $PesoGramas . "KG sou pesadinho!<br>";
		}elseif($this->PesoGramas > 15000)
		{
			echo $PesoGramas . "KG sou pesadão!<br>";
		}else{
			echo $PesoGramas . "KG sou levinho!<br>";
		}
	}

	//Método Fale();
	function Fale()
	{
		echo $this->Nome . " - Eu sou Mudo!<br>";
	}

	//Método Alimentar();
	function Alimentar()
	{
		echo "Estou me Alimentando<br>";
	}
}
?>