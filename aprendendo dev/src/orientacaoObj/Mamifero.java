package orientacaoObj;

public class Mamifero {

	public static void main(String[] args) {

		Animal cachorro = new Animal("pastor alemão");
		
		cachorro.principaisCaract = "morde";
		cachorro.habitat = "domestico";
		cachorro.locomocao = "quatro patas";
		cachorro.reproducao = "sexuada";

		System.out.println(cachorro.nome);
		
		cachorro.respirar();

		cachorro.animais.add(cachorro);
		
		System.out.println(cachorro.obterQuantidadeAnimais());
	
	    Animal cachorro2 = new Animal("pastor alemão");
		
		cachorro2.principaisCaract = "morde";
		cachorro2.habitat = "domestico";
		cachorro2.locomocao = "quatro patas";
		cachorro2.reproducao = "sexuada";

		System.out.println(cachorro.nome);
		
		cachorro2.respirar();

		cachorro2.animais.add(cachorro2);
		
		System.out.println(cachorro2.obterQuantidadeAnimais());
	}

}
