package streams.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.Produto;


public class Exercicio2 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Arroz", 20, 0.9, 10);
		Produto p2 = new Produto("Feijao", 16, 0.11, 10);
		Produto p3 = new Produto("Macarrao", 19.8, 0.7, 10);
		Produto p4 = new Produto("Salsisha", 10, 0.38, 0);
		Produto p5 = new Produto("Laranja", 5.5, 0.45, 0);
		Produto p6 = new Produto("Suco de uva", 14, 0.50, 20);
		Produto p7 = new Produto("Frango", 49, 0.23, 10);
		
		List<Produto>produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		Predicate<Produto>superDesconto = a -> a.desconto > 0.30;
		Predicate<Produto>freteGratis = a -> a.frete == 0;
		
		Function<Produto, String>superPromocao = a -> a.nome +" R$"+ a.preco + " SUPER PROMOÇÃO!!!";
		
		produtos.stream()
			.filter(superDesconto)
			.filter(freteGratis)
			.map(superPromocao)
			.forEach(System.out::println);
	}
	
}
