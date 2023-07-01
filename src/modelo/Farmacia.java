package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * A classe Farmacia representa uma farmácia, contendo informações como nome,
 * CNPJ e uma lista de filiais. Essa classe fornece métodos para acessar e modificar 
 * essas informações, além de funcionalidades como adicionar e remover filiais, buscar
 * filiais por cidade, obter a lista de produtos cadastrados em todas as filiais, buscar
 * produtos por nome em todas as filiais, preencher a farmácia com dados de exemplo 
 * e uma representação em formato de String que inclui o nome, CNPJ e a quantidade de filiais da farmácia.
 * @author João Vitor e Felipe Amorim
 * @since 2023
 * @version 1.0
 */
public class Farmacia {

	private String nome;
	private String cnpj;
	private ArrayList<Filial> listaFiliais;
	
	/**
     * Construtor da classe Farmacia.
     *
     * @param nome  O nome da farmácia.
     * @param cnpj  O CNPJ da farmácia.
     */
	public Farmacia(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		listaFiliais = new ArrayList<Filial>();
	}
	
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setlistaFiliais(ArrayList<Filial> lista) {
		listaFiliais = lista;
	}
	
	/**
     * Adiciona uma filial à farmácia.
     *
     * @param filial A filial a ser adicionada.
     * @return true se a filial foi adicionada com sucesso, false caso contrário.
     */ 
	public boolean addFilial(Filial filial) {
		return listaFiliais.add(filial);
	}
	/**
     * Remove uma filial da farmácia.
     *
     * @param filial A filial a ser removida.
     * @return true se a filial foi removida com sucesso, false caso contrário.
     */
	public boolean deletarFilial(Filial filial) {
		return listaFiliais.remove(filial);
	}
	/**
     * Busca filiais por cidade.
     *
     * @param cidade A cidade para a qual deseja buscar as filiais.
     * @return Uma lista com todas as filiais da cidade especificada.
     */
	public ArrayList<Filial> buscarFiliais(String cidade) {
		// Retorna uma lista com todas as filiais de uma determinada cidade.
		
		ArrayList<Filial> lista = new ArrayList<Filial>();
		
		// Loope por todas as filiais cadastradas.
		for (Filial filial : listaFiliais) {
			String filialCidade = filial.getEndereco().getCidade();
			
			// Se a cidade coincidir, adicione essa filial a lista.
			if (filialCidade.toLowerCase().contains(cidade.toLowerCase())) {
				lista.add(filial);
			}
		}
		
		return lista;
	}
    /**
     * Retorna uma lista com todos os produtos cadastrados em todas as filiais da farmácia.
     *
     * @return Uma lista com todos os produtos cadastrados em todas as filiais.
     */
	public ArrayList<Produto> produtosCadastrados() {
		// Retorna uma lista com todos os produtos cadastrados em todas as filiais.
		
		ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
		
		// Loope por todas as filiais cadastradas.
		for (Filial filial : listaFiliais) {
			// Adicione todos os produtos dessa filial à lista.
			produtosCadastrados.addAll(filial.getlistaProdutos());
		}
		
		return produtosCadastrados;
	}
    /**
     * Busca produtos por nome em todas as filiais da farmácia.
     *
     * @param nome O nome do produto a ser buscado.
     * @return Uma lista com todos os produtos que possuem o nome especificado.
     */
	public ArrayList<Produto> buscarProdutos(String nome) {
		// Retorna uma lista com todos os produtos com certo nome.
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		for (Filial filial : listaFiliais) {
			for (Produto produto : filial.getlistaProdutos())  {
				if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
					lista.add(produto);
				}
			}
		}
		
