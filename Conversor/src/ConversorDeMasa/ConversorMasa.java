package ConversorDeMasa;
import javax.swing.JOptionPane;

public class ConversorMasa {
	
	public void ConvertirOnzaAGramo(double valor) {
		double gramos = valor*28.35;
		gramos = (double) Math.round(gramos *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " onzas es igual a " + gramos + " gramos.");
	}
	
	public void ConvertirGramoAOnza(double valor) {
		double onzas = valor/28.35;
		onzas = (double) Math.round(onzas *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " gramos es igual a " + onzas + " onzas.");
	}
	
	public void ConvertirToneladaAKilogramo(double valor) {
		double kg = valor*1000;
		kg = (double) Math.round(kg *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " toneladas es igual a " + kg + " kilogramos.");
	}
	
	public void ConvertirKilogramoATonelada(double valor) {
		double toneladas = valor/1000;
		toneladas = (double) Math.round(toneladas *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " kilogramos es igual a " + toneladas + " toneladas.");
	}
	
	public void ConvertirKilogramoALibras(double valor) {
		double libras = valor*2.205;
		libras = (double) Math.round(libras *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " kilogramos es igual a " + libras + " libras.");
	}
	
	public void ConvertirLibraAKilogramo(double valor) {
		double kg = valor/2.205;
		kg = (double) Math.round(kg *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " libras es igual a " + kg + " kilogramos.");
	}
}
