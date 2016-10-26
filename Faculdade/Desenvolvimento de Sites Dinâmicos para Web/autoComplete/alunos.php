<?php

header("Content-type: application/json;charset=utf-8");
include "conecta.php";

$sql = "SELECT * FROM  aluno ORDER BY nome";

$consulta = $con->prepare($sql);
$consulta->execute();

//quantidade de resultados
$q = $consulta->rowCount();

//contador iniciando em 1
$i = 1;

echo "[\n";
while($dados = $consulta->fetch(PDO::FETCH_OBJ)){
	$ra = $dados->ra;
	$nome = $dados->nome;

	echo "{\"nome\":\"$nome\",\"ra\":\"$ra\"}";

	//verificar se o i é maior que a quantidade
	if($i < $q) echo ",\n";
	//somar mais um
	$i++;
}
echo "\n]";