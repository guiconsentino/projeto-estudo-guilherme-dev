package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class FahrenheitToCelsius {
	// (�F-32) X 5/9 = �C

	public static void main(String[] args) {

		final int ajuste = 32;
		final double multiplicador = 5 / 9.0;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o �f: ");
		double f = entrada.nextDouble();

		double resultado = (f - ajuste) * multiplicador;
		System.out.printf("o valor de �C �: %.2f ", resultado);

		entrada.close();
	    
		/*
		double f = 90;
		final int ajuste = 32;
		final double divisor = 5 / 9.0;
		double celsius;
		
		celsius = (f - ajuste) * divisor;
	    System.out.printf("O resultado �: %.2f �C", celsius);
		*/
	
	}
}
