package classe;

public class CanetaTeste {

	public static void main(String[] args) {
		
		
	Caneta c1 = new Caneta();
	
	c1.marca = "bic";
	c1.cor = "azul";
	c1.expessuraPonta = 0.5;
	c1.carga = 99;
	c1.tampada = false;
	
	c1.status();
	
	System.out.println();

	c1.escrever(10);
    System.out.println("agora sua carga �: " + c1.carga +"%");
	
    System.out.println();
		
	Caneta c2 = new Caneta();
	c2.marca = "faber";
	c2.cor = "vermelha";
	c2.expessuraPonta = 0.3;
	c2.carga = 95;
	c2.tampada = true;
	
	c2.status();
	
	System.out.println();
	
	c2.desenhar();
		
	}
	
	
}
