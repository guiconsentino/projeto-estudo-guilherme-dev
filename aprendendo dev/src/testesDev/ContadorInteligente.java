package testesDev;

import java.util.Scanner;

public class ContadorInteligente {

	public static void main(String[] args) {

		int contador, inicioRepet, fimRepet;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inicio: ");
		inicioRepet = entrada.nextInt();

		System.out.println("Fim: ");
		fimRepet = entrada.nextInt();

		if (inicioRepet < fimRepet)
			for (contador = inicioRepet; contador < fimRepet; contador++) {
				System.out.printf("%d... ",contador);

			}	
		else {
			for (contador = inicioRepet; contador > fimRepet; contador--) {
				System.out.printf("%d... ",contador);

			}
		}
	}
}