package arrays.ExerciciosNet;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1C {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite quantos produtos quer: ");
		int qntProdutos = entrada.nextInt();
        			
		double valorProdutos[] = new double[qntProdutos];
		
		
		for(int p = 0; p < qntProdutos; p++) {
			System.out.print("valor do produto " + (p + 1) + ": ");
			valorProdutos[p] = entrada.nextDouble();
		}
		
		String nomeProdutos[] = new String [qntProdutos];

		for(int p = 0; p < qntProdutos; p++) {
			System.out.print("nome dos produtos " + (p + 1) + ": ");
               nomeProdutos[p] = entrada.next();      			

              System.out.println(Arrays.toString(nomeProdutos));
              System.out.println(Arrays.toString(valorProdutos));
		}
		
		
		
		entrada.close();
	}
}
