<?php
if(isset($_GET["email"]))
{
	include "conecta.php";

	$email = trim($_GET["email"]);

	if(filter_var($email, FILTER_VALIDATE_EMAIL))
	{

		$sql = "select * from cliente where email = ? limit 1";
		$query = $con->prepare($sql);
		$query->bindParam(1,$email);
		$query->execute();

		$dados = $query->fetch(PDO::FETCH_OBJ);

		if(!empty($dados->email))
		{
			echo "O e-mail digitado está em uso.";
		}

	}else{
		echo "Este e-mail é inválido.";
	}
}else{
	echo "Erro ao verificar";
}
?>