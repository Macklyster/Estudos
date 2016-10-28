<?php
include "conecta.php";


//iniciando a variável
$pagina = "home";

//verificando se a variável existe
if(isset($_GET["p"]))
{
	//recuperar o p
	$p = trim($_GET["p"]);

	$p = explode("/", $p);

	$pagina = $p[0];

	if(isset($p[1]))
	{
		$id = $p[1];
	}
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Cinema - <?= ucfirst($pagina); ?></title>

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/estilo.css">
	<link rel="stylesheet" href="colorbox.css">

	<script src="js/jquery-3.1.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.cycle2.min.js"></script>
	<script src="js/jquery.colorbox-min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="index.php" class="navbar-brand">
					<img src="imagens/logo.svg" alt="Cinemark" width="120">
				</a>
			</div>

			<div class="collapse navbar-collapse" id="menu">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="empresa">Quem somos</a></li>
					<li><a href="filmes">Filmes</a></li>
					<li><a href="contato">Contato</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="cycle-slideshow" id="banner"  data-cycle-slides='> a'>
		<?php

		$sql = "select * from banner";
		$consulta = $con->prepare($sql);
		$consulta->execute();

		while($dados = $consulta->fetch(PDO::FETCH_OBJ))
		{
			$titulo = $dados->titulo;
			$imagem = $dados->imagem;
			$filme_id = $dados->filme_id;

			$imagem = "imagens/$imagem";

			echo "<a href='filme/$filme_id' title='$titulo'><img src='$imagem' title='$titulo' class='img'/></a>";
		}

		?>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-3 col-sm-3">
				<h2>Categorias</h2>

				<ul class="nav nav-pills nav-stacked">
					<?php
					$sql = "select * from tipo order by tipo";
					$consulta = $con->prepare($sql);
					$consulta->execute();
					while($dados = $consulta->fetch(PDO::FETCH_OBJ))
					{
						echo "<li>
						<a href='filmes/$dados->id'>$dados->tipo</a>
					</li>";
				}
				?>
			</ul>
		</div>
		<div class="col-md-9 col-sm-9">
			<?php
			if($pagina == "index")
			{
				$pagina = "home";
			}
				//carregar o conteudo das páginas internas
			$pagina = "$pagina.php";

			if(file_exists($pagina))
			{
				include $pagina;
			}else{
				include "erro.php";
			}
			?>
		</div>
	</div>
</div>

<footer><p class="text-center">Desenvolvido por AlexMCoder</p></footer>
</body>
</html>
