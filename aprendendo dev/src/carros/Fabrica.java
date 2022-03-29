package carros;

public class Fabrica {

	public Carro fabricaCarro(String motor, int roda) {
 
		Carro carro = new Carro();

		carro.setMotor(motor);
		carro.setRoda(roda);

		return carro;

		
		
		
		
	}

}
