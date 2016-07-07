package br.com.alex.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico 
{
	private String nome;
	private List<Animal> animais;

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public Zoologico()
	{
		animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal animalASerAdicionado)
	{
		animais.add(animalASerAdicionado);
	}
	
	public void removerAnimal(int indiceDoAnimal)
	{
		animais.remove(indiceDoAnimal);
	}	
	
	/**
	 * listar os animais que foram adicionado ao zoologico
	 */
	public void listarAnimais()
	{	
		
		System.out.println("Animais do Zoológico");
		/**
		 * método size pega o tamanho do atributo animais, que é uma lista de array.
		 */
		for(int i = 0; i < animais.size(); i++)
		{
			System.out.println("       - " + animais.get(i).getNome());
		}
	}

}
