package tabjogo;

public class Tabuleiro {

	private int qtdeLinhas;
	private int qtdeColunas;

	private Peca[][] pecas;

	public Tabuleiro(int qtdeLinhas, int qtdeColunas) {
		if (qtdeLinhas < 1 || qtdeColunas < 1) {
			throw new TabException(
					"Erro na criacao do tabuleiro: � nescess�rio que exista ao menos 1 linha e 1 coluna");
		}
		this.qtdeLinhas = qtdeLinhas;
		this.qtdeColunas = qtdeColunas;
		pecas = new Peca[qtdeLinhas][qtdeColunas];
	}

	public int getQtdeLinhas() {
		return qtdeLinhas;
	}

	public int getQtdeColunas() {
		return qtdeColunas;
	}

	public Peca peca(int lin, int col) {
		if (!existePosicao(lin, col)) {
			throw new TabException("Posi��o n�o existente no tabuleiro");
		}
		return pecas[lin][col];
	}

	public Peca peca(Posicao posic) {
		if (!existePosicao(posic)) {
			throw new TabException("Posi��o n�o existente no tabuleiro");
		}
		return pecas[posic.getLinha()][posic.getColuna()];
	}

	public void lugarPeca(Peca peca, Posicao posic) {
		if (haPeca(posic)) {
			throw new TabException("J� existe uma pe�a nesta posi��o " + posic);
		}
		pecas[posic.getLinha()][posic.getColuna()] = peca;
		peca.posicao = posic;
	}

	private boolean existePosicao(int lin, int col) {
		return lin >= 0 && lin < qtdeLinhas && col >= 0 && col < qtdeColunas;
	}

	public boolean existePosicao(Posicao posic) {
		return existePosicao(posic.getLinha(), posic.getColuna());

	}

	public boolean haPeca(Posicao posic) {
		if (!existePosicao(posic)) {
			throw new TabException("Posi��o n�o existente no tabuleiro");
		}
		return peca(posic) != null;
	}

}
