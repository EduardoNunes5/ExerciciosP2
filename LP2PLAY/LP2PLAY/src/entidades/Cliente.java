package entidades;

import interfaces.Categoria;

public class Cliente {
	private Categoria categoriaAtual;
	private Vip vip;
	private Comum comum;
	private double dinheiro;
	
	public Cliente(String categoria, double dinheiro) {
		this.comum = new Comum();
		this.vip = new Vip();
		setCategoria(categoria);
		this.dinheiro = dinheiro;
	}
	
	public void comprar(double gasto) {
		double aPagar = this.categoriaAtual.aplicaDesconto(gasto);
		this.categoriaAtual.acumulaPontos();
		this.dinheiro -= aPagar;
	}
	
	//Para ver se o calculo de pagamento foi correto no teste de unidade
	public double getDinheiro() {
		return this.dinheiro;
	}
	
	public int  getPontos() {
		return this.categoriaAtual.getPontos();
	}
	
	public void setCategoria(String categoria) {
		if("VIP".equals(categoria))
			this.categoriaAtual = this.vip;
		if("COMUM".equals(categoria))
			this.categoriaAtual = this.comum;
	}
}
