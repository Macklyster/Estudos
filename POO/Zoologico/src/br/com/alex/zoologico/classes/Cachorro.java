package br.com.alex.zoologico.classes;

public class Cachorro extends Animal {
	
	public Cachorro(String nome) 
	{
		super(nome);
	}
	
	public Cachorro(String nome, String especie, int idade) 
	{
		super(nome, especie, idade);
	}
	
	@Override
	public void emitirBarulho() 
	{
		if(estaVivo)
		{
			System.out.println("Latido do Cachorro");
		}else
		{
			System.out.println("O Animal está Morto!");
		}
	}
	@Override
	public Boolean ehAdulto()
	{
		if(estaVivo){
			return idade >= 2;
		}else{
			return false;
		}
	}
	
	
}
