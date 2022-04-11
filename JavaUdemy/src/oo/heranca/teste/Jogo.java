package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi(10,11);
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		System.out.println("heroi tem => " + heroi.vida + " de vida");
		System.out.println("monstro tem => " + monstro.vida + " de vida");

		System.out.println();
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);

		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		
		System.out.println("heroi tem => " + heroi.vida + " de vida");
		System.out.println("monstro tem => " + monstro.vida + " de vida");
		
		

	}
}
