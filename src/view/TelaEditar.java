package view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

import controle.ControleFarmacia;
import controle.ControleFilial;
import controle.ControleProduto;

public class TelaEditar implements ActionListener {
	private JFrame janela;
	private ControleFarmacia dados;
	private int op;
	private JLabel titulo;
	private JList<String> listaAmbos;
	private static JButton cadastrarP;
	private static JButton cadastrarF;
	private static JButton refresh;
	private JButton editarP;
	private JButton editarF;
	private String[] nomes_p = new String[50];
	private String[] nomes_f = new String[50];

	public void mostrarDados(int op, ControleFarmacia dados) {
		this.dados = dados;
		this.op = op;
		
		// Dimensões da janela.
		int j_comp = 500;
		int j_larg = 500;
		int l_comp = 420;
		int l_larg = 310;
		
		// Janela.
		janela = new JFrame();
		janela.setSize(j_comp, j_larg);
		
		// JButtons.
		refresh = new JButton("Atualizar");
		refresh.setBounds(340, 410, 110, 30);
		janela.add(refresh);
		refresh.addActionListener(this);
		
		switch (op) {
			case 1: // Edição de produtos.
				janela.setTitle("Editar Produtos");
				
				// Label.
				titulo = new JLabel("Produtos Cadastrados");
				titulo.setFont(new Font("Arial", Font.BOLD, 30));
				titulo.setBounds(75, 20, 400, 40);
				janela.add(titulo);
				
				//Lista os produtos
				nomes_p = new ControleProduto(dados).getNomeProdutos();
				listaAmbos = new JList<String>(nomes_p);
				janela.add(listaAmbos);
				listaAmbos.setBounds(30, 70, l_comp, l_larg);
				
				//Botões	
				cadastrarP = new JButton("Cadastrar");
				editarP = new JButton("Editar");
				cadastrarP.setBounds(50, 410, 110, 30);		
				editarP.setBounds(195, 410, 110, 30);
				janela.add(cadastrarP);
				janela.add(editarP);
				cadastrarP.addActionListener(this);
				editarP.addActionListener(this);
				
				//Visibilidade janela
				janela.setLayout(null);
				janela.setVisible(true);
				
			break;
			
			case 2: // Edição de filiais.
				janela.setTitle("Editar Filiais");
				
				// Label.
				titulo = new JLabel("Filiais Cadastradas");
				titulo.setFont(new Font("Arial", Font.BOLD, 30));
				titulo.setBounds(100, 20, 400, 40);
				janela.add(titulo);
				
				//Lista as filiais.
				nomes_f = new ControleFilial(dados).getNomeFiliais();
				listaAmbos = new JList<String>(nomes_f);
				listaAmbos.setBounds(30, 70, l_comp, l_larg);
				janela.add(listaAmbos);
				
				//Botões
				cadastrarF = new JButton("Cadastrar");
				editarF = new JButton("Editar");
				cadastrarF.setBounds(50, 410, 110, 30);		
				editarF.setBounds(195, 410, 110, 30);
				janela.add(cadastrarF);
				janela.add(editarF);
				cadastrarF.addActionListener(this);
				editarF.addActionListener(this);
				
				//Visibilidade janela
				janela.setLayout(null);
				janela.setVisible(true);
			break;
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Opções gerais.
		if(src == refresh) {
			if (op == 1) {
				nomes_p = new ControleProduto(dados).getNomeProdutos();
				listaAmbos.setListData(nomes_p);
			} else {
				nomes_f = new ControleFilial(dados).getNomeFiliais();
				listaAmbos.setListData(nomes_f);
			}
		}
		
		// Opções de cadastro.
		if(src == cadastrarP) {
			// Verifique se existem filiais.
			if (dados.getFiliais().length > 0) {
				new TelaDetalhe(1,dados,0);
			} else {
				JOptionPane.showMessageDialog(null,"Não existem filiais!", null, 
											  JOptionPane.ERROR_MESSAGE);
			}
		}
		
		if(src == cadastrarF) {
			new TelaDetalhe(2,dados,0);
		}
		
		// Opções de edição.
		if(src == editarP) {
			int pos = listaAmbos.getSelectedIndex();
			if (pos != -1) {
				new TelaDetalhe(3,dados,pos);
			}
		}
		
		if(src == editarF) {
			int pos = listaAmbos.getSelectedIndex();
			if (pos != -1) {
				new TelaDetalhe(4,dados,pos);
			}
		}
	}
}
