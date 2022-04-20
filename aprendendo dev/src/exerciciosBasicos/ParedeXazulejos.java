package exerciciosBasicos;

import java.util.Scanner;

public class ParedeXazulejos {

	public static void main(String[] args) {
		
		double aP,lP, aA, lA, qntdA;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("altura parede: ");
		aP = entrada.nextDouble();
		
		System.out.println("largura parede: ");
		lP = entrada.nextDouble();
		
		System.out.println("altura azulejo: ");
		aA = entrada.nextDouble();
		
		System.out.println("largura azulejo: ");
		lA = entrada.nextDouble();
		
		qntdA = (aP * lP)/(aA * lA);
		
		System.out.printf("a quantidade exata de azulejos que voce precisa é %.2f ",qntdA);
		
		entrada.close();
	}
}
