package oo.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 1, 100);
		
		compra1.adicionarItem(new Produto("notebook", 2000.00), 2);
	
		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 10, 10);
		
		compra2.adicionarItem(new Produto("impressora", 1000.00), 1);

		Cliente cliente = new Cliente("Maria das Gracas");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		System.out.println(cliente.nome);
	}
	
}
