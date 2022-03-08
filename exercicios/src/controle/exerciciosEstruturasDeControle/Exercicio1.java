package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		// criar um programa que receba um numero e verifique se ele esta entre
		// 0 e 10 e é par.

		String palavra = "";
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Digite um numero de 0 a 10: ");
			int numero = entrada.nextInt();

			if (numero >= 0 && numero <= 10) {
				if (numero % 2 == 1) {
					System.out.println("numero impar");
				} else {
					System.out.println("numero par");
				}
			} else {
                System.out.println("O número não é valido");
            }

            System.out.println("Deseja sair do programa? (sim / nao)");
            palavra = entrada.next();

        } while(!palavra.equalsIgnoreCase("sim"));

        entrada.close();

	}
}
