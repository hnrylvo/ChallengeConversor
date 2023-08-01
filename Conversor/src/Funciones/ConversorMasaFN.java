package Funciones;

import javax.swing.JOptionPane;
import ConversorDeMasa.ConversorMasa;

public class ConversorMasaFN {
	
	ConversorMasa masa =  new ConversorMasa();
	
	Object[] opciones = {"De onza a gramo", "De gramo a onza", "De tonelada a kilogramo",
			"De kilogramo a tonelada", "De kilogramo a libra", "De libra  a kilogramo"};
	
	public void ConvertirMasa(double cantidad) {
		Object seleccion = JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero: ",
				"Conversor de moneda", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion");
		
		if(seleccion == null) {
			JOptionPane.showMessageDialog(null, "Saliendo del programa...");
			return;
		}
		
		String opcionSeleccionada = seleccion.toString();
		switch (opcionSeleccionada) {
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
