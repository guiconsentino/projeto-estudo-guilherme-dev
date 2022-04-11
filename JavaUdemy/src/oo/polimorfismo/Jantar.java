package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		BalancaPeso balanca = new BalancaPeso(0);
		Pessoa p1 = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.1);
		//Comida ingrediente3 = new Comida(0.3); NAO PODE MAIS SER INSTANCIADA PORQUE PASSEI PARA ABSTRACT
		Comida ingrediente3 = new Arroz(0.3); // DESSA FORMA POSSO INSTANCIAR
		System.out.println(p1.getPeso());
		
		balanca.pesar(ingrediente1);
		balanca.pesar(ingrediente2);
		balanca.pesar(ingrediente3);
		
		System.out.println("peso da comida " + balanca.getPesoBalanca());
		
		p1.comer(ingrediente1);
		p1.comer(ingrediente2);
		p1.comer(ingrediente3);
		
		System.out.println("peso apos comer comida " + p1.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		p1.comer(sobremesa);
		
		System.out.println("peso apos comer comida e sobremesa " + p1.getPeso());
		
		
		
		
	}
}
