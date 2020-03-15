package br.com.desenvolvimentoweb.model;

public class Quadrado extends Poligono implements Diagonal {
	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return Math.pow(getBase(), 2);
	}
	
	@Override
	public double calculaDiagonal() {
		return Math.sqrt(this.area()) * Math.sqrt(2);
	}
}
