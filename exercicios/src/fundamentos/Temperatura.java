package fundamentos;

public class Temperatura {

	// (�F-32) X 5/9 = �C
	public static void main(String[] args) {

		double farenheit = 90;
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5 / 9.0;

		double celsius = (farenheit - AJUSTE) * MULTIPLICADOR;

		System.out.println("o resultado � = " + celsius + "�C." );

		farenheit = 160;
		celsius = (farenheit - AJUSTE) * MULTIPLICADOR;
		System.out.println("o resultado � = " + celsius + "�C.");

	}
}