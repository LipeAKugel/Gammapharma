package view;

import java.awt.event.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import controle.*;
import modelo.*;
/**
 * A classe TelaDetalhe implementa a interface ActionListener
 * e representa uma tela de detalhes para cadastro ou edição
 * de produtos ou filiais em uma farmácia.
 * @author Felipe Amorim e João Vitor
 * @since 2023
 * @version 1.0
 */
public class TelaDetalhe implements ActionListener{
	
	private ControleFarmacia dados;
	private String[] dadosAtuais;
	private String[] dadosNovos;
	private int op;
	private int pos;
	private JFrame janela;
	private JButton salvar;
	private JButton remover;
	
	// Elementos de produto.
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
	
	// Elementos de categoria.
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
	
	// Elementos de filial.
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
	
    /**
     * Constrói um objeto TelaDetalhe com a opção, os dados e a posição fornecidos.
     * 
     * @param op    a opção selecionada (1 para cadastro de produto, 2 para cadastro de filial, 
     *              3 para edição de produto, 4 para edição de filial)
     * @param dados os dados da farmácia
     * @param pos   a posição do objeto na lista de produtos ou filiais
     */
	public TelaDetalhe (int op, ControleFarmacia dados, int pos) {
		this.dados = dados;
		this.op = op;
		this.pos = pos;
		
		// Crie o JFrame.
		janela = new JFrame("Informações");
		
		// Set as bounds.
		int j_comp = 400;
		int j_larg = 500;
		janela.setSize(j_comp, j_larg);
		
		// JButtons.
		salvar = new JButton("Salvar");
		salvar.setBounds(135, 416, 110, 30);
		salvar.addActionListener(this);
		janela.add(salvar);
		
		// Adicione e mostre a janela.
		janela.setLayout(null);
		janela.setVisible(true);
		
		// Construa a tela de acordo com a opção.
		switch (op) {
		case 1: // Cadastro de produto.
			construirTelaProd();
			
			// Visibilidade dos elementos únicos.
			opcaoMedicamento();
			
		break;
		
		case 2: // Cadastro de filial.
			construirTelaFilial();
			
		break;
		
		case 3: // Edição de produto.
			construirTelaProd();
			filial.setEnabled(false);
			categoria.setEnabled(false);
			
			// JButtons.
			salvar.setBounds(75, 416, 110, 30);
			remover = new JButton("Remover");
			remover.setBounds(190, 416, 110, 30);
			remover.addActionListener(this);
			janela.add(remover);
			
			// Carregue e preencha os dados.
			preencherProduto(pos);
			
		break;
		
		case 4: // Edição de filial.
			construirTelaFilial();
			
			// JButtons.
			salvar.setBounds(75, 416, 110, 30);
			remover = new JButton("Remover");
			remover.setBounds(190, 416, 110, 30);
			remover.addActionListener(this);
			janela.add(remover);
			
			// Carregue e preencha os dados.
			preencherFilial(pos);
			
		break;
		}
		
	}
	
