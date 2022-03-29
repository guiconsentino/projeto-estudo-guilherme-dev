package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
        
		Carro c = new Carro();
		
		System.out.println(c.estaLigado());
		
		c.ligar();
		System.out.println(c.estaLigado());
 
		System.out.println(c.motor.rotacao());
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
	
	
		System.out.println(c.motor.rotacao());
	
	
	    c.frear();
	    c.frear();
	    c.frear();
	    c.frear();
	    c.frear();
	    c.frear();
	    c.frear();
	    c.frear();
	    
	    System.out.println(c.motor.rotacao());
	    
	}
}