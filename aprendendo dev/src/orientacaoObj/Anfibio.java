package orientacaoObj;

public class Anfibio {

	public static void main(String[] args) {
		
	Animal sapo = new Animal("cururu");
	
	sapo.habitat = "aquatico e terrestre";
	sapo.locomocao = "patas ou orgaos especializados";
	sapo.principaisCaract = "pula";
	sapo.reproducao = "sexuada";
	
	sapo.respirar();
	
	}

	void rebet(){
		System.out.println("rebet");
	}
}
