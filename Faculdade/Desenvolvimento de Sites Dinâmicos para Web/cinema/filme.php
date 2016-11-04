<?php
include "verifica.php";

$sql = "select * from filme where id = ? limit 1";
$consulta = $con->prepare($sql);
$consulta->bindParam(1, $id);
$consulta->execute();

$dados = $consulta->fetch(PDO::FETCH_OBJ);

$titulo = $dados->titulo;
$original = $dados->original;
$imagem = "imagens/$dados->imagem";
$ano = $dados->ano;
$elenco = $dados->elenco;
$sinopse = $dados->sinopse;
?>

<h1><?=$titulo;?></h1>
<div class="row">
	<div class="col-md-3 col-sm-3">
		<a href="<?=$imagem?>" class="foto">
			<img src="<?=$imagem;?>" alt="<?= $titulo;?>" class="thumbnail img">
		</a>
	</div>
	<div class="col-md-9 col-sm-9">
		<p>
			<strong>Título Original:</strong> <?= $original; ?>
		</p>
		<p>
			<strong>Ano de Produção:</strong> <?=$ano;?>
		</p>
		<p>
			<strong>Elenco:</strong> <?=$elenco;?>
		</p>
		<p>
			<strong>Sinopse:</strong> <?=$sinopse;?>
		</p>
	</div>
</div>
<h2>Trailers do Filme:</h2>
<div class="row">
	<?php
	$sql = "select * from trailer where filme_id = ? order by id desc";
	$consulta = $con->prepare($sql);
	$consulta->bindParam(1, $id);
	$consulta->execute();

	while($dados = $consulta->fetch(PDO::FETCH_OBJ))
	{
		$video = $dados->youtube;
		$video = explode("v=",$video);

		$codigo = $video[1];

		$imagem = "http://i1.ytimg.com/vi/$codigo/hqdefault.jpg";
		$url = "https://www.youtube.com/embed/$codigo";

		echo "<div class='col-md-4'>
		<a href='$url' class='youtube'>
			<img src='$imagem' class='thumbnail img'/>
		</a>
	</div>";
}
?>
</div>

<script>
	$(document).ready(function(){
		
		$(".youtube").colorbox({iframe:true, innerWidth:640, innerHeight:390});
		$(".foto").colorbox();

	})
</script>