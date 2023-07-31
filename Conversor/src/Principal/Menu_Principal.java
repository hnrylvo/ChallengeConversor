package Principal;

import javax.swing.JOptionPane;
import Funciones.*;


public class Menu_Principal {

	public static void main(String[] args) {
		boolean continuar;
		ConvertirDolaresFN moneda = new ConvertirDolaresFN();
		ConversorTemperaturaFN temperatura = new ConversorTemperaturaFN();
		ConversorMasaFN masa = new ConversorMasaFN();

		Object[] opciones = { "Conversor de moneda", "Conversor de temperatura", "Conversor de masa" };

		do {
			String seleccion = JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, opciones, "Seleccion").toString();

			switch (seleccion) {
			case "Conversor de moneda":
				String dinero = JOptionPane.showInputDialog("Ingrese el dinero a convertir: ");

				if (esMontoValido(dinero) == true && esNumero(dinero) == true) {
					double monto = Double.parseDouble(dinero);
					moneda.ConvertirMoneda(monto);
				} else {
					JOptionPane.showMessageDialog(null,
							"Valor inválido. No puede ingresar valores negativos o letras.");
				}

				break;

			case "Conversor de temperatura":
				String temp = JOptionPane.showInputDialog("Ingrese temperatura a convertir: ");

				if (esNumero(temp) == true) {
					double monto = Double.parseDouble(temp);
					temperatura.ConvertirTemperatura(monto);
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo valores numericos. ");
				}

				break;

			case "Conversor de masa":
				String cantidad = JOptionPane.showInputDialog("Ingrese la masa  convertir: ");

				if (esMontoValido(cantidad) && esNumero(cantidad)) {
					Double monto = Double.parseDouble(cantidad);
					masa.ConvertirMasa(monto);
				} else {
					JOptionPane.showMessageDialog(null,
							"Valor inválido. No puede ingresar valores negativos o letras.");
				}

				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no válida, saliendo del programa.");
				break;
			}

			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar",
					JOptionPane.YES_NO_OPTION);
			continuar = (respuesta == JOptionPane.YES_OPTION);	

		} while (continuar);
		
		JOptionPane.showMessageDialog(null, "Gracias por usar nuestro conversor. :)");		
	}

	public static boolean esMontoValido(String monto) {
		try {
			double cant = Double.parseDouble(monto);
			return cant > 0;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean esNumero(String temp) {
		try {
			Double.parseDouble(temp);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
