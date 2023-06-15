package controle;

import java.text.SimpleDateFormat;

import modelo.*;

public class ControleProduto {
	
	private Produto[] produtos;
	private ControleFarmacia dados;
	
	public ControleProduto(ControleFarmacia dados) {
		this.dados = dados;
		produtos = dados.getProdutos();
	}
	
	public String[] getNomeProdutos() {
		// Retorna uma lista com todos os nomes dos produtos. 
		String[] nomes = new String[produtos.length];
		
		int i = 0;
		for (Produto produto : produtos) {
			nomes[i] = produto.getNome();
			i++;
		}
		
		return nomes;
	}

	public String[] getNomeFiltrado(String nome) {
		// Retorna uma lista de todos os nomes dos produtos filtrados.
		Produto[] lista = dados.buscaProdutos(nome);
		String[] nomes = new String[lista.length];
		
		int i = 0;
		for (Produto produto : lista) {
			nomes[i] = produto.getNome();
			i++;
		}
		
		return nomes;
	}
	
	public String[] getDadosProduto(int pos) {
		// Retorna os dados de um produto de uma certa posição.
		
		Produto prod = produtos[pos];
		String[] prodDados = new String[15]; // Os dados são guardados aqui.
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		// Veja que tipo de produto é, e preencha os dados correspondentes.
		if (prod instanceof Medicamento) {
			// Preencha os dados do medicamento.
			Medicamento med = (Medicamento) prod;
			
			prodDados[0] = "0"; 								// Categoria.
			prodDados[1] = String.valueOf(new ControleFilial(dados).acharFilial(prod)); // Filial.
			prodDados[2] = med.getNome(); 						// Nome.
			prodDados[3] = med.getFabricante(); 				// Fabricante.
			prodDados[4] = String.valueOf(med.getPeso()); 		// Peso.
			prodDados[5] = String.valueOf(med.getPreco()); 		// Preço.
			prodDados[6] = med.getMarca(); 						// Marca.
			prodDados[7] = formato.format(med.getValidade()); 	// Validade.
			prodDados[8] = med.getModoUso(); 					// Modo Uso.
			prodDados[9] = med.getQuantidade(); 				// Quantidade.
			prodDados[10] = med.getDosagem(); 					// Dosagem.
			prodDados[11] = med.getEfeitosColaterais(); 		// Efeitos.
			
		} else if (prod instanceof Suplemento) {
			// Preencha os dados do suplemento.
			Suplemento sup = (Suplemento) prod;
			
			prodDados[0] = "1"; 								// Categoria.
			prodDados[1] = String.valueOf(new ControleFilial(dados).acharFilial(prod)); // Filial.
			prodDados[2] = sup.getNome(); 						// Nome.
			prodDados[3] = sup.getFabricante(); 				// Fabricante.
			prodDados[4] = String.valueOf(sup.getPeso()); 		// Peso.
			prodDados[5] = String.valueOf(sup.getPreco()); 	// Preço.
			prodDados[6] = sup.getMarca(); 					// Marca.
			prodDados[7] = formato.format(sup.getValidade()); 	// Validade.
			prodDados[8] = sup.getModoUso(); 					// Modo Uso.
			prodDados[9] = sup.getQuantidade(); 				// Quantidade.
			prodDados[10] = sup.getDosagem(); 					// Dosagem.
			prodDados[11] = sup.getIndicacao(); 				// Indicação.
			prodDados[12] = sup.getPrincipioAtivo(); 			// Princípio ativo.
			
		} else if (prod instanceof Cosmetico) {
			// Preencha os dados do cosmético.
			Cosmetico cosm = (Cosmetico) prod;
			
			prodDados[0] = "1"; 								// Categoria.
			prodDados[1] = String.valueOf(new ControleFilial(dados).acharFilial(prod)); // Filial.
			prodDados[2] = cosm.getNome(); 					// Nome.
			prodDados[3] = cosm.getFabricante(); 				// Fabricante.
			prodDados[4] = String.valueOf(cosm.getPeso()); 	// Peso.
			prodDados[5] = String.valueOf(cosm.getPreco()); 	// Preço.
			prodDados[6] = cosm.getMarca(); 					// Marca.
			prodDados[7] = formato.format(cosm.getValidade()); // Validade.
			prodDados[8] = cosm.getAplicacao();				// Aplicação.
			prodDados[9] = cosm.getFuncao();					// Função.
			prodDados[10] = cosm.getTipoPele();				// Tipo de pele.
			
		}
		
		// Retorna os dados obtidos.
		return prodDados;
	}
	
}
