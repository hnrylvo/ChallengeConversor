package Funciones;

import javax.swing.JOptionPane;
import ConversorDeTemperatura.ConversorTemperatura;

public class ConversorTemperaturaFN {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	Object[] opciones = { "Celcius a Fahrenheit", "Celcius a Kelvin", "Fahrenheit a Celcius",
			"Fahrenheit a Kelvin", "Kelvin a Celcius", "Kelvin a Farenheit" };

	public void ConvertirTemperatura(double temp) {
		String seleccion = JOptionPane.showInputDialog(null, "Elija la conversión de temperatura: ",
				"Conversor de temperatura", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion").toString();
		
		switch (seleccion) {
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
