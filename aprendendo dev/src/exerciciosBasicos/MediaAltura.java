package exerciciosBasicos;

import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {

		int sexo, qtMulheres = 0, qtHomens = 0;
		double altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("digite 1 para MULHER e 2 para HOMEM: ");
			sexo = entrada.nextInt();
			System.out.print("digite sua altura: ");
			altura = entrada.nextDouble();

			if (sexo == 1) {
				qtMulheres++;
			} else if (sexo == 2) {
				qtHomens++;
				somaH = somaH + altura;
			} else
				System.out.println("opção sexo invalido");
			{

				if (altura <= 2.4 && altura > 0) {
				} else
					System.out.println("altura invalida");

				if (altura >= 0 ^ altura <= 2.4) {
				}else if (altura > maior) {
						maior = altura;
					} else if (altura < menor) {
						menor = altura;

					}
				mediaHomens = somaH / qtHomens;
				}
			}

			System.out.println("homens " + qtHomens);
			System.out.println("mulheres " + qtMulheres);
			System.out.println("a maior altura do grupo é: " + maior);
			System.out.println("a menor altura do grupo é: " + menor);
			System.out.println("a media dos homens é " + mediaHomens);

			entrada.close();
		}
	
}
