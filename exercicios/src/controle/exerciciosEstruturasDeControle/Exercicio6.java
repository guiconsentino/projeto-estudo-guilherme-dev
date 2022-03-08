package controle.exerciciosEstruturasDeControle;

public class Exercicio6 {

	public static void main(String[] args) {

		double nota1 = 10, nota2 = 5, nota3 = 9;
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 8) {
			System.out.println("passou de ano");
		
		}else if(media >=6) {
		System.out.println("melhore");
		}else {
		System.out.println("vagabundo");
		
		}
	}
}