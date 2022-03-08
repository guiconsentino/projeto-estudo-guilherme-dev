package arrays.ExerciciosNet;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1A {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    
		System.out.println("digite a quantidade de numeros: ");
		int numeros = entrada.nextInt();
		
		int conjunto1[] = new int [numeros];
	    
		for(int i = 0; i < conjunto1.length; i++) {
			System.out.println("informe o conjunto de numero: ");
	            conjunto1[i] = entrada.nextInt();
		}
		
		System.out.println(Arrays.toString(conjunto1));
    
	entrada.close();
	
	
	}
}
