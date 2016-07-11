<?php
require_once("Animal.class.php");
require_once("Cachorro.class.php");
require_once("Gato.class.php");
require_once("Cavalo.class.php");

$cachorro = new Cachorro("Cachorro", 4400);
$cachorro->Fale();
$cachorro->Alimentar();
$cachorro->MeuPeso();

$gato = new Gato("Gato", 1000);
$gato->Fale();
$gato->Arranhar();
$gato->Alimentar();
$gato->MeuPeso();

$cavalo = new Cavalo("Cavalo", 8000);
$cavalo->Fale();
$cavalo->Alimentar();
$cavalo->MeuPeso();
$cavalo->Cavalgar();
?>