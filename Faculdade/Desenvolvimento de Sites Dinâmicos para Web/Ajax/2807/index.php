<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Testando o AJAX</title>
	<script src="jquery-3.1.0.min.js"></script>
	<script>
		function abrirPagina(pagina){
			$("main").html("<img src='ajax-loader.gif'/>");
			$("main").load(pagina);
		}
	</script>
</head>
<body onload="abrirPagina('home.php');">
	<header>
		<h1>Testando o Ajax</h1>
	</header>
	<nav>
		<ul>
			<li><a href="javascript:abrirPagina('home.php');" id="home">Home</a></li>
			<li><a href="javascript:abrirPagina('quemsou.php');" id="quemsou">Quem sou</a></li>
			<li><a href="javascript:abrirPagina('contato.php');" id="contato">Contato</a></li>
		</ul>
	</nav>
	<main>
		<h2>Seja bem vindo, conforme clicar nos links acima essa mensagem irá mudar.</h2>
	</main>

</body>
</html>