package classe;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.marca = "volkswagen";
		c1.modelo = "jetta";
		c1.ano = 2011;
		c1.cor = "branca";
		c1.peso = 1600;
		c1.velocidade = 150;
	
		c1.ligar();
		
	c1.acelerar(50);
	System.out.printf("velocidade:%dKm/h\n",c1.velocidade);

	c1.freiar(70);
	System.out.printf("Radar 120Km/h a frente:%dKm/h",c1.velocidade);
	}

	
	
	
}