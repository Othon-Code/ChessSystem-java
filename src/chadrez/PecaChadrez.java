package chadrez;

import tabjogo.Peca;
import tabjogo.Tabuleiro;

public class PecaChadrez extends Peca {
	
	private Cor cor;

	public PecaChadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	
	

}
