package fundamentos;

public class NotaçãoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		String x = "Karina".toUpperCase();
		System.out.println(x);
		
		String y ="Bom dia X".replace("X", "Karina").toUpperCase().concat("!!!");
		System.out.println(y);
		
	}
}