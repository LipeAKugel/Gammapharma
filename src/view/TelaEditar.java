package view;

import java.awt.event.*;
import javax.swing.*;

public class TelaEditar implements ActionListener {
	private JFrame janela;
	private JList<String> listaAmbos;
	private static JButton cadastrarP;
	private static JButton cadastrarF;
	private JButton remover;
	private String[] nomes_p = {"Paracetamol", "Dipirona", "Soro Fisiológico"};
	private String[] nomes_f = {"Gamma Pharma Recanto", "Gamma Pharma Tagua", "Gamma Pharma Samambaia"};

	public void mostrarDados(int op) {
		
		// Dimensões da janela.
		int j_comp = 500;
		int j_larg = 500;
		int l_comp = 420;
		int l_larg = 350;
		
		
		switch (op) {
			case 1: // Edição de produtos.
				janela = new JFrame("Editar Produtos");
				janela.setSize(j_comp, j_larg);
				
				
				//Lista os produtos
				listaAmbos = new JList<String>(nomes_p);
				janela.add(listaAmbos);
				listaAmbos.setBounds(30, 50, l_comp, l_larg);
				
				//Botões	
				cadastrarP = new JButton("Cadastrar");
				remover = new JButton("Remover");
				cadastrarP.setBounds(120, 410, 110, 30);		
				remover.setBounds(265, 410, 110, 30);
				janela.add(cadastrarP);
				janela.add(remover);
				cadastrarP.addActionListener(this);
				
				//Visibilidade janela
				janela.setLayout(null);
				janela.setVisible(true);
				
			break;
			case 2: // Edição de filiais.
				janela = new JFrame("Editar Filiais");
				janela.setSize(j_comp, j_larg);
				
				//Lista as filiais
				listaAmbos = new JList<String>(nomes_f);
				listaAmbos.setBounds(30, 50, l_comp, l_larg);
				janela.add(listaAmbos);
				
				//Botões
				cadastrarF = new JButton("Cadastrar");
				remover = new JButton("Remover");
				cadastrarF.setBounds(120, 410, 110, 30);		
				remover.setBounds(265, 410, 110, 30);
				janela.add(cadastrarF);
				janela.add(remover);
				cadastrarF.addActionListener(this);
				
				//Visibilidade janela
				janela.setLayout(null);
				janela.setVisible(true);
			break;
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		//Escolhe qual tela ir.
		if(src == cadastrarP) 
			new TelaDetalhe(1);
		if(src == cadastrarF) 
			new TelaDetalhe(2);
	}
}
