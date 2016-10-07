<?php
include "conecta.php";

$id = "";

if(isset($url[1])){
	$id = trim($url[1]);
}

//seleciona o registro no banco
$sql = "
select *,
date_format(data,'%d/%m/%Y %H:%i:%s') dt
from noticia
where id = ?
limit 1
";
$consulta = $con->prepare($sql);
$consulta->bindParam(1, $id);
$consulta->execute();
$dados = $consulta->fetch(PDO::FETCH_OBJ);

echo "<h1>
$dados->titulo
</h1>
<p>
	$dados->descricao
</p>
<p>
	Data de Postagem: $dados->dt
</p>
<p>
	Link pra página:
	<a href='$dados->link'>$dados->link</a>
</p>";