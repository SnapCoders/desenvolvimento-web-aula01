package br.com.desenvolvimentoweb.model;

public class Triangulo extends Poligono {
	private double hipoternusa;
	
	public Triangulo(double base, double altura) {
		super(base, altura);
		this.hipoternusa = Math.sqrt((this.getBase() * this.getBase()) + (this.getAltura() * this.getAltura()));
	}

	public double getHipoternusa() {
		return hipoternusa;
	}

	public void setHipoternusa(double hipoternusa) {
		this.hipoternusa = hipoternusa;
	}
	
	@Override
	public double area() {
		return (this.getBase() * this.getAltura()) / 2;
	}
}
