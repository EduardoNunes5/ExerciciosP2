package entidades;

import interfaces.Categoria;

public class Vip implements Categoria {
	
	private int pontos;
	
	public Vip() {
		
	}
	
	@Override
	public int getPontos() {
		return this.pontos;
	}
	
	@Override
	public void acumulaPontos() {
		this.pontos +=10;		
	}

	@Override
	public double aplicaDesconto(double gasto) {
		return gasto - 0.1*gasto;
	}

}
