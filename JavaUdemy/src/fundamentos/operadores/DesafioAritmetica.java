package fundamentos.operadores;

public class DesafioAritmetica {

	public static void main(String[] args) {

		/*
		 * int a = 3 * 4 - 10; int b = (int) Math.pow(a, 3); double c = Math.pow(a, 3);
		 * 
		 * System.out.println(b); System.out.println(c);
		 */

		double a = 6 * (3 + 2);
		a = Math.pow(a, 2) / (3 * 2);
		System.out.println(a);

		double b = (1 - 5) * (2 - 7) / 2;
		b = Math.pow(b, 2);
		System.out.println(b);

		double c = a - b;
		c = Math.pow(c, 3) / Math.pow(10, 3);
		System.out.println(c);

		

	}
}
