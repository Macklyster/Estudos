<?php

/**
 * Constantes de configuração do Framework.
 */

// Dados de acesso ao banco de dados

define('DB_TYPE', 'mysql');
define('DB_HOST', 'localhost');
define('DB_NAME', 'agenda');
define('DB_USER', 'root');
define('DB_PASS', '123456');

// Diretórios

define('SITE_URL','http://localhost/agenda');
define('STATIC_URL','http://localhost/agenda/static');
define('IMG_URL','http://localhost/agenda/static/img');

define('SITE_PATH',realpath(dirname(__FILE__)).'/');
define('CONTROLLER_PATH', realpath(dirname(__FILE__) . '/application/controllers'));
define('VIEW_PATH', realpath(dirname(__FILE__) . '/application/views'));
define('MODEL_PATH', realpath(dirname(__FILE__) . '/application/models'));