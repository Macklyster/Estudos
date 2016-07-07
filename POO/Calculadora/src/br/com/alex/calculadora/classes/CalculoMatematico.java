package br.com.alex.calculadora.classes;

import br.com.alex.calculadora.interfaces.CalculadorMatematico;

public abstract class CalculoMatematico implements CalculadorMatematico {

	protected int numero1;
	protected int numero2;
	
	public CalculoMatematico(int numero1, int numero2) 
	{
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	/**
	 * O valor não pode ser zero
	 */
	@Override
	public Boolean validar() {
		return numero1 >= 0 && numero2 >= 0;
	}

	/**
	 * Este método é único, por isso usamos a palavra (final)
	 * - ela não pode ser sobrescrita.
	 * - O método irá verificar se os numeros são validos e se forem true ele irá calcular.
	 */
	@Override
	public final int calcular() {
		if(validar())
		{
			return doCalcular();
		}else{
			return -1;
		}
	}
	
	/**
	 * este método não precisa ser publico, não iremos expor este método para fora do CalculoMatematico
	 * mas ele tem que ser protegido, pois ele ainda precisa ser acessivel nas classes filhas.
	 * Classes filhas:
	 * Adicao;
	 * Subtracao;
	 * Multiplicacao;
	 * Divisao;
	 * @return
	 */
	protected abstract int doCalcular();

}
