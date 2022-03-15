package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		final double multiplicador = 9/5.0;
		final int ajuste = 32;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de °C: ");
		double celsius = entrada.nextDouble();
		
		double resultado = (celsius * multiplicador) + ajuste;
		System.out.printf("O resultado da conversão é: %.2f", resultado);
		
		entrada.close();
			
	}
	
}
