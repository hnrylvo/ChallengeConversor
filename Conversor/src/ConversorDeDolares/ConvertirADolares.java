package ConversorDeDolares;

import 	javax.swing.JOptionPane;

public class ConvertirADolares {
	
	public void ConvertirColonesSVCADolares(double monto) {
		double svc = monto/8.75;
		svc = (double) Math.round(svc *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " SVC es igual a " + svc + " USD.");
	}
	
	public void ConvertirPesosARSADolares(double monto) {
		double ars = monto/269.24;
		ars = (double) Math.round(ars *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " ARS es igual a " + ars + " USD.");
	}
	
	public void ConvertirEuroADolar(double monto) {
		double eur = monto/0.90;
		eur = (double) Math.round(eur *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " EUR es igual a " + eur + " USD.");
	}
	
	public void ConvertirLibrasADolar(double monto) {
		double libra = monto/0.78;
		libra = (double) Math.round(libra *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " GBP es igual a " + libra + " USD.");
	}
	
	public void ConvertirYenADolar(double monto) {
		double yen = monto/141.78;
		yen = (double) Math.round(yen *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " JPY es igual a " + yen + " USD.");
	}
	
	public void ConvertirWonADolar(double monto) {
		double won = monto/1286.65;
		won = (double) Math.round(won *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " KRW es igual a " + won + " USD.");
	}
}
