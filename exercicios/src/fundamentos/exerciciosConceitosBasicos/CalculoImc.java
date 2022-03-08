package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.print("Digite seu peso: ");
	   double peso = entrada.nextDouble();
	   
	   System.out.print("Digite sua altura: ");
	   double altura = entrada.nextDouble();
	   
	   double denominador = Math.pow( altura,2);
	   double resultado = peso / denominador;
	   
	   System.out.printf("O calculo do IMC é = %.2f ", + resultado);
		
	    /*
	    double peso = 80;
		double altura = 2.00;
		double denominador = Math.pow(altura,2); 
		double resultado = peso / denominador;
		System.out.println("O calculo do meu IMC é: " + resultado);
		*/
	
	entrada.close();
	
	}
	
}
