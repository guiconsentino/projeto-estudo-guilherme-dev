	package orientacaoObj;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	List<Animal>animais = new ArrayList<>();
	
	String nome;
	String habitat;
	String locomocao;
	String principaisCaract;
	String reproducao;	
	
	
	Animal(String nome){
		this.nome = nome;
	}
	
	void respirar(){
		System.out.println("respirando");
	}
	
	void adicionarAnimal(Animal animais) {
		this.animais.add(animais);
	}
	
	int obterQuantidadeAnimais() {
		int total = 0;
		
		for(Animal animal : animais) {
			total ++;
		}
		return total;
		
	}
	
}
