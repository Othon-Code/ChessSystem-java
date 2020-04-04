package chadrez;

import chadrez.pecas.Rei;
import chadrez.pecas.Torre;
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

	private void novoLugarPeca(char colun, int lin, PecaChadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicChadrez(colun, lin).toposicao());
	}

	private void iniciarSetUp() {
		novoLugarPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		novoLugarPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
		novoLugarPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
	}
}
