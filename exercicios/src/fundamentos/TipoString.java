package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Ola pessoal".charAt(5));
		// .charAt serve para saber em qual posi��o esta a letra come�ando do 0

		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        
        System.out.println("\n\nNome:" + nome + "\nSobrenome:" 
        + sobrenome + "\nIdade:" + idade + "\nSalario:" + salario);
        
        System.out.printf("\nNome:%s \nSobrenome:%s \nIdade:%d \nSalario:R$%.2f", 
        		nome, sobrenome, idade, salario);
       //%s ->substitui string, %d->numeros inteiros, %f-> numeros com ponto flutuante, \n->linha de baixo!
        
	
              
                
	}

}
