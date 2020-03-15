package br.com.desenvolvimentoweb.model;

public class Piramide extends Triangulo {
	private double profundidade;
	
	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public Piramide(double base, double profundidade, double altura) {
		super(base, altura);
		this.profundidade = profundidade;
	}
	
	public double volume() {
		return (1/3) * this.getBase() * this.getProfundidade() * this.getAltura();
	}
}
