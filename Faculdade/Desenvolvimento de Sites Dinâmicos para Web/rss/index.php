<!DOCTYPE html>
<html>
<head>
	<title>RSS e HTACCESS</title>
	<meta charset="utf-8">
	<base href="http://localhost/Estudos/Faculdade/Desenvolvimento%20de%20Sites%20Dinâmicos%20para%20Web/rss/">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#menu" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.php">XML/RSS/HTACCESS</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="menu">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="index.php">Notícias</a></li>
						<li><a href="sobre">Sobre</a></li>
						<li><a href="importar">Importar um RSS</a></li>
					</ul>

				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
		</nav>

		<?php
			//print_r($_GET);
		$page = "home";

			//verificar se foi enviado url por GET
		if(isset($_GET["url"])){
			$url = trim($_GET["url"]);

			$url = explode("/", $url);

			$page = $url[0];
		}

			//adicionar o .php ao nome da pagina
		$page = "$page.php";

		//verificar se a pagina existe
		if(file_exists($page)){
			include $page;
		}else{
			include "erro.php";
		}
		?>

		<div class="well">
			<p class="text-center">
				Desenvolvido por AlexMCoder
			</p>
		</div>
		
	</div>
</body>
</html>