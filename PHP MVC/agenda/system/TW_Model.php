<?php

/**
* Modelo base para os modelos da aplicação.
*
* @author TreinaWeb
* @access public
*/

class TW_Model
{
	function __construct()
	{
        // Cria na propriedade 'db' o objeto da classe Database
		$this->db = new TW_Database(DB_TYPE, DB_HOST, DB_NAME, DB_USER, DB_PASS);
	}
}