package application;

import chadrez.PartidaChadrez;
import tabjogo.Posicao;
import tabjogo.Tabuleiro;

public class Programa {

	public static void main(String[] args) {

		PartidaChadrez partChadrez = new PartidaChadrez();
		UI.imprimeTabuleiro(partChadrez.getPecas());
	}

}
