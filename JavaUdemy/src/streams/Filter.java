package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
	Aluno a1 = new Aluno("Ana", 7.8);
	Aluno a2 = new Aluno("Gui", 5.8);
	Aluno a3 = new Aluno("Gabriel", 9.0);
	Aluno a4 = new Aluno("Bia", 7.1);
	Aluno a5 = new Aluno("Pedro", 8.8);
	Aluno a6 = new Aluno("Rebeca", 6.0);
		
	List<Aluno>alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

	Predicate<Aluno>aprovado = a -> a.nota >= 7;
	Function<Aluno, String>saudacaoAprovado =
			a -> "parabens " + a.nome + "! voce foi aprovado!!"; 
	
	
	alunos.stream()
	.filter(aprovado)
	.map(saudacaoAprovado)
	.forEach(System.out::println);
	}
}
