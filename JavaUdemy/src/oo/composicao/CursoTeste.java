package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno ("Guilherme");
		Aluno aluno2 = new Aluno ("Brian");
		Aluno aluno3 = new Aluno ("Karina");
		
		Curso curso1 = new Curso("ADS");
		Curso curso2 = new Curso("T.I");
		Curso curso3 = new Curso("S.I");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);

	    aluno1.adicionarCurso(curso3);
	    aluno2.adicionarCurso(curso3);
	    aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("estou matriculado no curso " 
								+ curso3.nome	);
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
			
			
			}
	
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("s.i");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}
	
	
}
