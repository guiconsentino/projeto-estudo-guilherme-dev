package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio4 {

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

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo");

		} else {
			System.out.println("\nO numero " + numero + " não é primo");
		}
	entrada.close();
	
	}
}