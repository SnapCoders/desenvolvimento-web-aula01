package br.com.desenvolvimentoweb.model;

public class Esfera extends Circulo {
	public Esfera(double diametro) {
		super(diametro);
	}
	
	public double volume() {
		return (4/3) * Math.PI * Math.pow(this.getRaio(), 3);
	}
}
