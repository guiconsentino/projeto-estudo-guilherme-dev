package oo.composicao;

public class Carro {

	final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}

	void acelerar() {
		if (motor.fatorInjecao < 3) {
			System.out.println(motor.giros() + " Rpm");
			motor.fatorInjecao += 0.4;
		} else {
			System.out.println("raaandandandandan " + motor.giros() + " Rpm");

		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.4) {
			motor.fatorInjecao -= 0.4;
		} else {
			System.out.println(motor.giros()+" carro morreu");
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
