package br.com.desenvolvimentoweb.model;

public class Cilindro extends Circulo {
	private double altura;
	
	public Cilindro(double diametro, double altura) {
		super(diametro);
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double volume() {
		return Math.PI * Math.pow(this.getRaio(), 3) * this.altura;
	}
}
