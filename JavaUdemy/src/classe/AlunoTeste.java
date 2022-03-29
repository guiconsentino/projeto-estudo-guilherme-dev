package classe;

public class AlunoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		// aluno1.nome = "guilherme";
		aluno1.setNome("Guilherme");

		System.out.println(aluno1.getNome());

		// aluno1.idade = 150;
		aluno1.setIdade(99);
		System.out.println("eu tenho " + aluno1.idade + " anos");
		
		// aluno1.nota = 8;
		aluno1.setNota(9);	
		
	}

}
