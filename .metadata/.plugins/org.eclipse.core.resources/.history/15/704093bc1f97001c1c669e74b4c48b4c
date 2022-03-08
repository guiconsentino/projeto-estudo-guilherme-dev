package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;// atribuição por valor(TIPO PRIMITIVO)

		a++;
		b--;

		System.out.println(a + " " + b);

		Data d1 = new Data(1, "junho", 2022);
		Data d2 = d1;// (ATRIBUIÇÃO POR REFERENCIA(OBJETO))

		d1.dia = 27;
		d1.mes = "fevereiro";
		d2.ano = 2022;
		
		System.out.println(d2.obterDataFormatada());
		System.out.println(d1.obterDataFormatada());

		voltarDataParaValorPadrao(d2);

		System.out.println(d2.obterDataFormatada());
		System.out.println(d1.obterDataFormatada());
	
	int c = 5;
	alterarPrimitivo(c);
	System.out.println(c);
	
	
	}

	static void voltarDataParaValorPadrao(Data d) {
    d.dia = 1;
    d.mes = "janeiro";
    d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
		
	}
}
