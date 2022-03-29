package testesDev;

import java.util.Scanner;

public class Somador {

	public static void main(String[] args) {
		
		int soma = 0;
		String resposta = "s";
		
		Scanner entrada = new Scanner(System.in);
		
		while(resposta.equals("s")){
		System.out.println("digite um numero: ");
		int numero = entrada.nextInt();
		soma = numero + soma;
		
		System.out.println("voce quer continuar? s/n");
		resposta = entrada.next();
		}
		
		System.out.println("a soma de todos os valores é: " + soma);
		
		
		
		
	}
}
