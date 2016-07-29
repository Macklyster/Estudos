<?php
try {
	$servidor = "localhost";
	$usuario = "root";
	$senha = "123456";
	$banco = "ajax";
	$con = new PDO ( "mysql:host=$servidor;dbname=$banco;charset=utf8",$usuario,$senha );
} catch ( PDOException $e ) {
	echo "Erro ao conectar: " . $e->getMessage();
}