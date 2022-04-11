package oo.polimorfismo;

public class BalancaPeso {

	private double pesoBalanca;

	public BalancaPeso (double pesoBalanca) {
		setPesoBalanca(pesoBalanca);
	}
	
	public void pesar(Feijao feijao) {
		this.pesoBalanca += feijao.getPeso();
	}
	
	public void pesar(Arroz arroz) {
		this.pesoBalanca += arroz.getPeso();
	}
	public void pesar(Comida comida) {
		this.pesoBalanca += comida.getPeso();
	}
	
	public double getPesoBalanca() {
		return pesoBalanca;
	}

	public void setPesoBalanca(double pesoBalanca) {
		this.pesoBalanca = pesoBalanca;
	}
	
	
		
	
	
	
	
}
