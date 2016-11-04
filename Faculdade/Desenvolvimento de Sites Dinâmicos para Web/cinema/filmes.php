<?php
include "verifica.php";

$sql = "select * from tipo where id = ? limit 1";
$consulta = $con->prepare($sql);
$consulta->bindParam(1, $id);
$consulta->execute();

$dados = $consulta->fetch(PDO::FETCH_OBJ);

?>

<h1>Categoria: <?= $dados->tipo; ?></h1>

<div class="row">
	<?php
	$sql = "select * from filme where tipo_id = ? order by id desc";

	$consulta = $con->prepare($sql);
	$consulta->bindParam(1, $id);
	$consulta->execute();

	while($dados = $consulta->fetch(PDO::FETCH_OBJ))
	{
		$fid = $dados->id;
		$titulo = $dados->titulo;
		$imagem = "imagens/$dados->imagem";

		echo "<div class='col-md-3'>

		<div class='thumbnail'>

			<img src='$imagem' alt='$titulo' />
			<p class='text-center'>
				<a href='filme/$fid'>$titulo</a>
			</p>

		</div>

	</div>";
}
?>
</div>