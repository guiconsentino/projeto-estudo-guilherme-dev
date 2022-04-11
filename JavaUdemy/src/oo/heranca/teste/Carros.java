package oo.heranca.teste;

//import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Carros {

	public static void main(String[] args) {

		Civic c1 = new Civic();

		c1.modelo = "New Civic";
		c1.cor = "prata";

		System.out.println(c1.modelo +" "+ c1.cor);
		
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		

		System.out.println();

		Ferrari c2 = new Ferrari(400); // 400 velocidade maxima definido na classe ferrari!

		c2.modelo = "f8 tributo";
		c2.cor = "vermelha";
		
		System.out.println(c2.modelo + " " + c2.cor);
		
		c2.ligarTurbo();

		c2.ligarAr();
		
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);

		c2.desligarAr();
		
		c2.acelerar();
		System.out.println(c2);
	
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
	
	
	
	
	
	}
}
