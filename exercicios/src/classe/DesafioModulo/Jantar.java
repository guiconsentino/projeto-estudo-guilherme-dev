package classe.DesafioModulo;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("arroz", 0.500);
		Comida c2 = new Comida("feijao", 0.400);
		
		Pessoa p1 = new Pessoa("Guilherme", 99.33);
		System.out.println(p1.apresentar()); 

		p1.comer(c1);
        System.out.println(p1.apresentar());
	    p1.comer(c2);
	    System.out.println(p1.apresentar());
      
	}
}