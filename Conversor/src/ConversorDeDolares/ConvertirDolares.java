package ConversorDeDolares;
import javax.swing.JOptionPane;

public class ConvertirDolares {
	
	public void ConvertirDolareAColonesSVC(double monto) {
		double svc = monto*8.75;
		svc = (double) Math.round(svc *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " USD es igual a " + svc + " SVC.");
	}
	
	public void ConvertirDolareAPesosAR(double monto) {
		double ars = monto*269.24;
		ars = (double) Math.round(ars *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " USD es igual a " + ars + " ARS.");
	}
	
	public void ConvertirDolareAEuro(double monto) {
		double eur = monto*0.90;
		eur = (double) Math.round(eur *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " USD es igual a " + eur + " EUR.");
	}
	
	public void ConvertirDolareALibras(double monto) {
		double libra = monto*0.78;
		libra = (double) Math.round(libra *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " USD es igual a " + libra + " GBP.");
	}
	
	public void ConvertirDolareAYen(double monto) {
		double yen = monto*141.78;
		yen = (double) Math.round(yen *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " USD es igual a " + yen + " JPY.");
	}
	
	public void ConvertirDolareAWon(double monto) {
		double won = monto*1286.65;
		won = (double) Math.round(won *100d)/100;
		JOptionPane.showMessageDialog(null, monto + " USD es igual a " + won + " KRW.");
	}
}
