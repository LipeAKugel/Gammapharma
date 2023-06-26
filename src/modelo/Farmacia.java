package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * A classe Farmacia representa uma farmácia.
 */
public class Farmacia {

	// Atributos.
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
	
	// Gets
	/**
     * Obtém o nome da farmácia.
     *
     * @return O nome da farmácia.
     */
	public String getNome() {
		return nome;
	}
	/**
     * Obtém o CNPJ da farmácia.
     *
     * @return O CNPJ da farmácia.
     */
	public String getCnpj() {
		return cnpj;
	}
	/**
     * Obtém a lista de filiais da farmácia.
     *
     * @return A lista de filiais da farmácia.
     */
	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	
	// Sets
	/**
     * Define o nome da farmácia.
     *
     * @param nome O nome da farmácia.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
     * Define o CNPJ da farmácia.
     *
     * @param cnpj O CNPJ da farmácia.
     */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
     * Define a lista de filiais da farmácia.
     *
     * @param lista A lista de filiais da farmácia.
     */
	public void setlistaFiliais(ArrayList<Filial> lista) {
		listaFiliais = lista;
	}
	
	// Métodos.
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
		
		Endereco end01 = new Endereco("quadra 01","","123456","recanto","df");
		
		Filial filial01 = new Filial("Gammapharma Recanto","12345678",end01);
		
		Date data01 = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data01 = format.parse("20/12/2022");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Produto prod01 = new Medicamento("Paracetamol","","",data01,
										 1.0,5.0,"","","","");
		Produto prod02 = new Medicamento("Dipirona","","",data01,
				 1.0,5.0,"","","","");
		Produto prod03 = new Medicamento("Soro Fisiológico","","",data01,
				 1.0,5.0,"","","","");
		
		filial01.addProduto(prod01);
		filial01.addProduto(prod02);
		filial01.addProduto(prod03);
		
		this.addFilial(filial01);
	}
	/**
     * Retorna uma representação em formato de String da farmácia.
     *
     * @return Uma String contendo o nome, o CNPJ e o número de filiais da farmácia.
     */
    @Override
	// toString.
	public String toString() {
		return "Nome: " + nome + ", Cnpj: " + cnpj +
			   ", Num de filiais:" + listaFiliais.size();
	}
	
}
