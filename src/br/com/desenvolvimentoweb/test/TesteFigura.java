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
		
		// ---------- C�RCULO ----------
		
		double inputDiametro = Double.parseDouble(JOptionPane.showInputDialog("Digite o di�metro do circulo para calcular a �rea"));
		
		Circulo circulo = new Circulo(inputDiametro);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es do C�rculo\n\n" +
			//"Di�metro: " + circulo.getDiametro() + 
			//"\nRaio: " + circulo.getRaio() +
			"\n�rea: " + df.format(circulo.area()) +
			"\nPer�metro: " + df.format(circulo.perimetro())
		);
		
		// ---------- QUADRADO ----------
		
		double inputBaseQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do quadrado"));
		double inputAlturaQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do quadrado"));
		
		Quadrado quadrado = new Quadrado(inputBaseQuadrado, inputAlturaQuadrado);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es do Quadrado\n\n" +
			//"Base: " + quadrado.getBase() +
			//"\nAltura: " + quadrado.getAltura() +
			"\n�rea: " + df.format(quadrado.area()) +
			"\nPer�metro: " + df.format(quadrado.perimetro()) +
			"\nDiagonal: " + df.format(quadrado.calculaDiagonal())
		);
		
		// ---------- RET�NGULO ----------
		
		double inputBaseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do ret�ngulo"));
		double inputAlturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do ret�ngulo"));
		
		Retangulo retangulo = new Retangulo(inputBaseRetangulo, inputAlturaRetangulo);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es do Ret�ngulo\n\n" +
			//"Base: " + retangulo.getBase() +
			//"\nAltura: " + retangulo.getAltura() +
			"\n�rea: " + df.format(retangulo.area()) +
			"\nPer�metro: " + df.format(retangulo.perimetro()) +
			"\nDiagonal: " + df.format(retangulo.calculaDiagonal())
		);
		
		// ---------- TRI�NGULO ----------
		
		double inputBaseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do tri�ngulo"));
		double inputAlturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do tri�ngulo"));
		
		Triangulo triangulo = new Triangulo(inputBaseTriangulo, inputAlturaTriangulo);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es do Tri�ngulo\n\n" +
			//"Base: " + triangulo.getBase() +
			//"\nAltura: " + triangulo.getAltura() +
			"\n�rea: " + df.format(triangulo.area()) +
			"\nPer�metro: " + df.format(triangulo.perimetro())
		);
		
		// ---------- LOSANGO ----------
		
		double inputBaseLosango = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do losango"));
		double inputAlturaLosango = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do losango"));
		
		Losango losango = new Losango(inputBaseLosango, inputAlturaLosango);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es do Losango\n\n" +
			//"Base: " + losango.getBase() +
			//"\nAltura: " + losango.getAltura() +
			"\n�rea: " + df.format(losango.area()) +
			"\nPer�metro: " + df.format(losango.perimetro())
		);
		
		// ---------- CILINDRO ----------
		
		double inputBaseDiametroCilindro = Double.parseDouble(JOptionPane.showInputDialog("Digite o di�metro do cilindro"));
		double inputAlturaCilindro = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cilindro"));
		
		Cilindro cilindro = new Cilindro(inputBaseDiametroCilindro, inputAlturaCilindro);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es do Cilindro\n\n" +
			//"Base: " + cilindro.getBase() +
			//"\nAltura: " + cilindro.getAltura() +
			"\n�rea: " + df.format(cilindro.area()) +
			"\nPer�metro: " + df.format(cilindro.perimetro()) +
			"\nVolume: " + df.format(cilindro.volume())
		);
		
		// ---------- CUBO ----------
		
		double inputBaseCubo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do cubo"));
		double inputAlturaCubo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cubo"));
		double inputProfundidadeCubo = Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade do cubo"));
		
		Cubo cubo = new Cubo(inputBaseCubo, inputAlturaCubo, inputProfundidadeCubo);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es do Cubo\n\n" +
			//"Base: " + cubo.getBase() +
			//"\nAltura: " + cubo.getAltura() +
			"\n�rea: " + df.format(cubo.area()) +
			"\nPer�metro: " + df.format(cubo.perimetro()) +
			"\nDiagonal: " + df.format(cubo.calculaDiagonal()) +
			"\nVolume: " + df.format(cubo.volume())
		);
		
		// ---------- ESF�RA ----------
		
		double inputBaseDiametroEsfera = Double.parseDouble(JOptionPane.showInputDialog("Digite o di�metro da esf�ra"));
		
		Esfera esfera = new Esfera(inputBaseDiametroEsfera);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es da Esf�ra\n\n" +
			//"Base: " + esfera.getBase() +
			//"\nAltura: " + esfera.getAltura() +
			"\n�rea: " + df.format(esfera.area()) +
			"\nPer�metro: " + df.format(esfera.perimetro()) +
			"\nVolume: " + df.format(esfera.volume())
		);
		
		// ---------- PIR�MIDE ----------
		
		double inputBasePiramide = Double.parseDouble(JOptionPane.showInputDialog("Digite a base da pir�mide"));
		double inputAlturaPiramide = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pir�mide"));
		double inputProfundidadePiramide = Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade da pir�mide"));
		
		Piramide piramide = new Piramide(inputBasePiramide, inputAlturaPiramide, inputProfundidadePiramide);
		
		JOptionPane.showMessageDialog(
			frame,
			"Informa��es da Pir�mide\n\n" +
			//"Base: " + piramide.getBase() +
			//"\nAltura: " + piramide.getAltura() +
			"\n�rea: " + df.format(piramide.area()) +
			"\nPer�metro: " + df.format(piramide.perimetro()) +
			"\nVolume: " + df.format(piramide.volume())
		);
	}
}
