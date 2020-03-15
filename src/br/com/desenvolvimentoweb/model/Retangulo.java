package br.com.desenvolvimentoweb.model;

public class Retangulo extends Poligono implements Diagonal {
	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(this.getBase(), 2) + Math.pow(this.getAltura(), 2));
	}
}
