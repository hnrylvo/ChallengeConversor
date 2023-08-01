package Funciones;

import javax.swing.JOptionPane;
import ConversorDeTemperatura.ConversorTemperatura;

public class ConversorTemperaturaFN {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	Object[] opciones = { "Celcius a Fahrenheit", "Celcius a Kelvin", "Fahrenheit a Celcius",
			"Fahrenheit a Kelvin", "Kelvin a Celcius", "Kelvin a Farenheit" };

	public void ConvertirTemperatura(double temp) {
		Object seleccion = JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero: ",
				"Conversor de moneda", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion");
		
		if(seleccion == null) {
			JOptionPane.showMessageDialog(null, "Saliendo del programa...");
			return;
		}
		
		String opcionSeleccionada = seleccion.toString();
		switch (opcionSeleccionada) {
		case "Celcius a Fahrenheit":
			temperatura.ConvertirCelciusAFahrenheit(temp);
			break;
		case "Celcius a Kelvin":
			temperatura.ConvertirCelciusAKelvin(temp);
			break;
		case "Fahrenheit a Celcius":
			temperatura.ConvertirFahrenheitACelcius(temp);
			break;
		case "Fahrenheit a Kelvin":
			temperatura.ConvertirFarenheitAKelvin(temp);
			break;
		case "Kelvin a Celcius":
			temperatura.ConvertirKelvintACelcius(temp);
			break;
		case "Kelvin a Fahrenheit":
			temperatura.ConvertirKelvinAFahrenheit(temp);
			break;

		default:
			break;
		}
	}

}
