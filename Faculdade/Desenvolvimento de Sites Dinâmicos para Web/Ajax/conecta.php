<?php
	try {
		$servidor = "127.0.0.1";
		$usuario = "root";
		$senha = "root";
		$banco = "ajax";
		$con = new PDO ( "mysql:host=$servidor;dbname=$banco;charset=utf8",$usuario,$senha );
	} catch ( PDOException $e ) {
		echo "Erro ao conectar: " . $e->getMessage();
	}