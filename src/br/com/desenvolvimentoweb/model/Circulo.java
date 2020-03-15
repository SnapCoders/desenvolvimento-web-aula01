package br.com.desenvolvimentoweb.model;

public class Circulo extends Figura {
	private double diametro;
	private double raio;
	
	public Circulo(double diametro) {
		this.diametro = diametro;
		this.raio = diametro / 2;
	}
	
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
        return Math.PI * (this.raio * this.raio);
	}
}
