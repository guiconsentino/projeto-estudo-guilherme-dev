package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testesAcessos() {

		/*
		 * Ana mae = new Ana(); 
		 * System.out.println(mae.segredo);
		 * System.out.println(mae.facoDentroDeCasa);
		 * System.out.println(mae.formaDeFalar); 
		 * System.out.println(mae.todosSabem);
		 */

		//a forma correta de acessar atributos ou metodos de outra classe não é por 
		//instancia! e sim por herança, como da forma abaixo
		
		//System.out.println(segredo); pode ser usado apenas na sua propria classe
		//System.out.println(facoDentroDeCasa); pode ser usado apenas no proprio pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
