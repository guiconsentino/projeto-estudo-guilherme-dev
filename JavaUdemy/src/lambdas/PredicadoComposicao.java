package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	//predicate vamos trabalhar com operações logicas! &&, ||...
	
	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.test(22)); // passando parametro e testando se é par
		System.out.println(isTresDigitos.test(100)); //testando se tem 3 digitos
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isPar.or(isTresDigitos).test(123));
		
		
	}
}
