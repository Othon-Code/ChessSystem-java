package chadrez.pecas;

import chadrez.Cor;
import chadrez.PecaChadrez;
import tabjogo.Tabuleiro;

public class Torre extends PecaChadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		
	}
@Override
public String toString() {
	return "T";
}
}
