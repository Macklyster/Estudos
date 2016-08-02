<?php
/*
Na Orientação a Objetos, temos três modificadores  de visibilidade.
- public
- private
- protected

* O modificador public permite visibilidade para qualquer classe do escopo.
* O modificador private permite visibilidade somente na classe que foi declarada.
* O modificador protected permite visibilidade somente para as classes que as herdaram.
 */

class a
{
	private $Atributo1;
	protected $Atributo2;
	public $Atributo3;


	/*
	O atributo com o modificador private - podemos fazer um Setter e um Getter para acessar fora da classe.
	 */
	public function setAtributo1($val)
	{
		$this->Atributo1 = $val;
	}
	public function getAtributo1()
	{
		return $this->Atributo1;
	}
}
class b extends a
{

}
$teste = new b();

$teste->setAtributo1("Teste");
echo $teste->getAtributo1();
?>