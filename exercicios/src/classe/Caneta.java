package classe;

public class Caneta {

	String marca;
	String cor;
	int carga;
	double expessuraPonta;
	boolean tampada;

	void status() {
		System.out.println("uma caneta marca: " + this.marca);
		System.out.println("cor: " + this.cor);
		System.out.println("com " + this.carga + "% de carga");
		System.out.println("sua expessura de ponta �: " + this.expessuraPonta);

		if (tampada == true) {
			System.out.println("caneta tampada");
		} else
			System.out.println("caneta destampada");

	}

	void escrever(int escrevendo) {
          carga -= escrevendo;		
		if (tampada == true) {
			System.out.println("n�o escreve, ESTOU TAMPADA");
		} else 
			System.out.println("escrevendo...");

	}

	void rabiscar() {
		if (tampada == true) {
			System.out.println("n�o rabisca, ESTOU TAMPADA");
		} else 
			System.out.println("rabiscando...");
    
     }
	

	void desenhar() {
		if (tampada == true) {
			System.out.println("n�o desenha, ESTOU TAMPADA");
		} else 
			System.out.println("desenhando...");

	}
	
}
