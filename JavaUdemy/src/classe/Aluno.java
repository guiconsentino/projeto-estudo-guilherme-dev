package classe;

public class Aluno {

	// atributos
	private String nome;
	 int idade;
	 double nota;

	// metodo
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		if (idade > 0 && idade < 115) {
			this.idade = idade;
			System.out.println("idade cadastrada");
		} else {
			System.out.println("Erro");
		}
	}

	public void setNota(double nota) {
        if(nota >10 || nota<0) {
        	System.out.println("nota invalida");
        	this.nota = nota;
        }else if(nota >=7) {
        	System.out.println("passou de ano");
        }else if(nota >=5) {
        	System.out.println("recuperação");
        }else{
        	System.out.println("reprovou");
        
        	
	}

}
}
// construtor padrão não recebe nada por parametro
