package view;

import javax.swing.JFrame;

public class TelaEditar {
	private JFrame janela;

	public void mostrarDados(int op) {
		
		// Dimensões da janela.
		int j_comp = 500;
		int j_larg = 500;
		
		switch (op) {
			case 1: // Edição de produtos.
				janela = new JFrame("Editar Produtos");
				janela.setSize(j_comp, j_larg);
				
				janela.setLayout(null);
				janela.setVisible(true);
			break;
			case 2: // Edição de filiais.
				janela = new JFrame("Editar Filiais");
				janela.setSize(j_comp, j_larg);
				
				janela.setLayout(null);
				janela.setVisible(true);
			break;
		}
		
	}
	
}
