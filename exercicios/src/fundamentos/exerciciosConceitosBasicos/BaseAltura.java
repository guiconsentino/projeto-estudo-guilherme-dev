package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class BaseAltura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("horario da prova: ");
		double horario = entrada.nextDouble();
		
		String resp = (horario > 18) ? " se fodeu " : (horario < 18) ? " adiantado " : " ufa ";
		System.out.println(resp);
		
		entrada.close();
	}

}
