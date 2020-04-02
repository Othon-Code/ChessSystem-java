package chadrez;

import tabjogo.Tabuleiro;

public class PartidaChadrez {
	private Tabuleiro tabuleiro;

	public PartidaChadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}

	public PecaChadrez[][] getPecas() {
		PecaChadrez[][] mat = new PecaChadrez[tabuleiro.getQtdeLinhas()][tabuleiro.getQtdeColunas()];
		for (int i = 0; i < tabuleiro.getQtdeLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getQtdeColunas(); j++) {
				mat[i][j] = (PecaChadrez) tabuleiro.peca(i, j);

			}
		}
		return mat;

	}

}
