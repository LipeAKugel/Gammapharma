package view;

import java.awt.event.*;
import javax.swing.*;

public class TelaDetalhe implements ActionListener{
	
	private JFrame janela;
	
	//Variaveis Produto
	private JLabel lnome;
	private JTextField nome;
	private JLabel lmarca;
	private JTextField marca;
	private JLabel lfabri;
	private JTextField fabri;
	private JLabel lpeso;
	private JTextField peso;
	private JLabel lvali;
	private JTextField vali;
	private JLabel lpreco;
	private JTextField preco;
	
	//Variaveis Filiais
	private JLabel liden;
	private JTextField iden;
	private JLabel llogra;
	private JTextField logra;
	private JLabel lcompl;
	private JTextField compl;
	private JLabel lcep;
	private JTextField cep;
	private JLabel lcidade;
	private JTextField cidade;
	private JLabel lestado;
	private JTextField estado;
	private JLabel lcnpj;
	private JTextField cnpj;
	
	
	public TelaDetalhe (int op) {
		
		// Crie o JFrame.
		janela = new JFrame("Tela Detalhe");
		
		// Set as bounds.
		int j_comp = 500;
		int j_larg = 500;
		int p_y = 30;
		int p_x = 30;
		int Tp_y = 52;
		
		switch (op) {
		case 1:
			//Label
			lnome = new JLabel("Nome: ");
			lfabri = new JLabel("Fabricante: ");
			lpeso = new JLabel("Peso: ");
			lpreco = new JLabel("Preco: ");
			lmarca = new JLabel("Marca: ");
			lvali = new JLabel("Validade: ");
			
			lnome.setBounds(p_x, p_y, 60, 60);
			lfabri.setBounds(p_x, p_y+30, 80, 60);
			lpeso.setBounds(p_x, p_y+30*2, 60, 60);
			lvali.setBounds(p_x, p_y+30*3, 60, 60);
			lpreco.setBounds(p_x, p_y+30*4, 60, 60);
			lmarca.setBounds(p_x, p_y+30*5, 60, 60);
			
			//JTextFields
			
			nome = new JTextField();
			peso = new JTextField();
			fabri = new JTextField();
			vali = new JTextField();
			preco = new JTextField();
			marca = new JTextField();
			
			nome.setBounds(p_x+40, Tp_y, 200, 20);
			fabri.setBounds(p_x+66, Tp_y+30, 200, 20);
			peso.setBounds(p_x+35, Tp_y+30*2, 200, 20);
			vali.setBounds(p_x+55, Tp_y+30*3, 200, 20);
			preco.setBounds(p_x+41, Tp_y+30*4, 200, 20);
			marca.setBounds(p_x+42, Tp_y+30*5, 200, 20);
			
			// Adicione e mostre a janela.
			janela.setSize(j_comp, j_larg);
			
			//Adiciona JLabel
			janela.add(lnome);
			janela.add(lfabri);
			janela.add(lmarca);
			janela.add(lpeso);
			janela.add(lpreco);
			janela.add(lvali);
			
			//Adiciona JText
			janela.add(nome);
			janela.add(fabri);
			janela.add(preco);
			janela.add(marca);
			janela.add(peso);
			janela.add(vali);
			//
			janela.setLayout(null);
			janela.setVisible(true);
		break;
		case 2: //label
			liden = new JLabel("Identificador: ");
			llogra = new JLabel("Logradouro: ");
			lcep = new JLabel("CEP: ");
			lcnpj = new JLabel("CNPJ: ");
			lestado = new JLabel("Estado: ");
			lcidade = new JLabel("Cidade: " );
			lcompl = new JLabel("Complemento: ");
			
			liden.setBounds(p_x, p_y, 60, 60);
			llogra.setBounds(p_x, p_y+30, 80, 60);
			lcompl.setBounds(p_x, p_y+30*2, 60, 60);
			lcep.setBounds(p_x, p_y+30*3, 60, 60);
			lcnpj.setBounds(p_x, p_y+30*4, 60, 60);
			lestado.setBounds(p_x, p_y+30*5, 60, 60);
			lcidade.setBounds(p_x, p_y+30*6, 60, 60);
			
			//JTextFields
			iden = new JTextField();
			logra = new JTextField();
			estado = new JTextField();
			cep = new JTextField();
			cnpj = new JTextField();
			cidade = new JTextField();
			compl = new JTextField();
			
			iden.setBounds(p_x+40, Tp_y, 200, 20);
			logra.setBounds(p_x+66, Tp_y+30, 200, 20);
			cep.setBounds(p_x+35, Tp_y+30*2, 200, 20);
			cnpj.setBounds(p_x+55, Tp_y+30*3, 200, 20);
			estado.setBounds(p_x+41, Tp_y+30*4, 200, 20);
			cidade.setBounds(p_x+42, Tp_y+30*5, 200, 20);
			compl.setBounds(p_x+42, Tp_y+30*6, 200, 20);
			
			// Adicione e mostre a janela.
			janela.setSize(j_comp, j_larg);
			
			//Adiciona JLabel
			janela.add(liden);
			janela.add(llogra);
			janela.add(lcep);
			janela.add(lcnpj);
			janela.add(lestado);
			janela.add(lcompl);
			janela.add(lcidade);
			
			//Adiciona JText
			janela.add(iden);
			janela.add(logra);
			janela.add(cep);
			janela.add(cnpj);
			janela.add(estado);
			janela.add(compl);
			janela.add(cidade);
			
			//Tela
			janela.setLayout(null);
			janela.setVisible(true);
		break;
		}
		
	}

	
	public void actionPerformed(ActionEvent e) {

	}

}
