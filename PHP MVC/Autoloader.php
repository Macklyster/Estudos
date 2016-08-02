<?php 

class Autoloader
{
	public $diretorios = array();

	public function register()
	{
		spl_autoload_register(array($this, 'loader'));
	}

	private function loader($className)
	{
		//DIRECTORY_SEPARATOR  serve para tratar as barras do diretorio, tanto para o windows como linux.
		$class = str_replace('_', DIRECTORY_SEPARATOR, $className) . '.php';

		//se diretorio for diferente de vazio
		if(!empty($this->diretorios))
		{
			//dentro de cada diretorio, iremos verificar se existe a classe.
			foreach ($this->diretorios as $diretorio) {

				//remove espaços e barras no final
				$classPath = rtrim($diretorio, '/') . DIRECTORY_SEPARATOR . $class;

				//se o arquivo existe dentro do diretorio
				if(file_exists($classPath))
				{
					return include_once $classPath;
				}
			}
		}

		if(file_exists($class))
		{
			return include_once $class;

			$classPath = stream_resolve_include_path($class);
			if($classPath !== false)
			{
				return include_once $classPath;
			}
		}
	}
}

/*
O exemplo abaixo, demonstra como podemos executar o autoloader no index.
Suponhamos que o nosso autoloader esteja em um diretori chamado library
 */

set_include_path(dirname(__FILE__) . DIRECTORY_SEPARATOR . 'library' . PATH_SEPARETOR . get_include_path());

require_once 'Autoloader.php';

//primeiro criamos o objeto
$loader = new Autoloader();

//selecionamos o local do diretorio que queremos trabalhar com as classes
$loader->diretorios = array('library');

//em seguida registramos
$loader->register();
?>