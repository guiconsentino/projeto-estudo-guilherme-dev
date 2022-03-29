package testesDev;

import java.util.Scanner;

public class QualFoiAMaiorNota {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contador = 1;
        int n = 1;
		double maior = 0;
        
		System.out.println("Quantos alunos tem a turma?");
		int alunos = entrada.nextInt();

		while (contador <= alunos) {
			
			System.out.println("Aluno " + n++);

			System.out.print("nome do aluno: ");
			String nomeAluno = entrada.next();

			System.out.print("nota de " + nomeAluno + ": ");
			Double notaAluno = entrada.nextDouble();
			
			if(notaAluno > maior) {
				maior = notaAluno	;
			}
			
			System.out.println("-------------------------");
			contador++;
			
		}			

		System.out.println("Qual foi a maior nota? " + maior);
	}

}
