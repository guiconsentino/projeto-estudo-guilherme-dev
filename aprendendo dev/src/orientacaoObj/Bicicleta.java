package orientacaoObj;

public class Bicicleta {

	int rodas;
	int aro;
	String marca;
	String modelo;

	Bicicleta(String marca, String modelo, int aro, int rodas) {
		this.marca = marca;
		this.modelo = modelo;
		this.rodas = rodas;
		this.aro = aro;
	}

	Ciclista ciclista = new Ciclista();

	void pedalando() {
		if (ciclista.pedalando == true) {
			ciclista.fatorForça += 50;
			System.out.println(ciclista.fatorForça);
		}
	}

	void pedalar() {
		System.out.println("pedalando");
		ciclista.pedalando = true;
	}

	void naoPedalar() {
		System.out.println("estou cansado");
		ciclista.pedalando = false;
	}

	public Bicicleta modeloBicicleta() {
	Bicicleta c2 = new Bicicleta(marca, modelo, aro, rodas);
		return c2;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Ciclista getCiclista() {
		return ciclista;
	}

	public void setCiclista(Ciclista ciclista) {
		this.ciclista = ciclista;
	}
	
	
	
}
