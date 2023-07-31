package ConversorDeTemperatura;
import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void ConvertirCelciusAFahrenheit(double valor) {
		double fahrenheit = valor*1.8+32;
		fahrenheit = (double) Math.round(fahrenheit *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°C es igual a " + fahrenheit + "°F.");
	}
	
	public void ConvertirFahrenheitACelcius(double valor) {
		double celcius = (valor-32)/1.8;
		celcius = (double) Math.round(celcius *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°F es igual a " + celcius + "°C.");
	}
	
	public void ConvertirKelvintACelcius(double valor) {
		double celcius = valor - 273.15;
		celcius = (double) Math.round(celcius *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "K es igual a " + celcius + "°C.");
	}
	
	public void ConvertirCelciusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°C es igual a " + kelvin + "K.");
	}
	
	public void ConvertirFarenheitAKelvin(double valor) {
		double kelvin = 5/9*(valor-32)+273.15;
		kelvin = (double) Math.round(kelvin *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°F es igual a " + kelvin + "K.");
	}
	
	public void ConvertirKelvinAFahrenheit(double valor) {
		double fahrenheit = 1.8*(valor-273.15)+32;
		fahrenheit = (double) Math.round(fahrenheit *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "K es igual a " + fahrenheit + "°F.");
	}
}
