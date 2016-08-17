<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Exemplo com Ajax</title>

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/principal.css">

	<script src="js/jquery-3.1.0.min.js"></script>
	<script src="js/bootstrap-inputmask.min.js"></script>
	<script src="js/jqBootstrapValidation.js"></script>
	<script src="js/jquery.cpfcnpj.min.js"></script>

	<script>
		$(function () { $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); } );

		$(document).ready(function(){

			$("#email").blur(function(){
				$("#msgemail").html("<img src='imgs/load.gif'/> Aguarde, verificando...");

				var email = $("#email").val();

				$.get("verificaEmail.php",{email:email}, function(dados){
					if(dados != "")
					{
						$("#msgemail").html(dados);
						$("#email").val("");
						$("#email").focus();
					}else{
						$("#msgemail").html("");
					}
				});
			});

			$("#nome").blur(function(){
				$("#msgNome").html("<img src='imgs/load.gif'/> Aguarde, verificando...");

				var nome = $("#nome").val();

				$.get("validarNome.php",{nome:nome}, function(dados){
					if(dados != "")
					{
						$("#msgNome").html(dados);
						$("#nome").val("");
						$("#nome").focus();
					}else{
						$("#msgNome").html("");
					}
				});
			});

		});
	</script>
</head>
<body>

	<div class="container">

		<h1 class="text-center">
			Formulário de Cadastro de Pokemon
		</h1>

		<?php
		include "conecta.php";
		?>

		<form name="form1" method="post" novalidate>

			<div class="control-group">
				<label for="nome" class="control-label">* Nome:</label>
				<div class="controls">
					<input name="nome" id="nome" type="text" class="form-control" data-validation-required-message="Por favor, insira o nome completo" />
					<p id="msgNome"></p>
				</div>
			</div>

			<div class="control-group">
				<label for="email" class="control-label">* E-mail:</label>
				<div class="controls">
					<input name="email" id="email" type="email" class="form-control" data-validation-required-message="Por favor, insira o E-mail corretamente" data-validation-email-message="Digite um E-mail válido"/>
					<p id="msgemail"></p>
				</div>
			</div>

			<br>

			<button type="submit" class="btn btn-success">Gravar Dados</button>

		</form>

	</div>

</body>
</html>