package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a media: ");
		double media = entrada.nextDouble();
		
		if(media <=10 && media >= 7) { 
			System.out.println("aprovado");
		    System.out.println("parabens");
		}
		    if(media == 6)
			System.out.println("recuperação");
		if(media < 6)
			System.out.println("reprovado");
		entrada.close();
		
	}

}
