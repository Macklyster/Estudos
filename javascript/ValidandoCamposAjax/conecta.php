<?php
ini_set('display_errors',1);
ini_set('display_startup_erros',1);
error_reporting(E_ALL);
try {
	$servidor = "localhost";
	$usuario = "root";
	$senha = "123456";
	$banco = "cidade";
	$con = new PDO ( "mysql:host=$servidor;dbname=$banco;charset=utf8",$usuario,$senha );
} catch ( PDOException $e ) {
	echo "Erro ao conectar: " . $e->getMessage();
}