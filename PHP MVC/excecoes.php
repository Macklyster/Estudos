<?php
//charset
header("Content-Type: text/html;charset=utf-8");

//função openfile - Iremos usar o throw para erros

function openFile($arquivo = null)
{

	if(!$arquivo)
	{
		throw new Exception("O nome do arquivo não foi especificado.");
	}
	if(!file_exists($arquivo))
	{
		throw new Exception("O Arquivo não existe.");
	}
	if(!$data = file_get_contents($arquivo))
	{
		throw new Exception("Não foi possivel ler o arquivo");
	}

	//retorna o conteudo do arquivo
	return $data;
}

//tenta abrir o arquivo
try
{
	$arquivo = openFile("data.log");
	echo $arquivo;
}
//lança exceção
catch(Exception $exc)
{
	echo $exc->getFile() . " - " . $exc->getLine() . " # " . $exc->getMessage();
}
?>