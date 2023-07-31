package Funciones;

import javax.swing.JOptionPane;
import ConversorDeMasa.ConversorMasa;

public class ConversorMasaFN {
	
	ConversorMasa masa =  new ConversorMasa();
	
	Object[] opciones = {"De onza a gramo", "De gramo a onza", "De tonelada a kilogramo",
			"De kilogramo a tonelada", "De kilogramo a libra", "De libra  a kilogramo"};
	
	public void ConvertirMasa(double cantidad) {
		String seleccion = JOptionPane.showInputDialog(null, "Elija la conversión de masa: ",
				"Conversor de masa", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion").toString();
		
		switch (seleccion) {
		case "De onza a gramo":
			masa.ConvertirOnzaAGramo(cantidad);
			break;
		case "De gramo a onza":
			masa.ConvertirGramoAOnza(cantidad);
			break;
		case "De tonelada a kilogramo":
			masa.ConvertirToneladaAKilogramo(cantidad);
			break;
		case "De kilogramo a tonelada":
			masa.ConvertirKilogramoATonelada(cantidad);
			break;
		case "De kilogramo a libra":
			masa.ConvertirKilogramoALibras(cantidad);
			break;
		case "De libra  a kilogramo":
			masa.ConvertirLibraAKilogramo(cantidad);
			break;

		default:
			break;
		}
	}
	
}
