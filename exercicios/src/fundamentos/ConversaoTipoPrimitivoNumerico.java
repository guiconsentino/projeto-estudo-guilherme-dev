package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1;
		/*
		 * conversão de tipo implicito, não perde dados.
		 * "converte um inteiro para double"
		 */
		System.out.println(a);

		float b = (float) 1.124568888; // explicita (CAST)
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // explicita (cast)
		System.out.println(d);

	double e = 1.9999999;
	int f = (int) e; //explicita (cast)
	System.out.println(f);
	
	}
}
