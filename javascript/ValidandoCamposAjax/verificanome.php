<?php
	if (isset($_GET["nome"])){

		include "conecta.php";
		$nome = trim($_GET["nome"]);

		if (filter_var($nome,FILTER_DEFAULT)){
			$sql = "select * from cliente where nome = ? limit 1";
			$consulta = $con->prepare($sql);
			$consulta->bindParam(1,$nome);
			$consulta->execute();
			$dados = $consulta->fetch(PDO::FETCH_OBJ);

			if (!empty($dados->nome)){
				echo "O nome digitado já existe";
			}
		} else {
			echo "Este nome é inválido";
		}

	} else {
		echo "Erro ao verificar";
	}

?>