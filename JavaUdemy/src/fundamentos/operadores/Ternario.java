package fundamentos.operadores;

public class Ternario {

	
	public static void main(String[] args) {
		
		double media = 7.5;
		
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado." ;
		String resultadoFinal = media >= 7.0 ? "aprovado." :  resultadoParcial;
		
		System.out.println("O aluno esta " + resultadoFinal);
		
		double nota = 7.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "não";
		
		System.out.println("tem desconto? " + resultado);
		
	}
}
