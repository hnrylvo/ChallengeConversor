package Funciones;

import javax.swing.JOptionPane;
import ConversorDeDolares.*;

public class ConvertirDolaresFN {

	ConvertirDolares ConvDolares = new ConvertirDolares();
	ConvertirADolares ConvADolares = new ConvertirADolares();

	Object[] opciones = { "De Dólar a Colón salvadoreño", "De Dólar a Peso argentino", "De Dólar a Euro",
			"De Dólar a Libra esterlina", "De Dólar a Yen japonés", "De Dólar a Won surcoreano",
			"De Colón salvadoreño a Dólar", "De Peso argentino a Dólar", "De Euro a Dólar",
			"De Libra esterlina a Dólar", "De Yen japonés a Dólar", "De Won surcoreano a Dólar" };

	public void ConvertirMoneda(double dinero) {
		Object seleccion = JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero: ",
				"Conversor de moneda", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion");
		
		if(seleccion == null) {
			JOptionPane.showMessageDialog(null, "Saliendo del programa...");
			return;
		}
		
		String opcionSeleccionada = seleccion.toString();
		switch (opcionSeleccionada) {
		case "De Dólar a Colón salvadoreño":
			ConvDolares.ConvertirDolareAColonesSVC(dinero);
			break;
		case "De Dólar a Peso argentino":
			ConvDolares.ConvertirDolareAPesosAR(dinero);
			break;
		case "De Dólar a Euro":
			ConvDolares.ConvertirDolareAEuro(dinero);
			break;
		case "De Dólar a Libra esterlina":
			ConvDolares.ConvertirDolareALibras(dinero);
			break;
		case "De Dólar a Yen japonés":
			ConvDolares.ConvertirDolareAYen(dinero);
			break;
		case "De Dólar a Won surcoreano":
			ConvDolares.ConvertirDolareAWon(dinero);
			break;
		case "De Colón salvadoreño a Dólar":
			ConvADolares.ConvertirColonesSVCADolares(dinero);
			break;
		case "De Peso argentino a Dólar":
			ConvADolares.ConvertirPesosARSADolares(dinero);
			break;
		case "De Euro a Dólar":
			ConvADolares.ConvertirEuroADolar(dinero);
			break;
		case "De Libra esterlina a Dólar":
			ConvADolares.ConvertirLibrasADolar(dinero);
			break;
		case "De Yen japonés a Dólar":
			ConvADolares.ConvertirYenADolar(dinero);
			break;
		case "De Won surcoreano a Dólar":
			ConvADolares.ConvertirWonADolar(dinero);
			break;
		default:
			break;
		}
	}
}
