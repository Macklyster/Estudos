<!DOCTYPE html>
<html>
<head>
	<title>Exemplo com Ajax</title>
	<meta charset="utf-8">

	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">

	<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="js/bootstrap-inputmask.min.js"></script>
	<script type="text/javascript" src="js/jqBootstrapValidation.js"></script>
	<script type="text/javascript" src="js/jquery.cpfcnpj.min.js"></script>

	<script>
		$(function () { $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); } );

		$(document).ready(function(){

			$("#email").blur(function(){
				$("#msgemail").html("<img src='imgs/load.gif'> Aguarde, verificando...");
	  			//pegar o valor do e-mail
	  			var email = $("#email").val(); 
	  			//ajax para enviar e receber os dados
	  			$.get("verificaemail.php",
	  				{email:email},
	  				function(dados){

	  					if (dados != "") {
	  						$("#msgemail").html(dados);
	  					  //apagar o e-mail
	  					  $("#email").val("");
	  					  $("#email").focus();
	  					} else {
	  						$("#msgemail").html("");
	  					}

	  				})
	  		})
	  		//verificação do CPF
	  		$('#cpf').cpfcnpj({
	  			mask: false,
	  			validate: 'cpfcnpj',
	  			event: 'blur',
	  			handler: '#cpf',
	  			ifValid: function  (input) { 
	  				$('#msgcpf').html('<img src="imgs/load.gif">Verificando...');

	  				//verificar se existe um cpf
	  				var cpf = $("#cpf").val();

	  				//verifica se o cpf esta em branco
	  				if(cpf === "")
	  				{
	  					alert("Preencha o CPF");
	  					$("#cpf").focus();
	  				}

	  				//envia o cpf por get para o verificarCpf.php
	  				$.get("verificaCpf.php", {cpf:cpf},
	  					function(dados){
	  						if (dados != "") {
	  							//se deu erro ou existe um cpf cadastro
	  							$("#msgcpf").html(dados);
	  					  		//apagar o cpf
	  					  		$("#cpf").val("");
	  					  		$("#cpf").focus();
	  					  	} else {
	  					  		$("#msgcpf").html("");
	  					  	}
	  					  })
	  			},
	  			ifInvalid: function (input) { 
	  				$('#msgcpf').html('CPF inválido');
	  			}
	  		})
	  	})

function escondeCnpj(){
	$('.cpf').show();
	$('.cnpj').hide();
}
function escondeCpf(){
	$('.cpf').hide();
	$('.cnpj').show();
}

</script>
</head>
<body>

	<div class="container">
		<h1 class="text-center">
			Formulário de Cadastro de Pokemongo
		</h1>
		<?php
			//incluir o conecta para conectar no banco
		include "conecta.php";
		?>
		<form name="form1" method="post" novalidate>
			<div class="control-group">
				<label for="nome" class="control-label">* Nome:</label>
				<div class="controls">
					<input type="text" name="nome"
					id="nome" class="form-control"
					required
					data-validation-required-message="Por favor preencha com seu nome completo">
				</div>
			</div>

			<div class="control-group">
				<label for="email" class="control-label">* E-mail:</label>
				<div class="controls">
					<input type="email" name="email"
					id="email" class="form-control"
					required
					data-validation-required-message="Por favor preencha seu e-mail"
					data-validation-email-message="Digite um e-mail válido">

					<p id="msgemail"></p>
				</div>
			</div>

			<label for="tipo">Tipo de Pessoa:</label>
			<input type="radio" name="tipo" checked onclick="escondeCnpj()">
			Pessoa Fisíca
			<input type="radio" name="tipo" onclick="escondeCpf()">
			Pessoa Jurídica

			<div class="control-group cpf">
				<label for="cpf" class="control-label">* CPF:</label>
				<div class="controls">
					<input type="text" name="cpf"
					id="cpf" class="form-control"
					required
					data-validation-required-message="Por favor preencha seu CPF"
					data-mask="999.999.999-99">

					<p id="msgcpf"></p>
				</div>
			</div>

			<div class="control-group cnpj">
				<label for="cpnj" class="control-label">* CNPJ:</label>
				<div class="controls">
					<input type="text" name="cpnj"
					id="cpnj" class="form-control"
					required
					data-validation-required-message="Por favor preencha seu CNPJ"
					data-mask="99.999.999/9999-99">
				</div>
			</div>

			<button type="submit" class="btn btn-success">Gravar Dados</button>

		</form>

	</div>

</body>
</html>