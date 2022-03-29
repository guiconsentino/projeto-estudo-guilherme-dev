package orientacaoObj;

public class Ciclista {

	boolean pedalando = false;
	int fatorForça = 1;

	public static void main(String[] args) {

		Bicicleta b1 = new Bicicleta("Kaloi", "corrida", 26, 2);
		
		System.out.println("marca" + b1.getMarca());
		
		Ciclista c1 = new Ciclista();

		b1.naoPedalar();

		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();

		b1.pedalar();

		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();
		b1.pedalando();

	}

}