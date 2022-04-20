package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("guilherme", 7.1);
		Aluno a2 = new Aluno("luna", 8.1);
		Aluno a3 = new Aluno("ana", 6.1);
		Aluno a4 = new Aluno("gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia =
				(m,m1) -> Media.combinar(m, m1);
				
		
		Media media = alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A media da turma é " + media.getValor());
	}
}
