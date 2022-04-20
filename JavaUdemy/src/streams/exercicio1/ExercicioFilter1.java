package streams.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExercicioFilter1 {

	public static void main(String[] args) {
	
		Familia f1 = new Familia("Guilherme", 25, 1.9);
		Familia f2 = new Familia("karina", 23, 1.62);
		Familia f3 = new Familia("Daiane", 40, 1.64);
		Familia f4 = new Familia("Jose", 74, 1.78);
		Familia f5 = new Familia("Maria", 73, 1.57);
		Familia f6 = new Familia("Gabriel", 13, 1.5);
	
	List<Familia>familia = Arrays.asList(f1,f2,f3,f4,f5,f6);
	
	Predicate<Familia>maiores = a -> a.altura >=1.7;
	Predicate<Familia>maisVelhos = a -> a.idade >=50;
	
	
	familia.stream()
	.filter(maiores)
	.filter(maisVelhos)
	.forEach(System.out::println);
	
	
	}
}
