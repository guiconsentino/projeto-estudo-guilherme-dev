package carros;

import java.util.Scanner;

public class Pedidos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int contador;
		int n = 1;

		System.out.println("quantos carros quer? ");
		int qntCarros = entrada.nextInt();
		for (contador = 1; contador <= qntCarros; contador++) {

			System.out.println( "Carro nº:"+ n++ +" Qual motor no carro?");
			String motor = entrada.next();

			System.out.println("Qual roda?");
			int roda = entrada.nextInt();
		

		Fabrica fabrica = new Fabrica();

		Carro carroCriado = fabrica.fabricaCarro(motor, roda);

		System.out.println("motor:" + carroCriado.getMotor() + "\nrodas:" 
		+ carroCriado.getRoda());

		
		
		}
	}

}
