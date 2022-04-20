package streams;

public class Media {

	private double total;
	private int quantidade;

	public Media adicionar(double valor) {
		total += valor;
		quantidade++;
		return this;
	}

	public double getValor() {
		return total / quantidade;
	}

	public static Media combinar(Media m, Media m1) {
		Media resultante = new Media();
		resultante.total = m.total + m1.total;
		resultante.quantidade = m.quantidade + m1.quantidade;
		return resultante;
	}
	
}
 