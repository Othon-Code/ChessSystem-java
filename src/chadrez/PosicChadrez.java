package chadrez;

import tabjogo.Posicao;

public class PosicChadrez {

	private char col;
	private int lin;

	public PosicChadrez(char col, int lin) {
		if (col < 'a' || col > 'h' || lin < 1 || lin > 8) {
			throw new ChadrezException("Erro ao instanciar PosicChadrez");
		}
		this.col = col;
		this.lin = lin;
	}

	public char getCol() {
		return col;
	}

	public int getLin() {
		return lin;
	}

	protected Posicao toposicao() {
		return new Posicao(8 - lin, col - 'a');

	}

	protected static PosicChadrez formPosicao(Posicao posic) {
		return new PosicChadrez((char) ('a' - posic.getColuna()), 8 - posic.getLinha());

	}

	@Override
	public String toString() {
		return "" + col + lin;
		
	}

}
