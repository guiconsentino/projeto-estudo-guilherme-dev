package streams;

public class MediaTeste {

	public static void main(String[] args) {
		

		Media m = new Media().adicionar(8.3).adicionar(6.7);
		Media m1 = new Media().adicionar(7.9).adicionar(6.6);
		
		
		System.out.println(m.getValor());
		System.out.println(m1.getValor());
		
		System.out.println(Media.combinar(m, m1).getValor());
		
	}
}
