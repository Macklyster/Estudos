package br.com.alex.calculadora.fabricas;

import br.com.alex.calculadora.classes.Adicao;
import br.com.alex.calculadora.classes.Divisao;
import br.com.alex.calculadora.classes.Multiplicacao;
import br.com.alex.calculadora.classes.Potenciacao;
import br.com.alex.calculadora.classes.Subtracao;
import br.com.alex.calculadora.interfaces.CalculadorMatematico;

public class FabricaCalculos 
{
	/** - O método consegue chamar as classes das operações por causa do tipo que o método tem
	 * que é extamente a nossa interface CalculadorMatematico. Nele contem o nosso método calcular,
	 * com isso será capaz de verificar diversos valores em diversas classes dentro de um único método.
	 * 
	 * - Este método irá ajudar a criar o nosso programa, sem ele iremos ter que ficar dando new a cada
	 * novo objeto.
	 * @param numero1
	 * @param numero2
	 * @param calculo
	 * @return
	 */
	public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo)
	{
		if(calculo.equals("+"))
		{
			return new Adicao(numero1, numero2);
		}else if(calculo.equals("-"))
		{
			return new Subtracao(numero1, numero2);
		}else if(calculo.equals("/"))
		{
			return new Divisao(numero1, numero2);
		}else if(calculo.equals("*"))
		{
			return new Multiplicacao(numero1, numero2);
		}else if(calculo.equals("^"))
		{
			return new Potenciacao(numero1, numero2);
		}else{
			return null;
		}
	}
}
