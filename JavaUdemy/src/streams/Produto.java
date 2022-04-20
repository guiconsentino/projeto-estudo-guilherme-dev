package streams;

public class Produto {

	public final String nome;
	public final double preco;
	public double desconto;
	public double frete;
	
	public Produto(String nome, double preco, double desconto, double frete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal ;
	}
	
	
	
}


