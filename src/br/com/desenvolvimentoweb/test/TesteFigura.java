package br.com.desenvolvimentoweb.test;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.desenvolvimentoweb.model.Cilindro;
import br.com.desenvolvimentoweb.model.Circulo;
import br.com.desenvolvimentoweb.model.Cubo;
import br.com.desenvolvimentoweb.model.Esfera;
import br.com.desenvolvimentoweb.model.Losango;
import br.com.desenvolvimentoweb.model.Piramide;
import br.com.desenvolvimentoweb.model.Quadrado;
import br.com.desenvolvimentoweb.model.Retangulo;
import br.com.desenvolvimentoweb.model.Triangulo;

public class TesteFigura {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		// ---------- CÍRCULO ----------
		
		double inputDiametro = Double.parseDouble(JOptionPane.showInputDialog("Digite o diâmetro do circulo para calcular a área"));
		
		Circulo circulo = new Circulo(inputDiametro);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações do Círculo\n\n" +
			//"Diâmetro: " + circulo.getDiametro() + 
			//"\nRaio: " + circulo.getRaio() +
			"\nÁrea: " + df.format(circulo.area()) +
			"\nPerímetro: " + df.format(circulo.perimetro())
		);
		
		// ---------- QUADRADO ----------
		
		double inputBaseQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do quadrado"));
		double inputAlturaQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do quadrado"));
		
		Quadrado quadrado = new Quadrado(inputBaseQuadrado, inputAlturaQuadrado);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações do Quadrado\n\n" +
			//"Base: " + quadrado.getBase() +
			//"\nAltura: " + quadrado.getAltura() +
			"\nÁrea: " + df.format(quadrado.area()) +
			"\nPerímetro: " + df.format(quadrado.perimetro()) +
			"\nDiagonal: " + df.format(quadrado.calculaDiagonal())
		);
		
		// ---------- RETÂNGULO ----------
		
		double inputBaseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo"));
		double inputAlturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo"));
		
		Retangulo retangulo = new Retangulo(inputBaseRetangulo, inputAlturaRetangulo);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações do Retângulo\n\n" +
			//"Base: " + retangulo.getBase() +
			//"\nAltura: " + retangulo.getAltura() +
			"\nÁrea: " + df.format(retangulo.area()) +
			"\nPerímetro: " + df.format(retangulo.perimetro()) +
			"\nDiagonal: " + df.format(retangulo.calculaDiagonal())
		);
		
		// ---------- TRIÂNGULO ----------
		
		double inputBaseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo"));
		double inputAlturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
		
		Triangulo triangulo = new Triangulo(inputBaseTriangulo, inputAlturaTriangulo);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações do Triângulo\n\n" +
			//"Base: " + triangulo.getBase() +
			//"\nAltura: " + triangulo.getAltura() +
			"\nÁrea: " + df.format(triangulo.area()) +
			"\nPerímetro: " + df.format(triangulo.perimetro())
		);
		
		// ---------- LOSANGO ----------
		
		double inputBaseLosango = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do losango"));
		double inputAlturaLosango = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do losango"));
		
		Losango losango = new Losango(inputBaseLosango, inputAlturaLosango);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações do Losango\n\n" +
			//"Base: " + losango.getBase() +
			//"\nAltura: " + losango.getAltura() +
			"\nÁrea: " + df.format(losango.area()) +
			"\nPerímetro: " + df.format(losango.perimetro())
		);
		
		// ---------- CILINDRO ----------
		
		double inputBaseDiametroCilindro = Double.parseDouble(JOptionPane.showInputDialog("Digite o diâmetro do cilindro"));
		double inputAlturaCilindro = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cilindro"));
		
		Cilindro cilindro = new Cilindro(inputBaseDiametroCilindro, inputAlturaCilindro);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações do Cilindro\n\n" +
			//"Base: " + cilindro.getBase() +
			//"\nAltura: " + cilindro.getAltura() +
			"\nÁrea: " + df.format(cilindro.area()) +
			"\nPerímetro: " + df.format(cilindro.perimetro()) +
			"\nVolume: " + df.format(cilindro.volume())
		);
		
		// ---------- CUBO ----------
		
		double inputBaseCubo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do cubo"));
		double inputAlturaCubo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cubo"));
		double inputProfundidadeCubo = Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade do cubo"));
		
		Cubo cubo = new Cubo(inputBaseCubo, inputAlturaCubo, inputProfundidadeCubo);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações do Cubo\n\n" +
			//"Base: " + cubo.getBase() +
			//"\nAltura: " + cubo.getAltura() +
			"\nÁrea: " + df.format(cubo.area()) +
			"\nPerímetro: " + df.format(cubo.perimetro()) +
			"\nDiagonal: " + df.format(cubo.calculaDiagonal()) +
			"\nVolume: " + df.format(cubo.volume())
		);
		
		// ---------- ESFÉRA ----------
		
		double inputBaseDiametroEsfera = Double.parseDouble(JOptionPane.showInputDialog("Digite o diâmetro da esféra"));
		
		Esfera esfera = new Esfera(inputBaseDiametroEsfera);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações da Esféra\n\n" +
			//"Base: " + esfera.getBase() +
			//"\nAltura: " + esfera.getAltura() +
			"\nÁrea: " + df.format(esfera.area()) +
			"\nPerímetro: " + df.format(esfera.perimetro()) +
			"\nVolume: " + df.format(esfera.volume())
		);
		
		// ---------- PIRÂMIDE ----------
		
		double inputBasePiramide = Double.parseDouble(JOptionPane.showInputDialog("Digite a base da pirâmide"));
		double inputAlturaPiramide = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pirâmide"));
		double inputProfundidadePiramide = Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade da pirâmide"));
		
		Piramide piramide = new Piramide(inputBasePiramide, inputAlturaPiramide, inputProfundidadePiramide);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informações da Pirâmide\n\n" +
			//"Base: " + piramide.getBase() +
			//"\nAltura: " + piramide.getAltura() +
			"\nÁrea: " + df.format(piramide.area()) +
			"\nPerímetro: " + df.format(piramide.perimetro()) +
			"\nVolume: " + df.format(piramide.volume())
		);
	}
}
