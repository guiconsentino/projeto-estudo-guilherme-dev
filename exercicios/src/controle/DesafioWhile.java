package controle;

import java.util.Scanner;

public class DesafioWhile {
	/*
	 * logica: calcular a media das notas de uma turma, não sei quantos alunos tem..
	 * o usuario vai digitar uma nota valida de 0 a 10 "quando o aluno digitar essa
	 * nota o valor sera armazenado em uma variavel chamada total e sempre q uma
	 * nova nota for digitada ela sera acrescentada na variavel total
	 * 
	 * criar outra variavel para dizer quantas notas foram digitadas
	 * 
	 * -1 pra sair do programa
	 * 
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double total = 0;
		double nota = 0;
		int quantidadeDeNotas = 0;

		while (nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
			System.out.println("Nota invalida ;D  ");
			}
		}

		double media = total / quantidadeDeNotas;
		System.out.print("media = " + media);

		entrada.close();
	}

}
