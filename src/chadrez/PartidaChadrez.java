package chadrez;

import chadrez.pecas.Rei;
import chadrez.pecas.Torre;
import tabjogo.Posicao;
import tabjogo.Tabuleiro;

public class PartidaChadrez {
	private Tabuleiro tabuleiro;

	public PartidaChadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarSetUp();
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

	private void iniciarSetUp() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));
	}
}
