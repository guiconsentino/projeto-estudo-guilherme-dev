package classe;

public class Carro {

	//atributos
	String modelo;
	String marca;
    String cor;
	int ano;
	int velocidade;
    int chassis;	
	double peso;
    
	//metodos
	
	void acelerar(int aceleracao){
	     velocidade += aceleracao;
	}
	void freiar(int acelera��o) {
		velocidade -= acelera��o;
	}
	void ligar() {
		System.out.println("vruuuuum");
	}
}