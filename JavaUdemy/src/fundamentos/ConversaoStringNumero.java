package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		System.out.println(valor1 + valor2);
		//n�o consegue somar as String
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		//convertendo string para double
		
		double soma = numero1 + numero2; // somando os valores
		System.out.println("Soma �" + soma);
		System.out.println("Media � " + soma / 2);
	}
	
}
