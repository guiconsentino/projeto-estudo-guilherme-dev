package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informação do funcionario

		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumulados = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // true

		// tipo caractere
		char status = 'A'; // ativo

		// dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// numero de viagens
		System.out.println(numeroDeVoos / 2);

		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumulados);
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
