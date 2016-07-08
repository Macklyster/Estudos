<?php
	class Carro{
		public $Modelo;
		public $Cilindradas;
		public $Portas;
		public $Cor;
		public $Ano;

		function VerCarro()
		{
			echo "<ul>
					<li>Modelo: $this->Modelo</li>
					<li>Cilindradas: $this->Cilindradas</li>
					<li>Portas: $this->Portas</li>
					<li>Cor: $this->Cor</li>
					<li>Ano: $this->Ano</li>
				</ul>";
		}
	}
?>