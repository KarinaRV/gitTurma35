package br.com.generation.lista06;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cachorro dog = new Cachorro();
		Cavalo  horse = new Cavalo();
		Preguica preguica = new Preguica();
		
		//Atributos
				
		dog.setNome("Apolo");
		dog.setIdade(8);
				
		horse.setNome("Pangar� ");
		horse.setIdade(15);
				
		preguica.setNome("Sid");
		preguica.setIdade(20);
				
		System.out.println("O nome do cavalo �: " + horse.getNome());
      System.out.println("A idade do cavalo �: " + horse.getIdade());
      System.out.println("O som que o cavalo faz �: " + horse.emitirSom());
      System.out.println(horse.correr());
      System.out.println();

      System.out.println("O nome do cachorro �: " + dog.getNome());
      System.out.println("A idade do cachorro �: " + dog.getIdade());
      System.out.println("O som que o cachorro faz �: " + dog.emitirSom());
      System.out.println(dog.correr());
      System.out.println();

        System.out.println("O nome da pregui�a �: " + preguica.getNome());
        System.out.println("A idade da pregui�a �: " + preguica.getIdade());
        System.out.println("O som que a pregui�a faz �: " + preguica.emitirSom());
        System.out.println(preguica.sobeArvore());
	
	
	}

}
