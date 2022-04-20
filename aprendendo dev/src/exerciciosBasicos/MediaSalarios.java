package exerciciosBasicos;

import java.util.Scanner;

public class MediaSalarios {

	public static void main(String[] args) {

		double mediaSalario;
		double salarios;
		double somaS = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("digite seus ultimos salarios ");
			System.out.print("salario " + i + ": ");
			salarios = entrada.nextDouble();
			
			somaS += salarios;
			

		}	
		
		mediaSalario = somaS / 4;
		
		System.out.println(mediaSalario);
		System.out.printf("a media dos meus ultimos 4 salarios: R$%.2f",mediaSalario);
		

		
		entrada.close();
	}
}
