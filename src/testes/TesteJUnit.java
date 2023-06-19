package testes;

import controle.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TesteJUnit {

	@Test
	void testChecarDados() {
		
		
		String[] dadosProd = new String[15];
		
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
	}
	
	@Test
	void testSalvarProduto() {
		
	}
	
	void testSalvarFilial() {
		
	}
}
