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
   double pre�oComDesconto () {
	   return valor *(1 - desconto);
   }
   double pre�oComDesconto (double descontoDoGerente) {
	   return valor *(1 - (desconto + descontoDoGerente));
}   
}
