package oo.heranca.desafio;

public class Carro {

	public String modelo;
	public String cor;
	protected int velocidadeAtual;
	boolean ligado;
	public final int VELOCIDADE_MAXIMA;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();

		}

	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public String toString() {
		return "velocidade atual é " + velocidadeAtual + "Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public void ligar() {
		ligado = true;
		System.out.println("carro ligado");

	}

	public void desligado() {
		ligado = false;
		System.out.println("carro desligado");
	}
}
