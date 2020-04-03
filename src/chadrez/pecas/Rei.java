package chadrez.pecas;

import chadrez.Cor;
import chadrez.PecaChadrez;
import tabjogo.Tabuleiro;

public class Rei extends PecaChadrez {

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		
	}

	@Override
	public String toString() {
		return "R";
	}
	
}
