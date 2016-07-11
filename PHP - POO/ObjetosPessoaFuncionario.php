<?php

require_once("PessoaEmpresa.class.php");
require_once("Funcionario.class.php");

$alex = new Funcionario("Alex M Coder", 1993, "...Paraná...", 66666666, 8000, "Programador", 15);

echo "<h3>".$alex->ObterIdade()." Anos</h3>";

$alex->EscreveDados();
?>