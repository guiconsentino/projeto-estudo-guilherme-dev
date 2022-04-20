package streams.exercicio1;

public class Teste {

	double valorCompra;
	int parcelas;

	double valorComDesc;
	double desconto() {

		if (parcelas == 1) {
			valorComDesc = valorCompra - (valorCompra * 10 / 100);
			System.out.println("seu desconto foi de " + valorCompra * 10 / 100);
		} else if (parcelas == 2) {
			valorComDesc = valorCompra - (valorCompra * 8 / 100);
			System.out.println("seu desconto foi de " + valorCompra * 8 / 100);
		} else if (parcelas == 3) {
			valorComDesc = valorCompra - (valorCompra * 6 / 100);
			System.out.println("seu desconto foi de " + valorCompra * 6 / 100);
		} else if (parcelas == 4) {
			valorComDesc = valorCompra - (valorCompra * 4 / 100);
			System.out.println("seu desconto foi de " + valorCompra * 4 / 100);
		} else if (parcelas == 5) {
			valorComDesc = valorCompra - (valorCompra * 2 / 100);
			System.out.println("seu desconto foi de " + valorCompra * 2 / 100);
		} else if (parcelas > 5) {
			System.out.println("não tem desconto!");
		} 
		return valorComDesc;
	}
	void resultado() {
		if(parcelas >=1 && parcelas <=5) {
			System.out.println("o total da sua compra agora é: " + desconto());
		}else {
			System.out.println("voce não tem desconto!");
		}
	}

	

	//public String toString() {
		//return "o total da sua compra agora é: " + desconto();
	
	}
//}
