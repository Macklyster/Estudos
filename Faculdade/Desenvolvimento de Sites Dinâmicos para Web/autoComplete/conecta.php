<?php

try {
		//configurar com os dados do seu servidor
    $servidor = "10.1.1.254";
    $usuario = "1234";
    $senha = "1234";
    $banco = "1234";
    $con = new PDO ( "mysql:host=$servidor;dbname=$banco;charset=utf8",$usuario,$senha );
} catch ( PDOException $e ) {
    	//mostrar erro de conexão
    echo "Erro ao conectar: " . $e->getMessage();
}