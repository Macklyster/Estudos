<!DOCTYPE html>
<html>
<head>
	<title>Exemplo com Ajax</title>
	<meta charset="UTF-8">

	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">

	<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="js/bootstrap-inputmask.min.js"></script>
	<script type="text/javascript" src="js/jqBootstrapValidation.js"></script>
	<script type="text/javascript" src="js/jquery.cpfcnpj.min.js"></script>
	<script>
		$(function (){ $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); } );

		$(document).ready(function(){
			$("#email").blur(function(){
				$("#msgemail").html("<img src='imgs/load.gif'> Aguarde, verificando...");
	  			//pegar o valor do email
	  			var email = $("#email").val();
	  			//ajax para enviar e receber os dados
	  			$.get("verificaemail.php",{email:email},function(dados){
	  				if (dados != ""){
	  					$("#msgemail").html(dados);
	  					$("#email").val("");
	  					$("#email").focus();
	  				} else {
	  					$("#msgemail").html("");
	  				}
	  			})
	  		})	
		})
	</script>
	<script>	
		$(function(){ $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); });

		$("#nome").blur(function(){
			$("#msgnome").html("<img src='imgs/load.gif'/> Aguarde, verificando...");

			var nome = $("#nome").val();

			$.get("verificanome.php",{nome:nome}, function(dados){
				if(dados != "")
				{
					$("#msgnome").html(dados);
					$("#nome").val("");
					$("#nome").focus();
				}else{
					$("#msgnome").html("");
				}
			});
		});

		

	</script>

</head>
<body>
	<div class="container">
		<h1 class="text-center">
			Formulário de Cadastro
		</h1>
		<?php
			//incluir o conecta para conectar no banco
		include "conecta.php";
		?>
		<form name="form1" method="post" novalidate>
			<div class="control-group">
				<label for="nome" class="control-label">* Nome:</label>
				<div class="controls">
					<input type="text" name="nome" id="nome" class="form-control" required data-validation-required-message="Por favor, preencha com seu nome completo">
					<p id="msgnome"></p>
				</div>
			</div>
			<div class="control-group">
				<label for="email" class="control-label">* E-mail</label>
				<div class="controls">
					<input type="email" name="email" id="email" class="form-control" required data-validation-required-message="Por favor, preencha seu e-mail" data-validation-email-message="Digite um e-mail válido">

					<p id="msgemail"></p>
				</div>
			</div>
			<button type="submit" class="btn btn-success">Gravar Dados</button>

		</form>

	</div>
</body>
</html>