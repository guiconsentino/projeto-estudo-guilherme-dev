package classe;

public class Televisao {

	String marca;
	String modelo;
	int canal;
	int volume;
	int polegadas;
	boolean ligado;

	void status(){
		if(ligado == true) {
			System.out.println("sua tv esta ligada");
		}else {
			System.out.println("sua tv esta desligada");
		}
	}
	
	void mudarCanais() {
	
	
	}

}
