package br.com.desenvolvimentoweb.model;

public class Losango extends Poligono {
	public Losango(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (this.getAltura() * this.getBase()) / 2;
	}
}
