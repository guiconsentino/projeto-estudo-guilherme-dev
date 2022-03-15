package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
				
		Scanner entrada = new Scanner (System.in);
		
		System.out.printf("Digite seus ultimos tres salarios ");
        
		System.out.printf("\nSalario 1: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.printf("Salario 2: ");
        String salario2 = entrada.nextLine().replace(",", ".");
        System.out.printf("Salario 3: ");
        String salario3 = entrada.nextLine().replace(",", ".");
			
        
       double valor1 = Float.parseFloat(salario1);
       double valor2 = Float.parseFloat(salario2);
       double valor3 = Float.parseFloat(salario3);
        
        
       double somaSalarios = valor1 + valor2 + valor3;
       double media =  (valor1 + valor2 + valor3) / 3 ;
       
        System.out.println("A soma dos seus ultimos tres salario é = " + somaSalarios);
        System.out.println("Media dos salarios = " + media);
        
             
        entrada.close();
		
		
		
		
		
	}
}
