<?php

/*
Interface serve para declarar o que todas as classes que implemetar a interface deve conter.
Nesse caso todas classes obrigatóriamente tem que ter o Connect e o Execute;
Se em alguma das classes retirar um dos métodos, acontecerá um erro ao executar.
 */
interface DataBase
{
	public function Connect();
	public function Execute($sql);
}

class MYSQLDB implements DataBase
{
	public function Connect()
	{
		//codigo
	}
	public function Execute($sql)
	{
		//codigo
	}
}

class PostgreSQLDB implements DataBase
{
	public function Connect()
	{
		//codigo
	}
	public function Execute($sql)
	{
		//codigo
	}
}
?>