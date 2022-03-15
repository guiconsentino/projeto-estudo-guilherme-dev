package fundamentos.operadores;

public class logicos {

	public static void main(String[] args) {

		boolean condição1 = true;
		boolean condição2 = 3 > 7;

		System.out.println(condição1 && condição2);
		System.out.println(condição1 || condição2);
		System.out.println(condição1 ^ condição2);
		System.out.println(!condição1);
		System.out.println(!condição2);
		// "!" a interrogação significa NAO

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
