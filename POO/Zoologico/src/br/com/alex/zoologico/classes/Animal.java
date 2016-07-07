package br.com.alex.zoologico.classes;

public abstract class Animal implements Animavel 
{
	private String nome;
	private String especie;
	protected int idade;
	protected Boolean estaVivo; //Para o atributo ser acessado por suas filhas #protected
	
	public Animal(String nome, String especie, int idade)
	{
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.estaVivo = true;
	}
	
	public Animal(String nome)
	{
		this.nome = nome;
		this.estaVivo = true;
	}
	
	public abstract void emitirBarulho();
	
	public Boolean ehAdulto()
	{
		if(estaVivo == true)
		{
			return idade >= 1;
		}else
		{
			return false;
		}
	}
	
	public final void morrer()
	{
		this.estaVivo = false;
	}
	
	public Boolean estaVivo()
	{
		return estaVivo;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getEspecie()
	{
		return especie;
	}
	
	public void setEspecie(String especie)
	{
		this.especie = especie;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
}
