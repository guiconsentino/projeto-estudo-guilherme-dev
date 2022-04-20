package streams.exercicio1;

import java.util.Scanner;

public class Testando {

	public static void main(String[] args) {
		
		
		Teste totalDesc = new Teste();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o valor da compra: ");
		totalDesc.valorCompra = entrada.nextInt();
		
		System.out.println("quantas parcelas?: ");
		totalDesc.parcelas = entrada.nextInt();
		
		
		totalDesc.resultado();
		
		
		entrada.close();
	}
}

