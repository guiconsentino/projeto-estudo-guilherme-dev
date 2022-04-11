package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x = 0;
	public int y = 0;

	
	 Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;   	
		}else if(deltaY == 1 && deltaX == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
		
	}

	public boolean andar(Direcao direcao) {

		if (direcao == Direcao.NORTE) {
			y--;
			System.out.println("norte");
		} else if (direcao == Direcao.LESTE) {
			x++;
			System.out.println("leste");
		} else if (direcao == Direcao.OESTE) {
			x--;
			System.out.println("oeste");
		} else {
			y++;
			System.out.println("sul");
		}
		return true;

	}

}
