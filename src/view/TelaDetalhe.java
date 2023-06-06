package view;

import javax.swing.JFrame;

public class TelaDetalhe {
	TelaDetalhe() {
		
		// Crie o JFrame.
		JFrame janela = new JFrame("Tela Detalhe");
		
		// Set as bounds.
		int j_comp = 500;
		int j_larg = 500;
		
		// Adicione e mostre a janela.
		janela.setSize(j_comp, j_larg);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setLayout(null);
		janela.setVisible(true);
		
	}

}
