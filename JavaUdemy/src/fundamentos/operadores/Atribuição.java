package fundamentos.operadores;

public class Atribui��o {

	public static void main(String[] args) {
		
	
	int a = 3;
	int b = a;
	int c = a + b;
	
	c += b; // c = c + b;
	System.out.println(c);

	c -= a; // c = c - a;
	System.out.println(c);
	
	c *= b; // c = c * b;
	System.out.println(c);
	
	c /= a; // c = c / a;

	System.out.println(c);
	
	c %= 2; // c = c % 2; 0 ou 1; zero = par, 1 = impar
	System.out.println(c);
}
}