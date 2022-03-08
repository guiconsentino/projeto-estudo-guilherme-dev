package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de notas que quer informar: ");
			int quantidadeDeNotas = entrada.nextInt();
			
		double notasAluno[] = new double[quantidadeDeNotas];

		for (int i = 0; i < notasAluno.length; i++) {
				System.out.println("Informe a nota " + (i + 1) + ":");
				notasAluno[i] = entrada.nextDouble();
		}
        
		double total = 0;
		for(double nota: notasAluno) {
			total += nota;
		}
		
		double media = total/notasAluno.length;
		System.out.println("A media �: " + media);
		
		entrada.close();

	}
}
