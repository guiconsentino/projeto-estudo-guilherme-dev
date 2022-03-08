package classe;

public class AreaCirc {
//atributos
	double raio;
	final static double PI = 3.1415;

//construtor         raioInicial = parametro
	AreaCirc(double raioInicial) {

		raio = raioInicial;
	}

//metodo
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
