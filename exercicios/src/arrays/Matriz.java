package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantidade de alunos?: ");
		int quantidadeAlunos = entrada.nextInt();

		System.out.println("Quantas notas por aluno?: ");
		int notasDosAlunos = entrada.nextInt();

		double notasDaTurma[][] = new double[quantidadeAlunos][notasDosAlunos];

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {

				System.out.printf("informe a nota %d do aluno %d: ", n, a);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}

		}
		double media = total / (quantidadeAlunos * notasDosAlunos);
		System.out.println("Media da turma �" + media);

		entrada.close();
	}
}