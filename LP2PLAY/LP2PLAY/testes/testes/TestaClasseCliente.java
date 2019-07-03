package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entidades.Cliente;

class TestaClasseCliente {

	@Test
	void testaCompraVip() {
		Cliente c = new Cliente("VIP", 1000);
		c.comprar(500); // 500 - 500*0.1 =  450
		assertEquals(550, c.getDinheiro());
	}
	
	@Test
	void testaCompraComum() {
		Cliente c1 = new Cliente("COMUM", 1000);
		c1.comprar(500); // 500 - 500*0.05 =  475
		assertEquals(525, c1.getDinheiro());
	}
	
	@Test
	void testaSeMantevePontuacaoVip() {
		Cliente c = new Cliente("VIP", 1000);
		c.comprar(150);
		c.comprar(100);
		c.setCategoria("COMUM");
		c.comprar(100);
		c.setCategoria("VIP");
		c.comprar(20);
		assertEquals(30,c.getPontos());
	}
	
	@Test
	void TestaSeMantevePontuacaoComum(){
		Cliente c = new Cliente("COMUM", 1000);
		c.comprar(150);
		c.comprar(100);
		c.setCategoria("VIP");
		c.comprar(100);
		c.setCategoria("COMUM");
		c.comprar(20);
		assertEquals(15,c.getPontos());
	
	}
	


}
