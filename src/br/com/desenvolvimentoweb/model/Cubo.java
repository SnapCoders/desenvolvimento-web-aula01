package br.com.desenvolvimentoweb.model;

public class Cubo extends Quadrado {
	private double profundidade;

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public Cubo(double base, double altura, double profundidade) {
		super(base, altura);
		this.profundidade = profundidade;
	}
	
	public double volume() {
		return this.getBase() * this.getProfundidade() * this.getAltura();
	}
}
