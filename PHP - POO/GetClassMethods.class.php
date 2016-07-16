<?php
/*
Explicação: O método get_class_methods, mostrar todos os método da classe passada no parâmetro.
 */
class Pessoa
{
	public function setNome()
	{

	}
	public function setIdade()
	{
		
	}
	public function getNome()
	{
		
	}
	public function getIdade()
	{
		
	}

}

//usando o método:
print_r(get_class_methods('Pessoa'));
?>