package controle;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 8;

		//n�o usar ; em estruturas de controle (tem exce��o)
		if (nota >= 9.0) {
			System.out.println("quadro de honra");
			System.out.println("voc� � fera");

		}

		if (nota >= 5.9 && nota <= 6.5) {
			System.out.println("esta de recupera��o");

		}
	}

}
