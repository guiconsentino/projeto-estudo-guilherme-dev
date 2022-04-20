package streams.exercicio1;


public class Familia {

	final String nome;
	final int idade;
	final double altura;

	public Familia(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;

	}
		public String toString() {
			return nome +"\nIdade:" + idade + "\nAltura: " + altura+ "\n";
		
	}
}
