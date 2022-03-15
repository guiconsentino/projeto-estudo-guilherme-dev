package fundamentos;

import java.util.Scanner;

public class AoQuadradoEAoCubo {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.printf("Digite o valor: ");
	int valor1 = entrada.nextInt();
	
	double num1 = Math.pow(valor1, 2);
	System.out.println("resultado ao quadrado: " + num1);
	
	System.out.printf("\nDigite o valor: ");
	int valor2 = entrada.nextInt();
	
	double num2 = Math.pow(valor2, 3);
	System.out.println("resultado ao cubo: " + num2);
	
		
	   /*
		int valor1 = 30;
		int valor2 = 30;
		
		double num1 = (double)valor1;
		double num2 = (double)valor2;
		
		num1 = Math.pow(valor1, 2);
		
		num2 = Math.pow(valor2, 3);
		
		System.out.println("valor ao quadrado = " + num1);
		System.out.println("valor ao cubo =" + num2);
		*/

	entrada.close();
	
	}
	
	
}
