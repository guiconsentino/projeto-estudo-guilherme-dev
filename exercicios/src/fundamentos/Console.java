package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		/*System.out.print("Bom");
		System.out.print(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);

		System.out.printf("Salario:R$%.1f%n", 1234.5678);
		System.out.printf("Nome: %s\n", "Joao");*/

		Scanner entrada = new Scanner(System.in);

		System.out.printf("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.printf("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
	
		System.out.printf("Digite o seu cpf: ");
		String cpf = entrada.nextLine();
	
	    System.out.printf("Digite seu endere�o: ");
	    String endere�o = entrada.nextLine();
		
	    System.out.printf("Digite a sua idade: ");
	    int idade = entrada.nextInt();
		
		
		System.out.printf("%s %s cpf:%s tem %d anos mora na %s", nome, sobrenome, cpf, idade, endere�o);
		
		//System.out.println(nome, sobrenome, "cpf:" + cpf, "idade: " + idade, "mora no endere�o" + endere�o);
	 
	    entrada.close();
		
	}
}
