package br.com.desenvolvimentoweb.model;

public class Quadrado extends Poligono {
	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return Math.pow(getBase(), 2);
	}
}
