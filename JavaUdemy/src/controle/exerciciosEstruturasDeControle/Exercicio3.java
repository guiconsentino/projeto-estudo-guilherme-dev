package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite sua primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.println("digite sua segunda nota: ");
		double nota2 = entrada.nextDouble();

		double mediaNotas = (nota1 + nota2) / 2;
		System.out.println("Sua média: " + mediaNotas);

		if (mediaNotas >= 7) {
			System.out.println("Aprovado");
		} else if (mediaNotas >= 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
