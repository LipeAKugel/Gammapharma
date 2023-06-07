package view;

import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaDetalhe implements ActionListener{
	
	private JFrame janela;
	private ControleFarmacia dados;
	private JButton salvar;
	
	//Variaveis Produto.
	String[] filiais;
	private JComboBox<String> filial;
	private JLabel lfilial;
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
	String[] itens = {"Medicamento","Suplemento","Cosmético"};
	private JComboBox<String> categoria;
	private JLabel lcategoria;
	
	// Variáveis Produtos categoria.
	private JLabel lmodoUso;
	private JTextField modoUso;
	private JLabel lquantidade;
	private JTextField quantidade;
	private JLabel ldosagem;
	private JTextField dosagem;
	private JLabel lefeitos;
	private JTextField efeitos;
	private JLabel lindicacao;
	private JTextField indicacao;
	private JLabel lprincipio;
	private JTextField principio;
	private JLabel laplicacao;
	private JTextField aplicacao;
	private JLabel lfuncao;
	private JTextField funcao;
	private JLabel ltipoPele;
	private JTextField tipoPele;
	
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
	
	public TelaDetalhe (int op, ControleFarmacia dados) {
		this.dados = dados;
		
		// Crie o JFrame.
		janela = new JFrame("Informações");
		
		// Set as bounds.
		int j_comp = 400;
		int j_larg = 500;
		int p_y = 0;
		int p_x = 30;
		int Tp_y = 22;
		janela.setSize(j_comp, j_larg);
		
		// JButton.
		salvar = new JButton("Salvar");
		salvar.setBounds(135, 416, 110, 30);
		janela.add(salvar);
		
		// Adicione e mostre a janela.
		janela.setLayout(null);
		janela.setVisible(true);
		
		switch (op) {
		case 1: // Cadastro/Edição de produto.
			
			//Label
			lfilial = new JLabel("Filial: ");
			lnome = new JLabel("Nome: ");
			lfabri = new JLabel("Fabricante: ");
			lpeso = new JLabel("Peso: ");
			lpreco = new JLabel("Preco: ");
			lmarca = new JLabel("Marca: ");
			lvali = new JLabel("Validade: ");
			lcategoria = new JLabel("Categoria: ");
			lmodoUso = new JLabel("Modo Uso: ");
			lquantidade = new JLabel("Quantidade: ");
			ldosagem = new JLabel("Dosagem: ");
			lefeitos = new JLabel("Efeitos Colaterais: ");
			lindicacao = new JLabel("Indicação: ");
			lprincipio = new JLabel("Princípio Ativo: ");
			laplicacao = new JLabel("Aplicação: ");
			lfuncao = new JLabel("Função: ");
			ltipoPele = new JLabel("Tipo Pele: ");
			
			lfilial.setBounds(p_x, p_y, 60, 60);
			lnome.setBounds(p_x, p_y+30, 60, 60);
			lfabri.setBounds(p_x, p_y+30*2, 80, 60);
			lpeso.setBounds(p_x, p_y+30*3, 60, 60);
			lpreco.setBounds(p_x, p_y+30*4, 60, 60);
			lmarca.setBounds(p_x, p_y+30*5, 60, 60);
			lvali.setBounds(p_x, p_y+30*6, 60, 60);
			lcategoria.setBounds(p_x, p_y+30*7, 90, 60);
			lmodoUso.setBounds(p_x, p_y+30*8, 90, 60);
			lquantidade.setBounds(p_x, p_y+30*9, 90, 60);
			ldosagem.setBounds(p_x, p_y+30*10, 90, 60);
			lefeitos.setBounds(p_x, p_y+30*11, 90, 60);
			lindicacao.setBounds(p_x, p_y+30*11, 90, 60);
			lprincipio.setBounds(p_x, p_y+30*12, 90, 60);
			laplicacao.setBounds(p_x, p_y+30*8, 90, 60);
			lfuncao.setBounds(p_x, p_y+30*9, 90, 60);
			ltipoPele.setBounds(p_x, p_y+30*10, 90, 60);
			
			//JTextFields
			nome = new JTextField();
			peso = new JTextField();
			fabri = new JTextField();
			preco = new JTextField();
			marca = new JTextField();
			vali = new JTextField();
			modoUso = new JTextField();
			quantidade = new JTextField();
			dosagem = new JTextField();
			efeitos = new JTextField();
			indicacao = new JTextField();
			principio = new JTextField();
			aplicacao = new JTextField();
			funcao = new JTextField();
			tipoPele = new JTextField();
			
			/*
			nome.setBounds(p_x+40, Tp_y, 200, 20);
			fabri.setBounds(p_x+66, Tp_y+30, 200, 20);
			peso.setBounds(p_x+35, Tp_y+30*2, 200, 20);
			vali.setBounds(p_x+55, Tp_y+30*3, 200, 20);
			preco.setBounds(p_x+41, Tp_y+30*4, 200, 20);
			marca.setBounds(p_x+42, Tp_y+30*5, 200, 20);
			*/
			
			nome.setBounds(p_x+100, Tp_y+30, 200, 20);
			fabri.setBounds(p_x+100, Tp_y+30*2, 200, 20);
			peso.setBounds(p_x+100, Tp_y+30*3, 200, 20);
			preco.setBounds(p_x+100, Tp_y+30*4, 200, 20);
			marca.setBounds(p_x+100, Tp_y+30*5, 200, 20);
			vali.setBounds(p_x+100, Tp_y+30*6, 200, 20);
			modoUso.setBounds(p_x+100, Tp_y+30*8, 200, 20);
			quantidade.setBounds(p_x+100, Tp_y+30*9, 200, 20);
			dosagem.setBounds(p_x+100, Tp_y+30*10, 200, 20);
			efeitos.setBounds(p_x+100, Tp_y+30*11, 200, 20);
			indicacao.setBounds(p_x+100, Tp_y+30*11, 200, 20);
			principio.setBounds(p_x+100, Tp_y+30*12, 200, 20);
			aplicacao.setBounds(p_x+100, Tp_y+30*8, 200, 20);
			funcao.setBounds(p_x+100, Tp_y+30*9, 200, 20);
			tipoPele.setBounds(p_x+100, Tp_y+30*10, 200, 20);
			
			// ComboBox
			filiais = new ControleFilial(dados).getNomeFiliais();
			filial = new JComboBox<>(filiais);
			filial.setBounds(p_x+100, Tp_y, 120, 20);
			categoria = new JComboBox<>(itens);
			categoria.setBounds(p_x+100, Tp_y+30*7, 120, 20);
			categoria.addActionListener(this);
			
			// Adiciona a JComboBox.
			janela.add(filial);
			janela.add(categoria);
			
			//Adiciona JLabel
			janela.add(lfilial);
			janela.add(lnome);
			janela.add(lfabri);
			janela.add(lmarca);
			janela.add(lpeso);
			janela.add(lpreco);
			janela.add(lvali);
			janela.add(lcategoria);
			janela.add(lmodoUso);
			janela.add(lquantidade);
			janela.add(ldosagem);
			janela.add(lefeitos);
			janela.add(lindicacao);
			janela.add(lprincipio);
			janela.add(laplicacao);
			janela.add(lfuncao);
			janela.add(ltipoPele);
			
			//Adiciona JTextFields.
			janela.add(nome);
			janela.add(fabri);
			janela.add(preco);
			janela.add(marca);
			janela.add(peso);
			janela.add(vali);
			janela.add(modoUso);
			janela.add(quantidade);
			janela.add(dosagem);
			janela.add(efeitos);
			janela.add(indicacao);
			janela.add(principio);
			janela.add(aplicacao);
			janela.add(funcao);
			janela.add(tipoPele);
			
			// Visibilidade dos elementos.
			lmodoUso.setVisible(true);
			lquantidade.setVisible(true);
			ldosagem.setVisible(true);
			lefeitos.setVisible(true);
			lindicacao.setVisible(false);
			lprincipio.setVisible(false);
			laplicacao.setVisible(false);
			lfuncao.setVisible(false);
			ltipoPele.setVisible(false);
			
			modoUso.setVisible(true);
			quantidade.setVisible(true);
			dosagem.setVisible(true);
			efeitos.setVisible(true);
			indicacao.setVisible(false);
			principio.setVisible(false);
			aplicacao.setVisible(false);
			funcao.setVisible(false);
			tipoPele.setVisible(false);
			
		break;
		
		case 2: // Cadastro/Edição de filial.
			
			//label
			liden = new JLabel("Identificador: ");
			llogra = new JLabel("Logradouro: ");
			lcep = new JLabel("CEP: ");
			lcnpj = new JLabel("CNPJ: ");
			lestado = new JLabel("Estado: ");
			lcidade = new JLabel("Cidade: " );
			lcompl = new JLabel("Complemento: ");
			
			liden.setBounds(p_x, p_y, 80, 60);
			llogra.setBounds(p_x, p_y+30, 80, 60);
			lcompl.setBounds(p_x, p_y+30*2, 90, 60);
			lcep.setBounds(p_x, p_y+30*3, 30, 60);
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
			
			/*
			iden.setBounds(p_x+40, Tp_y, 200, 20);
			logra.setBounds(p_x+66, Tp_y+30, 200, 20);
			cep.setBounds(p_x+35, Tp_y+30*2, 200, 20);
			cnpj.setBounds(p_x+55, Tp_y+30*3, 200, 20);
			estado.setBounds(p_x+41, Tp_y+30*4, 200, 20);
			cidade.setBounds(p_x+42, Tp_y+30*5, 200, 20);
			compl.setBounds(p_x+42, Tp_y+30*6, 200, 20);
			*/
			
			iden.setBounds(p_x+100, Tp_y, 200, 20);
			logra.setBounds(p_x+100, Tp_y+30, 200, 20);
			cep.setBounds(p_x+100, Tp_y+30*2, 200, 20);
			cnpj.setBounds(p_x+100, Tp_y+30*3, 200, 20);
			estado.setBounds(p_x+100, Tp_y+30*4, 200, 20);
			cidade.setBounds(p_x+100, Tp_y+30*5, 200, 20);
			compl.setBounds(p_x+100, Tp_y+30*6, 200, 20);
			
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
			
		break;
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		String categ = (String) categoria.getSelectedItem();
		
		// Mude a visibilidade dos elementos dependendo da categoria.
		if (categ.equals(itens[0])) {
			// Elementos.
			lmodoUso.setVisible(true);
			lquantidade.setVisible(true);
			ldosagem.setVisible(true);
			lefeitos.setVisible(true);
			lindicacao.setVisible(false);
			lprincipio.setVisible(false);
			laplicacao.setVisible(false);
			lfuncao.setVisible(false);
			ltipoPele.setVisible(false);
			
			modoUso.setVisible(true);
			quantidade.setVisible(true);
			dosagem.setVisible(true);
			efeitos.setVisible(true);
			indicacao.setVisible(false);
			principio.setVisible(false);
			aplicacao.setVisible(false);
			funcao.setVisible(false);
			tipoPele.setVisible(false);
			
		}
		
		if (categ.equals(itens[1])) {
			// Elementos.
			lmodoUso.setVisible(true);
			lquantidade.setVisible(true);
			ldosagem.setVisible(true);
			lefeitos.setVisible(false);
			lindicacao.setVisible(true);
			lprincipio.setVisible(true);
			laplicacao.setVisible(false);
			lfuncao.setVisible(false);
			ltipoPele.setVisible(false);
			
			modoUso.setVisible(true);
			quantidade.setVisible(true);
			dosagem.setVisible(true);
			efeitos.setVisible(false);
			indicacao.setVisible(true);
			principio.setVisible(true);
			aplicacao.setVisible(false);
			funcao.setVisible(false);
			tipoPele.setVisible(false);
			
		} 
		
		if (categ.equals(itens[2])) {
			// Elementos.
			lmodoUso.setVisible(false);
			lquantidade.setVisible(false);
			ldosagem.setVisible(false);
			lefeitos.setVisible(false);
			lindicacao.setVisible(false);
			lprincipio.setVisible(false);
			laplicacao.setVisible(true);
			lfuncao.setVisible(true);
			ltipoPele.setVisible(true);
			
			modoUso.setVisible(false);
			quantidade.setVisible(false);
			dosagem.setVisible(false);
			efeitos.setVisible(false);
			indicacao.setVisible(false);
			principio.setVisible(false);
			aplicacao.setVisible(true);
			funcao.setVisible(true);
			tipoPele.setVisible(true);
			
		}
	}

}
