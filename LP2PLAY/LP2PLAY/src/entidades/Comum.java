package entidades;

import interfaces.Categoria;

public class Comum implements Categoria{

	private int pontos;
	
	
	public Comum() {
		
	}
	
	@Override
	public int getPontos() {
		return this.pontos;
	}
	@Override
	public void acumulaPontos() {
		this.pontos +=5;
	}
	
	@Override
	public double aplicaDesconto(double gasto) {
		return gasto - 0.05*gasto;

	}
}
