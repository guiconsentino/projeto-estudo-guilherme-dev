package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int contadorDeDivisores = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			
		System.out.println("\nO numero " + numero + " � primo");
break;
		
		default:
			System.out.println("\nO numero " + numero + " n�o � primo");
		}
		entrada.close();

	}

}
