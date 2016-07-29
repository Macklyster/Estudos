<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Testando o AJAX</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery-3.1.0.min.js"></script>
	<script>
		$(document).ready(function(){
			//primeira aula
			$("#b1").click(function(){
				alert("Ok, você clicou no primeiro botão.");
			});
			$("#b2").click(function(){
				$("#texto").html("Ok, você clicou no botão 2, e esse texto foi modificado.");
			});
			$("#b3").click(function(){
				$("#texto").load("home.php");
			});

			//segunda aula
			$("#home").click(function(){
				//alert("Você clicou");
				$("#carregaInformacao").load("home.php");
			});

			$("#quemsou").click(function(){
				$("#carregaInformacao").load("quemsou.php");
			});

			$("#contato").click(function(){
				$("#carregaInformacao").load("contato.php");
			});

			$("body").ready(function(){
				$("#home").click();
			});
		});
	</script>

	<style type="text/css">
		#style{
			float:right;
		}
	</style>
</head>
<body>
	<header>
		<h1>Testando o Ajax</h1>
	</header>
	<nav>
		<ul>
			<li><a href="#" id="home">Home</a></li>
			<li><a href="#" id="quemsou">Quem sou</a></li>
			<li><a href="#" id="contato">Contato</a></li>
		</ul>
	</nav>
	<main>
		<h2 id="carregaInformacao">Seja bem vindo, conforme clicar nos links acima essa mensagem irá mudar.</h2>
	</main>

	<div id="style">
		<button type="button" id="b1" class="btn btn-primary">Botão 01</button>
		<button type="button" id="b2" class="btn btn-primary">Botão 02</button>
		<button type="button" id="b3" class="btn btn-access">Botão 03</button>

		<div id="texto">Loading...</div>
	</div>
</body>
</html>