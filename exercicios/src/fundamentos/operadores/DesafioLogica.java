package fundamentos.operadores;

public class DesafioLogica {

	public static void main(String[] args) {
		// trabalho na ter�a e quinta
		// se os dois derem certo tv de50 no shopping
		// se apenas 1 trabalho der certo tv de 32
		// de qualquer jeito a familia vai tomar sorvete
		// se nenhum trabalho der certo a familia fica em casa

		boolean trabalhoTer�a = true;
		boolean trabalhoQuinta = true;

		boolean tv50 = trabalhoTer�a && trabalhoQuinta;
		boolean tv32 = trabalhoTer�a ^ trabalhoQuinta;
		boolean tomouSorvete = trabalhoTer�a || trabalhoQuinta;

		// operador unario
		boolean maisSaudavel = !tomouSorvete;
        boolean ficouEmCasa = !tomouSorvete;		
		
		System.out.println("Comprou tv 50? " + tv50);
		System.out.println("Comprou tv 32? " + tv32);
		System.out.println("Comprou Sorvete? " + tomouSorvete);
		System.out.println("Ficou em casa? " + ficouEmCasa);
		System.out.println("Mais saudavel? " + maisSaudavel);
	}
}
