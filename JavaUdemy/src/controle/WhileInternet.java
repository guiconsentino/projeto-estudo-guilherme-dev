package controle;

import java.util.Scanner;

public class WhileInternet {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.print("SENHA: ");
			int senha = entrada.nextInt();
			if (senha != 123) {
				System.out.println("ERRADO");
				continue;
			}
			break;

		}
		entrada.close();
	}
}
