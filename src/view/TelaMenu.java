package view;

import javax.swing.*;

public class TelaMenu {
	TelaMenu() {
		
		// Crie o container JFrame.
		JFrame janela = new JFrame("Menu Inicial");
		janela.setSize(400, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Mostre a janela.
		janela.setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new TelaMenu();
	}
}
