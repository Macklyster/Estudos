<?php
//verificar se foi enviado um cpf por $_GET
if(isset($_GET['cpf']))
{
	include "conecta.php";
	$cpf = trim($_GET['cpf']);

	//sql para buscar o cliente com este cpf
	$sql = "select * from cliente where cpf = ? limit 1";

	$consulta = $con->prepare($sql);
	$consulta->bindParam(1, $cpf);
	$consulta->execute();
	$dados = $consulta->fetch(PDO::FETCH_OBJ);

	//verificar
	if(!empty($dados->cpf))
	{
		echo "O CPF digitado já existe no sistema";
	}


}else{
	//não existe $_GET['cpf']
	echo "Erro ao verificar CPF";
}
?>