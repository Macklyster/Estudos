package br.com.alex.zoologico.app;

import br.com.alex.zoologico.classes.Animal;
import br.com.alex.zoologico.classes.Cachorro;
import br.com.alex.zoologico.classes.Gato;
import br.com.alex.zoologico.classes.Veterinario;
import br.com.alex.zoologico.classes.Zoologico;

public class Programa {

	public static void main(String[] args) {
		/**
		 * LSP, polimorfismo, podemos chamar a classe Animal ao invés da classe
		 * cachorro, pois um cachorro é um animal.
		 */
		Animal animal = new Cachorro("Totó", "Cachorro", 2);
		
		System.out.println("O nome do cachorro é: " + animal.getNome() + "\n" +  "A idade do cachorro é: " + animal.getIdade() + " anos" + "\n" + "A especie dele é: " + animal.getEspecie());
		
		animal.emitirBarulho();
		System.out.println("*********************************");
		animal.ehAdulto();
		
		/**
		 * Testando a classe Zoologico
		 * ela poderá adicionar os animais instaciados para o novo zoologico criado.
		 * poderá remover os animais também.
		 */
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoo do Alex");
		zoo.adicionarAnimal(animal);
		zoo.listarAnimais();
		
		System.out.println("*********************************");
		
		/**
		 * Testando a classe Veterinario
		 */
		Veterinario vet = new Veterinario();
		vet.setNome("Alex");
		vet.atenderAnimal(animal);
		vet.listarAnimaisAtendidos();
		
	}

}
