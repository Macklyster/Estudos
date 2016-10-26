<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>AutoComplete</title>

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/easy-autocomplete.min.css">

	<script src="js/jquery-3.1.0.min.js"></script>
	<script src="js/jquery.easy-autocomplete.min.js"></script>

	<script>
		$(document).ready(function(){
			var options = {

				//arquivo que será consultado
				url: "alunos.json",

				//valor que você está buscando
				getValue: "nome",

				//opções de listagem
				list:{
					match:{
						enabled: true
					}
				}
			}

			//aplicar o easy-autocomplete
			$("#nome").easyAutocomplete(options);

			var options = {

				//arquivo que será consultado
				url: "alunos.json",

				//valor que você está buscando
				getValue: "nome",

				//opções de listagem
				list:{
					match:{
						enabled: true
					}
				}
			}

			//aplicar o easy-autocomplete
			$("#dinamico").easyAutocomplete(options);

			var options = {

				//arquivo que será consultado
				url: "alunos2.php",

				//valor que você está buscando
				getValue: function(element){
					//retornar o elemento
					return element.nome;
				},

				//opções de listagem
				list:{
					onSelectItemEvent: function(){
						var selectItemValue = $("#aluno").getSelectedItemData().ra;
						$("#id").val(selectItemValue).trigger("change");
					},
					match:{
						enabled: true
					}
				}
			}

			//aplicar o easy-autocomplete
			$("#aluno").easyAutocomplete(options);
		});
</script>
</head>
<body>
	<div class="container">
		<h1>Exemplo AutoComplete</h1>

		<input type="text" name="nome" id="nome" class="form-control" placeholder="Digite um nome">

		<h1>Exemplo 2, com JSON Dinâmico</h1>

		<input type="text" name="dinamico" id="dinamico" class="form-control" placeholder="teste">

		<h1>Exemplo 3, trazendo outros dados</h1>

		<div class="row">
			<div class="col-md-2">
				<input type="text" name="id" id="id" class="form-control" placeholder="Ra do aluno" readonly>
			</div>
			<div class="col-md-10">
				<input type="text" name="aluno" id="aluno" class="form-control" placeholder="Digite um nome">
			</div>
		</div>
	</div>
</body>
</html>