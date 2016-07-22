<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Testando o AJAX</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery-3.1.0.min.js"></script>
	<script>
		$(document).ready(function(){
			$("#b1").click(function(){
				alert("Ok, você clicou no primeiro botão.");
			});
			$("#b2").click(function(){
				$("#texto").html("Ok, você clicou no botão 2, e esse texto foi modificado.");
			});
			$("#b3").click(function(){
				$("#texto").load("home.php");
			})
		})
	</script>
</head>
<body>
	<button type="button" id="b1" class="btn btn-primary">Botão 01</button>
	<button type="button" id="b2" class="btn btn-primary">Botão 02</button>
	<button type="button" id="b3" class="btn btn-access">Botão 03</button>

	<div id="texto">Hello World</div>
</body>
</html>