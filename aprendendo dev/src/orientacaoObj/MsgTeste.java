package orientacaoObj;

import java.util.Scanner;

public class MsgTeste {

	public static void main(String[] args) {
		
		MandaMensagem oi = new MandaMensagem();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nomePessoa = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		oi.mandaBoasVindas(nomePessoa, idade);
		
		oi.mandaMensagem();
	
		entrada.close();
	}
}
