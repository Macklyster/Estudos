package br.com.alex.calculadora.app;

import br.com.alex.calculadora.fabricas.FabricaCalculos;
import br.com.alex.calculadora.interfaces.CalculadorMatematico;

public class Programa {

	public static void main(String[] args) {
		String calculo = "+";
		int numero1 = 2;
		int numero2 = 4;
		
		FabricaCalculos fabrica = new FabricaCalculos();
		CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);
		
		if(calculador != null)
		{
			System.out.println(calculador.calcular());
		}else{
			System.out.println("Calculo Invalido!");
		}
	}

}
