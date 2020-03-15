package br.com.desenvolvimentoweb.model;

public class Poligono extends Figura {
	private double base;
	private double altura;
	
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}
	
	@Override
	double perimetro() {
		return (base * 2) + (altura * 2);
	}
}
