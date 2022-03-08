package fundamentos;

public class Temperatura {

	// (ºF-32) X 5/9 = ºC
	public static void main(String[] args) {

		double farenheit = 90;
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5 / 9.0;

		double celsius = (farenheit - AJUSTE) * MULTIPLICADOR;

		System.out.println("o resultado é = " + celsius + "ºC." );

		farenheit = 160;
		celsius = (farenheit - AJUSTE) * MULTIPLICADOR;
		System.out.println("o resultado é = " + celsius + "ºC.");

	}
}