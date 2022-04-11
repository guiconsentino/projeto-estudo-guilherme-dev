package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("lia", "bia", "gui", "ana");

		// formas de imprimir a lista

		System.out.println("forma tradicional...");

		for (String nome : aprovados) {
			System.out.println(nome + "!!!");
		}

		System.out.println("\nlambdas #1");

		aprovados.forEach(nome -> System.out.println(nome + " !!! "));

		System.out.println("\nMethod reference 1...");

		aprovados.forEach(System.out::println); // forma mais automatizada, não consigo
												// adicionar

		System.out.println("\nlambdas #2");

		aprovados.forEach(nome -> meuImprimir(nome + " !!! "));

		System.out.println("\nMethod reference 2...");

		aprovados.forEach(Foreach::meuImprimir);
	}

	static void meuImprimir(String nome) {
		System.out.println("oi meu primeiro nome é " + nome);
	}

}
