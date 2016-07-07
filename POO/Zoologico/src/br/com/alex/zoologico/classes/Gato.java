package br.com.alex.zoologico.classes;

public class Gato extends Animal {
	
	public Gato(String nome, String especie, int idade) 
	{
		super(nome, especie, idade);
	}
	
	public Gato(String nome) 
	{
		super(nome);
	}
		
	@Override
	public void emitirBarulho() 
	{
		if(estaVivo)
		{
			System.out.println("Miado do Gato");
		}else
		{
			System.out.println("O animal está morto!");
		}
	}
}
