<?php
function rsstotime($rss_time) {
    $time = explode(' ', $rss_time);
    $chrono = explode(':', $time[4]);

    $month = array('Jan' => 1, 'Fev' => 2, 'Mar' => 3, 'Abr' => 4, 'Mai' => 5,
        'Jun' => 6, 'Jul' => 7, 'Ago' => 8, 'Set' => 9, 'Out' => 10,
        'Nov' => 11, 'Dez' => 12);

    $mktime = mktime($chrono[0], $chrono[1], $chrono[2], $month[$time[2]], $time[1], $time[3]);

    return date("Y-m-d H:i:s",$mktime);
}

try {
    $servidor = "localhost";
    $usuario = "root";
    $senha = "123456";
    $banco = "rss";
    $con = new PDO ( "mysql:host=$servidor;dbname=$banco;charset=utf8",$usuario,$senha );
} catch ( PDOException $e ) {
    echo "Erro ao conectar: " . $e->getMessage();
}