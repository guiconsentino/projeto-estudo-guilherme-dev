package fundamentos.operadores;

public class logicos {

	public static void main(String[] args) {

		boolean condi��o1 = true;
		boolean condi��o2 = 3 > 7;

		System.out.println(condi��o1 && condi��o2);
		System.out.println(condi��o1 || condi��o2);
		System.out.println(condi��o1 ^ condi��o2);
		System.out.println(!condi��o1);
		System.out.println(!condi��o2);
		// "!" a interroga��o significa NAO

	System.out.println("\nTabela verdade E ");
	System.out.println(true && true);
	System.out.println(true && false);
//	System.out.println(false && true);
	//System.out.println(false && false);
	
	System.out.println("\nTabela verdade ou (or) ");
//	System.out.println(true || true);
//	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);

	System.out.println("\nTabela verdade OU exclusivo (xor) ");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);

	System.out.println("\nTabela verdade (NOT)");
	System.out.println(!true);
	System.out.println(!false);
	}
}
