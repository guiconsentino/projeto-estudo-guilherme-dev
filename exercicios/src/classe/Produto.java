package classe;

public class Produto {

	String nome;
	double valor;
	static double desconto = 0.25;
	
	//construtorpadrao
	Produto(){
		
	}
		//construtor
	Produto(String nomeInicial, double valorInicial){
		nome = nomeInicial;
        valor = valorInicial;
        
	}
//metodos
   double preçoComDesconto () {
	   return valor *(1 - desconto);
   }
   double preçoComDesconto (double descontoDoGerente) {
	   return valor *(1 - (desconto + descontoDoGerente));
}   
}