		return lista;
	}
	/**
     * Preenche a farmácia com alguns dados de exemplo.
     */
	public void fillWithSomeData() {
		// Preencha com alguns dados.
		
		// Endereços.
		Endereco end01 = new Endereco("Quadra 01, Rua 01","","71555-250","Gama","Distrito Federal");
		Endereco end02 = new Endereco("Quadra 02, Rua 02","","83707-102","Recanto das Emas","Distrito Federal");
		Endereco end03 = new Endereco("Quadra 03, Rua 03","","40391-206","Salvador","Bahia");
		
		// Filiais
		Filial filial01 = new Filial("Gp Central","73.166.297/0001-33",end01);
		Filial filial02 = new Filial("Gp Recanto","81.351.408/0001-00",end02);
		Filial filial03 = new Filial("Gp Salvador","52.438.757/0001-65",end03);
		
		// Datas de validade.
		Date data01 = new Date();
		Date data02 = new Date();
		Date data03 = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data01 = format.parse("20/12/2023");
			data02 = format.parse("25/02/2024");
			data03 = format.parse("31/03/2024");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Produtos.
		Produto prod01 = new Medicamento("Paracetamol","Cimed","Cimed",data01,
										 0.0315,6.99,"3 a 5 comprimidos por dia, ingerir com líquido","20 Comprimidos","750 mg",
										 "Boca seca, náusea, nervosismo, tontura, insônia");
		Produto prod02 = new Cosmetico("Hidratante Corporal","Cetaphil","Galderma",data01,
									   0.5160,88.49,"Corpo e rosto","Hidratante","Qualquer");
		Produto prod03 = new Suplemento("Vitamina C","Cewin","Sanofi Aventis", data01,
										0.0470,27.81,"1 comprimido ao dia, ingerir com líquido","30 comprimidos",
										"500 mg","Aumento das necessidades vitamina C","Ácido Ascorbico");
		
		Produto prod04 = new Medicamento("Soro Fisiológico","Needs","Needs",data02,
										 0.0420,7.79,"Aplicação na pele","500 ml","",
										 "Reação alérgica em pessoas com hipersensibilidade");
		Produto prod05 = new Cosmetico("Sabonete Líquido","Cetaphil","Galderma", data02,
									   0.3460, 98.99,"Pele","Higiene","Peles secas, irritadas e atópicas");
		Produto prod06 = new Suplemento("Suplemento Alimentar Impact","Nestlé","Nestlé",data02,
										0.2410,22.69,"Agitar e ingerir diretamente","200 ml","200 ml",
										"Preparo imunológico pré e pós-operatório","");
		
		Produto prod07 = new Medicamento("Dipirona","Prati","Prati",data03,
										 0.0480,5.05,"1 a 2 comprimidos por dia","10 Comprimidos", "500 mg",
										 "Manchas e inchaço da pele em excesso consumo");
		Produto prod08 = new Cosmetico("Água Termal Facial","Avène","Pierre Fabre", data03,
									   0.3720,120.99,"Rosto","Calmante facial","Peles sensíveis e irritadas");
		Produto prod09 = new Suplemento("Whey Zero Lactose","Piracanjuba","Piracanjuba",data03,
										0.2800,9.49,"Ingestão direta","250 ml","250 ml","Reforçar disposição, sistema imune","");
		
		// Adicione os produtos às filiais.
		filial01.addProduto(prod01);
		filial01.addProduto(prod02);
		filial01.addProduto(prod03);
		filial02.addProduto(prod04);
		filial02.addProduto(prod05);
		filial02.addProduto(prod06);
		filial03.addProduto(prod07);
		filial03.addProduto(prod08);
		filial03.addProduto(prod09);
		
		// Adicione as filiais à farmácia.
		this.addFilial(filial01);
		this.addFilial(filial02);
		this.addFilial(filial03);
	}
	/**
     * @return Uma representação em forma de String da farmacia que contém: 
     * nome, cnpj e quantidade de filiais.
     */
    @Override
	public String toString() {
		return "Nome: " + nome + ", Cnpj: " + cnpj +
			   ", Num de filiais:" + listaFiliais.size();
	}
	
}
