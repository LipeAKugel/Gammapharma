package main;

import classes.*;

public class Main {
	
	public static void main(String[] args) {
		
		// Instânciando as classes.
		SistemaFarmacia sistema = new SistemaFarmacia();
		
		Produto produto1 = new Produto("Dipirona", "Medicamento", "Prati", 5.66);
		Produto produto2 = new Produto("Paracetamol", "Medicamento", "União Química", 21.18);
		
		Endereco endereco1 = new Endereco("Quadra 01, Avenida Monjolo, Rua 06, Lote 02",
										  "a", "72542-406", "Brasília", "DF");
		Endereco endereco2 = new Endereco("Quadra 11, Avenida Águas, Rua do Sol, Lote 25",
										  "b", "72329-024", "Fortaleza", "Ceará");
		
		Filial filial01 = new Filial("Tecquimica","123456789",endereco1);
		Filial filial02 = new Filial("Drogalil","234567890",endereco2);
		
		// Adicionando os produtos ao sistema. 
		sistema.addProduto(produto1);
		sistema.addProduto(produto2);
		
		// Adicionando as filiais ao sistema.
		sistema.addFilial(filial01);
		sistema.addFilial(filial02);
		
		System.out.println("Produtos - ");
		System.out.println(produto1);
		System.out.println(produto2 + "\n");
		
		System.out.println("Endereços - ");
		System.out.println(endereco1);
		System.out.println(endereco2 + "\n");
		
		System.out.println("Filiais - ");
		System.out.println(filial01);
		System.out.println(filial02 + "\n");
		
		System.out.println("Sistema - ");
		System.out.println(sistema.consultarProdutos() + "\n");
		System.out.println(sistema.consultarFiliais());
		
		// Removendo uma filial e um produto.
		sistema.deletarFilial(filial01);
		sistema.deletarProduto(produto2);
		
		System.out.println("\nSistema - ");
		System.out.println(sistema.consultarProdutos() + "\n");
		System.out.println(sistema.consultarFiliais());
	}
	
}
