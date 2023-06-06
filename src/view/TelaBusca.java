package view;

import javax.swing.*;

public class TelaBusca {
	private JFrame janela;
	private JLabel labelBusca;
	private JTextField busca;
	private JButton pesquisar;
	private JButton listarTodos;
	private JList<String> listaProdutos;
	private String[] nomes_p = {"Paracetamol", "Dipirona", "Soro Fisiológico"};
	private String[] nomes_f = {"Gamma Pharma Recanto", "Gamma Pharma Tagua", "Gamma Pharma Samambaia"};
	
	public void telaBusca(int op) {
		
		// Dimensões da janela.
		int j_comp = 500;
		int j_larg = 500;
		int l_comp = 420;
		int l_larg = 350;
		
		// Criar os elementos da tela.
		janela = new JFrame("Buscar Produtos");
		busca = new JTextField(100);
		pesquisar = new JButton("Pesquisar");
		
		// Sete as dimensões.
		janela.setSize(j_comp, j_larg);
		busca.setBounds(140,10,200,20);
		pesquisar.setBounds(340, 10, 110, 20);
		
		// Adicione os elementos e mostre a janela.
		janela.add(busca);
		janela.add(pesquisar);
		janela.setLayout(null);
		janela.setVisible(true);
		
		// Crie os elementos dependendo da config de tela.
		switch (op) {
			case 1: // Busca de produtos.
				
				// Crie os elementos da tela.
				labelBusca = new JLabel("Busca por nome:");
				listaProdutos = new JList<String>(nomes_p);
				listarTodos = new JButton("Listar Todos");
				
				// Sete as dimensões.
				labelBusca.setBounds(30,9,120,20);
				listaProdutos.setBounds(30, 50, l_comp, l_larg);
				listarTodos.setBounds(195, 410, 110, 30);
				
				// Adicione os elementos para a janela.
				janela.add(labelBusca);
				janela.add(listaProdutos);
				janela.add(listarTodos);
				
			break;
			
			case 2: // Busca de filiais.
				
				// Crie os elementos da tela.
				labelBusca = new JLabel("Busca por cidade:");
				listaProdutos = new JList<String>(nomes_f);
				
				// Sete as dimensões.
				labelBusca.setBounds(30,9,120,20);
				listaProdutos.setBounds(30, 50, l_comp, l_larg);
				
				// Adicione os elementos para a janela.
				janela.add(labelBusca);
				janela.add(listaProdutos);
				
			break;
			
		}
	}
}
