<?php

header("Content-type: application/json;charset=utf-8");
include "conecta.php";

$sql = "SELECT * FROM  aluno ORDER BY nome";

$consulta = $con->prepare($sql);
$consulta->execute();

while($dados = $consulta->fetch(PDO::FETCH_OBJ)){
	$json[] = $dados;
}
echo  json_encode($json);