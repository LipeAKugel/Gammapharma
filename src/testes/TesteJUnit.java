package testes;

import modelo.*;
import controle.*;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.jupiter.api.Test;

class TesteJUnit {

	@Test
	void testChecarDados() {
		// Testar o método de checagem de dados.
		
		String[] dadosProd = new String[8];
		String[] dadosFilial = new String[8];
		
		// Caso correto.
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		
		assertTrue(new ControleFarmacia().checarDados(dadosProd,1));
		
		// Testando strings vazias.
		dadosProd[2] = "";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "";
		dadosProd[4] = "1.500";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "5.00";
		dadosProd[6] = "";
		dadosProd[7] = "01/01/2024";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		// Testando formato de double errado.
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "a";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "a";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		// Testando data errada.
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "a";
		
		assertFalse(new ControleFarmacia().checarDados(dadosProd,1));
		
		// Caso correto filial.
		dadosFilial[0] = "filialteste";
		dadosFilial[1] = "quadra 01";
		dadosFilial[2] = "123457890";
		dadosFilial[3] = "1324567890123";
		dadosFilial[4] = "Bahia";
		dadosFilial[5] = "Salvador";
		dadosFilial[6] = "";
		
		assertTrue(new ControleFarmacia().checarDados(dadosFilial,2));
		
		// Testando strings vazias.
		
		dadosFilial[0] = "";
		dadosFilial[1] = "quadra 01";
		dadosFilial[2] = "123457890";
		dadosFilial[3] = "1324567890123";
		dadosFilial[4] = "Bahia";
		dadosFilial[5] = "Salvador";
		dadosFilial[6] = "";
		
		assertFalse(new ControleFarmacia().checarDados(dadosFilial,2));
		
		dadosFilial[0] = "filialteste";
		dadosFilial[1] = "";
		dadosFilial[2] = "123457890";
		dadosFilial[3] = "1324567890123";
		dadosFilial[4] = "Bahia";
		dadosFilial[5] = "Salvador";
		dadosFilial[6] = "";
		
		assertFalse(new ControleFarmacia().checarDados(dadosFilial,2));
		
		dadosFilial[0] = "filialteste";
		dadosFilial[1] = "quadra 01";
		dadosFilial[2] = "";
		dadosFilial[3] = "1324567890123";
		dadosFilial[4] = "Bahia";
		dadosFilial[5] = "Salvador";
		dadosFilial[6] = "";
		
		assertFalse(new ControleFarmacia().checarDados(dadosFilial,2));
		
		dadosFilial[0] = "filialteste";
		dadosFilial[1] = "quadra 01";
		dadosFilial[2] = "123457890";
		dadosFilial[3] = "";
		dadosFilial[4] = "Bahia";
		dadosFilial[5] = "Salvador";
		dadosFilial[6] = "";
		
		assertFalse(new ControleFarmacia().checarDados(dadosFilial,2));
		
		dadosFilial[0] = "filialteste";
		dadosFilial[1] = "quadra 01";
		dadosFilial[2] = "123457890";
		dadosFilial[3] = "1324567890123";
		dadosFilial[4] = "";
		dadosFilial[5] = "Salvador";
		dadosFilial[6] = "";
		
		assertFalse(new ControleFarmacia().checarDados(dadosFilial,2));
		
		dadosFilial[0] = "filialteste";
		dadosFilial[1] = "quadra 01";
		dadosFilial[2] = "123457890";
		dadosFilial[3] = "1324567890123";
		dadosFilial[4] = "Bahia";
		dadosFilial[5] = "";
		dadosFilial[6] = "";
		
		assertFalse(new ControleFarmacia().checarDados(dadosFilial,2));
	}
	
	@Test
	void testSalvarProduto() throws NumberFormatException, ParseException {
		// Testar o método de salvar produto.
		ControleFarmacia dados = new ControleFarmacia();
		Produto[] listaProdutos;
		String[] dadosProd = new String[15];
		Produto produto;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		// Testar salvamento de produto novo.
		dadosProd[0] = "1";
		dadosProd[1] = "0";
		dadosProd[2] = "paracetamol";
		dadosProd[3] = "fabricante1";
		dadosProd[4] = "1.500";
		dadosProd[5] = "5.00";
		dadosProd[6] = "marca1";
		dadosProd[7] = "01/01/2024";
		produto = new Medicamento(dadosProd[2], dadosProd[6], dadosProd[3],
					  formato.parse(dadosProd[7]), Double.parseDouble(dadosProd[4]), Double.parseDouble(dadosProd[5]),
					  "","","","");
		
		assertTrue(dados.salvarProduto(dadosProd, 0, 1));
		listaProdutos = dados.getProdutos();
		assertEquals(produto.getNome(), listaProdutos[3].getNome());
		
		// Testar edição de produto.
		assertTrue(dados.salvarProduto(dadosProd, 0, 3));
		listaProdutos = dados.getProdutos();
		assertEquals(produto.getNome(), listaProdutos[0].getNome());
		
		// Testar opção inexistente.
		assertFalse(dados.salvarProduto(dadosProd, 0, 0));
		
	}
	
	@Test
	void testSalvarFilial() {
		// Testar o método de salvar filial.
		ControleFarmacia dados = new ControleFarmacia();
		Filial[] filiais;
		String[] dadosFilial = new String[7];
		Filial filial;
		
		// Testar salvamento de filial nova.
		dadosFilial[0] = "gama01";
		dadosFilial[1] = "quadra a lote 01";
		dadosFilial[2] = "123456798";
		dadosFilial[3] = "1316589-6546";
		dadosFilial[4] = "df";
		dadosFilial[5] = "recanto";
		dadosFilial[6] = "";
		Endereco end = new Endereco(dadosFilial[1], dadosFilial[6], dadosFilial[2], dadosFilial[5], dadosFilial[4]);
		filial = new Filial(dadosFilial[0], dadosFilial[3], end);
		
		assertTrue(dados.salvarFilial(dadosFilial, 0, 2));
		filiais = dados.getFiliais();
		assertEquals(filial.getIdentificador(),filiais[filiais.length-1].getIdentificador());
		
		// Testar edição de filial.
		assertTrue(dados.salvarFilial(dadosFilial, 0, 4));
		filiais = dados.getFiliais();
		assertEquals(filial.getIdentificador(),filiais[filiais.length-1].getIdentificador());
		
		// Testar opção inexistente.
		assertFalse(dados.salvarFilial(dadosFilial, 0, 1));
		
	}
}
