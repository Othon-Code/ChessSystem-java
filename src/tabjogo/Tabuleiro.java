package tabjogo;

public class Tabuleiro {

	private int qtdeLinhas;
	private int qtdeColunas;

	private Peca[][] pecas;

	public Tabuleiro(int qtdeLinhas, int qtdeColunas) {
		this.qtdeLinhas = qtdeLinhas;
		this.qtdeColunas = qtdeColunas;
		pecas = new Peca[qtdeLinhas][qtdeColunas];
	}

	public int getQtdeLinhas() {
		return qtdeLinhas;
	}

	public void setQtdeLinhas(int qtdeLinhas) {
		this.qtdeLinhas = qtdeLinhas;
	}

	public int getQtdeColunas() {
		return qtdeColunas;
	}

	public void setQtdeColunas(int qtdeColunas) {
		this.qtdeColunas = qtdeColunas;
	}
	
	public Peca peca(int lin, int col) {
		return pecas[lin][col];
	}

	public Peca peca(Posicao posic) {
		return pecas[posic.getLinha()][posic.getColuna()];
	}
	
}
