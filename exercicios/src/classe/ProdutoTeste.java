package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
	    Produto p1 = new Produto("notebook",4356.59);
	   
	    
	    var p2 = new Produto();
	    p2.nome = "caneta preta";
	    p2.valor = 12.56;
	   
	    Produto.desconto = 0.29;
	    
	    System.out.println(p1.nome + " " + p1.preçoComDesconto());
	    System.out.println(p2.nome + " " + p2.preçoComDesconto());
	    
	    double preçoFinal1 = p1.preçoComDesconto(0.1);
	    double preçoFinal2 = p2.preçoComDesconto();
	    double mediaDoCarrinho = (preçoFinal1 + preçoFinal2) / 2;
	    
	    System.out.printf("Media do carrinho = R$%.2f",mediaDoCarrinho);
	}	
}
