package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio2 {
	// criar um programa que mostra se o ano atual � bissexto
	// ano bissexto tem que dar inteiro quando dividido por 4
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println(ano + " � um ano bissexto");

		} else {
			System.out.println(ano + " n�o � um ano bissexto");
		}
		entrada.close();
	}
}
