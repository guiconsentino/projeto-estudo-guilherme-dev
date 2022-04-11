package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);

	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		System.out.println("turbo ligado");
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		System.out.println("turbo desligado");
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
		if (ligarAr == true) {
			System.out.println("ar gelando");
		} else {
			
		}
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
		System.out.println("ar desligado");

	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
}
