package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		System.out.println(30 > 35); 
		System.out.println(30 >= 30);
		System.out.println(30 < 40);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("tem desconto? " + temDesconto);
		
		
	}
	
}
