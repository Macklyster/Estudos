<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Controle de Estoque</title>
	<link rel="stylesheet" href="/css/app.css">
	<link rel="stylesheet" href="/css/custom.css">
</head>
<body>
	<div class="container">

		<nav class="navbar navbar-default">

			<div class="container-fluid">

				<div class="navbar-header">
					<a href="/produtos" class="navbar-brand">Estoque de Produtos</a>
				</div>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="{{action('ProdutoController@lista')}}">Listagem</a></li>
					<li><a href="{{action('ProdutoController@novo')}}">Novo</a></li>
				</ul>

			</div>

		</nav>

		@yield('conteudo')

		<footer class="footer">
			<p>Desenvolvido por AlexMCoder</p>
		</footer>

	</div>
</body>
</html>