	// Métodos.
	/**
	 * Executa a ação correspondente ao evento recebido.
	 *
	 * @param e o evento que ocorreu
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		// Funções dos botões.
		if (src == salvar) {
			if (op == 1 || op == 3) { // Produto.
				// Guardar os dados do produto.
				guardarProduto();
				
				// Verifique os dados e depois salve-os.
				boolean dadosValidos = dados.checarDados(dadosNovos, 1);
				if (dadosValidos) {
					boolean concluido = dados.salvarProduto(dadosNovos, pos, op);
					if (concluido) {
						janela.dispose();
					} else {
						JOptionPane.showMessageDialog(null,"Dados não salvos!", null, 
								  JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null,"Verifique os dados!", null, 
							  JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
			if (op == 2 || op == 4) { // Filial.
				// Guardar os dados da filial.
				guardarFilial();
				
				// Verifique os dados e depois salve-os.
				boolean dadosValidos = dados.checarDados(dadosNovos, 2);
				if (dadosValidos) {
					boolean concluido = dados.salvarFilial(dadosNovos, pos, op);
					if (concluido) {
						janela.dispose();
					} else {
						JOptionPane.showMessageDialog(null,"Dados não salvos!", null, 
								  JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null,"Verifique os dados!", null, 
							  JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		if (src == remover) {
			if (op == 3) { // Produto.
				dados.removerProduto(pos);
				janela.dispose();
			}
			if (op == 4) { // Filial.
				dados.removerFilial(pos);
				janela.dispose();
			}
		}
		
		// Mude a visibilidade dos elementos dependendo da categoria.
		if (op == 1 || op == 3) {
			String categ = (String) categoria.getSelectedItem();
			
			if (categ.equals(itens[0])) {
				opcaoMedicamento();
			}
			
			if (categ.equals(itens[1])) {
				opcaoSuplemento();
			} 
			
			if (categ.equals(itens[2])) {
				opcaoCosmetico();
			}
		}
	}
	/**
	 * Constrói a tela de produto, adicionando os labels, text fields e combo boxes correspondentes aos dados do produto.
	 */
	public void construirTelaProd() {
		// Constrói a tela de produto.
		
		// Coordenadas.
		int p_y = 0; // Y inicial dos Labels.
		int p_x = 30; // X inicial dos Labels.
		int tp_y = 22; // Y inicial dos JTextFields.
		
		// Labels.
		lfilial = new JLabel("Filial: ");
		lnome = new JLabel("Nome*: ");
		lfabri = new JLabel("Fabricante*: ");
		lpeso = new JLabel("Peso*: ");
		lpreco = new JLabel("Preco*: ");
		lmarca = new JLabel("Marca*: ");
		lvali = new JLabel("Validade*: ");
		lcategoria = new JLabel("Categoria: ");
		lmodoUso = new JLabel("Modo Uso: ");
		lquantidade = new JLabel("Quantidade: ");
		ldosagem = new JLabel("Dosage: ");
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
		
		// JTextFields
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
		
		nome.setBounds(p_x+100, tp_y+30, 200, 20);
		fabri.setBounds(p_x+100, tp_y+30*2, 200, 20);
		peso.setBounds(p_x+100, tp_y+30*3, 200, 20);
		preco.setBounds(p_x+100, tp_y+30*4, 200, 20);
		marca.setBounds(p_x+100, tp_y+30*5, 200, 20);
		vali.setBounds(p_x+100, tp_y+30*6, 200, 20);
		modoUso.setBounds(p_x+100, tp_y+30*8, 200, 20);
		quantidade.setBounds(p_x+100, tp_y+30*9, 200, 20);
		dosagem.setBounds(p_x+100, tp_y+30*10, 200, 20);
		efeitos.setBounds(p_x+100, tp_y+30*11, 200, 20);
		indicacao.setBounds(p_x+100, tp_y+30*11, 200, 20);
		principio.setBounds(p_x+100, tp_y+30*12, 200, 20);
		aplicacao.setBounds(p_x+100, tp_y+30*8, 200, 20);
		funcao.setBounds(p_x+100, tp_y+30*9, 200, 20);
		tipoPele.setBounds(p_x+100, tp_y+30*10, 200, 20);
		
		// ComboBox
		filiais = new ControleFilial(dados).getNomeFiliais();
		filial = new JComboBox<>(filiais);
		categoria = new JComboBox<>(itens);
		
		filial.setBounds(p_x+100, tp_y, 120, 20);
		categoria.setBounds(p_x+100, tp_y+30*7, 120, 20);
		
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
		
	}
	/**
	 * Constrói a tela de filial, adicionando os labels e text fields correspondentes aos dados da filial.
	 */
	public void construirTelaFilial() {
		// Constrói a tela de filial.
		
		// Coordenadas.
		int p_y = 0; // Y inicial dos Labels.
		int p_x = 30; // X inicial dos Labels.
		int tp_y = 22; // Y inicial dos JTextFields.
		
		// Labels
		liden = new JLabel("Identificador*: ");
		llogra = new JLabel("Logradouro*: ");
		lcep = new JLabel("CEP*: ");
		lcnpj = new JLabel("CNPJ*: ");
		lestado = new JLabel("Estado*: ");
		lcidade = new JLabel("Cidade*: " );
		lcompl = new JLabel("Complemento: ");
		
		liden.setBounds(p_x, p_y, 80, 60);
		llogra.setBounds(p_x, p_y+30, 80, 60);
		lcompl.setBounds(p_x, p_y+30*2, 90, 60);
		lcep.setBounds(p_x, p_y+30*3, 30, 60);
		lcnpj.setBounds(p_x, p_y+30*4, 60, 60);
		lestado.setBounds(p_x, p_y+30*5, 60, 60);
		lcidade.setBounds(p_x, p_y+30*6, 60, 60);
		
		// JTextFields
		iden = new JTextField();
		logra = new JTextField();
		estado = new JTextField();
		cep = new JTextField();
		cnpj = new JTextField();
		cidade = new JTextField();
		compl = new JTextField();
		
		iden.setBounds(p_x+100, tp_y, 200, 20);
		logra.setBounds(p_x+100, tp_y+30, 200, 20);
		compl.setBounds(p_x+100, tp_y+30*2, 200, 20);
		cep.setBounds(p_x+100, tp_y+30*3, 200, 20);
		cnpj.setBounds(p_x+100, tp_y+30*4, 200, 20);
		estado.setBounds(p_x+100, tp_y+30*5, 200, 20);
		cidade.setBounds(p_x+100, tp_y+30*6, 200, 20);
		
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
		
	}
	/**
	 * Torna os atributos de um medicamento visíveis e oculta os atributos de suplemento e cosmético.
	 */
	public void opcaoMedicamento() {
		// Torna os atributos de um medicamento visíveis.
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
	/**
	 * Torna os atributos de um suplemento visíveis e oculta os atributos de medicamento e cosmético.
	 */
	public void opcaoSuplemento() {
		// Torna os atributos de um suplemento visíveis.
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
	/**
	 * Torna os atributos de um cosmético visíveis e oculta os atributos de medicamento e suplemento.
	 */
	public void opcaoCosmetico() {
		// Torna os atributos de um cosmético visíveis.
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
	/**
	 * Preenche os dados de um produto nos TextFields com base na posição fornecida.
	 * 
	 * @param pos A posição do produto na lista de dados.
	 */
	public void preencherProduto(int pos) {
		// Preenche os dados de um produto nos TextFields.
		dadosAtuais = new ControleProduto(dados).getDadosProduto(pos);
		
		categoria.setSelectedIndex(Integer.parseInt(dadosAtuais[0]));
		filial.setSelectedIndex(Integer.parseInt(dadosAtuais[1]));
		
		switch (categoria.getSelectedIndex()) {
			case 0:
				// Preenche os atributos do medicamento.
				opcaoMedicamento();
				
				nome.setText(dadosAtuais[2]);
				fabri.setText(dadosAtuais[3]);
				peso.setText(dadosAtuais[4]);
				preco.setText(dadosAtuais[5]);
				marca.setText(dadosAtuais[6]);
				vali.setText(dadosAtuais[7]);
				modoUso.setText(dadosAtuais[8]);
				quantidade.setText(dadosAtuais[9]);
				dosagem.setText(dadosAtuais[10]);
				efeitos.setText(dadosAtuais[11]);
				
			break;
			
			case 1:
				// Preenche os atributos do suplemento.
				opcaoSuplemento();
				
				nome.setText(dadosAtuais[2]);
				fabri.setText(dadosAtuais[3]);
				peso.setText(dadosAtuais[4]);
				preco.setText(dadosAtuais[5]);
				marca.setText(dadosAtuais[6]);
				vali.setText(dadosAtuais[7]);
				modoUso.setText(dadosAtuais[8]);
				quantidade.setText(dadosAtuais[9]);
				dosagem.setText(dadosAtuais[10]);
				indicacao.setText(dadosAtuais[11]);
				principio.setText(dadosAtuais[12]);
				
			break;
			
			case 2:
				// Preenche os atributos do cosmético.
				opcaoCosmetico();
				
				nome.setText(dadosAtuais[2]);
				fabri.setText(dadosAtuais[3]);
				peso.setText(dadosAtuais[4]);
				preco.setText(dadosAtuais[5]);
				marca.setText(dadosAtuais[6]);
				vali.setText(dadosAtuais[7]);
				aplicacao.setText(dadosAtuais[8]);
				funcao.setText(dadosAtuais[9]);
				tipoPele.setText(dadosAtuais[10]);
				
			break;
		}
	}
	/**
	 * Preenche os dados de uma filial nos TextFields com base na posição fornecida.
	 * 
	 * @param pos A posição da filial na lista de dados.
	 */
	public void preencherFilial(int pos) {

		// Preenche os dados de uma filial no TextField.
		dadosAtuais = new ControleFilial(dados).getDadosFilial(pos);
		
		iden.setText(dadosAtuais[0]);
		logra.setText(dadosAtuais[1]);
		cep.setText(dadosAtuais[2]);
		cnpj.setText(dadosAtuais[3]);
		estado.setText(dadosAtuais[4]);
		cidade.setText(dadosAtuais[5]);
		compl.setText(dadosAtuais[6]);
	}

	/**
	 * Guarda todos os dados do produto presentes nos TextFields.
	 */
	public void guardarProduto() {
		// Guardar todos os dados de produto presente nos TextFields.
		dadosNovos = new String[15];
		
		dadosNovos[0] = String.valueOf(categoria.getSelectedIndex()); 			// Categoria.
		dadosNovos[1] = String.valueOf(filial.getSelectedIndex());				// Filial.
		dadosNovos[2] = nome.getText();											// Nome.
		dadosNovos[3] = fabri.getText();										// Fabricante.
		dadosNovos[4] = peso.getText();											// Peso.
		dadosNovos[5] = preco.getText();										// Preço.
		dadosNovos[6] = marca.getText();										// Marca.
		dadosNovos[7] = vali.getText();											// Validade.
		
		// Guardar os dados específicos.
		switch (categoria.getSelectedIndex()) {
			case 0: // Medicamento
				
				dadosNovos[8] = modoUso.getText();								// Modo uso.
				dadosNovos[9] = quantidade.getText();							// Quantidade.
				dadosNovos[10] = dosagem.getText();								// Dosagem.
				dadosNovos[11] = efeitos.getText();								// Efeitos colaterais.
				
			break;
			
			case 1: // Suplemento
				
				dadosNovos[8] = modoUso.getText();								// Modo uso.
				dadosNovos[9] = quantidade.getText();							// Quantidade.
				dadosNovos[10] = dosagem.getText();								// Dosagem.
				dadosNovos[11] = indicacao.getText();							// Indicação.
				dadosNovos[12] = principio.getText();							// Princípio.
				
			break;
			
			case 2: // Cosmético
				
				dadosNovos[8] = aplicacao.getText();							// Aplicação.
				dadosNovos[9] = funcao.getText();								// Função.
				dadosNovos[10] = tipoPele.getText();							// Tipo pele.
				
			break;
			
		}
	}
	/**
	 * Guarda todos os dados da filial presentes nos TextFields.
	 */
	public void guardarFilial() {
		// Guarda todos os dados de filial presente nos TextFields.
		
		dadosNovos = new String[7];
		
		dadosNovos[0] = iden.getText();
		dadosNovos[1] = logra.getText();
		dadosNovos[2] = cep.getText();
		dadosNovos[3] = cnpj.getText();
		dadosNovos[4] = estado.getText();
		dadosNovos[5] = cidade.getText();
		dadosNovos[6] = compl.getText();
		
	}
	
}
