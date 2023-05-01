package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import classes.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		// Instanciando endereços.
		Endereco endereco_1 = new Endereco("Quadra 01 Rua 01","","12345-001",
										   "Cidade 01","DF");
		Endereco endereco_2 = new Endereco("Quadra 02 Rua 02","","12345-002",
										   "Cidade 02","Goiás");
		Endereco endereco_3 = new Endereco("Quadra 03 Rua 03","","12345-003",
										   "Cidade 03","DF");
		
		// Instanciando a farmácia.
		Farmacia farmacia = new Farmacia("Gammapharma", "12345678/1234-03",
										 endereco_1);
		
		// Instanciando as filiais.
		Filial filial_1 = new Filial("df cidade 01","12345678/1234-02", endereco_2);
		Filial filial_2 = new Filial("df cidade 02","12345678/1234-03", endereco_3);
		
		// Instanciando datas.
		SimpleDateFormat data_formato = new SimpleDateFormat("dd/MM/yyyy");
		String dateString_1 = "01/01/2024";
		String dateString_2 = "02/01/2024";
		String dateString_3 = "03/01/2024";
		String dateString_4 = "04/01/2024";
		
		Date val_1 = data_formato.parse(dateString_1);
		Date val_2 = data_formato.parse(dateString_2);
		Date val_3 = data_formato.parse(dateString_3);
		Date val_4 = data_formato.parse(dateString_4);
		
		// Instanciando os produtos.
		Produto produto_1 = new Medicamento("Dipirona","Prati","Prati",val_1,0.0480,4.73,
											"Oral","10 comprimidos","500 mg", "Possível queda de pressão");
		Produto produto_2 = new Medicamento("Paracetamol","Cimed","Cimed",val_2,0.0315,23.60,
											"Oral","20 comprimidos","500 mg", 
											"Possível náusea, vômito e reação alérgica");
		Produto produto_3 = new Suplemento("Vitamina C","Sanofi","Sanofi",val_3,0.0520,12.49,
										   "Oral","10 comprimidos","1 g","Reposição de vitamina C",
										   "Vitamina C");
		Produto produto_4 = new Cosmetico("Protetor Solar","Darrow","Pierre Fabre",val_4,0.0770,72.99,
										  "Pele","Proteção solar", "Qualquer");
		
		
		// Adicionando as filiais à farmácia central.
		farmacia.addFilial(filial_1);
		farmacia.addFilial(filial_2);
		
		// Adicionando os produtos à farmácia e às filiais.
		farmacia.addProduto(produto_1);
		farmacia.addProduto(produto_2);
		filial_1.addProduto(produto_3);
		filial_2.addProduto(produto_4);
		
		// Testando toStrings.
		System.out.println("****** toStrings ******");
		System.out.println(farmacia);
		System.out.println(filial_1);
		System.out.println(filial_2);
		System.out.println(endereco_1);
		System.out.println(endereco_2);
		System.out.println(endereco_3);
		System.out.println(produto_1);
		System.out.println(produto_2);
		System.out.println(produto_3);
		System.out.println(produto_4);
		
		// Testando métodos
		System.out.println("\n****** Métodos *******");
		System.out.println(farmacia.consultarFiliais()+"\n");
		System.out.println(farmacia.consultarProdutos()+"\n");
		System.out.println(filial_1.consultarProdutos()+"\n");
		
		System.out.println("\n****** Todos os produtos cadastrados ******");
		ArrayList<Produto> prodCadastrados = farmacia.produtosCadastrados();
		for(int i = 0; i<prodCadastrados.size(); i++) {
			System.out.println(prodCadastrados.get(i).getNome());
		}
		System.out.println("\n");
		
		farmacia.deletarProduto(produto_1);
		farmacia.deletarFilial(filial_1);
		filial_2.deletarProduto(produto_4);
		
		System.out.println("****** Após deleção ******");
		System.out.println(farmacia.consultarFiliais()+"\n");
		System.out.println(farmacia.consultarProdutos()+"\n");
		System.out.println(filial_2.consultarProdutos()+"\n");
		
		System.out.println("\n****** Todos os produtos cadastrados ******");
		prodCadastrados = farmacia.produtosCadastrados();
		for(int i = 0; i<prodCadastrados.size(); i++) {
			System.out.println(prodCadastrados.get(i).getNome());
		}
		System.out.println("\n");
		
	}
	
}
