<h1>Importar Notícias</h1>

<form action="" name="form1" method="post" class="form-inline">
	<label for="url">Insira a URL:</label>
	<input type="text" name="url" class="form-control" required>
	<button type="submit" class="btn btn-success">OK</button>
</form>
<br>
<?php
	//verificar se foi dado um post
if($_POST){
//recupera a url
	$url = trim($_POST["url"]);

	//pegar o conteudo
	$conteudo = file_get_contents($url);

	//formatar utf-8
	$conteudo = utf8_encode($conteudo);

	$xml = new SimpleXmlElement($conteudo);

	foreach ($xml->channel->item as $item) {
		$titulo = $item->title;
		$descricao = $item->description;
		$link = $item->link;
		$data = $item->pubDate;

		echo "<p>$titulo $data</p>";
	}
}
?>