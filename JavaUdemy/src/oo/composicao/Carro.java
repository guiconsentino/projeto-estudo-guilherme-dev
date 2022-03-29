package oo.composicao;

public class Carro {

	Motor motor = new Motor();

	void acelerar() {
		if(motor.fatorInjeção < 2.6) {
		motor.fatorInjeção += 0.4;
		System.out.println(motor.rotacao());
		}else {
			System.out.println("randandan");
		}
	}

	void frear() {
		if(motor.fatorInjeção > 0.5) {
		motor.fatorInjeção -= 0.4;
		}else {
			motor.ligado = false;
			System.out.println("morreu");
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligado() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;

	}
}
