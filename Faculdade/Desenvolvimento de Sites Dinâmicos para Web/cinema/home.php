<h1>Filmes em destaque</h1>
<div class="row">
	<?php
	$sql = "select * from filme order by rand() limit 4";
	$consulta = $con->prepare($sql);
	$consulta->execute();

	while($dados = $consulta->fetch(PDO::FETCH_OBJ))
	{
		echo "<div class='col-md-3'>
		<div class='thumbnail'>
			<img src='imagens/$dados->imagem' alt='$dados->titulo' class='img'/>
			<p class='text-center'>
				<a href='filme/$dados->id'>$dados->titulo</a>
			</p>
		</div>
	</div>";
}
?>
</div>